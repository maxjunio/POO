/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Max
 */
public class Livro {
    private String nomeLivro;
    private String autorLivro;
    private String generoLivro;

    public Livro(String nomeLivro, String autorLivro, String generoLivro) {
        this.nomeLivro = nomeLivro;
        this.autorLivro = autorLivro;
        this.generoLivro = generoLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public String getGeneroLivro() {
        return generoLivro;
    }
    
}
