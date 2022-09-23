package fileReader;

import java.io.IOException;



public class FileReadingAndWriting 
{
	public static void main(String[] args) throws IOException
	{	
			NumberOfLinesAndCharacter linesAndChar=new NumberOfLinesAndCharacter();
			WriteAFile writeFile=new WriteAFile();
			writeFile.writeFile();
			
			System.out.println("Number of characters :"+linesAndChar.getNumberOfCharacters());
			System.out.println("Number of Lines :"+linesAndChar.getNumberOfLines());
			System.out.println("");
			System.out.println("Location of Writed File : E:\\\\java\\\\WritedFile.txt");
	}
}
