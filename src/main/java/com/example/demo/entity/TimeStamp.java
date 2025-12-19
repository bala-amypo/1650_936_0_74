package com.example.demo.entity;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import jakarta.persistence.PrePersist;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimeStamp{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    @PrePersist
    public void Oncreate(){
        LocalDateTime now=LocalDateTime().now();
        this.createdAt=now;
        this.updatedAt=now;
    }
    @PreUpdate
    public void Onupdate(){
        this.updateAt
    }
}