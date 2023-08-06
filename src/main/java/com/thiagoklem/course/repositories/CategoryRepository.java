package com.thiagoklem.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagoklem.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
