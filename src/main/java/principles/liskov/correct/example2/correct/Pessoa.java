package principles.liskov.correct.example2.correct;

public class Pessoa {

    public String nome;
    public long cpf;
    public long rg;
    public long cnpj;

    public Pessoa(String nome, long cpf, long rg, long cnpj){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.cnpj = cnpj;
    }

    public String TipoPessoa(){
        if(("").equals(cpf))
            return "Pessoa Juridica";
        else
            return "Pessoa Física";
    }



}
