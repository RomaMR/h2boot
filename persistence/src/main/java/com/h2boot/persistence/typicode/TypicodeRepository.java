package com.h2boot.persistence.typicode;

import com.h2boot.domain.typicode.Typicode;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TypicodeRepository extends PagingAndSortingRepository<Typicode, Long> {
}
