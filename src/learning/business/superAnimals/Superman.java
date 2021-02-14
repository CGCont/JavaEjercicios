package learning.business.superAnimals;

import learning.basicGUI.ImagePanel;

public class Superman extends HomoSapiens implements Flyer {

  public Superman() {
    super();
  }

  public void takeOff(ImagePanel space, int spaceWidth, int spaceHeight){

  }

  public void land(ImagePanel space, int spaceWidth, int spaceHeight){

  }

  public void fly(ImagePanel space, int spaceWidth, int spaceHeight){
                if (space.imageY > 0){
		space.imageY	=  space.imageY -  50;     
                }else {
                		space.imageY	=  spaceHeight - 150;
                }
                space.repaint();
  }

  public void stopBullet( ){

  }

  public void leapBuilding( ){

  }
 
}
