package school.sptech.ex1;

import java.util.Scanner;

public class Ex1ClasseSocial {
  public static void main(String[] args) {
    Ex1ClasseSocialMetodos ex1ClasseSocialMetodos = new Ex1ClasseSocialMetodos();
    Double renda = ex1ClasseSocialMetodos.calcularQtdSalariosMinimos(8500.00);
    String classe= ex1ClasseSocialMetodos.classeSocial(renda);

    System.out.println(String.format("Você recebe aproximadamente %.1f salários-mínimos.  \n" +
            "Você pertence a classe social: %s.",renda,classe));

  }

}
