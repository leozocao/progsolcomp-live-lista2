/* Nome do Aluno: Leonardo Micheli Moraes Cossio
* RA: 1272311512
* Nome do Programa: ex20
* Data: 19/05
*/
import java.util.Scanner;
public class ex20 {
    public static void main(String[] args) {
        
        int pessoasMaximo;
        int numPessoas = 0;
        double pesoMaximo;
        double pesoPessoa;
        double cargaAtual = 0;
        

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a carga máxima suportada pelo elevador: ");
        pesoMaximo = teclado.nextDouble();
        System.out.print("Digite a quantidade máxima de pessoas suportada pelo elevador: ");
        pessoasMaximo = teclado.nextInt();

        do {
            System.out.print("Digite o peso da pessoa a entrar no elevador: ");
            pesoPessoa = teclado.nextDouble();
            cargaAtual += pesoPessoa;
            numPessoas++;
        } while (cargaAtual <= pesoMaximo && numPessoas < pessoasMaximo);
        teclado.close();

        if (cargaAtual > pesoMaximo) {
            System.out.print("A última pessoa não pode entrar agora. ");
        }
        System.out.print("Este é o limite aceito pelo elevador.");

    }
}
