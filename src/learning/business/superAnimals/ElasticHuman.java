package learning.business.superAnimals;

import learning.basicGUI.ImagePanel;

public class ElasticHuman extends HomoSapiens implements Stretcher {

  public ElasticHuman() {
    super();
  }

  public void stretch(ImagePanel space, int x, int y){
                              space.imageWidth = x;
                              space.imageLenght = y;
                              space.repaint();
  }

}
