package com.cts.brownfield.pss.service;

import java.util.Optional;

import com.cts.brownfield.pss.entity.Product;

public interface SearchService {
	Optional<Product> findById(Long id);

	}
