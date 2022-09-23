package fileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NumberOfLinesAndCharacter 
{
	BufferedReader reader;
	
	public int getNumberOfLines() throws IOException
	{	
		reader=new BufferedReader(new FileReader("E:\\eclipse\\exercises\\src\\fileReader\\FileReadingAndWriting.java"));
		int numberOfLines=0;
		while(reader.readLine()!=null)
		{
			numberOfLines++;
		}
		reader.close();
		return numberOfLines;
	}
	
	public int getNumberOfCharacters() throws IOException
	{
		reader=new BufferedReader(new FileReader("E:\\eclipse\\exercises\\src\\fileReader\\FileReadingAndWriting.java"));
		int i;
		int numberOfCharacters=0;
		
		while((i=reader.read())!=-1)
		{
			numberOfCharacters++;
		}
		return numberOfCharacters;
	}
	
}
