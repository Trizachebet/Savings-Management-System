package com.presta.savings.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Schema(
        description = "Customer model information"
)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaveCustomerRequest {

    @Schema(
            description = "Customer Name"
    )
    private String name;
    @Schema(
            description = "Customer nationalIdNo"
    )
    private String nationalIdNo;
    @Schema(
            description = "Customer memberNo"
    )
    private String memberNo;
    @Schema(
            description = "Customer phoneNo"
    )
    private String phoneNo;
    @Schema(
            description = "Customer email"
    )
    private String  email;
}
