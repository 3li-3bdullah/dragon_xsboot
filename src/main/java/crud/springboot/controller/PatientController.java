package crud.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import crud.springboot.service.PatientService;

@RestController
@RequestMapping("/dragonxf")
public class PatientController {

    @Autowired
    private PatientService patientService;
    
    @GetMapping("/print-name")
    public String printPatientName() {
        return patientService.printPatientName("John Doe");
    }
}
