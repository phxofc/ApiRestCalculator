package com.example.exceptionhandler.controllers;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController
@OpenAPIDefinition()
@Tag(name = "CALCULATOR API REST")
public class CalcController {

    //OPERATIONS MATH

    @Operation(description = "makes a sum between two numbers", method = "GET")

    @ApiResponses(value ={
    @ApiResponse(responseCode = "201", description = "returns the sum"),
    @ApiResponse(responseCode = "502", description = "returns a variable error handling")
                    })

    @GetMapping("/sum/{n1}/{n2}")
    public ResponseEntity sum(@PathVariable("n1") double n1, @PathVariable("n2") double n2){
        double soma = n1+n2;
        return ResponseEntity.status(HttpStatus.CREATED).body("Result: "+ soma);

    }

    @Operation(description = "makes a subtraction between two numbers", method = "GET")
    @ApiResponses(value ={
            @ApiResponse(responseCode = "201", description = "returns the subtraction"),
            @ApiResponse(responseCode = "502", description = "returns a variable error handling")
    })
    @GetMapping("/sub/{n1}/{n2}")
    public ResponseEntity sub(@PathVariable("n1") double n1, @PathVariable("n2") double n2){
        double sub = n1-n2;
        return ResponseEntity.status(HttpStatus.CREATED).body("Result: "+ sub);

    }

    @Operation(description = "makes a multiplication between two numbers", method = "GET")
    @ApiResponses(value ={
            @ApiResponse(responseCode = "201", description = "returns the multiplication"),
            @ApiResponse(responseCode = "502", description = "returns a variable error handling")
    })
    @GetMapping("/mult/{n1}/{n2}")
    public ResponseEntity mult(@PathVariable("n1") double n1, @PathVariable("n2") double n2){
        double mult = n1*n2;
        return ResponseEntity.status(HttpStatus.CREATED).body("Result: "+ mult);

    }

    @Operation(description = "makes a division between two numbers", method = "GET")
    @ApiResponses(value ={
            @ApiResponse(responseCode = "201", description = "returns the division"),
            @ApiResponse(responseCode = "502", description = "returns a variable error handling")
    })
    @GetMapping("/div/{n1}/{n2}")
    public ResponseEntity div(@PathVariable("n1") double n1, @PathVariable("n2") double n2){
        double div = n1/n2;
        return ResponseEntity.status(HttpStatus.CREATED).body("Result: "+ div);

    }
}
