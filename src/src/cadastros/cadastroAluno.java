package cadastros;

import ClassesModel.Aluno;
import javax.swing.*;

import ClassesModel.Disciplina;
import ClassesModel.Validacoes;
import execultavel.Execucao;

import java.sql.ClientInfoStatus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class cadastroAluno {
    public static void cadastrarAluno() throws ParseException {


        String nome = JOptionPane.showInputDialog(null, "Informe nome", "Cadastro do Aluno", JOptionPane.INFORMATION_MESSAGE);
        Validacoes.validarCamposNulo(nome);
        String dataNascimento = JOptionPane.showInputDialog(null, "Informe data Nascimento dd/MM/yyyy");
        Validacoes.validarCamposNulo(dataNascimento);
        String numeroCpf = JOptionPane.showInputDialog(null, "Informe numero Cpf");
        Validacoes.validarCamposNulo(numeroCpf);
        String nomePai = JOptionPane.showInputDialog(null, "Informe nome Pai");
        Validacoes.validarCamposNulo(nomePai);
        String nomeMae = JOptionPane.showInputDialog(null, "Informe nome Mae");
        Validacoes.validarCamposNulo(nomeMae);
        String dataMatricula = JOptionPane.showInputDialog(null, "Informe data Matricula dd/MM/yyyy");
        Validacoes.validarCamposNulo(dataMatricula);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse(dataMatricula);
        String NomeEscola = JOptionPane.showInputDialog(null, "Informe Nome Escola");
        Validacoes.validarCamposNulo(NomeEscola);

        Aluno aluno = new Aluno();

        aluno.setNome(nome);
        aluno.setNomePai(nomePai);
        aluno.setNomeMae(nomeMae);
        aluno.setDataMatricula(data);
        aluno.setNomeEscola(NomeEscola);
        aluno.setNumeroCpf(numeroCpf);

        for (int pos = 1; pos <= 4; pos++ ){
            String nomeDisciplina = JOptionPane.showInputDialog(null,"Nome da disciplina "+pos+" ?");
            String notaDisciplina = JOptionPane.showInputDialog(null,"Nota da disciplina "+pos+" ?");

            Disciplina disciplina = new Disciplina();
            disciplina.setDisciplina(nomeDisciplina);
            disciplina.setNota(Double.parseDouble(notaDisciplina));

            aluno.getDisciplinas().add(disciplina);
        }

        int escolha = JOptionPane.showConfirmDialog(null,"Deseja remover alguma disciplina ?");
        if (escolha == 0){
            int continuarRemover  = 0;
            while (continuarRemover == 0) {

                JOptionPane.showMessageDialog(null,aluno.getDisciplinas());

                String disciplinaRemover = JOptionPane.showInputDialog(null, "Qual a disciplina 1, 2, 3 ou 4? ");
                aluno.getDisciplinas().remove(Integer.parseInt(disciplinaRemover) - 1);
                JOptionPane.showMessageDialog(null, "Disciplina removida: " + aluno.getDisciplinas().get(Integer.parseInt(disciplinaRemover)));
                continuarRemover = JOptionPane.showConfirmDialog(null, " Continuar remover? ");
            }
        }else if(escolha == 1){
            JOptionPane.showConfirmDialog(null,"Não remover!");
        } else if (escolha == 2) {
            Execucao.chamaMenuPrincipal();
        }


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
            relatorio.append("Nome da Disciplinas  : ").append(aluno.getDisciplinas()).append("\n");
            relatorio.append("Média de Notas: ").append(aluno.getMedia()+("\n"));
            relatorio.append("Resultado final: ").append(aluno.getResultado());
            JOptionPane.showMessageDialog(null, relatorio.toString(), "Relatório do Aluno", JOptionPane.INFORMATION_MESSAGE);



            if (aluno.getMedia() >= 5 && aluno.getMedia() < 7){
                int opcaoRecuperacao = JOptionPane.showConfirmDialog(null, "Recuperação, deseja refazer notas? ");
                if (opcaoRecuperacao == 0) {

                    for (int pos = 1; pos <= 4; pos++) {
                        String nomeDisciplina = JOptionPane.showInputDialog(null, "Nome da disciplina " + pos + " ?", "Notas de Recuperação", JOptionPane.INFORMATION_MESSAGE);
                        String notaDisciplina = JOptionPane.showInputDialog(null, "Nota da disciplina " + pos + " ?", "Notas de Recuperação", JOptionPane.INFORMATION_MESSAGE);

                        Disciplina disciplina = new Disciplina();
                        disciplina.setDisciplina(nomeDisciplina);
                        disciplina.setNota(Double.parseDouble(notaDisciplina));

                        aluno.getDisciplinas().add(disciplina);
                    }

                    StringBuilder relatorio1 = new StringBuilder();
                    relatorio1.append("Nome: ").append(nome).append("\n");
                    relatorio1.append("Nome da Disciplinas  : ").append(aluno.getDisciplinas()).append("\n");
                    relatorio1.append("Nova - Média de Notas: ").append(aluno.getMedia() + ("\n"));
                    relatorio1.append("Novo - Resultado final: ").append(aluno.getResultado());
                    JOptionPane.showMessageDialog(null, relatorio1.toString(), "Relatório do Aluno", JOptionPane.INFORMATION_MESSAGE);

                }else if(opcaoRecuperacao == 1){
                    JOptionPane.showMessageDialog(null,"Desistência! ");
                    Execucao.chamaMenuPrincipal();
                }
                else if(opcaoRecuperacao == 2){
                    Execucao.chamaMenuPrincipal();
                }
            }
            Execucao.chamaMenuPrincipal();

        } else if (resposta == 1) {
            Execucao.chamaMenuPrincipal();
        } else if(resposta == 2){
            Execucao.chamaMenuPrincipal();
            JOptionPane.showMessageDialog(null, " Opção não existente! ");
        }
    }
}


