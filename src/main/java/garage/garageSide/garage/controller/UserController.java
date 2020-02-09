package garage.garageSide.garage.controller;
import garage.garageSide.garage.entity.User;
import garage.garageSide.garage.entity.UserCredentials;
import garage.garageSide.garage.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.http.HttpStatus;
import javax.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.http.Res;


import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    UserRepository repository;

    @GetMapping("/home")
    public String greeting(Model model) {
        model.addAttribute("name", "ytfyug");
        return "welcome";
    }

    @GetMapping("/registerUi")
    public String registerUi(Model model) {
        model.addAttribute("name", "ytfyug");
        return "welcome";
    }

    @PostMapping("/registration")
    public String registration(@RequestParam(value = "username", required = false) String username, @RequestParam(value = "password", required = false) String password){

//        User user = new User();
        System.out.println("uqvgfwe7683438938965923848965860`3286587896891234868017308579182095-762359-879-29137849-3802490759067830732490790333347890738962795628678463");

        if (repository.usernameAvailabilityCheck(username) == null) {
            System.out.println("uqvgfwe7683438938965923848965860`3286587896891234868017308579182095-762359-879-29137849-3802490759067830732490790333347890738962795628678463");

            User usr = userRepository.save(new User(username, password));
            System.out.println(usr.toString());
            return "login";
//            return usr;
        } else {
            System.out.println("Username is already taken");
            return "registration";
        }
//        return null;
    }

    @GetMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password){

//        User user = new User();
        System.out.println("uqvgfwe7683438938965923848965860`3286587896891234868017308579182095-762359-879-29137849-3802490759067830732490790333347890738962795628678463");
        System.out.println(username);
        System.out.println(password);
        System.out.println(username);
        System.out.println("THIS IS TO CONFIRM THE PARAMETER PASSINGbind ");
        if (repository.userLoginCheck(username, password) != null) {
            System.out.println("uqvgfwe7683438938965923848965860`3286587896891234868017308579182095-762359-879-29137849-3802490759067830732490790333347890738962795628678463");

//            User usr = userRepository.save(new User(username, password));
            System.out.println("Successfully logged in");
//            return "successfully logged in";
//            return usr;
            return "welcome";
        } else {
            System.out.println("Username or password is incorrect");
            return "login";
        }
//        return null;
    }

//    @PostMapping("/createuser")
//    @RequestMapping()
@RequestMapping(value = "createuser", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
public String createUser(@RequestBody User user, HttpServletResponse response){
//        modelAndView.addObject("user", user);


//        User user = new User();
    System.out.println("uqvgfwe7683438938965923848965860`3286587896891234868017308579182095-762359-879-29137849-3802490759067830732490790333347890738962795628678463");
    System.out.println(user.getUsername());
    System.out.println(user.getPassword());
    System.out.println(user.toString());
//        System.out.println(user.getPassword());
    System.out.println("uqvgfwe7683438938965923848965860`3286587896891234868017308579182095-762359-879-29137849-3802490759067830732490790333347890738962795628678463");

    if (repository.usernameAvailabilityCheck(user.getUsername()) != null) {
        System.out.println("uqvgfwe7683438938965923848965860`3286587896891234868017308579182095-762359-879-29137849-3802490759067830732490790333347890738962795628678463");

//            User usr = userRepository.save(new User(username, password));
        System.out.println("Username already taken");
//            return "successfully logged in";
//            return usr;
//            return "sign";
        response.setHeader("Registration", "Username not available");
        response.setStatus(5);

        return "USERNAME ALREADY TAKEN";

    } else {
        User usr = userRepository.save(new User(user.getUsername(), user.getUsername()+"@password"));
        System.out.println("SUCCESSFULLY CREATED NEW USER");
        response.setHeader("Registration", "Successfully registered");
//            response.a
//            response.sendRedirect("login");
        response.setStatus(5);
//            response.
        ResponseEntity<String> responseEntity = new ResponseEntity<String>("SUCCESSFULLY CREATED NEW USER", HttpStatus.OK);
        return "USER CREATED SUCSESSFULLY WITH USERNAME " + user.getUsername();
    }
//        return null;
}


    @RequestMapping(value = "createusertest", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
    public String createUser(@RequestParam("username") String username, @RequestParam("password") String password, HttpServletResponse response){
//        modelAndView.addObject("user", user);


//        User user = new User();
        System.out.println("uqvgfwe7683438938965923848965860`3286587896891234868017308579182095-762359-879-29137849-3802490759067830732490790333347890738962795628678463");
        System.out.println(username);
        System.out.println(password);
//        System.out.println(user.toString());
//        System.out.println(user.getPassword());
        System.out.println("uqvgfwe7683438938965923848965860`3286587896891234868017308579182095-762359-879-29137849-3802490759067830732490790333347890738962795628678463");

        if (repository.usernameAvailabilityCheck(username) != null) {
            System.out.println("uqvgfwe7683438938965923848965860`3286587896891234868017308579182095-762359-879-29137849-3802490759067830732490790333347890738962795628678463");

//            User usr = userRepository.save(new User(username, password));
            System.out.println("Username already taken");
//            return "successfully logged in";
//            return usr;
//            return "sign";
            response.setHeader("Registration", "Username not available");
            response.setStatus(5);

            return "USERNAME ALREADY TAKEN";

        } else {
            User usr = userRepository.save(new User(username, password+"@password"));
            System.out.println("SUCCESSFULLY CREATED NEW USER");
            response.setHeader("Registration", "Successfully registered");
//            response.a
//            response.sendRedirect("login");
            response.setStatus(5);
//            response.
            ResponseEntity<String> responseEntity = new ResponseEntity<String>("SUCCESSFULLY CREATED NEW USER", HttpStatus.OK);
            return "USER CREATED SUCSESSFULLY WITH USERNAME " + username;
        }
//        return null;
    }


    @GetMapping(path = "/fetchAll", produces = "application/json; charset=UTF-8")
    public List<User> login1234() {
        System.out.println("INSIDE FETCH ALL METHOD");
        System.out.println(userRepository.findAll().toString());
        System.out.println("uqvgfwe7683438938965923848965860`3286587896891234868017308579182095-762359-879-29137849-3802490759067830732490790333347890738962795628678463");


//        return userRepository.findAll();
        ResponseEntity<String> responseEntity = new ResponseEntity<>("my response body",
                HttpStatus.OK);
//        return new Re("ACtion successfully completed wow great work");

        return userRepository.findAll();
//        User user = new User();
//        System.out.println("uqvgfwe7683438938965923848965860`3286587896891234868017308579182095-762359-879-29137849-3802490759067830732490790333347890738962795628678463");
//        System.out.println(username);
//        System.out.println(password);
//        System.out.println(username);
//        System.out.println("THIS IS TO CONFIRM THE PARAMETER PASSINGbind ");
//        if (repository.userLoginCheck(username, password) != null) {
//            System.out.println("uqvgfwe7683438938965923848965860`3286587896891234868017308579182095-762359-879-29137849-3802490759067830732490790333347890738962795628678463");
//
////            User usr = userRepository.save(new User(username, password));
//            System.out.println("Successfully logged in");
////            return "successfully logged in";
////            return usr;
//            return "welcome";
//        } else {
//            System.out.println("Username or password is incorrect");
//            return "login";
//        }
//        return null;
//    }

//    @RequestMapping(path = "/getUsers", produces = "application/json; charset=UTF-8")
//    @ResponseBody
//    public List<User> findCities() {
//
//        List<User> cities = (List<User>) userRepository.findAll();
//
//        return cities;
//    }
    }


}

