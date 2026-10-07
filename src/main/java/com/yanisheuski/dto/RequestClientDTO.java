package com.yanisheuski.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class RequestClientDTO {
    String password;
    String email;
    String name;
    String lastName;
}

