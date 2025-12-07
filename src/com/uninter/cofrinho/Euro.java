public class Euro extends Moeda {

    public Euro(double valorInicial) {
        super(valorInicial);
    }

    @Override
    public void info() {
        System.out.println("Euro - € " + this.valor);
    }

    @Override
    public double converter() {
        // cotação dia 7/dez/2025
        return this.valor * 6.19;
    }

    @Override
    public String toString() {
        return "Euro";
    }
}