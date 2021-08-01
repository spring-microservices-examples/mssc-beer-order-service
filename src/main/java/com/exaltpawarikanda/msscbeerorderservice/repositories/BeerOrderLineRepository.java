package com.exaltpawarikanda.msscbeerorderservice.repositories;

import com.exaltpawarikanda.msscbeerorderservice.domain.BeerOrderLine;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerOrderLineRepository extends PagingAndSortingRepository<BeerOrderLine, UUID> {
}
