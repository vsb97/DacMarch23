package vaishnavi.hospital.com;

import java.util.Arrays;

public class PatientRecord {

	Patient p;
	MedicalRecord mr[]= new MedicalRecord[5];
	
	
	public PatientRecord() {
		
	}
	
	public PatientRecord(Patient p, MedicalRecord[] mr) {
		super();
		this.p = p;
		this.mr = mr;
	}

	@Override
	public String toString() {
		return "PatientRecord [p=" + p.toString() + ", mr=" + Arrays.toString(mr) + "]";
	}

}
