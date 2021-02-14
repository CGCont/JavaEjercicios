///////////////////////////////////////////////////
//    Java Class by Luis Ernesto Rubio Torres    //
///////////////////////////////////////////////////

package learning.data;

import java.io.*;

public class ObjectArchive{         
     
     public static void saveObject(Object object, String archiveName){
          ObjectOutputStream oos = null;
          try {
               oos = new ObjectOutputStream(new FileOutputStream(archiveName));       
               oos.writeObject(object);
	       if (oos != null) oos.close();	
          }
	  catch(Exception e){
		System.out.println("saveObject fails " + e);
	  }          
     }

     //////////////////////////////////////////////////////////////////////

     public static Object loadObject(String archiveName) {
          ObjectInputStream ois = null;
          Object object = null;
          try {
               ois = new ObjectInputStream(new FileInputStream(archiveName));                    
               object = ois.readObject();    
	       if (ois != null) ois.close();           
          }    
	  catch(Exception e){
		System.out.println("loadObject fails " + e);
	  }                    
          return object;
    }   
}