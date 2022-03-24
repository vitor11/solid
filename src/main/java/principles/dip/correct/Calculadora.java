package principles.dip.correct;

public class Calculadora {

    public double calcularOperacao(double numA, double numB, CalduladoraOperacoes operacao){
        return operacao.calcular(numA, numB);
    }
}
