package principles.srp.correct;

public class DebitoContaCorrente {

    public double debitarConta(double valorDebitar, double saldo) {

        SaldoContaCorrente saldoConta = new SaldoContaCorrente();
        boolean validaSaldo = saldoConta.validarSaldo(valorDebitar, saldo);

        if(validaSaldo)
            return (saldo - valorDebitar);
        else
            return saldo;
    }


}
