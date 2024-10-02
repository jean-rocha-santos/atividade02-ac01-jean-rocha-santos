package school.sptech.ex1;

public class Ex1ClasseSocialMetodos {
    Double calcularQtdSalariosMinimos(Double renda) {
        Double qtdSalarios = 0.00;
        if (renda < 2090.01) {
            qtdSalarios = renda / 1045.00;
        } else if (renda < 4180.01) {
            qtdSalarios = renda / 1045.00;
        } else if (renda < 10450.00) {
            qtdSalarios = renda / 1045.00;
        } else if (renda < 20900.00) {
            qtdSalarios = renda / 1045.00;
        } else {
            qtdSalarios = renda / 1045.00;
        }
        return qtdSalarios;
    }

    String classeSocial(Double qtdSalarios) {
            String classe;
        if (qtdSalarios <= 2) {
            classe = "E";
        } else if (qtdSalarios <= 4) {
            classe = "D";
        } else if (qtdSalarios <= 10 ) {
            classe = "C";
        } else if (qtdSalarios <=20 ) {
            classe = "B";
        } else {
            classe = "A";
        }
        return classe;
    }
}

