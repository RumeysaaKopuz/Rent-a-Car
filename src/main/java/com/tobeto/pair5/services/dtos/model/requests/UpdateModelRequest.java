package com.tobeto.pair5.services.dtos.model.requests;

import com.tobeto.pair5.services.dtos.brand.responses.GetAllBrandResponse;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateModelRequest {
    @Positive(message = "Id must be positive a number")
    @NotNull(message = "Id field can not be empty")
    private int id;

    @NotNull(message = "Name can not be empty")
    private String name;

    private GetAllBrandResponse brand;
}
