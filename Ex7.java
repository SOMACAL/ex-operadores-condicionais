import java.util.Scanner;

public class Ex7{
    public static void executar7() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        
        if(numero >= 100 && numero <= 200) {
            System.out.println("O número está dentro do intervalo entre 100 e 200.");
        } else {
            System.out.println("O número está fora do intervalo entre 100 e 200.");
        }
        
    }
}
