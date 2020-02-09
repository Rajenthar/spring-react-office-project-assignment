package garage.garageSide.garage;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//import org.hibernate.SessionFactory;
//import org.hibernate.ejb.HibernateEntityManagerFactory;
import garage.garageSide.garage.repository.UserRepository;
import garage.garageSide.garage.entity.User;
import org.springframework.boot.CommandLineRunner;


@SpringBootApplication
public class GarageApplication {



//	public UserRepository userRepository;
//
//	public User user;

//	@Autowired
//	@Bean
//	public SessionFactory sessionFactory(HibernateEntityManagerFactory h){
//		return h.getSessionFactory();
//	}

//	@Bean
//	CommandLineRunner runner() {
//		return args -> {
////            Save demo data after start
//			userRepository.save(new User("admin", "$2a$04$KNLUwOWHVQZVpXyMBNc7JOzbLiBjb9Tk9bP7KNcPI12ICuvzXQQKG"));
//		};
//
//	}



			public static void main(String[] args) {
		SpringApplication.run(GarageApplication.class, args);
	}

}
