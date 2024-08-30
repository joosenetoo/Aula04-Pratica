public class Livro {
    //Atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String isbn;

    // Construtor Padrão
    public Livro() {
        this.titulo = "Desconhecido";
        this.autor = "Desconhecido";
        this.anoPublicacao = 0;
        this.isbn = "0000000000";
    }

    public Livro(String titulo, String autor, int anoPublicacao, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.isbn = isbn;
    }

    //Getters
    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getAnoPublicacao(){
        return anoPublicacao;
    }

    public String getIsbn(){
        return isbn;
    }

    //Setters

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public void mostrarDetalhes(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("ISBN: " + isbn);
    }












}
