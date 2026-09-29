package br.com.romulo.curso.logica;

public class Algoritmo20ABrian{
    void main(){
        // Produtos disponíveis
        String[] produtos = {
            "Camiseta",
            "Calça",
            "Tênis",
            "Boné"
        };
        double[] precos = {
            40.00,
            80.00,
            150.00,
            30.00
        };
        double valorCompra = 0;
        // ==============================
        // ESCOLHA DOS PRODUTOS
        // ==============================
        System.out.println("===== PRODUTOS =====");
        for (int i = 0; i < produtos.length; i++) {
            System.out.println((i + 1) + " - " + produtos[i]
                    + " - R$ " + precos[i]);
        }
        System.out.println("0 - Finalizar compra");
        int escolha = -1;
        while (escolha != 0) {
            System.out.println();
            System.out.println("Escolha um produto:");
            escolha = Integer.parseInt(IO.readln());
            if (escolha >= 1 && escolha <= produtos.length) {
                System.out.println("Quantas unidades de "
                        + produtos[escolha - 1] + " deseja?");
                int quantidade = Integer.parseInt(IO.readln());
                if (quantidade > 0) {
                    double subtotal = precos[escolha - 1] * quantidade;
                    valorCompra = valorCompra + subtotal;
                    System.out.println();
                    System.out.println("Produto: "
                            + produtos[escolha - 1]);
                    System.out.println("Quantidade: " + quantidade);
                    System.out.println("Subtotal: R$ " + subtotal);
                    System.out.println("Valor atual da compra: R$ "
                            + valorCompra);
                } else {
                    System.out.println("Quantidade inválida.");
                }

            } else if (escolha != 0) {
                System.out.println("Produto inválido.");
            }
        }
        // ==============================
        // VERIFICAÇÃO DA COMPRA
        // ==============================
        if (valorCompra == 0) {
            System.out.println("Nenhum produto foi selecionado.");
        } else {
            System.out.println();
            System.out.println("===== RESUMO DA COMPRA =====");
            System.out.println("Valor da compra: R$ " + valorCompra);
            // ==============================
            // REGIÃO
            // ==============================
            System.out.println();
            System.out.println("Digite sua região:");
            System.out.println("1 - Centro-Oeste");
            System.out.println("2 - Sul");
            System.out.println("3 - Sudeste");
            System.out.println("4 - Nordeste");
            System.out.println("5 - Norte");
            int regiao = Integer.parseInt(IO.readln());
            // ==============================
            // FORMA DE PAGAMENTO
            // ==============================
            System.out.println();
            System.out.println("Escolha a forma de pagamento:");
            System.out.println("1 - PIX");
            System.out.println("2 - Cartão");
            int pagamento = Integer.parseInt(IO.readln());
            // ==============================
            // CUPONS
            // ==============================
            String[] cupons = {
                "PROMO10",
                "FRETEGRATIS",
                "DESCONTO20",
                "PIX5"
            };
            System.out.println();
            System.out.println("===== CUPONS DISPONÍVEIS =====");
            for (int i = 0; i < cupons.length; i++) {
                System.out.println((i + 1) + " - " + cupons[i]);
            }
            System.out.println("0 - Não utilizar cupom");
            System.out.println();
            System.out.println("Escolha o cupom que deseja usar:");
            int cupom = Integer.parseInt(IO.readln());

            // ==============================
            // APLICAÇÃO DOS CUPONS
            // ==============================

            if (cupom == 1) {

                if (valorCompra > 50) {

                    double desconto = valorCompra * 0.10;
                    double total = valorCompra - desconto;

                    System.out.println();
                    System.out.println("Cupom PROMO10 aplicado!");
                    System.out.println("Desconto: R$ " + desconto);
                    System.out.println("Total: R$ " + total);

                } else {

                    System.out.println();
                    System.out.println(
                        "Promoção não disponível para esta compra."
                    );
                }

            } else if (cupom == 2) {

                if (regiao == 1) {

                    System.out.println();
                    System.out.println("Cupom FRETEGRATIS aplicado!");
                    System.out.println(
                        "Frete grátis para o Centro-Oeste!"
                    );

                    System.out.println(
                        "Total: R$ " + valorCompra
                    );

                } else {

                    System.out.println();
                    System.out.println(
                        "Promoção não disponível para esta compra."
                    );
                }

            } else if (cupom == 3) {

                if (valorCompra > 100) {

                    double desconto = valorCompra * 0.20;
                    double total = valorCompra - desconto;

                    System.out.println();
                    System.out.println("Cupom DESCONTO20 aplicado!");
                    System.out.println("Desconto: R$ " + desconto);
                    System.out.println("Total: R$ " + total);

                } else {

                    System.out.println();
                    System.out.println(
                        "Promoção não disponível para esta compra."
                    );
                }

            } else if (cupom == 4) {

                if (pagamento == 1) {

                    double desconto = valorCompra * 0.05;
                    double total = valorCompra - desconto;

                    System.out.println();
                    System.out.println("Cupom PIX5 aplicado!");
                    System.out.println("Desconto: R$ " + desconto);
                    System.out.println("Total: R$ " + total);

                } else {

                    System.out.println();
                    System.out.println(
                        "Promoção não disponível para esta compra."
                    );
                }

            } else if (cupom == 0) {

                System.out.println();
                System.out.println("Nenhum cupom utilizado.");
                System.out.println("Total: R$ " + valorCompra);

            } else {

                System.out.println();
                System.out.println("Cupom inválido.");

            }
        }
    }
}
