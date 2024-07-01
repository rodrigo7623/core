package com.cavapy.core.service;

import com.cavapy.core.entity.Param;
import com.cavapy.core.repository.ParamRepository;
import com.cavapy.core.util.APIResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParamsService {

    private final ParamRepository paramRepository;

    @Autowired
    public ParamsService(ParamRepository paramRepository) {
        this.paramRepository = paramRepository;
    }

    @Value("${msg.operation.search.operationDate}")
    String operationDate;

    @Value("${msg.operation.search.cashSettlementDate}")
    String cashSettlementDate;

    @Value("${msg.operation.search.termSettlementDate}")
    String termSettlementDate;

    public APIResponse<?> getNegotiationMechanismMcn() {
        List<Param> params = paramRepository.getNegotiationMechanismMcn();
        APIResponse<List<Param>> apiResponse = new APIResponse<>();
        if (params!=null || !params.isEmpty()) {
            apiResponse.setSuccess(true);
            apiResponse.setCode(HttpStatus.OK.value());
            apiResponse.setData(params);
            return apiResponse;
        } else {
            apiResponse.setSuccess(false);
            apiResponse.setCode(HttpStatus.NOT_FOUND.value());
            apiResponse.setData(null);
            apiResponse.setMessage("Negotiation mechanism MCN not found.");
            return apiResponse;
        }
    }

    public APIResponse<?> getNegotiationDateTypeMcn() {
        List<Param> params = new ArrayList<>();
        Param param = new Param();
        param.setId(0);
        param.setDescription(operationDate);
        params.add(param);

        param = new Param();
        param.setId(1);
        param.setDescription(cashSettlementDate);
        params.add(param);

        param = new Param();
        param.setId(2);
        param.setDescription(termSettlementDate);
        params.add(param);

        APIResponse<List<Param>> apiResponse = new APIResponse<>();
        apiResponse.setSuccess(true);
        apiResponse.setCode(HttpStatus.OK.value());
        apiResponse.setData(params);
        return apiResponse;
    }

}
