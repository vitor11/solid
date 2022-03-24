package principles.srp.error;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class DebitoContaCorrenteSemSrp {


    private final double saldoInicial;
    private final double valorDebito;

    public DebitoContaCorrenteSemSrp(double saldoInicial, double valorDebito){
        this.saldoInicial = saldoInicial;
        this.valorDebito = valorDebito;
    }


    public boolean validarSaldo() {

        if((saldoInicial > 0.00) && (valorDebito <= saldoInicial))
            return TRUE;
        else
            return FALSE;
    }

    public double debitarConta() {

        if(validarSaldo())
            return (saldoInicial - valorDebito);
        else
            return saldoInicial;
    }

    public void emitirComprovante() {
        System.out.println("Saldo: R$ "+debitarConta());
    }
}
