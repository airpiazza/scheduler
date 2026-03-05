package com.airpiazza.scheduler;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRespository extends JpaRepository<Appointment, Integer> { }
