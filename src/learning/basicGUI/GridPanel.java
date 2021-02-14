///////////////////////////////////////////////////
//    Java Class by Luis Ernesto Rubio Torres    //
///////////////////////////////////////////////////

package learning.basicGUI;

import java.awt.*;


public class GridPanel extends Panel{
	
	public GridPanel(int rows, int columns){						
		super();
		this.setLayout(new GridLayout(rows, columns));
	}	

}