public class Livro {
    // Atributos privados
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private double preco;
    private boolean disponivel;

    // Construtor
    public Livro(String titulo, String autor, int anoPublicacao, double preco, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
        this.disponivel = disponivel;
    }

    // Getters e Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public int getAnoPublicacao() { return anoPublicacao; }
    public void setAnoPublicacao(int anoPublicacao) { this.anoPublicacao = anoPublicacao; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public boolean isDisponivel() { return disponivel; }
    public void setDisponivel(boolean disponivel) { this.disponivel = disponivel; }

    // Método para emprestar o livro
    public void emprestar() {
        this.disponivel = false;
    }

    // Método para devolver o livro
    public void devolver() {
        this.disponivel = true;
    }

    // Método para obter a idade do livro
    public int obterIdade(int anoAtual) {
        return anoAtual - this.anoPublicacao;
    }

    // Método para aplicar desconto
    public void aplicarDesconto(double percentual) {
        this.preco -= this.preco * (percentual / 100);
    }
}

