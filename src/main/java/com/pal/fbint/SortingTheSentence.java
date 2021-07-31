package com.pal.fbint;

/*
 * https://leetcode.com/problems/sorting-the-sentence/
 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.
 * A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.
 * For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
 * Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.
 */

public class SortingTheSentence {

	public static void main(String[] args) {

		String s = "is2 sentence4 This1 a3";//"Myself2 Me1 I4 and3";
		String opt = new SortingTheSentence().sortingSentence(s);
		System.out.println(opt);

	}

	public String sortingSentence(String s) {

		String[] sentArray = s.split(" ");
		String[] optArray = new String[sentArray.length];	
		for(String senValue : sentArray) {
			String indx = String.valueOf(senValue.charAt(senValue.length()-1));
			optArray[Integer.parseInt(indx)-1] = senValue.substring(0, senValue.length()-1);
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<optArray.length-1; i++) {
			sb.append(optArray[i]).append(" ");
		}
		sb.append(optArray[optArray.length-1]);
		return sb.toString();

	}


}
