package cadastros;

import ClassesModel.Aluno;
import javax.swing.*;
import execultavel.Execucao;

public class cadastroAluno {
    public static void cadastrarAluno() {


                String nome = JOptionPane.showInputDialog(null, "Informe nome");
                String dataNascimento = JOptionPane.showInputDialog(null, "Informe dataNascimento");
                String numeroCpf = JOptionPane.showInputDialog(null, "Informe numeroCpf");
                String nomePai = JOptionPane.showInputDialog(null, "Informe nomePai");
                String nomeMae = JOptionPane.showInputDialog(null, "Informe nomeMae");
                String dataMatricula = JOptionPane.showInputDialog(null, "Informe dataMatricula");
                String NomeEscola = JOptionPane.showInputDialog(null, "Informe NomeEscola");

                Aluno aluno1 = new Aluno(nome, 4, dataNascimento, numeroCpf, nomePai, nomeMae, dataMatricula, NomeEscola, 9.5, 9.6, 9.5, 10.0);

        int resposta = JOptionPane.showConfirmDialog(null, "Deseja visualizar relatório? ");
        if (resposta == 0) {
            StringBuilder relatorio = new StringBuilder();
            relatorio.append("Nome: ").append(nome).append("\n");
            relatorio.append("Data de Nascimento: ").append(dataNascimento).append("\n");
            relatorio.append("CPF: ").append(numeroCpf).append("\n");
            relatorio.append("Nome do Pai: ").append(nomePai).append("\n");
            relatorio.append("Nome da Mãe: ").append(nomeMae).append("\n");
            relatorio.append("Data de Matrícula: ").append(dataMatricula).append("\n");
            relatorio.append("Nome da Escola: ").append(NomeEscola).append("\n");
            relatorio.append("Média de Notas: ").append(aluno1.getMediaNota());
            relatorio.append("Resultado final: ").append(aluno1.getResultadoFinal());

            JOptionPane.showMessageDialog(null, relatorio.toString(), "Relatório do Aluno", JOptionPane.INFORMATION_MESSAGE);
            Execucao.chamaMenuPrincipal();
        } else if (resposta == 1) {
            Execucao.chamaMenuPrincipal();
        } else {
            JOptionPane.showMessageDialog(null, " Opção não existente! ");
        }
        }

    }
