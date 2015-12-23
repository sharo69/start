package com.start.products;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by nikola.kaloyanov on 12/23/2015.
 */
public interface ProductRepository extends JpaRepository<Product, Long>
{
}
