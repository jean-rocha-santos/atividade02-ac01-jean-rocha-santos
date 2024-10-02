package school.sptech.ex4;

public class Ex4DescontoProgressivoMetodos {
    double calcularDesconto(Double valorProduto, Integer quantidade) {
        Double valorComDesconto = 0.00;
        if (quantidade == 1) {
            valorComDesconto = valorProduto * 0.90;
        } else if (quantidade == 2) {
            valorComDesconto = valorProduto * 0.80;
        } else {
            valorComDesconto = valorProduto * 0.70;
        }
        return valorComDesconto;
    }

    void exibirNotaFiscal(Double valorProduto, Integer quantidade, Double valorComDesconto) {
        valorComDesconto *=quantidade;
        System.out.println("------------------------------");
        System.out.println(String.format("Valor do produto: R$%.2f\n" +
                "Quantidade: %d",valorProduto,quantidade));
        System.out.println("------------------------------");
        System.out.println(String.format("Valor com desconto: R$%.2f",valorComDesconto));
    }


}
