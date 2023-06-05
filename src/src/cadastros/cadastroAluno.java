package cadastros;

import ClassesModel.Aluno;
import javax.swing.*;

public class cadastroAluno {
    public static void cadastrar(){

        String nome = JOptionPane.showInputDialog(null,"Informe nome");
        String idadE = JOptionPane.showInputDialog(null,"Informe idade");
        int idade = Integer.parseInt(idadE);
        String dataNascimento = JOptionPane.showInputDialog(null,"Informe dataNascimento");
        String numeroCpf = JOptionPane.showInputDialog(null,"Informe numeroCpf");
        String nomePai = JOptionPane.showInputDialog(null,"Informe nomePai");
        String nomeMae = JOptionPane.showInputDialog(null,"Informe nomeMae");
        String dataMatricula = JOptionPane.showInputDialog(null,"Informe dataMatricula");
        String NomeEscola = JOptionPane.showInputDialog(null,"Informe NomeEscola");


        Aluno aluno1 = new Aluno(nome,idade,dataNascimento,numeroCpf,nomePai,nomeMae,dataMatricula,NomeEscola,9.5,9.6,9.5,10.0);

        int resposta = JOptionPane.showConfirmDialog(null," Deseja ver o aluno cadastrado e sua média ?");

        if (resposta == 0){
            JOptionPane.showMessageDialog(null," SIM!! \n " +
                    " Aluno "+ aluno1 +
                    "\n Média: " + aluno1.getMediaNota()+
                    "\n Resultado : " +aluno1.getResultadoFinal()
            );
        }else if (resposta == 1){
            JOptionPane.showMessageDialog(null, "NÃO");
        } else if (resposta == 2) {
            JOptionPane.showMessageDialog(null,"CANCELADO");
        }

    }


}
