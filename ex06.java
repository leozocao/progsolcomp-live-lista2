/* Nome do Aluno: Leonardo Micheli Moraes Cossio
* RA: 1272311512
* Nome do Programa: ex06
* Data: 19/05
*/
import java.util.Scanner;
public class ex06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         System.out.print("Digite sua nota (De 0 a 100): ");
         double nota = teclado.nextDouble();

         teclado.close();

         if(nota < 50){
            System.out.print("Nota Insuficiente");
         }else if(nota >= 50 && nota < 65){
            System.out.print("Nota Regular");
         }else if(nota >= 65 && nota < 85){
            System.out.print("Nota Boa");
         }else if(nota >= 85 && nota <= 100){
            System.out.print("Nota Ótima");
         }else{
            System.out.println("Tente novamnete, utilize uma nota válida");
         }
    }
}
