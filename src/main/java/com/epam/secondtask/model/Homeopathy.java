package com.epam.secondtask.model;

import com.epam.secondtask.model.enumeration.MedicineGroupType;

import java.util.List;

public class Homeopathy extends Medicine {
    private String activeSubstance;

    public Homeopathy(String medicineId, boolean prescription, String medicineName, MedicineGroupType medicineGroup, List<String> analogs, List<Version> medicineVersions) {
        super(medicineId, prescription, medicineName, medicineGroup, analogs, medicineVersions);
    }

    public String getActiveSubstance() {
        return activeSubstance;
    }

    public void setActiveSubstance(String activeSubstance) {
        this.activeSubstance = activeSubstance;
    }

    @Override
    public String toString() {
        return "Homeopathy{" +
                "activeSubstance='" + activeSubstance + '\'' +
                '}';
    }
}