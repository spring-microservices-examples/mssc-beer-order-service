package com.exaltpawarikanda.msscbeerorderservice.services;

import com.exaltpawarikanda.msscbeerorderservice.web.model.BeerDto;

import java.util.Optional;
import java.util.UUID;

/**
 * Created by Exalt Pawarikanda on 8/1/21
 */
public interface BeerService {

    Optional<BeerDto> getBeerById(UUID uuid);

    Optional<BeerDto> getBeerByUpc(String upc);
}
