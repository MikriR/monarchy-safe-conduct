package br.com.date;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBase {
    private static final String URL = "jdbc:mysql://localhost:3306/nome_do_projeto";
    private static final String USER = "seu_root";
    private static final String PASSWORD = "sua_senha";

    public static boolean savingCode(StringBuilder code, String description) {
        String sql = "INSERT INTO tests_codes (ticketscodes, descriptions) VALUES (?, ?)";

        try (Connection connectionSQL = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = connectionSQL.prepareStatement(sql)) {

            stmt.setString(1, code.toString());
            stmt.setString(2, description);

            stmt.executeUpdate();
            System.out.println("Successfully saved: \n" + code);
            return true;

        } catch (SQLException e) {

            if (e.getErrorCode() == 1062 || "23505".equals(e.getSQLState())) {
                return false;
            }
            System.err.println("ERROR: " + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException("Unexpected database error", e);
        }
    }

    public static void checkStock() {
        String query = "SELECT id, ticketscodes, descriptions  FROM tests_codes";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            System.out.printf("TICKETS CODES\n");

            while (rs.next()) {
                String ticketscodes = rs.getString("ticketscodes");
                System.out.printf("%-20s\n", ticketscodes);
            }
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static boolean codeVerifying(String code) {
        String sql = "SELECT COUNT(*) FROM tests_codes WHERE ticketscodes = ?";

        try (Connection connectionSQL = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = connectionSQL.prepareStatement(sql)) {

            stmt.setString(1, code);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        } catch (SQLException e) {
            System.err.println("ERROR: " + e.getMessage());
        }
        return false;
    }
}