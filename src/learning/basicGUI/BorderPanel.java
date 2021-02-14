///////////////////////////////////////////////////
//    Java Class by Luis Ernesto Rubio Torres    //
///////////////////////////////////////////////////

package learning.basicGUI;

import java.awt.*;


public class BorderPanel extends Panel{
  
	public BorderPanel(){						
		super();	
		this.setLayout(new BorderLayout());
	}
	
	public void addNorth(Component component){
		this.add(component, BorderLayout.NORTH);
	}
	public void addSouth(Component component){
		this.add(component, BorderLayout.SOUTH);
	}
	public void addEast(Component component){
		this.add(component, BorderLayout.EAST);
	}
	public void addWest(Component component){
		this.add(component, BorderLayout.WEST);
	}
	public void addCenter(Component component){
		this.add(component, BorderLayout.CENTER);
	}

}