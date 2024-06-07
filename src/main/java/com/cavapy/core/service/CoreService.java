package com.cavapy.core.service;

import com.cavapy.core.entity.BankType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.cavapy.core.repository.BankTypeRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoreService {

    final BankTypeRepository bankTypeRepository;

    public CoreService(BankTypeRepository bankTypeRepository) {
        this.bankTypeRepository = bankTypeRepository;
    }

    public ResponseEntity<?> getBankTypes() {

        List<BankType> bankTypes = bankTypeRepository.getBankTypes();
        if (bankTypes.isEmpty()) {
            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.NOT_FOUND);
        } else return new ResponseEntity<>(bankTypes, HttpStatus.OK);
    }
}
