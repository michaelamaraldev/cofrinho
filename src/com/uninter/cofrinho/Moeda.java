import java.util.Objects;

public abstract class Moeda {

    protected double valor;

    public Moeda(double valorInicial) {
        this.valor = valorInicial;
    }

    public abstract void info();
    public abstract double converter();

// aqui tem que sobrescrever o equals pra conseguir achar a moeda certa pra remover da lista
    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) return true;
        if (objeto == null || getClass() != objeto.getClass()) return false;
        Moeda outraMoeda = (Moeda) objeto;
        return Double.compare(outraMoeda.valor, valor) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}