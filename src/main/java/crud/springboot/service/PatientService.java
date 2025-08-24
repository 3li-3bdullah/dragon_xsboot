package crud.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crud.springboot.model.PatientModel;

@Service
public class PatientService {

    // public String printPatientName(String name) {
    //     return name.toUpperCase();
    // }

    @Autowired
    private PatientModel patientModel;

    public String printPatientName(String patientName) {
        String name = patientModel.getPatients().stream().filter(i -> i == patientName).findAny().orElse("Not Found"); 
        return name;
    }
}
