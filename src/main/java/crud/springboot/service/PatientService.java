package crud.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crud.springboot.model.Patient;
import crud.springboot.model.PatientModel;

@Service
public class PatientService {

    // public String printPatientName(String name) {
    // return name.toUpperCase();
    // }

    @Autowired
    private PatientModel patientModel;

    public Patient printPatientName(String patientName, Integer age) {
        Patient patient = patientModel.getPatients().stream().filter(i -> {
            return i.getName().equals(patientName) || i.getAge().equals(age); }).findAny().orElse(new Patient());
        return patient;
    }

    public List<Patient> getPatients() {
        // List<Patient> patients = new ArrayList<>();
        // patientModel.getPatients().forEach(name -> patients.add(new Patient(name,
        // 10)));

        return patientModel.getPatients();
    }
}
