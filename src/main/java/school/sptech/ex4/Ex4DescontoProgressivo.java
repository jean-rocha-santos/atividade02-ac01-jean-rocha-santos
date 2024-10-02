package school.sptech.ex4;

import java.util.Scanner;

public class Ex4DescontoProgressivo {

  public static void main(String[] args) {
    Ex4DescontoProgressivoMetodos ex4DescontoProgressivoMetodos =new Ex4DescontoProgressivoMetodos();
    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite o valor unitário do produto:");
    Double valor = leitor.nextDouble();
    System.out.println("Digite a quantidade:");
    Integer quantidade =leitor.nextInt();

    Double valorComDesconto = ex4DescontoProgressivoMetodos.calcularDesconto(valor,quantidade);
    ex4DescontoProgressivoMetodos.exibirNotaFiscal(valor,quantidade,valorComDesconto);


  }
}
