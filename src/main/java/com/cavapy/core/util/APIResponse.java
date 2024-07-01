package com.cavapy.core.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
public class APIResponse <T>{

    private boolean success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;

    private int code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;
}
