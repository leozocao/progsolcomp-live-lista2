/* Nome do Aluno: Leonardo Micheli Moraes Cossio
* RA: 1272311512
* Nome do Programa: ex05
* Data: 09/05
*/
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = teclado.nextLine();
        System.out.print("Digite sua naturalidade(Cidade em que nasceu): ");
        String naturalidade = teclado.nextLine();
        System.out.print("Digite a sua idade: ");
        int idade = teclado.nextInt();
        System.out.print("Você deseja visualizar os dados informados completamente? \nDigite S ou N: ");
        char resposta = teclado.next().charAt(0);

        teclado.close();

        if (resposta == 'S' || resposta == 's') {
            System.out.printf("Nome: %s \nSobrenome: %s \nIdade: %d \nNaturalidade: %s \n", nome, sobrenome, idade, naturalidade);
        } else if (resposta == 'N' || resposta == 'n') {
            System.out.printf("Nome: %s \nIdade: %d", nome, idade);
        } else {
            System.out.printf("Digitação errada, tente novamente!");
        }

    }
}