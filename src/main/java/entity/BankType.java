package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class BankType {

    @Id
    @Column(name = "BANK_ID_BANK_PK")
    private Integer id;

    @Column(name = "BANK_DESCRIPTION")
    private String description;

    @Column(name = "BANK_DOCUMENT_NUMBER")
    private String documentNumber;

    @Column(name = "BANK_ACCOUNT_NUMBER")
    private String accountNumber;
}
