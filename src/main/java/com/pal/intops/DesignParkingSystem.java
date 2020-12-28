package com.pal.intops;

public class DesignParkingSystem {

	private int big;
	private int medium;
	private int small;

	public DesignParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesignParkingSystem designParkingSystem = new DesignParkingSystem(1, 1, 0);
		int[] carArray = new int[] {1, 2, 3, 1};
		for (int i: carArray) {
		int carType = i;
		boolean param_1 = designParkingSystem.addCar(carType);
		System.out.println(param_1);
		}
		}
	
	public boolean addCar(int carType) {
		if (carType == 1){
			if (big >= 1){
				big--;
				return true;
				}
			return false;
			}
		else if (carType == 2) {
			if (medium >= 1) {
				medium--;
				return true;
			}
			return false;
			}
		else if (carType == 3) {
		if (small >= 1) {
			small--;
				return true;
			}
			return false;
			} 
		else {
			return false;
			}
	} 

}
