package school.sptech.ex6;

import java.util.Scanner;

public class Ex6ValidacaoNumerica {

    public static void main(String[] args) {
        Ex6ValidacaoNumericaMetodos ex6ValidacaoNumericaMetodos = new Ex6ValidacaoNumericaMetodos();
        Scanner leitor = new Scanner(System.in);
        Integer numeroInteiro;

        System.out.println("Digite um número:");
        numeroInteiro = leitor.nextInt();

        while (numeroInteiro > 1) {
            ex6ValidacaoNumericaMetodos.verificarPrimo(numeroInteiro);
            System.out.println("Digite um número:");
            numeroInteiro = leitor.nextInt();
        }
    }
}
