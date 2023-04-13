package vaishnavi.hospital.com;

import java.util.Scanner;

public class HospitalManager {

//	static int prCount;
	static Scanner sc = new Scanner(System.in);
	static Hospital h = new Hospital();
	
	void addPatientRecord() {
		if(Hospital.prCount<Hospital.MAX_PATIENT_COUNT) {
			System.out.print("Enter name of the patient: ");
			String name = sc.nextLine();
			System.out.print("Enter age of the patient: ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter gender of the patient: ");
			String gender = sc.nextLine();
			System.out.print("Enter address of the patient: ");
			String address = sc.nextLine();
			
			System.out.print("Enter no of medical records for this patient: ");
			int noOfRecords = sc.nextInt();
			sc.nextLine();
			
			PatientRecord patientRecord = new PatientRecord();
			
			patientRecord.p = new Patient(name,  age,  gender,  address);
			
			for(int i =0;i<noOfRecords;i++) {
				addMedicalRecord(patientRecord);
			}
			
				h.pr[Hospital.prCount] = patientRecord;
				System.out.println("Patient added succefully at index.: "+Hospital.prCount);
				Hospital.prCount++;
		}
		
	}
	
	void addMedicalRecord(PatientRecord p) {
		
		if(p.p.mrCount<5) {
			System.out.print("Enter Doctor name : ");
			String dname = sc.nextLine();
			System.out.print("Enter diagnosis: ");
			String d = sc.nextLine();
			System.out.print("Enter treatment: ");
			String t = sc.nextLine();
			
			p.mr[p.p.mrCount] = new MedicalRecord( dname,  d,  t);
			p.p.mrCount++;
			//System.out.println(p.toString());
		}
		else {
			System.out.println("Maximum limit of medical records extended");
		}
		
	}
	
//	void addMedicalRecordForPatient(int index) {
//		
//		
//			
//			if(p.p.mrCount<5) {
//				System.out.print("Enter Doctor name : ");
//				String dname = sc.nextLine();
//				System.out.print("Enter diagnosis: ");
//				String d = sc.nextLine();
//				System.out.print("Enter treatment: ");
//				String t = sc.nextLine();
//				
//				p.mr[p.p.mrCount] = new MedicalRecord( dname,  d,  t);
//				p.p.mrCount++;
//				//System.out.println(p.toString());
//			}
//			else {
//				System.out.println("Maximum limit of medical records extended");
//			}
//			
//		}
	
	PatientRecord getPatientRecord() {
		System.out.println("Enter index of patient to get the record.:");
		int i = sc.nextInt();
		if(i>=0 && i<10 && h.pr[i]!=null) {
			return h.pr[i];
		}
		return null;
	}
	MedicalRecord[] getPatientMedicalRecord() {
		System.out.println("Enter index of patient to get the medical record.:");
		int i = sc.nextInt();
		if(i>=0 && i<10 && h.pr[i]!=null) {
			if(h.pr[i].mr!=null) {
				for(int j=0;j<5;j++) {
					if(h.pr[i].mr[j]!=null)
						System.out.println((h.pr[i].mr[j]));
				}
			}
//				System.out.println((h.pr[i].mr.toString()));
			return h.pr[i].mr;
		}
		return null;
	}

	public static HospitalManager getReference() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addMedicalRecordPrev() {
		// TODO Auto-generated method stub
		
	}

}


