package exception.ex3;

import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o usuário");
        String login = scanner.nextLine();
        System.out.println("Insira a senha");
        String senha = scanner.nextLine(); 

        SistemaLogin sistemaLogin = new SistemaLogin();

        try {
            sistemaLogin.fazerLogin(login, senha);
        } catch (LoginInvalido e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
