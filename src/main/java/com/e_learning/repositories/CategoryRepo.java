package com.e_learning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.e_learning.entities.Category;



public interface CategoryRepo extends JpaRepository<Category, Integer> {

	
}
