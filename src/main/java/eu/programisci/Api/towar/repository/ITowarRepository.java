package eu.programisci.Api.towar.repository;


import eu.programisci.Api.kontrahent.ob.KontrahentOB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITowarRepository extends JpaRepository<KontrahentOB,Long> {
}
