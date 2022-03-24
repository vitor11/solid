package principles;

import principles.dip.correct.*;
import principles.liskov.correct.example.A;
import principles.liskov.correct.example.B;
import principles.liskov.correct.example.Imprime;

import java.io.IOException;
import java.text.ParseException;

public class Principal {

    public static void main(String[] args) throws IOException, ParseException {

        // SEM SRP
        /*DebitoContaCorrenteSemSrp debito = new DebitoContaCorrenteSemSrp(100.00,50.00);
        debito.emitirComprovante();*/

        /*Conta dadosConta = new Conta();

        dadosConta.setSaldo(100.00);
        dadosConta.setValorDebitar(50.00);

        DebitoContaCorrente debito = new DebitoContaCorrente();
        double saldoAtual = debito.debitarConta(dadosConta.getValorDebitar(), dadosConta.getSaldo());

        ComprovanteContaCorrente comprovante = new ComprovanteContaCorrente();
        comprovante.EmitirComprovante(saldoAtual);*/

        // LISKOV //
        /*A objetoA = new A();
        B objetoB = new B();

        Imprime t = new Imprime();

        t.imprimeNome(objetoA);
        t.imprimeNome(objetoB);*/


        // DIP
        /**/
        Adicao add = new Adicao();
        Multiplicacao mult = new Multiplicacao();
        Divisao div = new Divisao();
        Subtracao sub = new Subtracao();

        Calculadora calc = new Calculadora();
        System.out.println("VALOR "+calc.calcularOperacao(1, 3, add));/**/

        // SEM DIP
        /*System.out.println("VALOR "+add.calculate(5, 6));
        System.out.println("VALOR "+mult.calculate(5, 6));
        System.out.println("VALOR "+div.calculate(5, 6));
        System.out.println("VALOR "+sub.calculate(5, 6));*/

    }
}
