package com.presta.savings.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SavingRequest {
    private double transactionAmount;
    private long productId;
    private long customerId;
}
