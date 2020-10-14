package com.capg;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class MyLinkedHashMapTest {

	@Test
	public void givenASentence_WhenWordsAreAddedToList_ShouldReturnWordFrequency() {
		String sentence="Paranoids are not paranoid because"
				+ "they are paranoid but because they keep putting"
				+ "themselves deliberately into paranoid avoidable situations";
		LinkedHashMap<String,Integer> myHashMap=new LinkedHashMap<>();
		String[] words=sentence.toLowerCase().split(" ");
		for(String word: words) {
			Integer value= myHashMap.get(word);
			if(value==null) {
				value=1;
			}
			else {
				value=value+1;
			}
			myHashMap.add(word,value);
		}
		int frequency = myHashMap.get("paranoid");
		System.out.println(myHashMap);
		Assert.assertEquals(3, frequency);
	}

	@Test
	public void givenASentence_WhenWordIsDeleted_ShouldReturnNull() {
		String sentence="Paranoids are not paranoid because"
				+ "they are paranoid but because they keep putting"
				+ "themselves deliberately into paranoid avoidable situations";
		LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap<>();
		String[] words=sentence.toLowerCase().split(" ");
		for(String word: words) {
			Integer value= linkedHashMap.get(word);
			if(value==null) {
				value=1;
			}
			else {
				value=value+1;
			}
			linkedHashMap.add(word,value);
		}
		linkedHashMap.remove("avoidable");
		System.out.println(linkedHashMap);
		Assert.assertNull(linkedHashMap.get("avoidable"));
	}
}
