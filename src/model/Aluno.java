package model;

public class Aluno {
    
    private String nome;
    private int idade;
    private String sexo;
    private String situacao;

    public Aluno(String nome, int idade, String sexo, String situacao) {
        
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.situacao = situacao;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
}
