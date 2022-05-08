package com.gfa.backendapi.controller;

import com.gfa.backendapi.model.UntilInput;
import com.gfa.backendapi.service.ApiService;
import com.gfa.backendapi.service.ErrorService;
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


    @GetMapping("/doubling")
    public ResponseEntity getDoubling(@RequestParam(required = false) Integer input)  {
       if (Objects.isNull(input)) {
           return ResponseEntity.status(HttpStatus.OK).body(errorService.createEr("Please provide an input!"));
       } else {
           return ResponseEntity.status(HttpStatus.OK).body(apiService.createDoubling(input));
       }
    }

    @GetMapping("/greeter")
    public ResponseEntity getGreeting(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {

        if (Objects.isNull(name) && Objects.isNull(title)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorService.createEr("Please provide a name and a title!"));
        } else if (Objects.isNull(name)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorService.createEr("Please provide a name!"));
        } else if (Objects.isNull(title)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorService.createEr("Please provide a title!"));
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(apiService.greet(name, title));
        }
    }

    @GetMapping("/appenda/{appendable}")
    public ResponseEntity getAppendA(@PathVariable String appendable) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(apiService.appendA(appendable));
        } catch (NullPointerException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Please provide a string to append a!");
        }
    }

    @PostMapping("/dountil/{operation}")
    public ResponseEntity postDoUntil(@PathVariable String operation, @RequestBody UntilInput untilInput) {
        if (Objects.nonNull(untilInput)) {
            return ResponseEntity.status(HttpStatus.OK).body(apiService.doUntil(untilInput, operation));
        } else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Please provide a number!");
    }
}
