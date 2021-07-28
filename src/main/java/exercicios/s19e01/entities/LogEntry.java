package exercicios.s19e01.entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry {

    private String username;
    private Date moment;

    public LogEntry(String username, Date moment) {
        this.username = username;
        this.moment = moment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    // meu critério de comparação é se o nome de usuário é o mesmo.
    // vou criar um set que não vai aceitar que eu insira o mesmo usuário mais de uma vez.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LogEntry logEntry)) return false;
        return getUsername().equals(logEntry.getUsername());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername());
    }
}
