///////////////////////////////////////////////////
//    Java Class by Luis Ernesto Rubio Torres    //
///////////////////////////////////////////////////

package learning.basicGUI;

import java.awt.*;
import java.io.*;

public class ImagePanel extends Panel implements Serializable{
  public transient Image image;
  public int   imageX;
  public int   imageY;
  public int   imageLenght;
  public int   imageWidth;
  public String imageFile;

  public ImagePanel() {
       	imageX = 0;
       	imageY = 0;
  }

  public void setImage(String imageFile, int imageWidth, int imageLenght){
       image = this.getToolkit().getImage(imageFile); 
       this.imageLenght = imageLenght;
       this.imageWidth = imageWidth;
       this.imageFile = imageFile;	
  }

  public void reSetImage(){
			   // for IO: use after object deserialization 
	image = this.getToolkit().getImage(imageFile); 
  }

  public void paint (Graphics g){
      g.drawImage(image, imageX, imageY, imageWidth, imageLenght, this);  
  }

}
