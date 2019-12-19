package com.sample;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString()
@NoArgsConstructor
public class Person {
    @Getter
    @Setter
    private String name;
    @Setter
    @Getter
    private Integer age;


}
