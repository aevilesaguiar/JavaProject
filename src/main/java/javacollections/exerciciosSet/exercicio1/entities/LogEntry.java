package javacollections.exerciciosSet.exercicio1.entities;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class LogEntry {

    private String name;
    private Date date;

    public LogEntry() {
    }

    public LogEntry(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogEntry logEntry = (LogEntry) o;
        return name.equals(logEntry.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
