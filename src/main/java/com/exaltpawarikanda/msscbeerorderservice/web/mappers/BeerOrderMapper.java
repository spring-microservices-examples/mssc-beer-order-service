package com.exaltpawarikanda.msscbeerorderservice.web.mappers;

import com.exaltpawarikanda.msscbeerorderservice.domain.BeerOrder;
import com.exaltpawarikanda.msscbeerorderservice.web.model.BeerOrderDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {DateMapper.class, BeerOrderLineMapper.class})
public interface BeerOrderMapper {

    @Mapping(target = "customerId", source = "customer.id")
    BeerOrderDto beerOrderToDto(BeerOrder beerOrder);

    BeerOrder dtoToBeerOrder(BeerOrderDto dto);
}
