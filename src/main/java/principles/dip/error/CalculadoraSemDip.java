package principles.dip.error;

public class CalculadoraSemDip {

    public enum Operacao{
        ADD, SUB, MULT, DIV
    }

    public double calcular(double numA, double numB, Operacao operacao){

        double result = 0;

        switch(operacao){

            case ADD:
                AdicaoSemDip addOp = new AdicaoSemDip();
                result = addOp.adicionar(numA, numB);
                break;
            case SUB:
                SubtracaoSemDip subOp = new SubtracaoSemDip();
                result = subOp.subtrair(numA, numB);
                break;
            case MULT:
                MultiplicacaoSemDip multOp = new MultiplicacaoSemDip();
                result = multOp.multiplicar(numA, numB);
                break;
            case DIV:
                DivisaoSemDip divOp = new DivisaoSemDip();
                result = divOp.dividir(numA, numB);
                break;

        }

        return result;

    }
}
