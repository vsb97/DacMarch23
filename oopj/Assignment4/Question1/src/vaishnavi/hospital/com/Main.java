package vaishnavi.hospital.com;

import java.util.Scanner;

public class Main {

	static Scanner sc= new Scanner(System.in);
	static HospitalManager hm = new HospitalManager();
	//static HospitalManager hm = HospitalManager.getReference();
	
	static int menu() {
		System.out.println("0.Exit");
		System.out.println("1.Add Patient Record");
		//System.out.println("2.Add Medical Record");
		System.out.println("3.Print Patient Record");
		System.out.println("4.Print Medical Record(s)");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		
		int i =10;
		while(i!=0) {
			i=Main.menu();
			switch(i) {
			case 0: 
				System.out.println("Thank you!!!");
				return;
				
			case 1: 
				hm.addPatientRecord();
				break;
				
//			case 2: 
//				System.out.println("Enter patient index.:");
//				int name = sc.nextInt();
//				hm.addMedicalRecordForPatient(name);
//				break;
				
			case 3:
				System.out.println(hm.getPatientRecord());
				break;
				
			case 4:
				hm.getPatientMedicalRecord();
				break;
			}
		}
		
//		HospitalManager hm = new HospitalManager();
//		hm.addPatientRecord();
//		
//		PatientRecord record = hm.getPatientRecord();
//		if(record!=null)
//			System.out.println(record.toString());
//		
//		MedicalRecord[] mr = hm.getPatientMedicalRecord();
		
		
		

	}

}


