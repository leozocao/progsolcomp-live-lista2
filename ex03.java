/* Nome do Aluno: Leonardo Micheli Moraes Cossio
* RA: 1272311512
* Nome do Programa: ex03
* Data: 09/05
*/
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int a = teclado.nextInt();
        System.out.print("Digite outro número: ");
        int b = teclado.nextInt();
        teclado.close();

        if (a % b == 0 || b % a == 0){
            System.out.print("Os números digitados são múltiplos!");
        } else {
            System.out.print("Os números digitados não são múltiplos!");
        }
    }
    
}
