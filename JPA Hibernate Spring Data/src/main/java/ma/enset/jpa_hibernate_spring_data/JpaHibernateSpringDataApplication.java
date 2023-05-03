package ma.enset.jpa_hibernate_spring_data;

import ma.enset.jpa_hibernate_spring_data.entities.Patient;
import ma.enset.jpa_hibernate_spring_data.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class JpaHibernateSpringDataApplication implements CommandLineRunner {
    @Autowired
   private PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(JpaHibernateSpringDataApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
         for (int i=0;i<40;i++){
             patientRepository.save(new Patient((long) i,"mmohammed",new Date(),true,124));
         }
//        patientRepository.save(new Patient(1L,"mmohammed",new Date(),true,124));
//        patientRepository.save(new Patient(2L,"ali",new Date(),true,100));
//        patientRepository.save(new Patient(3L,"adil",new Date(),false,34));
//        patientRepository.save(new Patient(1L,"hicham",new Date(),false,54));
        Page<Patient> patients = patientRepository.findAll(PageRequest.of(1,5));
        System.out.println("totale pages :"+patients.getTotalPages());
        System.out.println("totale element :"+patients.getTotalPages());
        System.out.println("num page :"+patients.getTotalPages());
         List<Patient> content = patients.getContent();
         List<Patient> ByMalade = patientRepository.findByMalade(true);
        Page<Patient> ByMalad = patientRepository.findByMalade(true,PageRequest.of(1,5));

        System.out.println("***********************Listes des patients******************************");
        ByMalad.forEach(patient -> {
            System.out.println("-------------------- patient ayant id :"+ patient.getId()+"-------------------------------");
            System.out.println(patient.getNom());
            System.out.println(patient.getDatenaissance());
            System.out.println(patient.getScore());
            System.out.println(patient.isMalade());
        });
     Patient patient = patientRepository.findById(4L).orElse(null);
     if(patient!=null){
         System.out.println("-------------------------- le patient par id : "+ patient.getId());
         System.out.println(patient.getNom());
         System.out.println(patient.isMalade());
         patient.setScore(87);
         patientRepository.save(patient);
     }
       patientRepository.deleteById(1L);
    }
}
