package finalProject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileHandler {
	
	public FileHandler() {
	}

	public void writeToFile(Entity entity, String outputFilename)
	{
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(outputFilename));)
		{
			out.writeObject(entity);
			System.out.println("Serialization to file complete.\n");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public Entity readFromFile(String inputFileName)
	{
		
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(inputFileName));)
		{
			return (Entity) in.readObject();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return null;
	}
}
