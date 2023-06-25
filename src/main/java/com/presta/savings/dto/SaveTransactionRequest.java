package com.presta.savings.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaveTransactionRequest {

    private double amount;
     private String paymentChannel;
    private String transactionRef;
    private long customerId;
   private long productId;
}
