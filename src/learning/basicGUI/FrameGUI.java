///////////////////////////////////////////////////
//    Java Class by Luis Ernesto Rubio Torres    //
///////////////////////////////////////////////////

package learning.basicGUI;

import java.awt.*;


public class FrameGUI extends Frame{
  
	public FrameGUI(){						
		super();	
	}
	public FrameGUI(String title){						
		super(title);
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