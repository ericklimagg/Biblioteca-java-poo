public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Criando 10 livros
        Livro livro1 = new Livro("O Hobbit", "J.R.R. Tolkien", 1937, 39.90, true);
        Livro livro2 = new Livro("1984", "George Orwell", 1949, 29.90, true);
        Livro livro3 = new Livro("Dom Casmurro", "Machado de Assis", 1899, 25.00, true);
        Livro livro4 = new Livro("A Revolução dos Bichos", "George Orwell", 1945, 19.90, true);
        Livro livro5 = new Livro("A Guerra dos Tronos", "George R. R. Martin", 1996, 49.90, true);
        Livro livro6 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943, 15.00, true);
        Livro livro7 = new Livro("Harry Potter", "J.K. Rowling", 1997, 59.90, true);
        Livro livro8 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, 69.90, true);
        Livro livro9 = new Livro("Capitães da Areia", "Jorge Amado", 1937, 22.00, true);
        Livro livro10 = new Livro("A Cabana", "William P. Young", 2007, 34.90, true);

        // Adicionando os 10 livros na biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);
        biblioteca.adicionarLivro(livro5);
        biblioteca.adicionarLivro(livro6);
        biblioteca.adicionarLivro(livro7);
        biblioteca.adicionarLivro(livro8);
        biblioteca.adicionarLivro(livro9);
        biblioteca.adicionarLivro(livro10);

        // Empresta 2 livros
        livro2.emprestar();
        livro5.emprestar();

        // Lista os livros disponíveis
        System.out.println("📚 Livros disponíveis:");
        biblioteca.listarLivrosDisponiveis();

        // Busca por um livro
        String tituloBusca = "Harry Potter";
        Livro resultadoBusca = biblioteca.buscarLivroPorTitulo(tituloBusca);
        if (resultadoBusca != null) {
            System.out.println("\n🔎 Livro encontrado: " + resultadoBusca.getTitulo() + " de " + resultadoBusca.getAutor());
        } else {
            System.out.println("\n❌ Livro '" + tituloBusca + "' não encontrado.");
        }

        // Aplica desconto em um livro
        livro1.aplicarDesconto(10);
        System.out.println("\n💸 Preço de '" + livro1.getTitulo() + "' após 10% de desconto: R$ " + livro1.getPreco());

        // Mostra idade de um livro
        int anoAtual = 2025;
        System.out.println("\n📅 Idade do livro '" + livro6.getTitulo() + "': " + livro6.obterIdade(anoAtual) + " anos");

        // Calcula valor total de todos os livros (inclusive os emprestados)
        System.out.println("\n💰 Valor total dos livros na biblioteca: R$ " + biblioteca.calcularValorTotal());
    }
}
