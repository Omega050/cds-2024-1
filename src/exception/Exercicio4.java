import java.util.Scanner;

public class Main {
    public class SaldoInsuficienteException extends Exception {
        public SaldoInsuficienteException() {
            super("Saldo Insuficiente");
        }
    }

    public class ContaBancária {
        private int saldo;

        public void depositar(int valor){
           saldo+=valor;
        }

        private void sacar(int valor) throws SaldoInsuficienteException{
            if
        }
    }

    public static void main(String[] args) {
        Main main = new Main(); // Criar uma instância da classe externa
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o usuário");
        String login = scanner.nextLine();
        System.out.println("Insira a senha");
        String senha = scanner.nextLine();

        Main.SistemaLogin sistemaLogin = main.new SistemaLogin(); // Criar uma instância da classe interna

        try {
            sistemaLogin.fazerLogin(login, senha);
        } catch (LoginInvalido e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
