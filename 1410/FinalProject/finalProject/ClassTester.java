package finalProject;

import java.util.ArrayList;
import java.util.List;

public class ClassTester {

	public static void main(String[] args) {
	
		EntityFactory ef = new EntityFactory();
		List<Entity> entities = new ArrayList<>();
		Component cp;
		
		entities.add(ef.produceEntity(EntityTemplateName.PLAYERCHARACTERDWARF, PClass.FIGHTER));
		entities.add(ef.produceEntity(EntityTemplateName.PLAYERCHARACTERHUMAN, PClass.ROGUE));
		entities.add(ef.produceEntity(EntityTemplateName.PLAYERCHARACTERELF, PClass.WIZARD));
		
		for(Entity el: entities)
		{
			cp = el.getComponent(ComponentRace.class);
			System.out.println(((ComponentRace)cp).toString());
			
			cp = el.getComponent(ComponentPClass.class);
			System.out.println(((ComponentPClass)cp).toString());
			System.out.println();
			
			cp = el.getComponent(ComponentAttributes.class);
			System.out.println(((ComponentAttributes)cp).toString());
			System.out.println();
			
			cp = el.getComponent(ComponentSavingThrows.class);
			System.out.println(((ComponentSavingThrows)cp).toString());
			System.out.println();
			
			cp = el.getComponent(ComponentBody.class);
			System.out.println(((ComponentBody)cp).toString());
			System.out.println();
			
			cp = el.getComponent(ComponentSize.class);
			System.out.println(((ComponentSize)cp).toString());
			System.out.println();
			
			cp = el.getComponent(ComponentLevel.class);
			System.out.println(((ComponentLevel)cp).toString());
			
			cp = el.getComponent(ComponentXP.class);
			System.out.println(((ComponentXP)cp).toString());
			System.out.println();
			
			System.out.println("-------------------------------------");
			System.out.println();
		}
	}
}
