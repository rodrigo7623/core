package com.cavapy.core.controller;

import com.cavapy.core.service.ParamsService;
import com.cavapy.core.util.APIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/params")
public class ParamsController {

    private final ParamsService paramsService;

    @Autowired
    public ParamsController(ParamsService paramsService) {
        this.paramsService = paramsService;
    }

    @GetMapping(value = "/get/negotiation/mcn/mechanism")
    public APIResponse<?> getNegotiationMechanismMcn() {
        return paramsService.getNegotiationMechanismMcn();
    }

    @GetMapping(value = "/get/negotiation/mcn/dateType", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public APIResponse<?> getNegotiationDateTypeMcn() {
        return paramsService.getNegotiationDateTypeMcn();
    }
}
