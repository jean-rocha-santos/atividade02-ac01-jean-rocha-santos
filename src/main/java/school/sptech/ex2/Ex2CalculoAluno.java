package school.sptech.ex2;

public class Ex2CalculoAluno {

  public static void main(String[] args) {
    Ex2CalculoAlunoMetodos ex2CalculoAlunoMetodos = new Ex2CalculoAlunoMetodos();
    Double nota1=8.5;
    Double nota2= 10.0;
    Double media = ex2CalculoAlunoMetodos.calcularMedia(nota1,nota2);
    System.out.println(String.format("Média: %.1f",media));

  }
}
