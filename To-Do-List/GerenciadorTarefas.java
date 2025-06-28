import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {
    private List<Tarefa> tarefas;

    public GerenciadorTarefas() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa adicionada.");
        } else {
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println((i + 1) + ". " + tarefas.get(i));
            }
        }
    }

    public void concluirTarefa(int indice) {
        if (indice >= 1 && indice <= tarefas.size()) {
            tarefas.get(indice - 1).marcarComoConcluida();
            System.out.println("Tarefa concluída!");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void removerTarefa(int indice) {
        if (indice >= 1 && indice <= tarefas.size()) {
            tarefas.remove(indice - 1);
            System.out.println("Tarefa removida!");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
