public class Real extends Moeda {

    public Real(double valorInicial) {
        super(valorInicial);
    }

    @Override
    public void info() {
        System.out.println("Real - R$ " + this.valor);
    }

    @Override
    public double converter() {
        // o real ja tá na moeda certa, então só retorna ele mesmo
        return this.valor;
    }

    @Override
    public String toString() {
        return "Real";
    }
}