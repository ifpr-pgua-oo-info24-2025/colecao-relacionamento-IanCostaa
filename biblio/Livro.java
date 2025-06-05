class Livro {
    private String titulo;
    private String anoPublicado;
    private Autor autor;

    public String getTitulo() {
        return titulo;
    }

    public Livro(String titulo, String anoPublicado, Autor autor) {
        this.titulo = titulo;
        this.anoPublicado = anoPublicado;
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnoPublicado() {
        return anoPublicado;
    }

    public void setAnoPublicado(String anoPublicado) {
        this.anoPublicado = anoPublicado;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String exibirDetalhes() {
        return "Título: " + titulo + 
               "\nAno Publicado: " + anoPublicado + 
               "\nAutor: " + (autor != null ? autor.getNome() : "Desconhecido");
    }
}

class LivroFisico extends Livro {
    private Integer numeroPaginas;

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() + 
               "\nNúmero de Páginas: " + numeroPaginas;
    }
    
    public LivroFisico(String titulo, String anoPublicado, Autor autor) {
    super(titulo, anoPublicado, autor);
    }
}
class LivroDigital extends Livro {

    private Double tamanhoDoArquivoMb;

    public Double getTamanhoDoArquivoMb() {
        return tamanhoDoArquivoMb;
    }

    public void setTamanhoDoArquivoMb(Double tamanhoDoArquivoMb) {
        this.tamanhoDoArquivoMb = tamanhoDoArquivoMb;
    }
    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() + "tamanho em Mbs" + tamanhoDoArquivoMb;
    }

    public LivroDigital(String titulo, String anoPublicado, Autor autor) {
        super(titulo, anoPublicado, autor);
    }


}
