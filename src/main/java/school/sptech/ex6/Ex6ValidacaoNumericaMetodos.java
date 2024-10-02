package school.sptech.ex6;

public class Ex6ValidacaoNumericaMetodos {
    void verificarPrimo(Integer numeroInteiro) {
        Integer divisivelQtdNumeros = 0;
        if (numeroInteiro > 1) {
            for (int i = 1; i <= 9; i++) {
                if (numeroInteiro % i == 0) {
                    divisivelQtdNumeros += 1;
                }
            }
        } else {
            return;
        }
        if (divisivelQtdNumeros > 2) {
            System.out.println("Não é primo");
        } else {
            System.out.println("É primo");
        }

    }
}
