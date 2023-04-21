import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Collection {
    private List<Tarefa> tarefas;

    public Collection() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void modificarTarefa(int index, Tarefa tarefa) {
        if (index >= 0 && index < tarefas.size()) {
            tarefas.set(index, tarefa);
        }
    }

    public void apagarTarefa(int index) {
        if (index >= 0 && index < tarefas.size()) {
            tarefas.remove(index);
        }
    }

    public List<Tarefa> listarTarefasParaData(LocalDate data) {
        List<Tarefa> tarefasParaData = new ArrayList<>();
        for (Tarefa tarefa : tarefas) {
            if (tarefa.ocorreEm(data)) {
                tarefasParaData.add(tarefa);
            }
        }
        return tarefasParaData;
    }
}
