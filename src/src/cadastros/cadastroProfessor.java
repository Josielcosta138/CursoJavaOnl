package cadastros;

import ClassesModel.ProfessorTeste;
import ClassesModel.Validacoes;

import javax.swing.*;
import java.text.ParseException;

public class cadastroProfessor {

    public static void cadastrarProfessor() throws ParseException {

        String nome1 = JOptionPane.showInputDialog(null," Nome 1 Professor");
        ProfessorTeste prof1 = new ProfessorTeste(nome1);
        Validacoes.validarCamposNulo(prof1.getNome());

        String nome2 = JOptionPane.showInputDialog(null," Informe 2 Professor");
        ProfessorTeste prof2 = new ProfessorTeste(nome2);
        Validacoes.validarCamposNulo(prof2.getNome());

        Validacoes.validarObjetosIguais(prof1.getNome(), prof2.getNome());




    }




}
