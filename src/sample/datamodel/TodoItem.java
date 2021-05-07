package sample.datamodel;

import java.time.LocalDate;
import java.util.Objects;

public class TodoItem {
    private String shortDescription;
    private String details;
    private LocalDate deadLine;

    public TodoItem(String shortDescription, String details, LocalDate deadLine) {
        this.shortDescription = shortDescription;
        this.details = details;
        this.deadLine = deadLine;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoItem todoItem = (TodoItem) o;
        return Objects.equals(shortDescription, todoItem.shortDescription) &&
                Objects.equals(details, todoItem.details) &&
                Objects.equals(deadLine, todoItem.deadLine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shortDescription, details, deadLine);
    }

    @Override
    public String toString() {
        return
                 shortDescription;
    }
}
