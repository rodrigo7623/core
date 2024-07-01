package com.cavapy.core.repository;

import com.cavapy.core.entity.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ParamRepository extends CrudRepository<Param, Integer> {

    @Query(value = "SELECT * FROM PRADERA_DEPOSITARY.NEGOTIATION_MECHANISM_view", nativeQuery = true)
    List<Param> getNegotiationMechanismMcn();
}
