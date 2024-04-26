import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;
        ContaBancaria conta = new ContaBancaria(10000);

        while (true) {
            Clear.clear();
            System.out.println("Saldo atual: "+ conta.getSaldo());
            System.out.println("\n");
            System.out.println("Escolha uma opção:");
            System.out.println("1. Realizar Depósito");
            System.out.println("2. Realizar Saque");
            System.out.println("3. Sair");
            System.out.println("\n");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    Clear.clear();
                    System.out.println("Insira o valor que deseja depositar");
                    double val;
                    val=scanner.nextDouble();
                    conta.depositar(val);
                    break;
                case 2:
                    Clear.clear();
                    System.out.println("Insira o valor que deseja sacar");
                    double vals;
                    vals=scanner.nextDouble();
                    try{
                        conta.sacar(vals);
                    } catch(SaldoInsuficienteException e){
                        System.out.println("Erro: "+ e.getMessage());
                        System.out.println("Deseja tentar sacar um valor diferente? (s/n)");
                        String resposta = scanner.next();
                        if(resposta.equalsIgnoreCase("s")){
                            continue; // Tenta o saque novamente
                        } else {
                            System.out.println("Operação de saque cancelada.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Encerando!");
                    scanner.close();
                    return; 
                default:
                    System.out.println("Opção Inválida");
            }
         }
    }
}