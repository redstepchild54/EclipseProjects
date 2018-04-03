package assignmentA07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListVsSetDemo {
	
	private List<ColoredSquare> list = new ArrayList<>();
	private Set<ColoredSquare> set = new HashSet<>();
	
	public ListVsSetDemo(ColoredSquare... elements)
	{
		for (ColoredSquare el : elements)
		{
			list.add(el);
			set.add(el);
		}
	}
	
	public String getListElements()
	{
		StringBuilder sb = new StringBuilder();
		for (ColoredSquare el : list)
		{
			sb.append(el.toString());
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public String getSetElements()
	{
		StringBuilder sb = new StringBuilder();
		for (ColoredSquare el : set)
		{
			sb.append(el.toString());
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public void addElement(ColoredSquare el)
	{
		list.add(el);
		set.add(el);
	}
}
