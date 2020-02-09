package garage.garageSide.garage.entity;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;


@Entity
@Table(name = "users")
public class User {

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String username) {
        this.username = username;
    }

    public User() {
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

//    @UniqueElements
    @Column(name = "name")
    private String username;

//    @Column(name = "role")
//    private int role;

    @Column(name = "password")
    private String password;

//    @Transient
//    private String passwordConfirm;

//    @ManyToMany
//    private Set<Role> roles;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String name) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
