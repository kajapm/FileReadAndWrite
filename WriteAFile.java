package fileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteAFile 
{
	BufferedReader reader;
	FileWriter fileWriter;
	
	WriteAFile() throws IOException
	{
		reader=new BufferedReader(new FileReader("E:\\eclipse\\exercises\\src\\fileReader\\FileReadingAndWriting.java"));
		fileWriter=new FileWriter("E:\\java\\WritedFile.txt");
	}
	public void writeFile() throws IOException
	{
		int i;
		while((i=reader.read())!=-1)
		{
			fileWriter.write((char)i);
		}
		
		reader.close();
		fileWriter.close();
	}
}

