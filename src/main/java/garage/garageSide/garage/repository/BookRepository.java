package garage.garageSide.garage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import garage.garageSide.garage.entity.Book;

import java.util.List;


@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findAll();

    @Query(value = "SELECT * FROM Book b WHERE b.numberPlate = (:numberPlate) AND b.date = (:localDate)", nativeQuery = true)
    Book sameDayAlreadyBookedCheck(@Param("numberPlate") String numberPlate, @Param("localDate") String localDate);

    @Query(value = "SELECT * FROM Book  WHERE b.date = (:localdate)", nativeQuery = true)
    List<Book> getBookedSlots(@Param("date") String localdate);
}

