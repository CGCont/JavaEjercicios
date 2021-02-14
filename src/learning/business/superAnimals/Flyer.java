package learning.business.superAnimals;

import learning.basicGUI.ImagePanel;

public interface Flyer {
  public void takeOff(ImagePanel space, int spaceWidth, int spaceHeight);
  public void land(ImagePanel space, int spaceWidth, int spaceHeight);
  public void fly(ImagePanel space, int spaceWidth, int spaceHeight);
}
