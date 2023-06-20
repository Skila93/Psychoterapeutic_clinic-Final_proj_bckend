package com.kodilla.psychoterapeutic_clinic_bckend.domain.Dto;

import com.kodilla.psychoterapeutic_clinic_bckend.domain.Currency;
import com.kodilla.psychoterapeutic_clinic_bckend.domain.Position;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PriceDto {
    private Currency currency;
    private Position positionId;
    private long id;
    private long price;
}
