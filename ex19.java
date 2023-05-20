/* Nome do Aluno: Leonardo Micheli Moraes Cossio
* RA: 1272311512
* Nome do Programa: ex19
* Data: 19/05
*/
import java.util.Scanner;
public class ex19 {
    public static void main(String[] args) {
        int tempoSegundos = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o volume inicial do gás(cm³): ");
        double volumeGas = teclado.nextDouble();
        teclado.close();

        while(volumeGas <= 1000){
            volumeGas *= 2;
            tempoSegundos ++;
        }
        System.out.print("O tempo necessário para que esse volume se torne maior que 1000cm³ é de " + tempoSegundos + "s");
    }
}
