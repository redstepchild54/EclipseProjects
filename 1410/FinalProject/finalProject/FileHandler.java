package finalProject;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FileHandler {
	
	private Entity entity;
	private String outputFilename;
	private String inputFilename;
	
	public FileHandler(Entity entity, String outputFilename, String inputFilename)
	{
		this.entity = entity;
		this.outputFilename = outputFilename;
		this.inputFilename = inputFilename;
	}

	public void writeToFile()
	{
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(outputFilename));)
		{
			
		}
		catch(Exception e)
		{
			
		}
	}
}
