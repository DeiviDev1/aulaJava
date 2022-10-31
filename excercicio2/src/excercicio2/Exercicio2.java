package excercicio2;

import java.util.Scanner;

public class Exercicio2 {

	private static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		
      int num, contP = 0, contImp = 0;
        
        for(int i = 1; i <= 10; i++){
            System.out.println("Digite o " + i + "º número");
            num = leia.nextInt();
            
            //para informar números pares
            if(num % 2 == 0){
                contP++;
            }

            // para informar números impares
            
            if(num % 2 == 1){
                contImp++;
            }
            
        }
        
        System.out.println("Total de números pares:  " + contP);
        System.out.println("Total de números pares:  " + contImp);
		

	}

}
