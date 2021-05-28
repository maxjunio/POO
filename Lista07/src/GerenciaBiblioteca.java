import java.util.Scanner;
public class GerenciaBiblioteca {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        String guarda; 
        Biblioteca objBiblioteca = new Biblioteca(0,"Biblioteca PUC");
        
        Livro livro1 = new Livro("jao da bola","Jogador falido","aventura");
        Livro livro2 = new Livro("chola nao","Garoto deprê","didatico");
        Livro livro3 = new Livro("o menino que roubava no truco","Ladrão do zap","aventura");
        Livro livro4 = new Livro("quem viu e porque nao e cego","Euclives da Vista","auto ajuda");
        Livro livro5 = new Livro("o passarinho que sabia matar","Jucelinho","didatico");
        
        objBiblioteca.addLivro(livro1);    
        objBiblioteca.addLivro(livro2);    
        objBiblioteca.addLivro(livro3);    
        objBiblioteca.addLivro(livro4);    
        objBiblioteca.addLivro(livro5); 
        
        System.out.println(objBiblioteca.statusBiblioteca());
        
        System.out.println("Digite o titulo do livro desejado: ");
        guarda = entrada.nextLine();
        
        System.out.println(objBiblioteca.dadosLivro(guarda));
        System.out.println("A biblioteca possui " + objBiblioteca.possuiBiblioteca()+ " livros.");
        System.out.println("");
        objBiblioteca.excluiLivro(livro1);
        objBiblioteca.excluiLivro(livro3);
        System.out.println("Cabem " + objBiblioteca.cabeBiblioteca()+ " na biblioteca.");
        objBiblioteca.addLivro(livro3);
        System.out.println("");
        
        System.out.println(objBiblioteca.titulosLivro("didatico")+ "do genero didaticos foram encontrados!");
        System.out.println("");
        System.out.println(objBiblioteca.statusBiblioteca());
    }
    
}
