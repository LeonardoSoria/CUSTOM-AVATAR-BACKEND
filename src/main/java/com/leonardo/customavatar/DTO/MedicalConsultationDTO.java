package com.leonardo.customavatar.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicalConsultationDTO {

    private Long id;

    private String description;
    private LocalDate date;
    private String prescription;
    private Long patientId;
    private Long doctorId;
}
