package finalProject;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class ClassTester {

	public static void main(String[] args) {
	
		EntityFactory ef = new EntityFactory();
		List<Entity> entities = new ArrayList<>();
		Component cp;
		FileHandler fileHandler = new FileHandler();
		
		entities.add(ef.produceEntity(EntityTemplateName.PLAYERCHARACTERDWARF, PClass.FIGHTER));
		entities.add(ef.produceEntity(EntityTemplateName.PLAYERCHARACTERHUMAN, PClass.ROGUE));
		entities.add(ef.produceEntity(EntityTemplateName.PLAYERCHARACTERELF, PClass.WIZARD));
		
		cp = entities.get(0).getComponent(ComponentCharacterDescription.class);
		((ComponentCharacterDescription)cp).setCharacterName("Hadvar");
		((ComponentCharacterDescription)cp).setPlayerName("Bill");
		((ComponentCharacterDescription)cp).setGender(Gender.MALE);
		((ComponentCharacterDescription)cp).setHair(Color.RED);
		((ComponentCharacterDescription)cp).setEyes(Color.GREEN);
		
		cp = entities.get(1).getComponent(ComponentCharacterDescription.class);
		((ComponentCharacterDescription)cp).setCharacterName("Dominique");
		((ComponentCharacterDescription)cp).setPlayerName("Bill");
		((ComponentCharacterDescription)cp).setGender(Gender.MALE);
		((ComponentCharacterDescription)cp).setHair(Color.YELLOW);
		((ComponentCharacterDescription)cp).setEyes(Color.BLACK);
		
		cp = entities.get(1).getComponent(ComponentCharacterDescription.class);
		((ComponentCharacterDescription)cp).setCharacterName("Vaeri");
		((ComponentCharacterDescription)cp).setPlayerName("Caroline");
		((ComponentCharacterDescription)cp).setGender(Gender.FEMALE);
		((ComponentCharacterDescription)cp).setHair(Color.WHITE);
		((ComponentCharacterDescription)cp).setEyes(Color.BLUE);
		
		fileHandler.writeToFile(entities.get(0), "FinalProject/finalProject/Entity.ser");
		entities.add(fileHandler.readFromFile("FinalProject/finalProject/Entity.ser"));
		
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
			
			cp = el.getComponent(ComponentCharacterDescription.class);
			System.out.println(((ComponentCharacterDescription)cp).toString());
			System.out.println();
			
			System.out.println("-------------------------------------");
			System.out.println();
		}
	}
}
