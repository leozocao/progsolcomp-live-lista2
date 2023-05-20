/* Nome do Aluno: Leonardo Micheli Moraes Cossio
* RA: 1272311512
* Nome do Programa: ex09
* Data: 19/05
*/
import java.util.Scanner;
public class ex09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor da venda: R$");
        double valorVenda = teclado.nextDouble();
        System.out.print("Digite qual a condição de pagamento: \n1-Venda a Vista \n2-Venda a Prazo 30 dias \n3-Venda a Prazo 60 dias \n4-Venda a Prazo 90 dias \n5-Venda com cartão de débito \n6-Venda com cartão de crédito \n");
        int condicaoPagamento = teclado.nextInt();

        teclado.close();

        double desconto, acrescimo, totalvenda;

        if (condicaoPagamento == 1) {
            desconto = valorVenda * (10/100.0f);
            totalvenda = valorVenda - desconto;
            System.out.printf("O valor total da venda é: R$%.2f", totalvenda);
        } else if (condicaoPagamento == 2) {
            desconto = valorVenda * (5/100.0f);
            totalvenda = valorVenda - desconto;
            System.out.printf("O valor total da venda é: R$%.2f", totalvenda);
        } else if (condicaoPagamento == 3) {
            System.out.print("O valor da venda é: R$" + valorVenda);
        } else if (condicaoPagamento == 4) {
            acrescimo = valorVenda * (5/100.0f);
            totalvenda = valorVenda + acrescimo;
            System.out.printf("O valor total da venda é: R$%.2f", totalvenda);
        } else if (condicaoPagamento == 5) {
            desconto = valorVenda * (8/100.0f);
            totalvenda = valorVenda - desconto;
            System.out.printf("O valor total da venda é: R$%.2f", totalvenda);
        } else if (condicaoPagamento == 6) {
            desconto = valorVenda * (7/100.0f);
            totalvenda = valorVenda - desconto;
            System.out.printf("O valor total da venda é: R$%.2f", totalvenda);
        }
     

    }
}
