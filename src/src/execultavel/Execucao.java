package execultavel;

import cadastros.cadastroProfessor;

import javax.swing.*;

public class Execucao {
    public static void chamaMenuPrincipal() {

        String[] opcoesMenu = {"Cadastros", "Sair"};
        int opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção: ",
                "Menu Principal",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoesMenu, opcoesMenu[0]);
        switch (opcao) {
            case 0: //Cadastros
                cadastroProfessor.cadastrar();
                chamaMenuPrincipal();
                break;
            case 1: //Sair
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                break;

        }

    }

}
