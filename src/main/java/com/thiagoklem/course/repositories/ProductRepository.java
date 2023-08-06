package com.thiagoklem.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagoklem.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
