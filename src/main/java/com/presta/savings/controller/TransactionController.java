package com.presta.savings.controller;

import com.presta.savings.dto.SaveTransactionRequest;
import com.presta.savings.service.TransactionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@Tag(
        name ="CRUD REST APIs for Transaction",
        description = "CRUD REST APIs-Create Transaction, Update Transaction,Get Transaction,Get All Transaction,Delete Transaction"
)

@RestController
@RequestMapping(value="/api/transaction/")
public class TransactionController {
    @Autowired
    TransactionService transactionService;

    @Operation(
            summary="Create Transaction REST API",
            description = "Create Transaction REST API used to save Transaction  in a database"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP Status 201 CREATED"
    )
    @PostMapping("add")
    public ResponseEntity<?> addTransaction(@RequestBody SaveTransactionRequest saveTransactionRequest){
        return transactionService.addTransaction(saveTransactionRequest);

    }
    @Operation(
            summary="update Transaction REST API",
            description = "update Transaction REST API is used to update a particular Transaction in a database"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP Status 201 CREATED"
    )
    @PutMapping("update/{id}")
    public ResponseEntity<?> updateTransaction(@RequestBody SaveTransactionRequest saveTransactionRequest, @PathVariable long id){
        return transactionService.updateTransaction(saveTransactionRequest,id);

    }
    @Operation(
            summary="Get all Transaction REST API",
            description = "Get all Transaction REST API used to get all Transaction from the database"
    )
    @ApiResponse(
            responseCode = "302",
            description = "HTTP Status 302 FOUND"
    )
    @GetMapping("list")
    public ResponseEntity<?> listAll(){
        return transactionService.findAll();

    }
    @Operation(
            summary="Get Transaction by id  REST API",
            description = "Get Transaction By Id REST API is used to get a single Transaction from the database "
    )
    @ApiResponse(
            responseCode = "302",
            description = "HTTP Status 302 FOUND"
    )

    @GetMapping("findById/{id}")
    public ResponseEntity<?> findById(@PathVariable long id){
        return transactionService.findById(id);

    }
    @Operation(
            summary="Delete Transaction REST API",
            description = "Delete Transaction REST API is used to delete a particular Transaction from the  database"
    )
    @ApiResponse(
            responseCode = "202",
            description = "HTTP Status 201 ACCEPTED"
    )
    @DeleteMapping("deleteById/{id}")
    public ResponseEntity<?> deleteById(@PathVariable long id){
        return transactionService.deleteById(id);

    }
}
