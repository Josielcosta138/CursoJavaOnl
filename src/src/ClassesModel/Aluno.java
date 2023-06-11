package ClassesModel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aluno {

    private String nome;
    private int idade;
    private String dataNascimento;
    private String numeroCpf;
    private String nomePai;
    private String nomeMae;
    private Date dataMatricula;
    private String nomeEscola;
    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public double getMedia() {

        double somaNotas = 0.0;
        for (Disciplina disciplina : disciplinas) {
            somaNotas += disciplina.getNota();
        }

        return somaNotas / disciplinas.size();
    }

    public String getResultado(){

        String resultado = "";
        if (getMedia() >=7){
            resultado = ("Aprovado!" +" Média: "+ getMedia());

        } else if (getMedia() >=5 && getMedia() < 7) {
            resultado = ("Recupereção !" +" Média: "+ getMedia());
        } else {
            resultado = ("Reprovado !" +" Média: "+ getMedia());
        }
       return resultado;
    }

    /*
    public static void validarResultadoFim(String nome, Double media, String resultado ){
        int resposta = JOptionPane.showConfirmDialog(null," Deseja ver o aluno cadastrado e sua média ?");

        if (resposta == 0){
            JOptionPane.showMessageDialog(null," SIM!! \n " +
                    " Aluno "+ nome +
                    "\n Média: " + media+
                    "\n Resultado : " + resultado
            );
        }else if (resposta == 1){
            JOptionPane.showMessageDialog(null, "NÃO");
        } else if (resposta == 2) {
            JOptionPane.showMessageDialog(null,"CANCELADO");
        }

    } */

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", dataMatricula='" + dataMatricula + '\'' +
                ", nomeEscola='" + nomeEscola + '\'' +
                '}';
    }
}
