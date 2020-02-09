package garage.garageSide.garage.entity;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
//import java.util.Date;
import java.util.*;
import java.time.LocalDate; // import the LocalDate class
import java.time.LocalTime; // import the LocalDate class
import java.text.SimpleDateFormat;
import java.text.DateFormat;

@Entity
@Table(name = "book")
public class Book {

//    DateFormat f = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
//    Date d = f.parse("8/29/2011 11:16:12 AM");
//    DateFormat date = new SimpleDateFormat("MM/dd/yyyy");
//    DateFormat time = new SimpleDateFormat("hh:mm:ss a");
//        System.out.println("Date: " + date.format(d));
//        System.out.println("Time: " + time.format(d));

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

//    @UniqueElements
    @Column(name = "numberplate")
    private String numberPlate;

    @Column(name = "date")
    private String date;
//
//    @Column(name = "duration")
//    private int duration;

    @Column(name = "time")
    private String time;

    @Column(name = "terminal_no")
    private String terminal_no;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getLocalDate() {
        return date;
    }

    public void setLocalDate(String localDate) {
        this.date = localDate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocalTime() {
        return time;
    }

    public void setLocalTime(String localTime) {
        this.time = localTime;
    }

    public String getTerminal_no() {
        return terminal_no;
    }

    public void setTerminal_no(String terminal_no) {
        this.terminal_no = terminal_no;
    }

    public String getTerminalNo() {
        return terminal_no;
    }

    public void setTerminalNo(String terminalNo) {
        this.terminal_no = terminalNo;
    }

    public Book(String name, String numberPlate, String localDate, String localTime, String terminalNo) {
        this.name = name;
        this.numberPlate = numberPlate;
        this.date = localDate;
//        this.duration = duration;
        this.time = localTime;
        this.terminal_no = terminalNo;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numberPlate='" + numberPlate + '\'' +
                ", localDate=" + date +
                ", localTime=" + time +
                ", terminalNo=" + terminal_no +
                '}';
    }
}
