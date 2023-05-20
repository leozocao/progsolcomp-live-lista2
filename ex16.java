/* Nome do Aluno: Leonardo Micheli Moraes Cossio
* RA: 1272311512
* Nome do Programa: ex16
* Data: 19/05
*/
import java.util.Scanner;
public class ex16 {
    public static void main(String[] args) {
        int num = 0;
        Scanner teclado = new Scanner(System.in);

        while(num >= 0){
        System.out.print("Digite um número: ");
        num = teclado.nextInt();
        }

        teclado.close();

        System.out.println("Pronto");
    }
    
}
