package com.gfa.backendapi.service;

import com.gfa.backendapi.model.ErrorMessage;
import org.springframework.stereotype.Service;

@Service
public class ErrorService {

    public ErrorMessage createEr(String message) {
        return new ErrorMessage(message);
    }

}
