package com.gfa.backendapi.service;

import com.gfa.backendapi.model.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiService {

//    ObjectMapper objectMapper = new ObjectMapper();

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

    public ArrayResponseSumMultiply arraySumMultiply(String what, int[] numbers) throws Exception {
        ArrayResponseSumMultiply res = new ArrayResponseSumMultiply();
        switch (what) {
            case "sum":
                res.setResult(0);
                for (int i = 0; i < numbers.length; i++) {
                    res.setResult(res.getResult() + numbers[i]);
                }
                return res;
            case "multiply":
                res.setResult(1);
                for (int i = 0; i < numbers.length; i++) {
                    res.setResult(res.getResult() * numbers[i]);
                }
                return res;
            default:
                throw new Exception("not supported operation");
        }
    }

    public ArrayResponseDouble arrayDouble(int[] numbers) {
        ArrayResponseDouble res = new ArrayResponseDouble();
        res.setResult(new int[numbers.length]);
        for (int i = 0; i < numbers.length; i++) {
            res.getResult()[i] = numbers[i] * 2;
        }
        return res;
    }

    public TranslatorOutput translate(TranslatorInput t) {
        TranslatorOutput res = new TranslatorOutput();
        StringBuilder translated = new StringBuilder();
        List<Character> vowels = List.of('e', 'é', 'i', 'í', 'ö', 'ő', 'ü', 'ű', 'a', 'á', 'o', 'ó', 'u', 'ú');
        if (t.getLang().equals("hu")) {
            res.setLang("teve");

//            List<String> temp = List.of(t.getText().split(" "));

            for (int i = 0; i < t.getText().length(); i++) {
                if (!vowels.contains(Character.toLowerCase(t.getText().charAt(i)))) {
                    translated.append(t.getText().charAt(i));
                } else {
                    translated.append(t.getText().charAt(i) + "v" + Character.toLowerCase(t.getText().charAt(i)));
                }
            }
        } else {
            res.setLang("gibberish");


//            List<String> temp = List.of(t.getText().split(" "));

            for (int i = 0; i < t.getText().length(); i++) {
                if (!vowels.contains(Character.toLowerCase(t.getText().charAt(i)))) {
                    translated.append(t.getText().charAt(i));
                } else {
                    translated.append(t.getText().charAt(i) + "idig");
                }
            }
        }
        res.setTranslated(translated.toString());
        return res;
    }
}
