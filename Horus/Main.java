package Horus;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class Main {
	private static final String[] COLORS= {"RED","GREEN","BLUE","BLACK","WHITE"};
	private static final String[] MATERIAL= {"STEEL","FOOD","WATER","GOLD","STONE"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ram= new Random();
		List<Blocks> blocks= new ArrayList <Blocks>(); 
		for (int i=0; i<ram.nextInt(50);i++) {// for example create 20 bloks
			blocks.add(i, new Blocks(COLORS[ram.nextInt(COLORS.length)],MATERIAL[ram.nextInt(MATERIAL.length)]));
		}
		
		Wall wall=new Wall(blocks);// create wall 
		wall.getBlocks().forEach(System.out::println); // for check
		List<Blocks>findSteel  =wall.findBlocksByMaterial("STEEL", wall);
		System.out.println("Find material // zwraca wszystkie elementy z danego materiału");
		findSteel.forEach(System.out::println);
		Optional<Blocks> findRed=wall.findBlockByColor("RED", wall);
		System.out.println("zwraca dowolny element o podanym kolorze ");
		System.out.println(findRed);
		int countWall=wall.count(wall);
		System.out.println("Size wall:"+ countWall);
	
		
		
	}

}
