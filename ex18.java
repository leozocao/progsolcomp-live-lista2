/* Nome do Aluno: Leonardo Micheli Moraes Cossio
* RA: 1272311512
* Nome do Programa: ex18
* Data: 19/05
*/
import java.util.Scanner;
public class ex18 {
    public static void main(String[] args) {
        int i;
        int fatorialNum = 1;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o número que deseja saber o fatorial: ");
        int num = teclado.nextInt();
        teclado.close();

        for(i = 1; i <= num; i++){
            fatorialNum *= i;
        }
        
        System.out.print(fatorialNum);
    }
}
