/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zer0leet.sms.dao;

import com.zer0leet.sms.entity.Student;
import java.util.ArrayList;

/**
 *
 * @author Deepika
 */
public interface StudentDAO {

    void add(Student s);

    boolean delete(int id);

    ArrayList<Student> showAll();

    Student searchById(int id);

    ArrayList<Student> searchByAny(String param);

}
