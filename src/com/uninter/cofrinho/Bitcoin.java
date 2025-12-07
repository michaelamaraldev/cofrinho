// classe extra
public class Bitcoin extends Moeda {

    public Bitcoin(double valorInicial) {
        super(valorInicial);
    }

    @Override

    public void info() {
        System.out.println("Bitcoin - BTC " + this.valor);
    }

    @Override
    public double converter() {
        // cotação dia 7/dez/2025
        return this.valor * 487416.28;
    }

    @Override
    public String toString() {
        return "Bitcoin";
    }
}