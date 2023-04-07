package resataurant.menu.vaishnavi;

import java.util.Scanner;

public class MenuOperations {
	
	private String menu[]=new String[10];
	private int price[]=new int[10];
	
	static Scanner sc = new Scanner(System.in);
	
	public MenuOperations() {
		menu[0]="Dal";menu[1]="Rice";menu[2]="Roti";
		menu[3]="Chhole";menu[4]="Puran Poli";menu[5]="Dal-khichdi";
		menu[6]="Dosa";menu[7]="Idali";menu[8]="Papad";menu[9]="DalBati";
		
		price[0]=30;price[1]=40;price[2]=15;
		price[3]=120;price[4]=40;price[5]=50;
		price[6]=30;price[7]=30;price[8]=25;price[9]=80;	
	}

	public void viewMenu() {
		// TODO Auto-generated method stub
		if(menu!=null) {
			System.out.println("-------------------------------------");
			System.out.println("Menu----->>>>");
			for(int i=0; i<menu.length; i++) {
				if(menu[i]!=null)
					System.out.println(menu[i]+"	"+price[i]);
				else
					break;
			}
			System.out.println("-------------------------------------");
		}
		else {
			System.out.println("Array is empty");
			System.out.println("-------------------------------------");
		}
	}

	public void addDish() {
		// TODO Auto-generated method stub
		int flag=0;
		System.out.print("Enter name of the new dish to be added.:");
		String dish=sc.nextLine();
		sc.nextLine();
		System.out.print("Enter price of the new dish to be added.:");
		int p=sc.nextInt();
		for(int i=0; i<menu.length; i++) {
			if(menu[i]==null) {
				menu[i]=dish;
				price[i]=p;
				flag =1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("The menu is full thats why overriding new dish at last index");
			menu[9]=dish;
			price[9]=p;
		}
		viewMenu();
		
	}

	public void removeDish() {
		// TODO Auto-generated method stub
		if(menu!=null) {
			System.out.println("Enter index of dish to remove.:");
			int i = sc.nextInt();
			if(i>=0 & i<10) {
				for(int k=i;k<9;k++) {
					menu[k]=menu[k+1];
					price[k]=price[k+1];
				}
				menu[9]=null;
				price[9]=0;
				viewMenu();
			}
			else
				System.out.println("Wrong index entered.:");
		}
		else {
			System.out.println("Array is empty");
		}
		
		System.out.println("-------------------------------------");
	}

	public void modifyPrice() {
		// TODO Auto-generated method stub
		System.out.print("Enter index of dish to modify price.:");
		int i = sc.nextInt();
		if(i>=0 & i<10 & menu[i]!=null) {
			System.out.print("Enter new price.:");
			price[i]=sc.nextInt();
			viewMenu();
			
		}
		else
			System.out.println("Wrong index entered.:");
		
		System.out.println("-------------------------------------");
		
	}
	
	

}
