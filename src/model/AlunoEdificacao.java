
package model;

import java.util.ArrayList;

public class AlunoEdificacao implements MyIterator{
    
    private ArrayList <Aluno> colecao = new <Aluno> ArrayList();
    private int cont = 0;
    private int qtd = 0;
    
    public void add(Aluno novo){
        colecao.add(novo);
        qtd++;
    }

    @Override
    public boolean hasNext() {
        if (cont >= colecao.size() || colecao.get(cont) == null) {
            cont = 0;
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Aluno next() {
        Aluno aluno = colecao.get(cont);
        cont++;
        return aluno;
    }    
}
