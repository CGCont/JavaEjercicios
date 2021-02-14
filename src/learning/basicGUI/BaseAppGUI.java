///////////////////////////////////////////////////
//    Java Class by Luis Ernesto Rubio Torres    //
///////////////////////////////////////////////////

package learning.basicGUI;

import java.awt.*;
import java.awt.event.*;

public class BaseAppGUI{
        
	protected FrameGUI frameGUI;
	
	protected void createComponents(){
		frameGUI = new FrameGUI("Basic Application Graphic User Interface");
		frameGUI.addWindowListener(new WindowAdapter() {
       			public void windowClosing(WindowEvent e) {              
        	  		System.exit(0);
       			}
		}); 
	}
	protected void distributeComponents(){
		frameGUI.setSize(500,250);    
    		frameGUI.setResizable(true);
	}
	protected void startApplication(){
		frameGUI.setVisible(true);
	}
	public BaseAppGUI(){						
		createComponents();
		distributeComponents();
	}

}