package garage.garageSide.garage.entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "terminalstate")
public class TerminalState {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "terminalid")
    private long terminalid;

//    @Column(name = "name")
//    private String terminalName;
//
    @Column(name = "date")
    private String date;

    @Column(name = "deactive")
    private boolean deactive;

    public long getTerminalid() {
        return terminalid;
    }

    public void setTerminalid(long terminalid) {
        this.terminalid = terminalid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isDeactive() {
        return deactive;
    }

    public void setDeactive(boolean deactive) {
        this.deactive = deactive;
    }

    public TerminalState(long terminalid, String date, boolean deactive) {
        this.terminalid = terminalid;
        this.date = date;
        this.deactive = deactive;
    }

    public TerminalState() {
    }

//    public TerminalState(long terminalid, String date) {
//        this.terminalid = terminalid;
//        this.date = date;
//    }
}
