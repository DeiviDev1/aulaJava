package excercicio2;

import java.util.Scanner;



public class Exercicio3 {
	
	
	public static void main(String[] args) {
	 Scanner leia = new Scanner(System.in)	;
		
	 int n1 = 0, pmenores = 0, pmaiores = 0;

     while(n1 >= 0){
         System.out.println("Digite uma idade: ");
         n1 = leia.nextInt();

                 if(n1 > 0 && n1 < 21){
                 pmenores++;
                 }

                 if(n1 > 50){
                  pmaiores++;
                 }

     }
     System.out.println("Total de pessoas menores de 21 anos: "+pmenores);
     System.out.println("Total de pessoas maiores de 50 anos: "+pmaiores);
     }

}