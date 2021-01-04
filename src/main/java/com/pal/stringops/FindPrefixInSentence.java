package com.pal.stringops;
/*https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/*/
public class FindPrefixInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "hellohello hellohellohello";//"this problem is an easy problem";//"i love eating burger";//"hellohello hellohellohello";//"i am tired";//"i use triple pillow";
		String searchWord = "ello";//"pro";//"ell";//"you";//"pill";//"burg";
		System.out.println(new FindPrefixInSentence().isPrefixOfWord(sentence, searchWord));
	}
	
	public int isPrefixOfWord(String sentence, String searchWord) {
		 int outputIndex = -1;
			String[] sentenceArr = sentence.split("\\s+");
			char[] prefixArr = searchWord.toCharArray();
			 int i=0;
			 for(String word : sentenceArr) {
		        	int j=0;
		        	if(word.length()>=prefixArr.length) {
		        	for(char prefixchar : prefixArr) {
		        		if(word.charAt(j)==prefixchar) {
		        			if(j+1 == prefixArr.length) {
		        			outputIndex = i+1;
		        			}
		        		}else {
		        			break;
		        		}
		        		j++;
		        	  }
		        	}
		        	if(outputIndex>-1) {
		        		break;
		        	}
		        	i++;
		        }
			
			return outputIndex;
	}
	
	
	
	
	/* Using String methods */
	 /*public int isPrefixOfWord(String sentence, String searchWord) {
        int outputIndex = -1;
		String[] sentenceArr = sentence.split("\\s+");
        int i=1;
        for(String word : sentenceArr) {
        		
        		if(word.startsWith(searchWord)) {
        			outputIndex = i;
        			break;
        		}
        		i++;
        	}
        return outputIndex;
		}
*/
}
