import java.util.ArrayList;

public class Cofrinho {

    private ArrayList<Moeda> listaMoedas;

    public Cofrinho() {
        this.listaMoedas = new ArrayList<>();
    }

    public void adicionar(Moeda moeda) {
        this.listaMoedas.add(moeda);
    }

    public void remover(Moeda moeda) {
        // Aqui é pra usar aquele equals que fiz na classe Moeda
        boolean removeu = this.listaMoedas.remove(moeda);
        if(removeu) {
            System.out.println("Moeda removida com sucesso!");
        } else {
            System.out.println("Não encontrei esta moeda pra remover.");
        }
    }

    public void listagemMoedas() {
        // verifica se tá vazio antes de tentar listar
        if (this.listaMoedas.isEmpty()) {
            System.out.println("cofrinho ta vazio!");
            return;
        }

        System.out.println("--- LISTA DE MOEDAS ---");
        for (Moeda m : this.listaMoedas) {
            // aqui acontece o polimorfismo
            m.info();
        }
    }

    public void totalConvertido() {
        if (this.listaMoedas.isEmpty()) {
            System.out.println("Cofrinho vazio, total: R$ 0,00");
            return;
        }

        double valorTotalAcumulado = 0;

        for (Moeda m : this.listaMoedas) {
            // soma tudo convertendo pra real
            valorTotalAcumulado += m.converter();
        }

        // printf pra formatar bonitinho com duas casas decimais
        System.out.printf("Total convertido para Real: R$ %.2f%n", valorTotalAcumulado);
    }
}