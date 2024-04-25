package exception;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercicio1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o primeiro numero: ");
    int numero1 = 0;
    try {
      numero1 = scanner.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("Erro: entrada inválida");
      scanner.close();
      return;
    }

    System.out.print("Digite o segundo número: ");
    int numero2 = 0;
    try {
      numero2 = scanner.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("Erro: entrada inválida");
      scanner.close();
      return;
    }

    try {
      int resultado = numero1 / numero2;
      System.out.println("O resultado da divisão é: " + resultado);
    } catch (ArithmeticException e) {
      System.out.println("Erro: divisão por zero");
    }

    scanner.close();
  }
}
