package com.cavapy.core.repository;

import com.cavapy.core.entity.BankType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BankTypeRepository extends CrudRepository<BankType, Integer> {

    @Query(value = "select * from PRADERA_DEPOSITARY.Bank_account_view", nativeQuery = true)
    List<BankType> getBankTypes();

}
