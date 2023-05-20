/* Nome do Aluno: Leonardo Micheli Moraes Cossio
* RA: 1272311512
* Nome do Programa: ex01
* Data: 09/05
*/
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double a = teclado.nextDouble();
        System.out.print("Digite outro número: ");
        double b = teclado.nextDouble();
        teclado.close();
        
        if(a>b){
            System.out.print("O maior número é: " + a);
        }else{
            System.out.println("O maior número é: " + b);
        }

    }
}