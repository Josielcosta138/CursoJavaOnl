package ClassesModel;

import javax.swing.*;
import cadastros.cadastroProfessor;
import cadastros.cadastroAluno;
import execultavel.Execucao;

import java.text.ParseException;

public class Validacoes {

    Aluno aluno;

    public static void validarCamposNulo(String  campo) throws ParseException {

        while (campo == null || campo.isEmpty()){
            JOptionPane.showMessageDialog(null,"Campo nulo. Informe campo!");
            cadastroAluno.cadastrarAluno();
            if (campo == null){
                Execucao.chamaMenuPrincipal();
            }
        }
    }

    public static void validarObjetosIguais(String objtIgual1, String objtIgual2){
        if (objtIgual1.equals(objtIgual2)){
            JOptionPane.showMessageDialog(null,"Nomes iguais:  Nome1: "+objtIgual1 + " Nome2: "+objtIgual2  );
        }else {
            JOptionPane.showMessageDialog(null,"Nomes diferente: Nome1: "+objtIgual1 + " Nome2: "+objtIgual2 );
        }
    }



}
