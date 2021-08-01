package com.exaltpawarikanda.msscbeerorderservice.web.mappers;

import com.exaltpawarikanda.msscbeerorderservice.domain.BeerOrderLine;
import com.exaltpawarikanda.msscbeerorderservice.web.model.BeerOrderLineDto;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
@DecoratedWith(BeerOrderLineMapperDecorator.class)
public interface BeerOrderLineMapper {
    BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line);

   BeerOrderLine dtoToBeerOrderLine(BeerOrderLineDto dto);
}
