## **Olá! Me chamo Rafael F. de Santana**

S**obre Mim e Minha Trajetória**

Iniciei minha transição para a área de Programação em maio de 2026, mantendo um ritmo de estudos intensivo e focado em Engenharia de Software.


**Curso Técnico**
Iniciado em 02 de junho de 2026 
- Desenvolvimento de Sistemas — SENAC EAD 

**Estudos Intensivos (Alura)**
- Dedicação diária desde 16 de maio de 2026

&nbsp;

## **Projeto**

**Monarchy Safe-Conduct**
 
Este projeto foi desenvolvido tendo em vista a solidificação dos conceitos de POO e a inicialização de Banco de Dados.

Consiste na geração de códigos aleatórios para três categorias: 

- **Comum** - Dezoito letras, e números de 0 a 9.

- **VIP** - O comum acrescido de 8 letras escolhidas como particularidade da categoria.

- **Queng** (Fusão de Queen e King do xadrez) - O comum acrescido de 8 lances em notação enxadrística.

- Engloba a implementação de detalhes únicos para as duas últimas categorias e o armazenamento das informações no Banco de Dados.

&nbsp;

**Linha do Tempo do Desenvolvimento**

Cronograma:

**24/06 a 16/07** - Desenvolvimento do Núcleo
- Criação e construção das classes.
- Implementação dos conceitos da POO.
- Desenvolvimento da lógica de segurança.
- Implementação do Banco de Dados.

**18/07 a 02/08** - Testes Rigorosos

O período foi extremamente dedicado à realização de testes de toda a lógica do sistema, correções e prevenções para bugs e refatoração.

**Testes Realizados**

Dentro da Lógica:
- Geração exata e com ausência de anomalias dos códigos para as categorias Comum, VIP e Queng.
- Inserção certeira dos detalhes especiais para as categorias VIP e Queng.
- Inspeção para o código de uma categoria não estar se fundindo com a de outra.
- Busca por possíveis quebras de tamanho dos códigos.
- Envio, registro e retorno corretos na interação entre IDE e SQL.
- Evitando que um código que já exista no Banco de Dados seja salvo mais de uma vez.
- Validação se um código existe no banco de dados.

Mensagens e Usuário:

- Exibição correta das mensagens. 
- Leitores de dados funcionando sem problemas e recebendo apenas os dados esperados.

**Ala Bug**

- Problema I: Método pedindo retorno de um valor, porém com a existência de mais valores.
- Problema II: Alocando 'return null' no problema I e recebendo um erro de sintaxe com (NullPointerException)
- Correção: Adição do objeto contêiner 'Optional' para evitar o erro do problema II e configurar o retorno de um dos diversos valores do problema I.

**Refatoração**
- Gancho do Bug: Mudança do '.contains' para o 'isPresent' com a introdução do Optional.


**Abaixo deixo uma demonstração prática**
<p align="center">
  <img src="gif.project.gif" width="600">
</p>

**Experimente pessoalmente seguindo estes passos:**

Feito em JAVA VERSION 25.0.3

**1 -** Requer MySQL 

**2 -** Baixe os pacotes

**3 -** Conduza-se para a classe 'PlayExecution'.

**4 -** Clique em 'Play' e faça a sua própria interação.

