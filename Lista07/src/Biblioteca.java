
public class Biblioteca {

    private final int MAXLIV = 100;
    private Livro[] livrosBib = new Livro[MAXLIV];
    private String nomeBiblioteca;
    private int nlivros;

    public Biblioteca(int livros, String nomeBiblioteca) {
        this.nlivros = livros;
        this.nomeBiblioteca = nomeBiblioteca;

    }

    public int getMAXLIV() {
        return MAXLIV;
    }

    public Livro[] getLivrosBib() {
        return livrosBib;
    }

    public int getLivros() {
        return nlivros;
    }

    public void addLivro(Livro livro) {
        if (this.nlivros < this.MAXLIV) {
            for (int i = 0; i < this.MAXLIV; i++) {
                if (this.livrosBib[i] == null) {
                    this.livrosBib[i] = livro;
                    break;
                }

            }
            this.nlivros++;

        }
    }

    public void excluiLivro(Livro livro) {
        if (this.nlivros > 0) {
            for (int i = 0; i < MAXLIV; i++) {
                if (this.livrosBib[i] == livro) {
                    this.livrosBib[i] = null;
                    break;

                }
            }
            this.nlivros--;

        }
    }

    public String statusBiblioteca() {
        String status ="";
        for (int i = 0; i < MAXLIV; i++){
            if (this.livrosBib[i]!=null){
                status += "Livro:  " + this.livrosBib[i].getNomeLivro() + "\n";
        
            }else{
                status += "";
            }
        }
        return status;

    }

    public String dadosLivro(String texto) {
        String dado = " ";
        for (int i = 0; i < MAXLIV; i++) {
            if (this.livrosBib[i] == null) {
                dado = " ";
            } else {
                if (this.livrosBib[i].getNomeLivro().equals(texto)) {
                    dado += "Nome do Livro:  " + this.livrosBib[i].getNomeLivro() + "\n Autor: " + this.livrosBib[i].getAutorLivro() + "\n Genero do Livro: " + this.livrosBib[i].getGeneroLivro();
                    break;
                }
            }
        }

        return dado;
    }

    public String titulosLivro(String texto) {
        String titulo = "";
        for (int i = 0; i < MAXLIV; i++) {
            if (this.livrosBib[i]!= null) {
                if (this.livrosBib[i].getGeneroLivro().equals(texto)) {
                    titulo += "Livro: " + this.livrosBib[i].getNomeLivro() + "\n";
                }
            }
        }

        return titulo;
    }

    public int possuiBiblioteca() {
        return getLivros();
    }

    public int cabeBiblioteca() {
        return (getMAXLIV() - getLivros());
    }
}
