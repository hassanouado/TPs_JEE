package ma.enset.jpa_hibernate_spring_data.repository;

import ma.enset.jpa_hibernate_spring_data.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    public List<Patient> findByMalade(boolean m);
    public Page<Patient> findByMalade(boolean m , Pageable pageable);
    public List<Patient> findByMaladeAndScoreLessThan( boolean m, int score);
    public List<Patient> findByDatenaissanceBetweenAndAndMaladeTrueAndAndNomLike(Date d, Date d1,String s);
//    @Query("select p from Patient p where p.datenaissance between :x and :y or p.nom like :s")
//    public List<Patient> chercherPatient(@Param("x") Date d, @Param("p") Date d1, @Param("s") String s);

}
