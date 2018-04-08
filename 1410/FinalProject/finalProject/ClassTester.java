package finalProject;

import java.util.ArrayList;
import java.util.List;

public class ClassTester {

	public static void main(String[] args) {
	
		EntityFactory ef = new EntityFactory();
		List<Entity> entities = new ArrayList<>();
		Component cp;
		
		entities.add(ef.produceEntity(EntityTemplateName.PLAYERCHARACTERHUMAN, PClass.FIGHTER));
		entities.add(ef.produceEntity(EntityTemplateName.PLAYERCHARACTERHUMAN, PClass.ROGUE));
		entities.add(ef.produceEntity(EntityTemplateName.PLAYERCHARACTERHUMAN, PClass.WIZARD));
		
		for(Entity el: entities)
		{
			cp = el.components.get(ComponentClass.class);
			System.out.println(((ComponentClass)cp).toString());
			System.out.println();
			
			cp = el.components.get(ComponentAttributes.class);
			System.out.println(((ComponentAttributes)cp).toString());
			System.out.println();
			
			cp = el.components.get(ComponentBody.class);
			System.out.println(((ComponentBody)cp).toString());
			System.out.println();
			
			cp = el.components.get(ComponentSavingThrows.class);
			System.out.println(((ComponentSavingThrows)cp).toString());
			System.out.println();
			System.out.println();
		}
	}
}
