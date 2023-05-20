/* Nome do Aluno: Leonardo Micheli Moraes Cossio
* RA: 1272311512
* Nome do Programa: ex04
* Data: 09/05
*/
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print("Digite um número inteiro: ");
        int num = teclado.nextInt();
        teclado.close();

        if (num % 2 == 0) {
            System.out.printf("O número %d é par", num);
        } else {
            System.out.printf("O número %d é impar", num);
        }

        if (num > 0){
            System.out.print(" e positivo");
        }else {
            System.out.print(" e negativo");
        }
    }
    
}
