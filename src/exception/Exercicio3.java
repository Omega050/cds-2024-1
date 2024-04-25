import java.util.Scanner;

public class Exercicio3 {
    public class LoginInvalido extends Exception {
        public LoginInvalido() {
            super("Login inválido");
        }
    }

    public class SistemaLogin {
        private static final String correctU = "usuario";
        private static final String correctP = "senha";

        public void fazerLogin(String user, String senha) throws LoginInvalido {
            if (!validarLogin(user, senha)) {
                throw new LoginInvalido();
            } else {
                System.out.println("Login Realizado com sucesso");
            }
        }

        private boolean validarLogin(String usuario, String senha) {
            return usuario.equals(correctU) && senha.equals(correctP);
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
