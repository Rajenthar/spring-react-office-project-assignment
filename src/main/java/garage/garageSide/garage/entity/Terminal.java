package garage.garageSide.garage.entity;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;

@Entity
@Table(name = "terminals")
public class Terminal {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private long id;

//    @UniqueElements
    @Column(name = "name")
    private String name;

//    public long getTerminalid() {
//        return id;
//    }

    public long getId() {
        return id;
    }


//    public void setTerminalid(Integer terminalid) {
//        this.terminalid = terminalid;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Terminal(String name) {
        this.name = name;
    }

    public Terminal() {
    }

    @Override
    public String toString() {
        return "Terminal{" +
                "terminalid=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
