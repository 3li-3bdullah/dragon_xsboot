package crud.springboot.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class PatientModel {
    List<Patient> patients = new ArrayList<>();

    public PatientModel() {
        patients.add(new Patient("ali", 23));
        patients.add(new Patient("Tamer", 20));
        patients.add(new Patient("Azooz", 24));
    }

    public List<Patient> getPatients() {
        return patients;
    }
}
