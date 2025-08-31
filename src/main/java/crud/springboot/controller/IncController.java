package crud.springboot.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import crud.springboot.model.Inc;

@RestController
@RequestMapping("/inc")
public class IncController {

    @GetMapping("/personal-info")
    public Inc getInc() {
        // todo: this way is true
        // Inc inc = new Inc();
        // inc.setId(UUID.randomUUID().toString());
        // inc.setIncNo(123000);
        // inc.setPatientName("John Doe");
        // todo: and also this
        return Inc.builder()
                .patientName("Sudo Dragon X")
                .id(UUID.randomUUID().toString())
                .incNo(123000)
                .build();
    }

}
