package garage.garageSide.garage.controller;
import garage.garageSide.garage.entity.Terminal;
import garage.garageSide.garage.entity.TerminalState;
import garage.garageSide.garage.entity.AvailableTerminal;
import garage.garageSide.garage.entity.User;
import garage.garageSide.garage.entity.Book;
import garage.garageSide.garage.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//import garage.validator.UserValidator;
;import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.Max;
import java.util.Date;
import java.util.List;



@RestController
public class BookingController {

    @Autowired
    private TerminalRepository terminalRepository;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private TerminalStateRepository terminalStateRepository;

    @Autowired
    private AvailableTerminalRepository availableTerminalRepository;

    @Autowired
    UserRepository repository;

    @PostMapping("/booking")
    public String createTerminal(@RequestParam("name") String name) {

//        User user = new User();
        System.out.println("uqvgfwe7683438938965923848965860`3286587896891234868017308579182095-762359-879-29137849-3802490759067830732490790333347890738962795628678463");

        if (terminalRepository.nameAvailabilityCheck(name) == null) {
            System.out.println("uqvgfwe7683438938965923848965860`3286587896891234868017308579182095-762359-879-29137849-3802490759067830732490790333347890738962795628678463");

            Terminal terminal = terminalRepository.save(new Terminal(name));
            System.out.println(terminal.toString());
            return "success";
//            return usr;
        } else {
            System.out.println("Name is already taken");
            return "createTerminal";
        }
//        return null;
    }

    @RequestMapping(value = "bookTime", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
    public String bookTimeSlot(@RequestBody Book book, HttpServletResponse response) {
//        modelAndView.addObject("user", user);


//        User user = new User();
        System.out.println("uqvgfwe7683438938965923848965860`3286587896891234868017308579182095-762359-879-29137849-3802490759067830732490790333347890738962795628678463");
        System.out.println(book.getName());
        System.out.println(book.getNumberPlate());
        System.out.println(book.getLocalDate());
        System.out.println(book.getLocalTime());
        System.out.println(book.getTerminalNo());
        System.out.println(book.toString());
//        System.out.println(user.getPassword());
        System.out.println("uqvgfwe7683438938965923848965860`3286587896891234868017308579182095-762359-879-29137849-3802490759067830732490790333347890738962795628678463");


        if (bookRepository.sameDayAlreadyBookedCheck(book.getNumberPlate(), book.getDate()) != null) {
            System.out.println("This vehicle has already booked on this day");
            return "This vehicle has already booked on this day";
        } else {
            Book bok = bookRepository.save(new Book(book.getName(), book.getNumberPlate(), book.getDate(), book.getLocalTime(), book.getTerminalNo()));

            System.out.println("SUCCESSFULLY BOOKED FOR THE VWHICLE");
            response.setHeader("Booking", "Successfully booked");
            response.setStatus(5);
//            response.
            ResponseEntity<String> responseEntity = new ResponseEntity<String>("SUCCESSFULLY CREATED NEW USER", HttpStatus.OK);
            return "VEHICLE BOOKED SUCSESSFULLY WITH NUMBERPLATE NUMBER  " + book.getNumberPlate();
        }
    }


    @RequestMapping(value = "getBookedSlots", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
    public List<Book> getBookedSlots(@RequestParam Book book, HttpServletResponse response) {
//        modelAndView.addObject("user", user);
        System.out.println(bookRepository.getBookedSlots(book.getDate()));
//        System.out.println(bookRepository.getBookedSlots(date).toArray());
//        System.out.println(bookRepository.getBookedSlots(date).toArray().toString());
//        System.out.println(bookRepository.getBookedSlots(date).toString());
//        System.out.println(bookRepository.getBookedSlots(date).toString().toCharArray());
        return bookRepository.getBookedSlots(book.getDate());

//
////        User user = new User();
//        System.out.println("uqvgfwe7683438938965923848965860`3286587896891234868017308579182095-762359-879-29137849-3802490759067830732490790333347890738962795628678463");
////        System.out.println(user.getPassword());
//        System.out.println("uqvgfwe7683438938965923848965860`3286587896891234868017308579182095-762359-879-29137849-3802490759067830732490790333347890738962795628678463");
//
//
//        if (bookRepository.sameDayAlreadyBookedCheck(book.getNumberPlate(), book.getDate()) != null) {
//            System.out.println("This vehicle has already booked on this day");
//            return "This vehicle has already booked on this day";
//        } else {
//            Book bok = bookRepository.save(new Book(book.getName(), book.getNumberPlate(), book.getDate(), book.getLocalTime(), book.getTerminalNo()));
//
//            System.out.println("SUCCESSFULLY BOOKED FOR THE VWHICLE");
//            response.setHeader("Booking", "Successfully booked");
//            response.setStatus(5);
////            response.
//            ResponseEntity<String> responseEntity = new ResponseEntity<String>("SUCCESSFULLY CREATED NEW USER", HttpStatus.OK);
//            return "VEHICLE BOOKED SUCSESSFULLY WITH NUMBERPLATE NUMBER  " + book.getNumberPlate();
//        }
    }
}
