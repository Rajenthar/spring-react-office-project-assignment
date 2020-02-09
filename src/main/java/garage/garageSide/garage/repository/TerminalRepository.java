package garage.garageSide.garage.repository;

import garage.garageSide.garage.entity.Terminal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TerminalRepository extends JpaRepository<Terminal, Long> {
    List<Terminal> findAll();

    @Query(value = "SELECT id FROM Terminals u WHERE u.name = (:name)", nativeQuery = true)
    long getIdByName(@Param("name") String name);

    @Query(value = "SELECT * FROM Terminals u WHERE u.name = (:name)", nativeQuery = true)
    Terminal nameAvailabilityCheck(@Param("name") String name);

    @Query(value = "SELECT * FROM Terminals", nativeQuery = true)
    List<Terminal> getTerminalNames();
}

