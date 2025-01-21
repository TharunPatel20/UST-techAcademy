package strings;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Write the program to search the string in large document in java
public class Level1StringSearching {

	public static void main(String[] args)   { 
		String fileContent = getFileContent("./src/assignment1/strings/lorem.txt");
		String searchString = "versions of Lorem "; 
		
		findString(fileContent, searchString);
		
	}
	

	private static void findString(String fileContent, String searchString) {
		int n=fileContent.length();
		int m = searchString.length();
		boolean found=false;
		for(int i = 0;i<= n-m;i++) {
			int j;
			for(j=0;j<m;j++) {
				if(fileContent.charAt(i+j) != searchString.charAt(j)) break;
			}
			if(j == m) {
				System.out.println("Using NaiveSearch, Message found at position: " + i + " total stringlength = "+ (n-i-m));
				found = !found;
			}
		}
		
		if (!found )System.out.println("Message not found");
	}

	static String getFileContent(String path) {
		StringBuilder fileContent = new StringBuilder();
		try(FileReader reader = new FileReader(path)){
			int ch;
			while((ch=reader.read())!=-1) 	
				fileContent.append((char)ch);
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fileContent.toString();
	}
}
