package com.presta.savings.controller;

import com.presta.savings.dto.SaveProductRequest;
import com.presta.savings.service.SavingProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@Tag(
        name ="REST APIs for SavingProductController",
        description = "SavingProduct CRUD REST APIs-Create SavingProduct, Update SavingProduct,Get SavingProduct,Get All SavingProduct,Delete SavingProduct"
)
@RestController
@RequestMapping(value="/api/product/")
public class SavingProductController {
    @Autowired
    SavingProductService savingProductService;
    @Operation(
            summary="Create SavingProduct REST API",
            description = "Create SavingProduct REST API used to save SavingProduct in a database"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP Status 201 CREATED"
    )

    @PostMapping("add")
    public ResponseEntity<?> addProduct(@RequestBody SaveProductRequest saveProductRequest){
       // System.out.println(saveProductRequest.getName()+ "............................................");
        return savingProductService.addSavingProduct(saveProductRequest);

    }
    @Operation(
            summary="update SavingProduct REST API",
            description = "update SavingsProduct REST API is used to update a particular SavingProduct in a database"
    )
    @ApiResponse(
            responseCode = "201",
            description = "HTTP Status 201 CREATED"
    )
    @PutMapping("update/{id}")
    public ResponseEntity<?> updateProduct(@RequestBody SaveProductRequest saveProductRequest, @PathVariable long id){
        return savingProductService.updateSavingProduct(saveProductRequest,id);

    }
    @Operation(
            summary="Get all  REST API",
            description = "Get all SavingsProduct REST API used to get all SavingProduct from the database"
    )
    @ApiResponse(
            responseCode = "302",
            description = "HTTP Status 302 FOUND"
    )
    @GetMapping("list")
    public ResponseEntity<?> listAll(){
        return savingProductService.findAll();

    }
    @Operation(
            summary="Get SavingProduct by id  REST API",
            description = "Get SavingProduct By Id REST API is used to get a single SavingProduct from the database "
    )
    @ApiResponse(
            responseCode = "302",
            description = "HTTP Status 302 FOUND"
    )
    @GetMapping("findById/{id}")
    public ResponseEntity<?> findById(@PathVariable long id){
        return savingProductService.findById(id);

    }
    @Operation(
            summary="DeleteSavingProduct REST API",
            description = "Delete savingProduct REST API is used to delete a particular SavingProduct from the  database"
    )
    @ApiResponse(
            responseCode = "202",
            description = "HTTP Status 201 ACCEPTED"
    )
    @DeleteMapping("deleteById/{id}")
    public ResponseEntity<?> deleteById(@PathVariable long id){
        return savingProductService.deleteById(id);

    }

}
