
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
/*
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Tarefa t1 = new TarefaUnica("lavar a roupa", LocalDate.of(2023, 4, 22));
        Tarefa t2 = new TarefaDiaria("ir a praia", LocalDate.of(2023, 4, 21));
        Tarefa t3 = new TarefaMensal("Pagar contas", LocalDate.of(2023, 4, 1), 30);

        LocalDate data1 = LocalDate.of(2023, 4, 22);
        LocalDate data2 = LocalDate.of(2023, 4, 21);
        LocalDate data3 = LocalDate.of(2023, 4, 30);

        System.out.println(t1.getDescricao() + " ocorre em " + data1 + ": " + t1.ocorreEm(data1));
        System.out.println(t2.getDescricao() + " ocorre em " + data2 + ": " + t2.ocorreEm(data2));
        System.out.println(t3.getDescricao() + " ocorre em " + data3 + ": " + t3.ocorreEm(data3));
    }
}

 */