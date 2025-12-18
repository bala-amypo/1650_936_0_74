package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Validationentity;
@Repository
public interface Validationrepository extends JpaRepository<Validationentity,Long>{

    
}