package com.example.demo.service.Impl;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.Studententity;
import com.example.demo.repository.Studentrepository;
// import org.springframework.web.bind.annotation.Pathvariable;
import com.example.demo.service.Studentservice; 
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class Studentserviceimpl implements Studentservice{
    @Autowired Studentrepository student;
    //save(),findAll(),findById(),deleteById(),existsById();
    @Override
    public Studententity postdata(Studententity stu){
       return student.save(stu);

    }
    @Override
     public List<Studententity>getalldata(){
        return student.findAll();
     }
     @Override
     public String deletedata(int rollno){
        student.deleteById(rollno);
        return "Deleted successfully";
     }
     @Override 
     public Studententity getdata(int rollno){
        return student.findById(rollno).orElse(null);
     }
     @Override
    public Studententity updatedata(int rollno,Studententity entity){
        if(student.existsById(rollno)){
            entity.setRollno(rollno);
            return student.save(entity);
        }
        return null;
    }

}