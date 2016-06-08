/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zer0leet.sms.dao.impl;

import com.zer0leet.sms.dao.StudentDAO;

import com.zer0leet.sms.entity.Student;
import java.util.ArrayList;

/**
 *
 * @author Deepika
 */
public class StudentDAOImpl implements StudentDAO{
    ArrayList<Student> studentList=new ArrayList<>();
    @Override
    public void add(Student s) {
        s.setId(studentList.size() + 1);
        studentList.add(s);
        
    }

    @Override
    public boolean delete(int id) {
        for(int i=0;i<studentList.length;i++){
            if(studentList[i]!=)
            
        }
    }

    @Override
    public ArrayList<Student> showAll() {
        return studentList;
    }

    @Override
    public Student searchById(int id) {
       for(Student s: studentList){
           if(s.getId()==id){
               return s;
           }
       }
       return null;
    }

    @Override
    public ArrayList<Student> searchByAny(String param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}