package com.gfa.backendapi.controller;

import com.gfa.backendapi.model.InputArray;
import com.gfa.backendapi.model.Log;
import com.gfa.backendapi.model.TranslatorInput;
import com.gfa.backendapi.model.UntilInput;
import com.gfa.backendapi.service.ApiService;
import com.gfa.backendapi.service.ErrorService;
import com.gfa.backendapi.service.LogsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequiredArgsConstructor
public class ApiController {

    private final ApiService apiService;
    private final ErrorService errorService;
    private final LogsService logsService;


    @GetMapping("/doubling")
    public ResponseEntity getDoubling(@RequestParam(required = false) Integer input)  {
       if (Objects.isNull(input)) {
           logsService.save(new Log("/doubling", "wrong or non input"));
           return ResponseEntity.status(HttpStatus.OK).body(errorService.createEr("Please provide an input!"));
       } else {
           logsService.save(new Log("/doubling", "input=" + input.toString()));
           return ResponseEntity.status(HttpStatus.OK).body(apiService.createDoubling(input));
       }
    }

    @GetMapping("/greeter")
    public ResponseEntity getGreeting(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {

        if (Objects.isNull(name) && Objects.isNull(title)) {
            logsService.save(new Log("/greeter", "wrong or non input"));
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorService.createEr("Please provide a name and a title!"));
        } else if (Objects.isNull(name)) {
            logsService.save(new Log("/greeter", "wrong or non input"));
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorService.createEr("Please provide a name!"));
        } else if (Objects.isNull(title)) {
            logsService.save(new Log("/greeter", "wrong or non input"));
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorService.createEr("Please provide a title!"));
        } else {
            logsService.save(new Log("/greeter", "name=" + name + ", title=" + title));
            return ResponseEntity.status(HttpStatus.OK).body(apiService.greet(name, title));
        }
    }

    @GetMapping("/appenda/{appendable}")
    public ResponseEntity getAppendA(@PathVariable String appendable) {
        try {
            logsService.save(new Log("/appenda", "input=" + appendable));
            return ResponseEntity.status(HttpStatus.OK).body(apiService.appendA(appendable));
        } catch (NullPointerException e) {
            logsService.save(new Log("/appenda", "wrong or non input"));
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Please provide a string to append a!");
        }
    }

    @PostMapping("/dountil/{operation}")
    public ResponseEntity postDoUntil(@PathVariable String operation, @RequestBody UntilInput untilInput) {
        if (Objects.nonNull(untilInput)) {
            logsService.save(new Log("/dountil", untilInput.toString()));
            return ResponseEntity.status(HttpStatus.OK).body(apiService.doUntil(untilInput, operation));
        } else
            logsService.save(new Log("/dountil", "wrong or non input"));
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Please provide a number!");
    }

    @PostMapping("/arrays")
    public ResponseEntity arraysHandler(@RequestBody InputArray inputArray) {
        if (inputArray.getWhat().equals("double")) {
            logsService.save(new Log("/arrays", inputArray.toString()));
            return ResponseEntity.status(HttpStatus.OK).body(apiService.arrayDouble(inputArray.getNumbers()));
        } else {
            try {
                logsService.save(new Log("/arrays", inputArray.toString()));
                return ResponseEntity.status(HttpStatus.OK).body(apiService.arraySumMultiply(inputArray.getWhat(), inputArray.getNumbers()));
            } catch (Exception e) {
                logsService.save(new Log("/dountil", "wrong or non input"));
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorService.createEr("Please provide what to do with the numbers!"));
            }
        }
    }

    @GetMapping("/logs")
    public ResponseEntity getLogs() {
        return ResponseEntity.status(HttpStatus.OK).body(logsService.getEntries());
    }

    @PostMapping("translate")
    public ResponseEntity postTranslate(@RequestBody TranslatorInput translatorInput) {
        if (Objects.isNull(translatorInput) || Objects.isNull(translatorInput.getLang()) || Objects.isNull(translatorInput.getText())) {
            logsService.save(new Log("/translate", "wrong or non input"));
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorService.createEr("I can't translate that!"));
        } else {
            logsService.save(new Log("/translate", translatorInput.toString()));
            return ResponseEntity.status(HttpStatus.OK).body(apiService.translate(translatorInput));
        }
    }
}
