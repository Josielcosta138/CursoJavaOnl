package cadastros;

import ClassesModel.Aluno;
import javax.swing.*;

public class cadastroAluno {
    public static void cadastrar(){
        Aluno aluno1 = new Aluno("Jose",23,"23-02-1993","3213-123","Joao","Maria","23-02-2020","Satc",9.5,9.6,9.5,10.0);

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
