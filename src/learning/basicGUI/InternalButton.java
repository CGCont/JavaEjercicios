///////////////////////////////////////////////////
//    Java Class by Luis Ernesto Rubio Torres    //
///////////////////////////////////////////////////

package learning.basicGUI;

import java.awt.*;
import java.awt.event.*;

public class InternalButton extends Button implements ActionListener{
        
	public InternalButton(){						
		super();
		this.addActionListener(this);
	}
	public InternalButton(String buttonCaption){						
		super(buttonCaption);
		this.addActionListener(this);
	}
	public void actionPerformed(ActionEvent event){
		pushAction();
	}
	public void pushAction(){

	}
	
}