package com.airpiazza.scheduler;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:5173", methods = {RequestMethod.GET, RequestMethod.POST})
public class SchedulerController {
    @Autowired
    private AppointmentRespository appointmentRepository;

    @PostMapping(path = "/appointment")
    public Appointment createAppointment(@RequestBody Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @GetMapping(path = "/appointment/{id}")
    public Appointment getAppointmentById(@PathVariable int id) {        
        Optional<Appointment> appointment = appointmentRepository.findById(id);
        
        return appointment.orElse(null);
    }

    @DeleteMapping(path = "/appointment/{id}")
    public void deleteAppointmentById(@PathVariable int id) {
        appointmentRepository.deleteById(id);
    }
}
