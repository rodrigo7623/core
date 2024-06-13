package com.cavapy.core.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class BankType {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "ID_BANK_PK")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Integer idBankPk;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "DOCUMENT_NUMBER")
    private String documentNumber;

    @Column(name = "ACCOUNT_NUMBER")
    private String accountNumber;

    @Column(name = "CURRENCY")
    private String currency;
}
