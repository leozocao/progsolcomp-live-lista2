/* Nome do Aluno: Leonardo Micheli Moraes Cossio
* RA: 1272311512
* Nome do Programa: ex21
* Data: 19/05
*/
import java.util.Scanner;
public class ex21 {
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero positivo: ");
        int Numero = teclado.nextInt();
        teclado.close();

        int i, j;
    
        for (i = 1; i <= Numero; i++) {
            System.out.println("Tabuada do " + i + ":");
            for (j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }
            System.out.println();
        }   
    }
}
