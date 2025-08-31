package crud.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import crud.springboot.model.Patient;
import crud.springboot.service.PatientService;

@RestController
@RequestMapping("/dragonxf")
public class PatientController {

    @Autowired
    private PatientService patientService;
    
    @GetMapping("/print-name")
    public ResponseEntity printPatientName(@RequestParam String name, @RequestParam("a") Integer age) {
        return ResponseEntity.ok(patientService.printPatientName(name,age));
    }


     @GetMapping("/patients")
     public ResponseEntity getPatients() {
         return ResponseEntity.ok(patientService.getPatients());
     }
    
     @PostMapping("/patients/save")
    public Patient savePatients(@RequestBody Patient patient) {
        return patient;
    }
}
