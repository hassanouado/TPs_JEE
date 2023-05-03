package ma.enset.tp_micro_service.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.tp_micro_service.enums.TypedeCompte;

import java.util.Date;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Compte {
    @Id
    private String id;
    private Date createDate;
    private Double balance;
    private String currency;
    private TypedeCompte type;
}
