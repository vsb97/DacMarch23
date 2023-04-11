package vaishnavi.hospital.com;

import java.time.LocalDate;

public class MedicalRecord {


	LocalDate date;
	String doctorName;
	String diagnosis;
	String treatment;
	
	
	
	public MedicalRecord( String dname, String d, String t) {
		//super(name, age, gender, address);
		this.date= LocalDate.now();
		this.doctorName= dname;
		this.diagnosis = d;
		this.treatment = t;
	}



	@Override
	public String toString() {
		return "MedicalRecord [date=" + date + ", doctorName=" + doctorName + ", diagnosis=" + diagnosis
				+ ", treatment=" + treatment + "]";
	}

}
