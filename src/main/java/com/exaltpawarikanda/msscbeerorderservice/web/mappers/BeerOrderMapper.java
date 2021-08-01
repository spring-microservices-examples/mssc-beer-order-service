package com.exaltpawarikanda.msscbeerorderservice.web.mappers;

import com.exaltpawarikanda.msscbeerorderservice.domain.BeerOrder;
import com.exaltpawarikanda.msscbeerorderservice.web.model.BeerOrderDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class, BeerOrderLineMapper.class})
public interface BeerOrderMapper {

    BeerOrderDto beerOrderToDto(BeerOrder beerOrder);

    BeerOrder dtoToBeerOrder(BeerOrderDto dto);
}
