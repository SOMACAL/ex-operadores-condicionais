//Escreva um algoritmo que leia um número digitado pelo usuário e mostre amensagem 
//“Número maior do que 10!”, caso este número seja maior,
// ou “Número menor ou igual a 10!”, caso este número seja menor ou igual

import java.util.Scanner;

public class Ex1 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);


        //System.out.println("Escreva um algoritmo que leia um número digitado pelo usuário e mostre amensagem “Número maior do que 10!”, caso este número seja maior, ou “Númeromenor ou igual a 10!”, caso este número seja menor ou igual");

         System.out.println("Digite o numero:");
         int a = scanner.nextInt();
         
         if (a >= 10) {
        System.out.println("numero maior ou igual a 10!");
        } if (a < 9) {
        System.out.println("numero menor que 10!");
        
        
    }
}

}
