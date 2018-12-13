/**
 * 
 */
package com.assignment.controller;

/**
 * @author ugawari
 *
 */
public class RemoveExtraSpacesAndWord {

	/**
	 * program to accept the sentence and reduce all the extra blank space between two words to a single blank space.
	 * Accept a word from the user which is part of the sentence along with its position number and delete the word and display the sentence.
	 * @param sentence delete word from sentence
	 * @param position at index
	 * @param word to delete
	 * @return
	 */
	public String removeSpacesDuplicates(String sentence, int position, String word) {
		String spaceLessSentence=sentence.replaceAll("\\s+", " ");//removing extra spaces
		String sentenceWithoutDeletedWord="";//declaring empty string
		String []words=spaceLessSentence.split(" ");//split sentence into array
		for(int i=0; i<words.length; i++){
			if(words[i].equals(word) && i==position){//checking position and word is present. If "Yes" do not add to sentenceWithoutDeletedWord
			}else{
				if(i!=words.length-1){
					sentenceWithoutDeletedWord=sentenceWithoutDeletedWord.concat(words[i]+" ");
				}else{
					sentenceWithoutDeletedWord=sentenceWithoutDeletedWord.concat(words[i]);
				}
			}
		}
		return sentenceWithoutDeletedWord;
	}

}
