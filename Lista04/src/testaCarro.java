import java.util.Scanner;
public class testaCarro {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
                    
        Carro carro1 = new Carro(1,1);
        Carro carro2 = new Carro(2,2);
            
       
        carro1.abastece(20);
        carro2.abastece(30);
        
        carro1.selTipo();
        carro2.selTipo();
        
        carro1.move(100);
        carro2.move(400);
        
        carro1.atTanque();
        carro2.atTanque();
        
        carro1.status();
        System.out.println("");
        carro2.status();
        System.out.println("Obrigado por utilizar o programa!");
    }
}
