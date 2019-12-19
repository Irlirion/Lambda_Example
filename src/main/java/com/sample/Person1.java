package com.sample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString()
@AllArgsConstructor
public class Person1 {
    @Getter
    @Setter
    private String name;
    @Setter
    @Getter
    private Integer age;
}
