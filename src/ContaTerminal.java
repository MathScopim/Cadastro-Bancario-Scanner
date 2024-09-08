
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;


        System.out.println("===Cadastro Do Banco===");

        System.out.println("Digite uma Agência de preferência: ");
        String agencia = scanner.next();

        System.out.println("Digite Seu Nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();


        System.out.println("Digite uma senha: ");
        int senha = scanner.nextInt();

        System.out.println("Cadastro Criado.");
        System.out.println("Agência Escolhida : " + agencia + " | " +
                " Seu nome é : " + nome + " "
                 + sobrenome + " | " + "Sua idade:" + idade + " | " + "Sua Senha: " + senha);

    }
}
