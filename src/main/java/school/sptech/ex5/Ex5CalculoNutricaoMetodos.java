package school.sptech.ex5;

public class Ex5CalculoNutricaoMetodos {

    void calculaIMC(Double peso, Double altura) {
        Double IMC = peso / (altura * altura);
        System.out.println(String.format("O IMC é %.2f", IMC));
    }
}
