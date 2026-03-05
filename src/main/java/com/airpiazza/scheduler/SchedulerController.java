package com.airpiazza.scheduler;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchedulerController {
    @Autowired
    private AppointmentRespository appointmentRespository;

    @PostMapping(path = "/appointment")
    public Appointment createAppointment(@RequestBody Appointment appointment) {
        return appointmentRespository.save(appointment);
    }

    @GetMapping(path = "/appointment/{id}")
    public Appointment getAppointmentById(@PathVariable int id) {
        Optional<Appointment> appointment = appointmentRespository.findById(id);
        
        return appointment.orElse(null);
    }
}
