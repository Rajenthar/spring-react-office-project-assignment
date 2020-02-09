package garage.garageSide.garage.repository;

import garage.garageSide.garage.entity.AvailableTerminal;
import garage.garageSide.garage.entity.Terminal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AvailableTerminalRepository extends JpaRepository<AvailableTerminal, Long> {
    List<AvailableTerminal> findAll();
}

