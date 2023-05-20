/* Nome do Aluno: Leonardo Micheli Moraes Cossio
* RA: 1272311512
* Nome do Programa: ex07
* Data: 19/05
*/
import java.util.Scanner;
public class ex07 {
    public static void main(String[] args) {
        double diariaHotel = 60.0;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite qual foi o número de diárias no hotel: ");
        int numDiaria = teclado.nextInt();

        teclado.close();

        if(numDiaria >= 15){
            diariaHotel = (diariaHotel*numDiaria)+(numDiaria * 5.5);
            System.out.printf("O valor total da hospedagemfoi de: R$%.2f", diariaHotel);
        }else if(numDiaria == 15){
            diariaHotel = (diariaHotel*numDiaria)+(numDiaria * 6);;
            System.out.printf("O valor total da hospedagemfoi de: R$%.2f", diariaHotel);
        }else if(numDiaria < 15){
            diariaHotel = (diariaHotel*numDiaria)+(numDiaria * 8);;
            System.out.printf("O valor total da hospedagem foi de: R$%.2f", diariaHotel);
        }

    }
}
