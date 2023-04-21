
import java.time.LocalDate;

public class TesteTarefas {
    public static void main(String[] args) {
        Tarefa tarefaUnica = new TarefaUnica("Comprar pão", LocalDate.of(2023, 4, 22));
        Tarefa tarefaDiaria = new TarefaDiaria("Dia de ginasio", LocalDate.of(2023, 4, 21));
        Tarefa tarefaMensal = new TarefaMensal("Meu aniversario", LocalDate.of(2023, 4, 30), 30);

        System.out.println("Tarefa única ocorre em 2023/04/22: " + tarefaUnica.ocorreEm(2023, 4, 22));
        System.out.println("Tarefa diária ocorre em 2023/04/21: " + tarefaDiaria.ocorreEm(2023, 4, 21));
        System.out.println("Tarefa mensal ocorre em 2023/04/30: Dia do Meu aniversairio " + tarefaMensal.ocorreEm(2023, 4, 30));
    }
}
