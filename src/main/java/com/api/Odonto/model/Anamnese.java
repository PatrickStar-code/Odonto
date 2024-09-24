package com.api.Odonto.model;

import jakarta.persistence.*;

@Table
public class Anamnese {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tratamento_medico", length = 100)
    private String medical_treatment;

    @Column (name = "procedimentos", length = 100)
    private String procedures;

    @Column(name="Hospitalizado", nullable = false, columnDefinition = "boolean default false",length = 1)
    private Boolean hospitalized;

    @Column (name = "Motivo_Hospitalizacao", length = 100)
    private String hospitalization_reason;

    @Column(name="disturbio_sanguineo", nullable = false, columnDefinition = "boolean default false",length = 1)
    private Boolean blood_disorder;

    @Column (name = "Tipo_Disturbio_Sanguineo", length = 100)
    private String blood_disorder_type;

    @Column(name="diabetico", nullable = false, columnDefinition = "boolean default false",length = 1)
    private Boolean diabetic;

    @Column (name = "Doenca_infectocontagiosa", nullable = false, columnDefinition = "boolean default false",length = 1)
    private Boolean had_infectious_contagious;

    @Column(name = "Tipo_Doenca_infectocontagiosa", length = 100)
    private String type_infectious_contagious;

    @Column(name="disturbio_neurologico", nullable = false, columnDefinition = "boolean default false",length = 1)
    private Boolean has_neurological_disorder;

    @Column(name = "Tipo_Disturbio_Neurologico", length = 100)
    private String type_neurological_disorder;

    @Column(name = "Toma_Medicamento", nullable = false, columnDefinition = "boolean default false",length = 1)
    private Boolean takes_medication;

    @Column(name = "Tipo_Medicamento", length = 100)
    private String type_medication;

    @Column(name = "gravidez", nullable = false, columnDefinition = "boolean default false",length = 1)
    private Boolean is_pregnant;

    @Column(name = "Doenca_Familia", nullable = false, columnDefinition = "boolean default false",length = 1)
    private Boolean family_dominant_disease;

    @Column(name = "Tipo_Doenca_Familia", length = 100)
    private String type_family_dominant_disease;


    @Column(name = "Tipo_Sanguineo", length = 2)
    private  TypeBlood blood_type;

    @Column(name = "outras_informacoes", length = 100)
    private String other_information;

    @Column(name = "observacao", length = 100)
    private String observation;


    // Getters and Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMedical_treatment() {
        return medical_treatment;
    }

    public void setMedical_treatment(String medical_treatment) {
        this.medical_treatment = medical_treatment;
    }

    public String getProcedures() {
        return procedures;
    }

    public void setProcedures(String procedures) {
        this.procedures = procedures;
    }

    public Boolean getHospitalized() {
        return hospitalized;
    }

    public void setHospitalized(Boolean hospitalized) {
        this.hospitalized = hospitalized;
    }

    public String getHospitalization_reason() {
        return hospitalization_reason;
    }

    public void setHospitalization_reason(String hospitalization_reason) {
        this.hospitalization_reason = hospitalization_reason;
    }

    public Boolean getBlood_disorder() {
        return blood_disorder;
    }

    public void setBlood_disorder(Boolean blood_disorder) {
        this.blood_disorder = blood_disorder;
    }

    public String getBlood_disorder_type() {
        return blood_disorder_type;
    }

    public void setBlood_disorder_type(String blood_disorder_type) {
        this.blood_disorder_type = blood_disorder_type;
    }

    public Boolean getDiabetic() {
        return diabetic;
    }

    public void setDiabetic(Boolean diabetic) {
        this.diabetic = diabetic;
    }

    public Boolean getHad_infectious_contagious() {
        return had_infectious_contagious;
    }

    public void setHad_infectious_contagious(Boolean had_infectious_contagious) {
        this.had_infectious_contagious = had_infectious_contagious;
    }

    public String getType_infectious_contagious() {
        return type_infectious_contagious;
    }

    public void setType_infectious_contagious(String type_infectious_contagious) {
        this.type_infectious_contagious = type_infectious_contagious;
    }

    public Boolean getHas_neurological_disorder() {
        return has_neurological_disorder;
    }

    public void setHas_neurological_disorder(Boolean has_neurological_disorder) {
        this.has_neurological_disorder = has_neurological_disorder;
    }

    public String getType_neurological_disorder() {
        return type_neurological_disorder;
    }

    public void setType_neurological_disorder(String type_neurological_disorder) {
        this.type_neurological_disorder = type_neurological_disorder;
    }

    public Boolean getTakes_medication() {
        return takes_medication;
    }

    public void setTakes_medication(Boolean takes_medication) {
        this.takes_medication = takes_medication;
    }

    public String getType_medication() {
        return type_medication;
    }

    public void setType_medication(String type_medication) {
        this.type_medication = type_medication;
    }

    public Boolean getIs_pregnant() {
        return is_pregnant;
    }

    public void setIs_pregnant(Boolean is_pregnant) {
        this.is_pregnant = is_pregnant;
    }

    public Boolean getFamily_dominant_disease() {
        return family_dominant_disease;
    }

    public void setFamily_dominant_disease(Boolean family_dominant_disease) {
        this.family_dominant_disease = family_dominant_disease;
    }

    public String getType_family_dominant_disease() {
        return type_family_dominant_disease;
    }

    public void setType_family_dominant_disease(String type_family_dominant_disease) {
        this.type_family_dominant_disease = type_family_dominant_disease;
    }

    public TypeBlood getBlood_type() {
        return blood_type;
    }

    public void setBlood_type(TypeBlood blood_type) {
        this.blood_type = blood_type;
    }

    public String getOther_information() {
        return other_information;
    }

    public void setOther_information(String other_information) {
        this.other_information = other_information;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }
}


