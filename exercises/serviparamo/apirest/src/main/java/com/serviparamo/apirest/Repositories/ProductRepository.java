package com.serviparamo.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.serviparamo.apirest.Entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
