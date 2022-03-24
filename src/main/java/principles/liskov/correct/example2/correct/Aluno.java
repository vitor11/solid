package principles.liskov.correct.example2.correct;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class Aluno extends Pessoa{

    public double notas;
    public int presenca;
    public String mensagem;


    public Aluno(String nome, long cpf, long rg, long cnpj) {
        super(nome, cpf, rg, cnpj);
    }

    public boolean reprovarPorFreguencia(){
        return (presenca > 30) ? TRUE : FALSE;
    }

    public boolean aprovarPorNota(){
        return (notas > 5.0) ? TRUE : FALSE;
    }

    public String resultadoFinal(){

        if(reprovarPorFreguencia() && aprovarPorNota())
            return nome.concat(" aprovado com nota e frequencia");
        else
            return "Reprovado";
    }
}
