package ClassesModel;

public class Aluno {

    static String nome;
    int idade;
    String dataNascimento;
    String numeroCpf;
    String nomePai;
    String nomeMae;
    String dataMatricula;
    String nomeEscola;

    Disciplina disciplina;

    public Aluno(String nome, int idade, String dataNascimento, String numeroCpf, String nomePai, String nomeMae, String dataMatricula, String nomeEscola, Double nota1, Double nota2, Double nota3, Double nota4) {
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.numeroCpf = numeroCpf;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.dataMatricula = dataMatricula;
        this.nomeEscola = nomeEscola;

        this.disciplina = new Disciplina(); // Criado uma instância de Disciplina

        this.disciplina.setNota1(nota1);
        this.disciplina.setNota2(nota2);
        this.disciplina.setNota3(nota3);
        this.disciplina.setNota4(nota4);
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

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }


    public double getMediaNota()  {
        return (disciplina.getNota1() + disciplina.getNota2() + disciplina.getNota3() + disciplina.getNota4()) /4;
    }

    public String getResultadoFinal(){

        String resultado = "";
        if (getMediaNota() >= 7){
            resultado = "APROVADO";
            if (getMediaNota() > 9){
                resultado = "PARABENS ACIMA DA MÉDIA";
            }

        } else if (getMediaNota() < 7 && getMediaNota() >=5) {
            resultado ="RECUPERAÇão";
        }else {
            resultado = "REPROVADO";
        }

        return resultado;
    }

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
