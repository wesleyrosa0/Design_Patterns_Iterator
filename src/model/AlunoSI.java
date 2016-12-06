
package model;

public class AlunoSI implements MyIterator{
    
    private Aluno colecao[] = new Aluno[10];
    private int cont = 0;
    private int qtd = 0;
    
    public void add(Aluno novo){
        colecao[qtd] = novo;
        qtd++;
    }

    @Override
    public boolean hasNext() {
        if (cont >= colecao.length || colecao[cont] == null) {
            cont = 0;
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Aluno next() {
        Aluno aluno = colecao[cont];
        cont++;
        return aluno;
    }    
}
