package com.pal.stringops;

public class GoalParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String command = "(al)G(al)()()G";//"G()()()()(al)";//"G()(al)";
		System.out.println(new GoalParser().interpret(command));
	}
	
	public String interpret(String command) {
		String finalStr = "";
		char[] strToChar = command.toCharArray();
		//for(char checkChar: strToChar){
		for(int i=0;i<strToChar.length; i++){
			//char checkChar = strToChar[i]; 
			if(strToChar[i]=='G'){
				finalStr=finalStr.concat("G");
			}if(strToChar[i]=='(' && strToChar[i+1]==')'){
				finalStr=finalStr.concat("o");
			}
			if(strToChar[i]=='(' && strToChar[i+1]=='a'){
				finalStr=finalStr.concat("al");
			}
		}
		return finalStr;
        
    }

}
