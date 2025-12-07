public class Dolar extends Moeda {

    public Dolar(double valorInicial) {
        super(valorInicial);
    }

    @Override
    public void info() {
        System.out.println("Dolar - US$ " + this.valor);
    }

    @Override
    public double converter() {
        // cotação dia 7/dez/2025
        return this.valor * 5.44;
    }

    @Override
    public String toString() {
        return "Dolar";
    }
}