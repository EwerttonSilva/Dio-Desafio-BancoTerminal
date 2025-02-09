import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = input.nextLine();

        System.out.println("Informe a sua data de nascimento: ");
        String nascimento = input.nextLine();

        String mensagem = String.format("Olá, %s! sua conta foi criada com sucesso. Data de Nascimento: %s", nome, nascimento);
        System.out.println(mensagem);
    }
}