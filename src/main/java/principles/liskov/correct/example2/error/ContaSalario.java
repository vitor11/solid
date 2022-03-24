package principles.liskov.correct.example2.error;


public class ContaSalario extends ContaCorrenteComum {

    public void rende() throws Exception {
        throw new Exception("Essa conta não possui rendimento");
    }

}