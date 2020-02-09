package garage.garageSide.garage.entity;

import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name = "availableterminals")
public class AvailableTerminal {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "terminalid")
    private long terminalid;

    @Column(name = "date")
    private Date date;

    @Column(name = "averagetime")
    private int avgTime;

    public long getTerminalid() {
        return terminalid;
    }

    public void setTerminalid(long terminalid) {
        this.terminalid = terminalid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAvgTime() {
        return avgTime;
    }

    public void setAvgTime(int avgTime) {
        this.avgTime = avgTime;
    }

    public AvailableTerminal(long terminalid) {
        this.terminalid = terminalid;
    }

    public AvailableTerminal(long terminalid, Date date) {
        this.terminalid = terminalid;
        this.date = date;
    }

    public AvailableTerminal(long terminalid, Date date, int avgTime) {
        this.terminalid = terminalid;
        this.date = date;
        this.avgTime = avgTime;
    }

    @Override
    public String toString() {
        return "AvailableTerminal{" +
                "terminalid=" + terminalid +
                ", date=" + date +
                ", avgTime=" + avgTime +
                '}';
    }
}
