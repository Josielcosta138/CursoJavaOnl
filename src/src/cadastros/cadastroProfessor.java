package cadastros;

import ClassesModel.ProfessorTeste;
import ClassesModel.Validacoes;

import javax.swing.*;

public class cadastroProfessor {

    public static void cadastrar(){

        String nome1 = JOptionPane.showInputDialog(null," Informe seu 1 nome");
        ProfessorTeste professorTeste1 = new ProfessorTeste(nome1);
        Validacoes.validarCamposNulo(nome1);


        String nome2 = JOptionPane.showInputDialog(null," Informe seu 2 nome");
        ProfessorTeste professorTeste2 =new ProfessorTeste(nome2);
        Validacoes.validarCamposNulo(nome2);

        Validacoes.validarObjetosIguais(nome1, nome2);


    }




}
