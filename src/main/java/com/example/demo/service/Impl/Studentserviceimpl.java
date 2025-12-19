package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepo;
import com.example.demo.service.StudentService;
import java.util.List;
@Service
public class StudentServiceimpl implements StudentService{
        @Autowired StudentRepo student;
        //save()
        //findAll()
        //findById()
        //deleteById()
        //existById()
    @Override
           public StudentEntity postData(StudentEntity stu){
             return student.save(stu);
         }
         @Override
         
         public List<StudentEntity>getAllData(){
         
         return student.findAll();
         }
         @Override
         public String deleteData(int id){
          student.deleteById(id);
          return "Deleted Successfully";
         }
         @Override
         public StudentEntity getData(int id){
          return student.findById(id).orElse(null);
         }
         @Override
         public StudentEntity updateData(int id,StudentEntity entity){
           if(student.existsById(id)){
            entity.setId(id);
            return student.save(entity);
           }
           return null;
         }
}