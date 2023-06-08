package ClassesModel;

import javax.swing.*;

public class ProfessorTeste {
    private String nome;

    public ProfessorTeste(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "ProfessorTeste{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
