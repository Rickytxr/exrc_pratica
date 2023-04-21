import java.time.LocalDate;

public class TarefaDiaria extends Tarefa {
    public TarefaDiaria(String descricao, LocalDate data) {
        super(descricao, data);
    }

    @Override
    public boolean ocorreEm(int year, int month, int day) {
        LocalDate dataVerificada = LocalDate.of(year, month, day);
        return getData().getMonth().equals(dataVerificada.getMonth()) &&
                getData().getDayOfMonth() == dataVerificada.getDayOfMonth();
    }
}
