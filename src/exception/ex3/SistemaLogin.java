package exception.ex3;

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