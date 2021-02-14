// The SupermanVsHulkApp Program

import learning.business.superAnimals.Superman;
import learning.business.superAnimals.ElasticHuman;
import learning.basicGUI.BaseAppGUI;
import learning.basicGUI.ImagePanel;
import learning.basicGUI.InternalButton;
import learning.basicGUI.FlowPanel;
import learning.basicGUI.GridPanel;
import java.awt.TextArea;
import java.awt.event.*;

public class CuatroFantasticos extends BaseAppGUI {

        private class WalkButton extends InternalButton{
                public void pushAction(){
                        walkAction();
                }
        }

        private class FlyButton extends InternalButton{
                public void pushAction(){
                        flyAction();
                }
        }

        private class MouseStretch extends MouseAdapter {
                public void mousePressed(MouseEvent e){
                              superHero2.stretch(space2, e.getX(), e.getY() );
                }
        }

        private Superman	superHero;
        private ImagePanel     	space;

        private ElasticHuman	superHero2;
        private ImagePanel     	space2;

        private Superman	superHero3;
        private ImagePanel     	space3;

        private ElasticHuman	superHero4;
        private ImagePanel     	space4;

        private FlowPanel       	controlPanel;
        private WalkButton      	walkButton;
        private FlyButton      	flyButton;
        private int	      	spaceWidth;
        private int		spaceHeight;

        private GridPanel       	gridPanel;
        private int	       	renglones;
        private int 	       	columnas;


        public void createComponents(){

                super.createComponents();

                superHero 	= new Superman();
                space		= new ImagePanel();

                superHero2 	= new ElasticHuman();
                space2		= new ImagePanel();

                superHero3 	= new Superman();
                space3		= new ImagePanel();

                superHero4 	= new ElasticHuman();
                space4		= new ImagePanel();

                controlPanel	= new FlowPanel();
                walkButton	= new WalkButton();
                flyButton	= new FlyButton();

                spaceWidth	= 600;
                spaceHeight	= 600;

                renglones = 2;
                columnas = 2;
                gridPanel 		= new GridPanel(renglones, columnas);

        }

        public void distributeComponents(){

                space.imageX	= 0;
                space.imageY	= 0;
                space.setImage("D:/EjerciciosJava/src/resources/images/supers/Fantastic4/Reed Richards.jpg", 200,250);
              
                space2.imageX	= 0;
                space2.imageY	= 0;
                space2.addMouseListener(new MouseStretch());
                space2.setImage("D:/EjerciciosJava/src/resources/images/supers/Fantastic4/Sue Storm.jpg", 200,250);

                space3.imageX	= 0;
                space3.imageY	= 0;
                space3.setImage("D:/EjerciciosJava/src/resources/images/supers/Fantastic4/Jhonny Storm.jpg", 200,250);
              
                space4.imageX	= 0;
                space4.imageY	= 0;
                space4.addMouseListener(new MouseStretch());
                space4.setImage("D:/EjerciciosJava/src/resources/images/supers/Fantastic4/Ben Grimm.jpg", 200,250);

                walkButton.setLabel("Walk");
                flyButton.setLabel("Fly");

                controlPanel.add(walkButton);
                controlPanel.add(flyButton);

                gridPanel.add(space);
                gridPanel.add(space2);
                gridPanel.add(space3);
                gridPanel.add(space4);

                frameGUI.setTitle("Fantastic Four!!!");
                frameGUI.setSize(spaceWidth, spaceHeight);
                frameGUI.setResizable(false);
                frameGUI.addNorth(controlPanel);
                frameGUI.addCenter(gridPanel);
               
        }

        public void startApplication(){

                frameGUI.setVisible(true);

        }

        public void walkAction(){
               superHero.walk(space, spaceWidth/2, spaceHeight);
               superHero2.walk(space2, spaceWidth/2, spaceHeight);
        }

        public void flyAction(){
                superHero.fly(space, spaceWidth/2, spaceHeight);  
        }

        public static void main(String [] args){
                CuatroFantasticos theTest = new CuatroFantasticos();
                theTest.startApplication();
        }

}
