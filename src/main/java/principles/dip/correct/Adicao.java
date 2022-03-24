package principles.dip.correct;

public class Adicao implements CalduladoraOperacoes{

    @Override
    public double calcular(double numbA, double numB) {
        return (numbA + numB);
    }
}
