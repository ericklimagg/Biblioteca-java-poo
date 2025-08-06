# 📚 Biblioteca em Java com POO

Este é um projeto simples em Java que simula o gerenciamento de uma biblioteca utilizando conceitos de Programação Orientada a Objetos (POO).

## 📝 Descrição

O sistema de biblioteca permite realizar as seguintes operações:

  - **Adicionar Livros**: Incluir novos livros ao acervo da biblioteca.
  - **Gerenciar Livros**: A classe `Livro` possui atributos como título, autor, ano de publicação, preço e disponibilidade.
  - **Empréstimo e Devolução**: Marcar livros como emprestados ou devolvidos, alterando sua disponibilidade.
  - **Busca de Livros**: Procurar por um livro específico pelo seu título.
  - **Listagem de Livros**: Exibir todos os livros que estão atualmente disponíveis para empréstimo.
  - **Cálculos Diversos**:
      - Aplicar um percentual de desconto no preço de um livro.
      - Calcular a idade de um livro com base no seu ano de publicação.
      - Calcular o valor total de todos os livros no acervo da biblioteca.

## 🏛️ Estrutura do Projeto

O projeto é composto por três classes principais:

  - **`Livro.java`**: Representa a entidade livro, com todos os seus atributos e métodos, como emprestar, devolver, aplicar desconto e obter a idade do livro.
  - **`Biblioteca.java`**: Gerencia o conjunto de livros. Possui métodos para adicionar, buscar, listar os livros disponíveis e calcular o valor total do acervo.
  - **`Main.java`**: É a classe principal que executa o programa. Nela, são criados os objetos, adicionados à biblioteca e as funcionalidades são demonstradas.

## 🚀 Como Usar

### Pré-requisitos

  - Java Development Kit (JDK) instalado no seu sistema.

### Compilação e Execução

1.  **Salve os arquivos**: Certifique-se de que os três arquivos (`Main.java`, `Livro.java`, `Biblioteca.java`) estejam no mesmo diretório.
2.  **Abra o terminal**: Navegue até o diretório onde os arquivos foram salvos.
3.  **Compile o projeto**: Execute o seguinte comando para compilar todos os arquivos `.java`:
    ```sh
    javac *.java
    ```
4.  **Execute o programa**: Após a compilação, execute a classe principal com o comando:
    ```sh
    java Main
    ```

## 🖥️ Saída Esperada

Ao executar o programa, o console irá exibir:

  - Uma lista dos livros disponíveis na biblioteca.
  - O resultado da busca por um livro específico.
  - O novo preço de um livro após a aplicação de um desconto.
  - A idade de um dos livros.
  - O valor total em reais de todos os livros cadastrados na biblioteca.
