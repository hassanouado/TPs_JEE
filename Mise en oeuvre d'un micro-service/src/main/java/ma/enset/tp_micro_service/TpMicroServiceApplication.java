package ma.enset.tp_micro_service;

import ma.enset.tp_micro_service.entities.Compte;
import ma.enset.tp_micro_service.enums.TypedeCompte;
import ma.enset.tp_micro_service.repository.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class TpMicroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpMicroServiceApplication.class, args);
    }
    CommandLineRunner start(CompteRepository compteRepository){
        return args -> {
            for (int i=0;i<10;i++){
                Compte compte = Compte.builder()
                        .id(UUID.randomUUID().toString())
                        .type(Math.random()>0.5? TypedeCompte.CURRENT_ACOUNT:TypedeCompte.SAVING_ACOUNT)
                        .balance(1000+Math.random()*20000)
                        .createDate(new Date())
                        .currency("MAD")
                        .build();
                compteRepository.save(compte);
            }
            compteRepository.findAll().forEach(p->{
                System.out.println(p.getBalance());
            });
        };
    }

}
