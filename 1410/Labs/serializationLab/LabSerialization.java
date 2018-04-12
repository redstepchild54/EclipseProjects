package serializationLab;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LabSerialization {
    public static void main(String[] args) {
        ListVsSetDemo demo = new ListVsSetDemo(
                new ColoredSquare(4, Color.RED),
                new ColoredSquare(6, Color.BLUE),
                new ColoredSquare(4, Color.RED),
                new ColoredSquare(8, Color.YELLOW));

//        testDemo(demo);
        serialize(demo, "Labs/serializationLab/Demo.ser");
        
        ListVsSetDemo setDemo = deserialize("Labs/serializationLab/Demo.ser");
        
        testDemo(setDemo);

    };

    private static void testDemo(ListVsSetDemo demo) {
        System.out.println("List:");
        System.out.println(demo.getListElements());
        System.out.println("Set:");
        System.out.println(demo.getSetElements());
    }
    
    private static void serialize(ListVsSetDemo demo, String filename)
    {
    	try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename));)
    	{
    		out.writeObject(demo);
    		System.out.println("Serialization Complete Commander.\n");
    	}
    	catch (IOException e)
    	{
    		System.out.println("File Error: " + e.getMessage());
    	}
    	catch (Exception e)
    	{
    		System.out.println(e.getMessage());
    	}
    }

    private static ListVsSetDemo deserialize(String filename)
    {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename));)
		{
			return (ListVsSetDemo) in.readObject();
		}
		catch(IOException e)
		{
			System.out.println("File Error: " + e.getMessage());
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class Not Found: " + e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return null;
    }
}
