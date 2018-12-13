package com.assignment.controller;

/**
 * @author ugawari
 *
 */
public class ReverseCharacters {

	/**
	 * Program to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order
	 * @param sentence
	 * @return reverse each word of sentence
	 */
	public String reverseCharacter(String sentence) {
		String reverseChar = "";
		String words[]=sentence.split(" ");//split sentence into words
		for(int i=0; i<words.length; i++){
			String reverseWord="";
			char characters[] = words[i].toCharArray();//split words into characters
			int index=characters.length-1;
			for(int j=index; j>=0; j--){
				reverseWord+=characters[j];//reverse character of each word
			}
			if(i!=words.length-1){
				reverseChar=reverseChar.concat(reverseWord+" ");
			}else{
				reverseChar=reverseChar.concat(reverseWord);
			}
		}
		return reverseChar;//return reverse character sentence
	}

}
