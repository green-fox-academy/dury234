package com.gfa.programmerfoxclub.model;

import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Data
@Component
public class Fox {

    @NotNull
    @NotBlank
    @Length(min = 3, max = 14)
    private String name;

    private List<Tricks> tricks = new ArrayList<>();

    private String food = "mice";

    private String drink = "milk";

}
