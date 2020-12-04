package com.example.azk.expense.repository;
import com.example.azk.expense.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>  {
    Category findByName(String name);


}
