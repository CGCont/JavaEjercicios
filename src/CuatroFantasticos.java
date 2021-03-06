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

        private class StretchButton extends InternalButton{
                public void pushAction(){
                        superHero.stretch(space, 200, 250);
                }
        }

        private boolean visibleFlag = true;
        private class VisibleButton extends InternalButton{
                public void pushAction(){
                        space2.setVisible(visibleFlag);
                        visibleFlag = !visibleFlag;
                }
        }

        private class MouseStretch extends MouseAdapter {
                public void mousePressed(MouseEvent e){
                              superHero.stretch(space, e.getX(), e.getY() );
                }
        }

        private ElasticHuman	superHero;
        private ImagePanel     	space;

        private ElasticHuman	superHero2;
        private ImagePanel     	space2;

        private Superman	superHero3;
        private ImagePanel     	space3;

        private ElasticHuman	superHero4;
        private ImagePanel     	space4;

        private FlowPanel       controlPanel;
        private WalkButton      walkButton;
        private FlyButton      	flyButton;
        private StretchButton      stretchButton;
        private VisibleButton      visibleButton;


        private int	      	spaceWidth;
        private int		spaceHeight;

        private GridPanel       	gridPanel;
        private int	       	renglones;
        private int 	       	columnas;


        public void createComponents(){

                super.createComponents();

                superHero 	= new ElasticHuman();
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

                stretchButton	= new StretchButton();
                visibleButton = new VisibleButton();

                spaceWidth	= 600;
                spaceHeight	= 600;

                renglones = 2;
                columnas = 2;
                gridPanel 		= new GridPanel(renglones, columnas);

        }

        public void distributeComponents(){

                space.imageX	= 0;
                space.imageY	= 0;
                space.addMouseListener(new MouseStretch());
                space.setImage("D:/EjerciciosJava/src/resources/images/supers/Fantastic4/Reed Richards.jpg", 200,250);
              
                space2.imageX	= 0;
                space2.imageY	= 0;
                space2.setImage("D:/EjerciciosJava/src/resources/images/supers/Fantastic4/Sue Storm.jpg", 200,250);

                space3.imageX	= 0;
                space3.imageY	= 0;
                space3.setImage("D:/EjerciciosJava/src/resources/images/supers/Fantastic4/Jhonny Storm.jpg", 200,250);
              
                space4.imageX	= 0;
                space4.imageY	= 0;
                space4.setImage("D:/EjerciciosJava/src/resources/images/supers/Fantastic4/Ben Grimm.jpg", 200,250);

                walkButton.setLabel("<Walk<");
                flyButton.setLabel("<Fly>");
                stretchButton.setLabel("<Stretch>");
                visibleButton.setLabel("<Visible>");

                controlPanel.add(stretchButton);
                controlPanel.add(visibleButton);
                controlPanel.add(flyButton);
                controlPanel.add(walkButton);
                
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
               superHero4.walk(space4, spaceWidth/2, spaceHeight);
        }
        public void flyAction(){
                superHero3.fly(space3, spaceWidth/2, spaceHeight);  
        }
        public static void main(String [] args){
                CuatroFantasticos theTest = new CuatroFantasticos();
                theTest.startApplication();
        }

}
