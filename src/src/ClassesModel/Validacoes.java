package ClassesModel;

import javax.swing.*;
import cadastros.cadastroProfessor;

public class Validacoes {

    public static void validarCamposNulo(String  campo){

        while (campo == null || campo.isEmpty()){
            JOptionPane.showMessageDialog(null,"Campo nulo. Informe nome!");
            campo = JOptionPane.showInputDialog(null," Informe nome!");
            if (campo == null){
             cadastroProfessor.cadastrar();
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
