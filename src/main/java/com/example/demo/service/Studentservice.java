package com.example.demo.service;
import com.example.demo.entity.Studententity;
import java.util.List;
public interface Studentservice{
    Studententity postdata(Studententity stu);

List<Studententity>getalldata();
String deletedata(int rollno);
Studententity getdata(int rollno);
Studententity updatedata(int rollno,Studententity entity);
}