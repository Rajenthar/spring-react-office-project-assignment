package garage.garageSide.garage.entity;

import javax.persistence.Column;
import java.util.Date;

public class TerminalStateParam {

    private String name;

    private String date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "TerminalStateParam{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
