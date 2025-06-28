import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== Lista de Tarefas ===");
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Listar Tarefas");
            System.out.println("3 - Concluir Tarefa");
            System.out.println("4 - Remover Tarefa");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    gerenciador.adicionarTarefa(descricao);
                    break;
                case 2:
                    gerenciador.listarTarefas();
                    break;
                case 3:
                    System.out.print("Número da tarefa a concluir: ");
                    int indiceConcluir = scanner.nextInt();
                    gerenciador.concluirTarefa(indiceConcluir);
                    break;
                case 4:
                    System.out.print("Número da tarefa a remover: ");
                    int indiceRemover = scanner.nextInt();
                    gerenciador.removerTarefa(indiceRemover);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
