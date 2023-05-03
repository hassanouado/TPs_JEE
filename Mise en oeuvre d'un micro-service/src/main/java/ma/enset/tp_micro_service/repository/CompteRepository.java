package ma.enset.tp_micro_service.repository;

import ma.enset.tp_micro_service.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte,String> {

}
