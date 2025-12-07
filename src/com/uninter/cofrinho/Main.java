import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
        int opcaoSelecionada = -1;

        System.out.println("--- SISTEMA COFRINHO ---");
        System.out.println("Aluno: Michael - RU: 5405408");

        while (opcaoSelecionada != 0) {
            exibirMenuPrincipal();

            try {
                opcaoSelecionada = scanner.nextInt();

                switch (opcaoSelecionada) {
                    case 1:
                        exibirSubMenuAdicionar(scanner, cofrinho);
                        break;
                    case 2:
                        exibirSubMenuRemover(scanner, cofrinho);
                        break;
                    case 3:
                        // chama o metodo do cofrinho pra listar tudo
                        cofrinho.listagemMoedas();
                        break;
                    case 4:
                        // mostra o total ja convertido
                        cofrinho.totalConvertido();
                        break;
                    case 0:
                        System.out.println("Encerrando o sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida, tente novamente.");
                }
            } catch (InputMismatchException e) {
                // coloquei esse try catch pra não quebrar se o usuário digitar letra no menu
                System.out.println("Erro: digite apenas números inteiros, por favor.");
                scanner.nextLine(); // limpar o buffer do scanner pra não entrar em loop infinito
            }
        }

        scanner.close(); // pra fechar o scanner
    }

    private static void exibirMenuPrincipal() {
        System.out.println("\n--- MENU ---");
        System.out.println("1 - Adicionar Moeda");
        System.out.println("2 - Remover Moeda");
        System.out.println("3 - Listar Moedas");
        System.out.println("4 - Calcular total convertido (R$)");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void exibirSubMenuAdicionar(Scanner scanner, Cofrinho cofrinho) {
        System.out.println("\nEscolha a moeda:");
        System.out.println("1 - Real");
        System.out.println("2 - Dolar");
        System.out.println("3 - Euro");
        System.out.println("4 - Bitcoin"); // adicionei uma nova moeda

        int tipoMoeda = scanner.nextInt();
        System.out.print("Digite o valor da moeda (use virgula): ");
        double valor = scanner.nextDouble();

        Moeda moeda = null;

        if (tipoMoeda == 1) {
            moeda = new Real(valor);
        } else if (tipoMoeda == 2) {
            moeda = new Dolar(valor);
        } else if (tipoMoeda == 3) {
            moeda = new Euro(valor);
        } else if (tipoMoeda == 4) {
            moeda = new Bitcoin(valor);
        } else {
            System.out.println("Tipo de moeda inválido!");
            return;
        }

        cofrinho.adicionar(moeda);
        System.out.println("moeda adicionada!");
    }

    private static void exibirSubMenuRemover(Scanner scanner, Cofrinho cofrinho) {
        System.out.println("\n--- REMOVER MOEDA ---");
        System.out.println("1 - Real");
        System.out.println("2 - Dolar");
        System.out.println("3 - Euro");
        System.out.println("4 - Bitcoin");

        int tipoMoeda = scanner.nextInt();
        System.out.print("Digite o valor da moeda pra remover: ");
        double valor = scanner.nextDouble();

        Moeda moedaParaRemover = null;

        if (tipoMoeda == 1) {
            moedaParaRemover = new Real(valor);
        } else if (tipoMoeda == 2) {
            moedaParaRemover = new Dolar(valor);
        } else if (tipoMoeda == 3) {
            moedaParaRemover = new Euro(valor);
        } else if (tipoMoeda == 4) {
            moedaParaRemover = new Bitcoin(valor);
        } else {
            System.out.println("Tipo inválido.");
            return;
        }

        cofrinho.remover(moedaParaRemover);
    }
}