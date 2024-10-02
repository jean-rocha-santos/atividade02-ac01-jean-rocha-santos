package school.sptech.ex3;

public class Ex3IdadeMetodos {
    void classificaIdade(Integer anos) {
        String mensagem;
        if (anos <= 2) {
            mensagem = "Bebê";
        } else if (anos <= 11) {
            mensagem = "Criança";
        } else if (anos <= 19) {
            mensagem = "Adolescente";
        } else if (anos <= 30) {
            mensagem = "Jovem";
        } else if (anos <= 60) {
            mensagem = "Adulto";
        } else {
            mensagem = "Idoso";
        }
        System.out.println(mensagem);

    }


}
