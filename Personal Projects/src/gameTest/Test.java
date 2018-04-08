package gameTest;

import gameTest.Entity.*;

public class Test {

	public static void main(String[] args) {

		EntityFactory entityFactory = new EntityFactory();
		Entity ent;
		
		ent = entityFactory.ProduceEntity("Batman");
		entityFactory.ProduceEntity("Robin");
		entityFactory.ProduceEntity("Robin");
		Component cpt = ent.componentKeys.get(CapeColor.class);
		System.out.println(((CapeColor) cpt).capeColorTemplate.str);
		
		
	}

}
