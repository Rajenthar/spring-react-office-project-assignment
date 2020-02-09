package garage.garageSide.garage.repository;

import garage.garageSide.garage.entity.Terminal;
import garage.garageSide.garage.entity.TerminalState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Date;

@Repository
public interface TerminalStateRepository extends JpaRepository<TerminalState, Long> {
    List<TerminalState> findAll();

    @Query(value = "SELECT * FROM Terminalstate u WHERE u.terminalid = (:terminalid) and u.date = (:date)", nativeQuery = true)
    TerminalState idAndDateAvailabilityCheck(@Param("terminalid") long terminalid, @Param("date") String date);
}

