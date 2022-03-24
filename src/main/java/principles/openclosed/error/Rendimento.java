package principles.openclosed.error;

public class Rendimento {

    public double Render(int valor, String tipo){

        double taxaContaCorrente = 0;
        double taxaPoupanca = 10;
        double taxaContaSalario = 6;
        double totalRendimento = 0;

        if(("CC").equals(tipo)){
            totalRendimento = (valor * (taxaContaCorrente/100));
        }

        if(("POUP").equals(tipo)){
            totalRendimento = (valor * (taxaPoupanca/100));
        }

        if(("CS").equals(tipo)){
            totalRendimento = (valor * (taxaContaSalario/100));
        }

        return totalRendimento;

    }
}
