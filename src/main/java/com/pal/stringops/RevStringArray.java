package javaexs.stringops;
public class RevStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputArray[] = {"H","a","n","n","a","h"};//{"h","e","l","l","o"};
		System.out.println("-----");
		for(String str : revInputArray(inputArray)){
			System.out.print("---"+str);
		}
		
	}
	 
	private static String[] revInputArray(String inputArray[]){
		int start = 0;
		int end = inputArray.length;
		int mid = end/2;
		end = end-1;
		// reverse and print 
		/*for(int i = end-1 ; i >= 0; i--) {
			System.out.print(inputArray[i] +",");
			System.out.println("-----");
			}*/
		// reverse and put back in same array
		String tempStr = "";
		for(int j = start; j<mid; j++){
			tempStr = inputArray[j];
			inputArray[j] = inputArray[end];
			inputArray[end] = tempStr;
			tempStr = "";
			end--;
			}
		
		return inputArray;
	}
}
