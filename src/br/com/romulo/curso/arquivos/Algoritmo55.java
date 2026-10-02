package br.com.romulo.curso.arquivos;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class Algoritmo55 {

    void main() {
        Path caminho = Path.of("ambientes.txt");
        
        // Dicionário mapeando a String (chave) para o objeto Ambiente
        Map<String, Ambiente> dicionarioAmbientes = new HashMap<>();
        
        // Formatador para data e hora atuais
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        int opcao = 0;

        do {
            String menu = "--- GERENCIADOR DE AMBIENTES ---\n"
                    + "1. Armazenar (Inserir / Atualizar)\n"
                    + "2. Buscar (Consultar)\n"
                    + "3. Deletar (Apagar)\n"
                    + "4. Listar Todos (Na Tela)\n"
                    + "5. Salvar no Arquivo\n"
                    + "6. Sair\n\n"
                    + "Escolha uma opção:";

            String entradaOpcao = JOptionPane.showInputDialog(menu);
            if (entradaOpcao == null) {
                break;
            }

<<<<<<< HEAD
     /*
       Avaliação de Capacidades
       (cada item: 3,10 pontos)
       - Elaborar e Explicar um Try Catch Finally (Seg)
       - Uso de JOptionPane ou JFrame ou outros SWING
       - Elaborar e Explicar DateTimeFormatter (Ter)
       - Elaborar e Explicar LocalDateTime (Ter)
       - Elaborar e Explicar FileWriter (Ter)
       - Elaborar e Explicar HashMap (Qua)
       - Elaborar e Explicar Map (Qua)
       - Elaborar e Explicar a Organização do Código (Qui)
     
     
     */

       //try catch
       //arquivo
       //hashmap
       //a - r - p - a - r
    
}
=======
            try {
                opcao = Integer.parseInt(entradaOpcao);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, digite um número válido!");
                continue;
            }

            switch (opcao) {
                case 1: // ARMAZENAR
                    String chave = JOptionPane.showInputDialog("Digite a chave/identificador do ambiente:");
                    if (chave != null && !chave.isBlank()) {
                        String descricao = JOptionPane.showInputDialog("Digite a descrição para '" + chave + "':");
                        if (descricao != null) {
                            String dataHoraAtual = LocalDateTime.now().format(dtf);
                            Ambiente novoAmbiente = new Ambiente(chave, descricao, dataHoraAtual);
                            dicionarioAmbientes.put(chave, novoAmbiente);
                            JOptionPane.showMessageDialog(null, "Ambiente armazenado com sucesso!\nCadastrado em: " + dataHoraAtual);
                        }
                    }
                    break;

                case 2: // BUSCAR
                    String chaveBusca = JOptionPane.showInputDialog("Digite a chave que deseja buscar:");
                    if (chaveBusca != null && !chaveBusca.isBlank()) {
                        if (dicionarioAmbientes.containsKey(chaveBusca)) {
                            Ambiente amb = dicionarioAmbientes.get(chaveBusca);
                            JOptionPane.showMessageDialog(null, 
                                    "--- AMBIENTE ENCONTRADO ---\n" +
                                    "Chave: " + amb.getChave() + "\n" +
                                    "Descrição: " + amb.getDescricao() + "\n" +
                                    "Data/Hora: " + amb.getDataHora());
                        } else {
                            JOptionPane.showMessageDialog(null, "Aviso: A chave '" + chaveBusca + "' não foi encontrada.");
                        }
                    }
                    break;

                case 3: // DELETAR / APAGAR
                    String chaveRemover = JOptionPane.showInputDialog("Digite a chave que deseja apagar:");
                    if (chaveRemover != null && !chaveRemover.isBlank()) {
                        if (dicionarioAmbientes.containsKey(chaveRemover)) {
                            dicionarioAmbientes.remove(chaveRemover);
                            JOptionPane.showMessageDialog(null, "Chave '" + chaveRemover + "' apagada com sucesso do dicionário!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Aviso: A chave '" + chaveRemover + "' não existe no dicionário.");
                        }
                    }
                    break;

                case 4: // LISTAR TODOS NO TELA
                    if (dicionarioAmbientes.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "O dicionário está vazio. Nenhum ambiente cadastrado.");
                    } else {
                        StringBuilder lista = new StringBuilder("--- AMBIENTES CADASTRADOS ---\n\n");
                        for (Ambiente amb : dicionarioAmbientes.values()) {
                            lista.append("Chave: ").append(amb.getChave())
                                 .append("\nDescrição: ").append(amb.getDescricao())
                                 .append("\nData/Hora: ").append(amb.getDataHora())
                                 .append("\n-----------------------------------\n");
                        }
                        JOptionPane.showMessageDialog(null, lista.toString());
                    }
                    break;

                case 5: // SALVAR NO ARQUIVO
                    if (dicionarioAmbientes.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "O dicionário está vazio. Nada para salvar.");
                        break;
                    }

                    try (BufferedWriter escritor = Files.newBufferedWriter(caminho)) {
                        for (Ambiente amb : dicionarioAmbientes.values()) {
                            escritor.write("Chave: " + amb.getChave() + " | Descrição: " + amb.getDescricao() + " | Data/Hora: " + amb.getDataHora());
                            escritor.newLine();
                        }

                        JOptionPane.showMessageDialog(null, "Dados salvos com sucesso em 'ambientes.txt'!");
                        System.out.println("Arquivo atualizado com os objetos Ambiente.");

                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Erro ao gravar o arquivo: " + e.getMessage());
                    }
                    break;

                case 6: // SAIR
                    JOptionPane.showMessageDialog(null, "Encerrando o programa. Até logo!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Escolha entre 1 e 6.");
                    break;
            }

        } while (opcao != 6);
    }
}
>>>>>>> 2f68b34a813ca89fef57d73daeeedf2030f51b49
