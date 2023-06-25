package com.presta.savings.controller;

import com.presta.savings.dto.SaveCustomerRequest;
import com.presta.savings.service.CustomerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@Tag(
        name ="CRUD REST APIs for Customer",
        description = "CRUD REST APIs-Create Customer, Update Customer,Get Customer,Get All Customers,Delete Customer"
)
@RestController
@RequestMapping(value="/api/customer/")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Operation(
            summary="Create Customer REST API",
            description = "Create Customer REST API used to save user in a database"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP Status 201 CREATED"
    )

    @PostMapping("add")
    public ResponseEntity<?> addCustomer(@RequestBody SaveCustomerRequest saveCustomerRequest){
           return customerService.addCustomer(saveCustomerRequest);

    }
    @Operation(
            summary="update Customer REST API",
            description = "update Customer REST API is used to update a particular Customer in a database"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP Status 201 CREATED"
    )


    @PutMapping("update/{id}")
    public ResponseEntity<?> addCustomer(@RequestBody SaveCustomerRequest saveCustomerRequest, @PathVariable long id){
        return customerService.updateCustomer(saveCustomerRequest,id);

    }
    @Operation(
            summary="Get all Customers REST API",
            description = "Get all Customers REST API used to get all customers  from the database"
    )
    @ApiResponse(
            responseCode = "302",
            description = "HTTP Status 302 FOUND"
    )


    @GetMapping("list")
    public ResponseEntity<?> listAll(){
        return customerService.findAll();

    }
    @Operation(
            summary="Get Customer by id  REST API",
            description = "Get Customer By Id REST API is used to get a single Customer from the database "
    )
    @ApiResponse(
            responseCode = "302",
            description = "HTTP Status 302 FOUND"
    )
    @GetMapping("findById/{id}")
    public ResponseEntity<?> findById(@PathVariable long id){
        return customerService.findById(id);

    }

    @Operation(
            summary="DeleteCustomer REST API",
            description = "Delete Customer REST API is used to delete a particular Customer from the  database"
    )
    @ApiResponse(
            responseCode = "202",
            description = "HTTP Status 201 ACCEPTED"
    )
    @DeleteMapping("deleteById/{id}")
    public ResponseEntity<?> deleteById(@PathVariable long id){
        return customerService.deleteById(id);

    }


}
