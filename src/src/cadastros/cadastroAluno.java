package cadastros;

import ClassesModel.Aluno;
import javax.swing.*;

import ClassesModel.Disciplina;
import execultavel.Execucao;

import java.sql.ClientInfoStatus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class cadastroAluno {
    public static void cadastrarAluno() throws ParseException {



        String nome = JOptionPane.showInputDialog(null, "Informe nome");
        String dataNascimento = JOptionPane.showInputDialog(null, "Informe data Nascimento dd/MM/yyyy");
        String numeroCpf = JOptionPane.showInputDialog(null, "Informe numero Cpf");
        String nomePai = JOptionPane.showInputDialog(null, "Informe nome Pai");
        String nomeMae = JOptionPane.showInputDialog(null, "Informe nome Mae");
        String dataMatricula = JOptionPane.showInputDialog(null, "Informe data Matricula dd/MM/yyyy");
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = formato.parse(dataMatricula);
        String NomeEscola = JOptionPane.showInputDialog(null, "Informe Nome Escola");

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
            String disciplinaRemover = JOptionPane.showInputDialog(null, "Qual a disciplina 1, 2, 3 ou 4? ");
            aluno.getDisciplinas().remove(Integer.parseInt(disciplinaRemover) - 1);
            JOptionPane.showMessageDialog(null,"Disciplina removida: " +aluno.getDisciplinas().get(Integer.parseInt(disciplinaRemover)));
        }else {
            JOptionPane.showConfirmDialog(null,"Não remover!");
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
            relatorio.append("Nome da Disciplinas 1 : ").append(aluno.getDisciplinas()).append("\n");
            relatorio.append("Média de Notas: ").append(aluno.getMedia()+("\n"));
            relatorio.append("Resultado final: ").append(aluno.getResultado());

            JOptionPane.showMessageDialog(null, relatorio.toString(), "Relatório do Aluno", JOptionPane.INFORMATION_MESSAGE);
            Execucao.chamaMenuPrincipal();
        } else if (resposta == 1) {
            Execucao.chamaMenuPrincipal();
        } else {
            JOptionPane.showMessageDialog(null, " Opção não existente! ");
        }
    }
}


