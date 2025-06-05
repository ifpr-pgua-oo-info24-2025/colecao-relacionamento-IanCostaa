import  java.util.ArrayList;

public class Main {
     
    public static void main(String[] args) {
        ArrayList<Livro> biblioteca = new ArrayList<>();

        Autor autor1 = new Autor("Sociologo Raiam Santos" ,"Russo");
        Autor autor2 = new Autor("Rezendeevil " , "Filipino");

        LivroDigital livro1 = new LivroDigital( "O paraiso" , "2017", autor2 );
        livro1.setTamanhoDoArquivoMb(3.2);
        LivroFisico livro2 = new LivroFisico("Harry potter" , "2000", autor2 );
        livro2.setNumeroPaginas(16);

        biblioteca.add(livro2);
        biblioteca.add(livro1);

        for (Livro livro : biblioteca) {
            System.out.println(livro.exibirDetalhes());
            System.out.println("----------------------");
        }
    }
}
