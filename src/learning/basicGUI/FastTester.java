///////////////////////////////////////////////////
//    Java Class by Luis Ernesto Rubio Torres    //
///////////////////////////////////////////////////

package learning.basicGUI;

import learning.basicGUI.*;
import learning.basicGUI.BaseAppGUI;
import learning.basicGUI.InternalButton;
import learning.basicGUI.FlowPanel;
import java.awt.TextArea;

public class FastTester extends BaseAppGUI{

	////////// (I) Components References //////////

	protected TesterButton 	testerButton;
	protected FlowPanel    	westFlowPanel;
	protected TextArea	textAreaGUI;

	///////////////////////////////////////////////


        public void createComponents(){
		super.createComponents();

		////////// (II) Components Creation  //////////

		testerButton 	= new TesterButton();
		westFlowPanel 	= new FlowPanel();
		textAreaGUI 	= new TextArea(40,20);
		
		///////////////////////////////////////////////
	}

	public void distributeComponents(){
		super.distributeComponents();

		////////// (III) Components Distribution & Settings //////////

		testerButton.setLabel("Test");
		westFlowPanel.add(testerButton);
		frameGUI.addWest(westFlowPanel);
		frameGUI.addCenter(textAreaGUI);

		//////////////////////////////////////////////////////////////
	}
	
	public void startApplication(){
		super.startApplication();

		////////// (IV) Start the Applicaction Logic //////////

		///////////////////////////////////////////////////////		
	}

	public static void main(String [] args){ 
		FastTester theAppObject = new FastTester();
		theAppObject.startApplication();
	}
	
	////////// (V) Application Logic & Control //////////
	
	protected class TesterButton extends InternalButton{
		public void pushAction(){
			testAction();
		}
	}

	public void testAction(){
		textAreaGUI.append("Testing the Application ...\n");
		System.out.println("Testing the Application ...");
	}
 
	//////////////////////////////////////////////////////
}