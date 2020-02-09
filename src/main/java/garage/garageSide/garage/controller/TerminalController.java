package garage.garageSide.garage.controller;
import garage.garageSide.garage.entity.*;
import garage.garageSide.garage.repository.AvailableTerminalRepository;
import garage.garageSide.garage.repository.TerminalRepository;
import garage.garageSide.garage.repository.TerminalStateRepository;
import garage.garageSide.garage.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//import garage.validator.UserValidator;
;import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.Date;
import java.util.List;



@RestController
public class TerminalController {

    @Autowired
    private TerminalRepository terminalRepository;

    @Autowired
    private TerminalStateRepository terminalStateRepository;

    @Autowired
    private AvailableTerminalRepository availableTerminalRepository;

    @Autowired
    UserRepository repository;

    @RequestMapping(value = "createTerminal", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
    public String createUser(@RequestBody Terminal user, HttpServletResponse response){

//    @PostMapping("/createTerminal")
//    public String createTerminal(@RequestParam("name") String name, HttpServletResponse response){

//        User user = new User();
        System.out.println("uqvgfwe7683438938965923848965860`3286587896891234868017308579182095-762359-879-29137849-3802490759067830732490790333347890738962795628678463");

        if (terminalRepository.nameAvailabilityCheck(user.getName()) == null) {
            System.out.println("uqvgfwe7683438938965923848965860`3286587896891234868017308579182095-762359-879-29137849-3802490759067830732490790333347890738962795628678463");
            System.out.println("11111111111111111111111111111111111111111111111111111111111111111111111111111");
            System.out.println(user.getName());
            System.out.println("2222222222222222222222222222222222222222222222222222222222222222222222222222222222");


            Terminal terminal = terminalRepository.save(new Terminal(user.getName()));
            System.out.println(terminal.toString());
            response.setHeader("Registration", "Terminal created successfully");
            response.setStatus(5);
            return "success";
//            return usr;
        } else {
            System.out.println("Name is already taken");
            response.setHeader("Registration", "Terminal name not available");
            response.setStatus(5);
            return "createTerminal";
        }
//        return null;
    }

    @RequestMapping(value = "deactivateTerminal", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
    public String deactivateTerminal(@RequestBody TerminalStateParam user, HttpServletResponse response){

//    @PostMapping("/deactivateTerminal")
//    public String deactivateTerminal(@RequestParam("name") String name, @RequestParam("date") Date date){

//        User user = new User();
        System.out.println("uqvgfwe7683438938965923848965860`3286587896891234868017308579182095-762359-879-29137849-3802490759067830732490790333347890738962795628678463");

        System.out.println("11111111111111111111111111111111111111111111111111111111111111111111111111111");
        System.out.println(user.getName());
        System.out.println(user.getDate());
        System.out.println(user.toString());
        System.out.println("2222222222222222222222222222222222222222222222222222222222222222222222222222222222");
        long terminalid = terminalRepository.getIdByName(user.getName());

        if (terminalStateRepository.idAndDateAvailabilityCheck(terminalid, user.getDate()) == null) {
            System.out.println("uqvgfwe7683438938965923848965860`3286587896891234868017308579182095-762359-879-29137849-3802490759067830732490790333347890738962795628678463");


            TerminalState terminalState = terminalStateRepository.save(new TerminalState(terminalid, user.getDate(), true));
            System.out.println(terminalState.toString());
            return "success";
//            return usr;
        } else {
            System.out.println("Terminal is already deactive");
            return "createTerminal";
        }
//        return null;
    }

    @RequestMapping(value = "getterminals", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    public List<Terminal> getTerminals(HttpServletResponse response) {

//    @PostMapping("/createTerminal")
//    public String createTerminal(@RequestParam("name") String name, HttpServletResponse response){

//        User user = new User();
//        System.out.println("uqvgfwe7683438938965923848965860`3286587896891234868017308579182095-762359-879-29137849-3802490759067830732490790333347890738962795628678463");
//
//        if (terminalRepository.nameAvailabilityCheck(user.getName()) == null) {
//            System.out.println("uqvgfwe7683438938965923848965860`3286587896891234868017308579182095-762359-879-29137849-3802490759067830732490790333347890738962795628678463");
//            System.out.println("11111111111111111111111111111111111111111111111111111111111111111111111111111");
//            System.out.println(user.getName());
//            System.out.println("2222222222222222222222222222222222222222222222222222222222222222222222222222222222");
//
//
//            Terminal terminal = terminalRepository.save(new Terminal(user.getName()));
//            System.out.println(terminal.toString());
//            response.setHeader("Registration", "Terminal created successfully");
//            response.setStatus(5);
//            return "success";
////            return usr;
//        } else {
        System.out.println(terminalRepository.getTerminalNames());
        System.out.println(terminalRepository.getTerminalNames().toString());
//        System.out.println(Arrays.stream(terminalRepository.getTerminalNames()));
//            response.setHeader("Registration", "Terminal name not available");
//            response.setStatus(5);
//            return "createTerminal";
//        }
//        return null;
//    }

        return terminalRepository.findAll();
    }

}
