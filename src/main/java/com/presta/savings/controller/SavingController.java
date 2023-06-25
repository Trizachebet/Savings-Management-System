package com.presta.savings.controller;

import com.presta.savings.service.SavingService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Tag(
        name ="REST APIs for SavingController",
        description = " REST APIs-Create Customer to Get  list of all savings and individual saving"
)

@RestController
@RequestMapping(value="/api/saving/")
public class SavingController {
    @Autowired
    SavingService savingService;
    @Operation(
            summary="Get all Saving REST API",
            description = "Get all Saving REST API used to get all savings from the database"
    )
    @ApiResponse(
            responseCode = "302",
            description = "HTTP Status 201 FOUND"
    )

    @GetMapping("list")
    public ResponseEntity<?> listAllCustomerSavings(){
        return savingService.findAll();

    }


    @Operation(
            summary="Get savings by id  REST API",
            description = "Get savings By Id REST API is used to get a single savings from the database "
    )
    @ApiResponse(
            responseCode = "302",
            description = "HTTP Status 302 FOUND"
    )
    @GetMapping("findById/{id}")
    public ResponseEntity<?> findByID(@PathVariable long id){
        return savingService.findById(id);

    }

}
