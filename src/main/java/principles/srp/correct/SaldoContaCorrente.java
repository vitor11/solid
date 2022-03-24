package principles.srp.correct;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class SaldoContaCorrente {

    public boolean validarSaldo(double valorDebitar, double saldo) {

        if( (saldo > 0.00) && (valorDebitar <= saldo) )
            return  TRUE;
        else
            return FALSE;

    }

}

