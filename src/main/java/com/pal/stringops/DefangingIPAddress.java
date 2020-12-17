package com.pal.stringops;

public class DefangingIPAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address = "1.1.1.1";
		DefangingIPAddress classObj = new DefangingIPAddress();
		System.out.println(classObj.defangIPaddr(address));
	}
	private String defangIPaddr(String address) {
        String finalString = address.replaceAll("\\.","[.]");
        return finalString;
    }
}
