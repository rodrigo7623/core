package com.cavapy.core.controller;

import com.cavapy.core.entity.BankType;
import com.cavapy.core.service.CoreService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/banks")
public class CoreController {

    final
    CoreService coreService;

    public CoreController(CoreService coreService) {
        this.coreService = coreService;
    }

    @GetMapping(value = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(coreService.getBankTypes(), HttpStatus.OK).getBody();
    }
}
