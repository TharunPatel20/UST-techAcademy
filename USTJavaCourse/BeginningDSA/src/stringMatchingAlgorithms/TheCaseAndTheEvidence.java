package stringMatchingAlgorithms;

import java.io.FileReader;
import java.io.IOException;

public class TheCaseAndTheEvidence {

	
	public static void main(String args[]) {
		String innocent_text="";
		String message_To_Find="";
		try {
			 innocent_text = readFile("./src/StringMatchingAlgorithms/innocent_text.txt");
			 message_To_Find = readFile("./src/StringMatchingAlgorithms/message_to_find.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("innocent_text.txt content: \t"+innocent_text);
		System.out.println("message_to_find.txt content: \t"+message_To_Find);
		
		
		//NavieSearch
		NaiveSearch navieSearch = new  NaiveSearch();
		boolean NavieFound = navieSearch.findSecret(innocent_text, message_To_Find);
		System.out.println("Using Navie Search Algorithm: "+(NavieFound ? "The secret is found ":"Sectet is not found"));
		
		
		//Boyer-Moore Algorithm
		BoyerMooreAlgorithm boyerMooreAlgorithm = new  BoyerMooreAlgorithm();
		boolean BoyerFound = boyerMooreAlgorithm.findSecret(innocent_text, message_To_Find);
		System.out.println("Using Boyer-Moore Algorithm : "+ (BoyerFound ? "The secret is found ":"Sectet is not found"));
		
		
		//Knuth-Morris-Pratt (KMP) Algorithm
		KMPAlgorithm KMP = new KMPAlgorithm();
		boolean KMPFound = KMP.findSecret(innocent_text, message_To_Find);
		System.out.println("Using Knuth-Morris-Pratt (KMP) Algorithm : "+ (KMPFound ? "The secret is found ":"Sectet is not found"));
		
	}
	
	static String readFile(String file) throws IOException {
		FileReader reader = new FileReader(file);
		StringBuilder builder = new StringBuilder();
		
		int ch;
		while((ch=reader.read())!=-1) builder.append((char)ch);
		reader.close();
		return builder.toString();
	}
}