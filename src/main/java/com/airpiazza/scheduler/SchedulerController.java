package com.airpiazza.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
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
}
