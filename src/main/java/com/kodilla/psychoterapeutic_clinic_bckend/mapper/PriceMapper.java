package com.kodilla.psychoterapeutic_clinic_bckend.mapper;

import com.kodilla.psychoterapeutic_clinic_bckend.domain.Dto.PriceDto;
import com.kodilla.psychoterapeutic_clinic_bckend.domain.Price;
import org.springframework.stereotype.Service;

@Service
public class PriceMapper {
    public Price mapToPrice(PriceDto dto){
        return new Price(dto.getCurrency(), dto.getPositionId(), dto.getId(), dto.getPrice());
    }
    public PriceDto mapToPriceDto(Price price){
        return new PriceDto(price.getCurrency(), price.getPositionId(), price.getId(), price.getPrice());
    }
}
