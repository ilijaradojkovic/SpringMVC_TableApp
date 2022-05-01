package com.example.springmvc_tableapp.Controllers;

import com.example.springmvc_tableapp.Repository.ProfesorRepository;
import com.example.springmvc_tableapp.Repository.StudentRepository;
import com.example.springmvc_tableapp.model.DTO.InsertProfesorDTO;
import com.example.springmvc_tableapp.model.DTO.InsertStudentDTO;
import com.example.springmvc_tableapp.model.Profesor;
import com.example.springmvc_tableapp.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.UUID;

@Controller
public class PersonsController {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private ProfesorRepository profesorRepository;
    @GetMapping()
    public String getIndexGet(Model model)
    {

        model.addAttribute("page","Home");
        return "index";
    }
    @PostMapping()
    public String getIndexPost(Model model)
    {
        model.addAttribute("page","Home");

        return "index";
    }

    @GetMapping("/insertStudent")
    public String getInsertStudentPage(Model model){
        model.addAttribute("page","InsertStudentPage");

        return "index";

    }

    @PostMapping("/insertStudent")
    public String InsertStudent(Model model, @RequestBody InsertStudentDTO studentDTO){

        System.out.println(studentDTO.toString());
        Student s=new Student(UUID.randomUUID(),studentDTO.getFirstName(),studentDTO.getLastName(),studentDTO.getAge(),studentDTO.getDateOfBirth(),studentDTO.getIndex(),studentDTO.getYear());

       studentRepository.save(s);

        return "redirect:/";

    }


    @GetMapping("/insertProfesor")
    public String getInsertProfesorPage(Model model){
        model.addAttribute("page","InsertProfesorPage");
        return "index";

    }

    @PostMapping("/insertProfesor")
    public String InsertProfesor(Model model, @RequestBody InsertProfesorDTO profesorDTO){


        Profesor s=new Profesor(UUID.randomUUID(),profesorDTO.getFirstName(),profesorDTO.getLastName(),profesorDTO.getAge(),profesorDTO.getDateOfBirth(),profesorDTO.getSalary(),profesorDTO.getYears_of_experience());

        profesorRepository.save(s);

        return "redirect:/";

    }
@ResponseBody
    @GetMapping("/GetAllStudents")
    public List<Student> getAllStudents(){
        List<Student> all = studentRepository.findAll();
        return all;
    }

    @ResponseBody
    @GetMapping("/GetAllProfesors")
    public List<Profesor> getAllProfesors(){
        List<Profesor> all = profesorRepository.findAll();
        return all;
    }
}
