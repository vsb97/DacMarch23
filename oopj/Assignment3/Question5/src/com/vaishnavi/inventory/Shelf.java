package com.vaishnavi.inventory;

public class Shelf {
	static final int SHELF_SIZE=10;
	private Item arr[]=new Item[SHELF_SIZE];
	private int shelfStatus=-1;//-1 empty..10 full.. 0-9 last element index
	public Item[] getArr() {
		return arr;
	}
	public void setArr(Item arr[]) {
		this.arr = arr;
	}
	public int getShelfStatus() {
		return shelfStatus;
	}
	public void setShelfStatus(int shelfStatus) {
		this.shelfStatus = shelfStatus;
	}
	
}
