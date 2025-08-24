package crud.springboot.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class PatientModel {
    List<String> patients = new ArrayList<>();

    public PatientModel() {
        patients.add("John Doe");
        patients.add("Jane Smith");
        patients.add("Alice Johnson");
    }

    public List<String> getPatients() {
        return patients;
    }
}
