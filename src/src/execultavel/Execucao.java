package execultavel;

import ClassesModel.Aluno;
import cadastros.cadastroProfessor;
import cadastros.cadastroAluno;
import relatorios.RelatorioAluno;


import javax.swing.*;

public class Execucao {
    public static void chamaMenuPrincipal() {

        String[] opcoesMenu = {"Cadastros", "Relatórios", "Sair"};
        int opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção: ",
                "Menu Principal",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoesMenu, opcoesMenu[0]);
        switch (opcao) {
            case 0: //Cadastros

                String[] opcoesMenuCad = {"Professor", "Aluno", "Sair"};
                int opcaoCad = JOptionPane.showOptionDialog(null, "Escolha uma opção: ",
                        "Menu Cadastro - Usuários",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoesMenuCad, opcoesMenuCad[0]);
                switch (opcaoCad) {
                    case 0: //Cadastro Professor
                        cadastroProfessor.cadastrarProfessor();
                        chamaMenuPrincipal();
                        break;
                    case 1: //Cadastro Aluno
                        cadastroAluno.cadastrarAluno();
                        RelatorioAluno.EmitirRelatorio();
                        chamaMenuPrincipal();
                        break;
                    case 2: //Sair
                        chamaMenuPrincipal();
                        break;
                }
                break;

            case 1: //Relatórios
                //RelatorioAluno.EmitirRelatorio();
                chamaMenuPrincipal();
                break;
            case 2: //Sair
                System.exit(0);
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                break;

        }

    }

}
