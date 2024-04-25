package com.github.omega050.exception;

import java.util.*;

public class Exercicio2 {
  public static void main(String[] args) {
    int[] vetor = new int[10];
    Scanner scanner= new Scanner(System.in);
     try{
    for (int i = 0; i <= vetor.length; i++){

        vetor[i] = scanner.nextInt();
        } 
    }
    catch (InputMismatchException e) {
      System.out.println("Erro: entrada inválida");
      scanner.close();
      return;
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: tamanho do vetor excedido");
            scanner.close();
            return;
        }
    finally{    
    scanner.close();
    for (int i = 0; i < vetor.length; i++) {
      System.out.println("Elemento " + i + ": " + vetor[i]);
    }
    }
}
}