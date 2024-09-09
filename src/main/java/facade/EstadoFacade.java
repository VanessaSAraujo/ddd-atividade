package facade;

import application.EstadoApplication;
import entities.Estado;
import java.util.Scanner;

public class EstadoFacade {
    private EstadoApplication estadoApplication;
    private Scanner scanner;

    public EstadoFacade() {
        this.estadoApplication = new EstadoApplication();
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao = 0;

        while (opcao != 6) {
            System.out.println("\n1 - Novo estado");
            System.out.println("2 - Atualizar estado");
            System.out.println("3 - Listar estados");
            System.out.println("4 - Buscar estado pelo DDD");
            System.out.println("5 - Remover estado");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    criarEstado();
                    break;
                case 2:
                    atualizarEstado();
                    break;
                case 3:
                    listarEstados();
                    break;
                case 4:
                    buscarEstadoPorDDD();
                    break;
                case 5:
                    removerEstado();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void criarEstado() {
        System.out.print("Digite o DDD: ");
        int ddd = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer
        System.out.print("Digite o nome do estado: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o caminho da imagem: ");
        String imagem = scanner.nextLine();
        estadoApplication.criarEstado(ddd, nome, imagem);
        System.out.println("Estado criado com sucesso!");
    }

    private void atualizarEstado() {
        System.out.print("Digite o DDD do estado a ser atualizado: ");
        int ddd = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer
        System.out.print("Digite o novo nome do estado: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o novo caminho da imagem: ");
        String imagem = scanner.nextLine();
        estadoApplication.atualizarEstado(ddd, nome, imagem);
        System.out.println("Estado atualizado com sucesso!");
    }

    private void listarEstados() {
        for (Estado estado : estadoApplication.listarEstados()) {
            System.out.println("DDD: " + estado.getDdd() + ", Nome: " + estado.getNome() + ", Imagem: " + estado.getCaminhoImagem());
        }
    }

    private void buscarEstadoPorDDD() {
        System.out.print("Digite o DDD: ");
        int ddd = scanner.nextInt();
        Estado estado = estadoApplication.buscarPorDDD(ddd);
        if (estado != null) {
            System.out.println("DDD: " + estado.getDdd() + ", Nome: " + estado.getNome() + ", Imagem: " + estado.getCaminhoImagem());
        } else {
            System.out.println("Estado não encontrado!");
        }
    }

    private void removerEstado() {
        System.out.print("Digite o DDD do estado a ser removido: ");
        int ddd = scanner.nextInt();
        estadoApplication.removerEstado(ddd);
        System.out.println("Estado removido com sucesso!");
    }
}
