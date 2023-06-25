package com.presta.savings.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SavingResponse {
    private String customerName;
    private String savingProductName;
    private double totalAmount;

}

