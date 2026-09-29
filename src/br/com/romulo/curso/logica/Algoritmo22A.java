package br.com.romulo.curso.logica;

public class Algoritmo22A {
    public void main () {
        String usuario = "senai";
        String senha = "123";

        int erro = 0;
        int logado = 0;

        IO.println("*** Seja muito bem vindo(a) ao Banco SENATECH ***");
        
        do {
            String usuarioDigit = IO.readln("Digite seu nome de usuário: ");
            String senhaDigit = IO.readln("Digite sua senha: ");

            if (usuarioDigit.equalsIgnoreCase(usuario) && senhaDigit.equalsIgnoreCase(senha)) {
                erro = 3;
                logado = 1;
            }
            else {
                int tentativa = 2 - erro;
                IO.println("Usuário ou senha incorreta, tente novamente!\nTentativas restantes antes de BLOQUEAR seu cartão: " + tentativa);
                erro++;
            }
        } while (erro < 3);

        switch (logado) {
            case 1:
                IO.println("\n*** LOGIN REALIZADO COM SUCESSO! ***");
                IO.println("Empréstimo pré aprovado: R$ 20.000,00");
                float emprestimo = Integer.parseInt(IO.readln("Qual o valor que deseja retirar de empréstimo? "));

                if (emprestimo <= 20000) {
                    IO.println("\nCerto, o valor de R$ " + emprestimo + " pode ser parcelado em até 10x com juros de 1% ao mês.");
                    int parcelas = 0;
                    do {
                        parcelas = Integer.parseInt(IO.readln("Em quantas parcelas deseja pagar: "));
                        if (parcelas > 10) {
                            IO.println("\nNão podemos parcelar em " + parcelas + " vezes!\n");
                        }
                        else {
                            float umPorcento = emprestimo / 100;
                            float jurosTotal = umPorcento * parcelas;
                            float totalDevido = emprestimo + jurosTotal;
                            float valorParcelas = totalDevido / parcelas;
                            IO.println("\n*** EMPRÉSTIMO REALIZADO COM SUCESSO ***");
                            IO.println("VALOR CONTRATADO: " + emprestimo);
                            IO.println("Valor total a ser pago: " + totalDevido);
                            IO.println("Quantidade de parcelas: " + parcelas);
                            IO.println("Valor de cada parcela: " + valorParcelas);
                            IO.println("\nBanco SENATECH agradece a preferência!");
                        }
                    } while (parcelas > 10);
                }
                else {
                    IO.println("\nInfelizmente não podemos liberar esse valor.");
                    IO.println("Tente novamente em outro momento!");
                    IO.println("Banco SENATECH está à disposição!");
                }
                break;
        
            default:
                IO.println("\nCartão BLOQUEADO, entre em contato com seu gerente para mais informações.");
                IO.println("Banco SENATECH está à disposição!");
                break;
        }
    }
}
