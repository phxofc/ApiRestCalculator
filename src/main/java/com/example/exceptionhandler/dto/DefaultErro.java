package com.example.exceptionhandler.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DefaultErro {

    private int code;
    private String message;
}
