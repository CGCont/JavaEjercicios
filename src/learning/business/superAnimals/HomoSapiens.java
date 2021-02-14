package learning.business.superAnimals;

import learning.basicGUI.ImagePanel;

public class HomoSapiens extends Animal {

  public HomoSapiens() {
    super(2);
  }

  public void eat() {
    System.out.println("Humans eat everything.");
  }

   public void walk(ImagePanel space, int spaceWidth, int spaceHeight) {
                if (space.imageX < spaceWidth){
		space.imageX	=  space.imageX + 50;     
                }else {
                		space.imageX	=  0;
                }
                space.repaint();
  }

}
