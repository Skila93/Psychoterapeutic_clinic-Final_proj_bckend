package com.kodilla.psychoterapeutic_clinic_bckend.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class UsdResponseDto {
    private BigDecimal udsExchangeRate;
}