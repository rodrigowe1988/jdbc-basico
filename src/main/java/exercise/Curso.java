package exercise;

import java.io.Serializable;
import java.sql.Time;
import java.time.Duration;
import java.util.Date;

public class Curso implements Serializable {

    private Integer id;
    private String nome;
    private Integer duracao_horas;

    public Curso() {
    }

    public Curso(Integer id, String nome, Integer duracao_horas) {
        this.id = id;
        this.nome = nome;
        this.duracao_horas = duracao_horas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDuracao_horas() {
        return duracao_horas;
    }

    public void setDuracao_horas(Integer duracao_horas) {
        this.duracao_horas = duracao_horas;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", duracao_horas=" + duracao_horas +
                '}';
    }
}
