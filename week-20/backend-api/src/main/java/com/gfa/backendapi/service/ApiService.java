package com.gfa.backendapi.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gfa.backendapi.model.*;
import org.springframework.stereotype.Service;

@Service
public class ApiService {

    ObjectMapper objectMapper = new ObjectMapper();

    public Doubling createDoubling(int received) {
        return new Doubling(received);
    }

    public Greeting greet(String name, String title) {
        Greeting g = new Greeting();
        g.setWelcome_message("Oh, hi there " + name + ", my dear " + title + "!");
        return g;
    }

    public AppendA appendA(String toAppend) {
        return new AppendA(toAppend);
    }

    public Until doUntil(UntilInput untilInput, String operation) {
        Until u = new Until();
        int result = 0;
        if (operation.equals("sum")) {
            for (int i = 1; i <= untilInput.getUntil(); i++) {
                result += i;
            }
        } else if (operation.equals("factor")) {
            result = 1;
            for (int i = 1; i <= untilInput.getUntil(); i++) {
                result *= i;
            }
        }
        u.setResult(result);
        return u;
    }

}
