package com.lao.javaLearning;

public class ReplaceAllVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "I miss MahendraSingh Dhoni";
		char [] inputarray = input.toCharArray();
		for (char c : inputarray) {
			if(c=='a'||c=='A'||c=='e' || c=='E'||c=='i' || c=='I'||c=='o' 
					|| c=='O'||c=='u' || c=='U') {
				input=input.replace(c,'*');
			}
		}
		System.out.println(input);
	}

}
