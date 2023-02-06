package com.example.springday11.Service;

import com.example.springday11.Exception.ApiException;
import com.example.springday11.Model.Teacher;
import com.example.springday11.Repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class TeacherService {
     final private TeacherRepository teacherRepository;

    //ADD
    public void addTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }

   //DISPLAY
    public List<Teacher> getTeacher() {
        return teacherRepository.findAll();
    }

    //Update

    public void updateTeacher(Integer id, Teacher teacher) {
        Teacher newTeacher = teacherRepository.findCustomerById(id);
        if (newTeacher == null) {
            throw new ApiException("order not found!!");
        }
        teacherRepository.save(newTeacher);
    }

    // Delete
    public void deleteTeacher(Integer id) {
        Teacher teacher = teacherRepository.findCustomerById(id);
        if (!teacherRepository.existsById(id)) {
            throw new ApiException("Id is not found");
        }
        teacherRepository.delete(teacher);
    }


}
