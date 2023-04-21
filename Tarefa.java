import java.time.LocalDate;

public class Tarefa {
    private String descricao;
    private LocalDate data;

    public Tarefa(String descricao, LocalDate data) {
        this.descricao = descricao;
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public boolean ocorreEm(int year, int month, int day) {
        LocalDate dataVerificada = LocalDate.of(year, month, day);
        return data.equals(dataVerificada);
    }

    public boolean ocorreEm(LocalDate data) {
        return data.equals(data);
    }
}