/* Nome do Aluno: Leonardo Micheli Moraes Cossio
* RA: 1272311512
* Nome do Programa: ex08
* Data: 19/05
*/
import java.util.Scanner;
public class ex08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número de um mês: ");
        int numMes = teclado.nextInt();

        teclado.close();

        switch (numMes){
            case 1:
            System.out.print("Mês: Janeiro \nEstação: Verão"); break;
            case 2:
            System.out.print("Mês: Fevereiro \nEstação: Verão"); break;
            case 3:
            System.out.print("Mês: Março \nEstação: Outono"); break;
            case 4:
            System.out.print("Mês: Abril \nEstação: Outono"); break;
            case 5:
            System.out.print("Mês: Maio \nEstação: Outono"); break;
            case 6:
            System.out.print("Mês: Junho \nEstação: Inverno"); break;
            case 7:
            System.out.print("Mês: Julho \nEstação: Inverno"); break;
            case 8:
            System.out.print("Mês: Agosto \nEstação: Inverno"); break;
            case 9:
            System.out.print("Mês: Setembro \nEstação: Primavera"); break;
            case 10:
            System.out.print("Mês: Outubro \nEstação: Primavera"); break;
            case 11:
            System.out.print("Mês: Novembro \nEstação: Primavera"); break;
            case 12:
            System.out.print("Mês: Dezembro \nEstação: Verão"); break;
            default:
            System.out.print("Tente novamente, utilize um mês válido");

        }
    }    
}
