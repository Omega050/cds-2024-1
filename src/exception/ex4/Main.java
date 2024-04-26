import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Executar função 1");
            System.out.println("2. Executar função 2");
            System.out.println("3. Sair");

            op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Executando função 1...");
                    // Coloque aqui a lógica da função 1
                    break;
                case 2:
                    System.out.println("Executando função 2...");
                    // Coloque aqui a lógica da função 2
                    break;
                case 3:
                    System.out.println("Saindo do programa. Adeus!");
                    return; // Sai do método main, encerrando o programa
                default:
                    System.out.println("Opção Inválida");
}
}