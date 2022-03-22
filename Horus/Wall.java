package Horus;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall  implements Structure, CompositeBlock  {

	private  List<Blocks> blocks;
	
	public Wall (List<Blocks> blocks) {
		this.setBlocks(blocks);
	}

	@Override
	public Optional <Blocks> findBlockByColor(String color, Wall wall) {
		// TODO Auto-generated method stub
		Optional<Blocks> result=wall.getBlocks()
				.stream()
				.filter(block->block.getColor().equals(color))
				.findAny();
		return result;
		}

	@Override
	public List<Blocks> findBlocksByMaterial(String material, Wall wall) {
		var result =wall.getBlocks();
		
		return result.stream()
			.filter(block->block.getMaterial().equals(material))
			.collect(Collectors.toList());
	}

	@Override
	public int count(Wall wall) {
		int result= wall.getBlocks().size();
		return result;
		
	}

	public void setBlocks(List<Blocks> blocks) {
		this.blocks = blocks;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMaterial() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Blocks> getBlocks() {
		
		
		return blocks;
	}

	

}
