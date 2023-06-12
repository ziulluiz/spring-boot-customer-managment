package com.example.ssb.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Customer {
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String address;
}
