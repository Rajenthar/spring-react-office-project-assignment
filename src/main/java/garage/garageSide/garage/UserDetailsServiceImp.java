package garage.garageSide.garage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import garage.garageSide.garage.entity.User;
import garage.garageSide.garage.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImp implements UserDetailsService {

    @Autowired
    public UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {


        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println(username);
        System.out.println(username);
        System.out.println(username);
        System.out.println(username);
        System.out.println(username);
        System.out.println(username);
        System.out.println(username);
        System.out.println(username);
        System.out.println(username);
        System.out.println(username);
        System.out.println(username);
        System.out.println(username);
        System.out.println(username);
        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");

        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println("845521gggggggggggggggggggggggggggggggggGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
        System.out.println("1111111111111111111111111");
    /*Here we are using dummy data, you need to load user data from
     database or other third party application*/

        User user = userRepository.findByUsername(username.toString());
//    System.out.println(user.toString());
        System.out.println("2222222222222222222222222222222222");
//        User user = findUserbyUername(username);

        UserBuilder builder = null;
        System.out.println("333333333333333333333333");
        if (user != null) {
            System.out.println("444444444444444444444444444");
            builder = org.springframework.security.core.userdetails.User.withUsername(username);
            System.out.println("55555555555555555555555555555555");
            builder.password(new BCryptPasswordEncoder().encode(user.getPassword()));
            System.out.println("66666666666666666666666666666666666666");
            builder.roles("USER");
            System.out.println("7777777777777777777777777777");
        } else {
            System.out.println("8888888888888888888888888888888888");
            throw new UsernameNotFoundException("User not found.");
//            System.out.println("999999999999999999999999999");
        }
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        return builder.build();
    }
}