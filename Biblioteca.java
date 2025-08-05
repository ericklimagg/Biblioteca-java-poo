public class Biblioteca {
    private Livro[] livros;
    private int quantidadeLivros;

    // Construtor
    public Biblioteca() {
        livros = new Livro[10]; // capacidade para 10 livros
        quantidadeLivros = 0;
    }

    // Método para adicionar um livro
    public void adicionarLivro(Livro livro) {
        if (quantidadeLivros < livros.length) {
            livros[quantidadeLivros] = livro;
            quantidadeLivros++;
        } else {
            System.out.println("Biblioteca cheia!");
        }
    }

    // Método para buscar livro pelo título
    public Livro buscarLivroPorTitulo(String titulo) {
        for (int i = 0; i < quantidadeLivros; i++) {
            if (livros[i].getTitulo().equalsIgnoreCase(titulo)) {
                return livros[i];
            }
        }
        return null;
    }

    // Método para listar livros disponíveis
    public void listarLivrosDisponiveis() {
        for (int i = 0; i < quantidadeLivros; i++) {
            if (livros[i].isDisponivel()) {
                System.out.println("Título: " + livros[i].getTitulo() + " | Autor: " + livros[i].getAutor());
            }
        }
    }

    // Método para calcular o valor total dos livros
    public double calcularValorTotal() {
        double total = 0;
        for (int i = 0; i < quantidadeLivros; i++) {
            total += livros[i].getPreco();
        }
        return total;
    }
}
