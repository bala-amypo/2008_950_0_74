package com.example.demo.Repository;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.jpa.repository;
@Repository
public interface StudentRepo extends JpaRepository<StudentEntity,Integer>{    

}