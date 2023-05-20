/* Nome do Aluno: Leonardo Micheli Moraes Cossio
* RA: 1272311512
* Nome do Programa: ex02
* Data: 09/05
*/
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        double a = teclado.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double b = teclado.nextDouble();
        System.out.print("Digite o terceiro valor: ");
        double c = teclado.nextDouble();
        teclado.close();

        if(a > b && b > c){
            System.out.printf("%.2f, %.2f, %.2f", c, b, a);
        }else if(a > c && c > b){
            System.out.printf("%.2f, %.2f, %.2f", b, c, a);
        }else if(b > a && a > c){
            System.out.printf("%.2f, %.2f, %.2f", c, a, b);
        }else if(b > c && c > a){
            System.out.printf("%.2f, %.2f, %.2f", a, c, b);
        }else if(c > a && a > b){
            System.out.printf("%.2f, %.2f, %.2f", b, a, c);
        }else if(c > b && b > a){
            System.out.printf("%.2f, %.2f, %.2f", a, b, c);
        }
    }
}

