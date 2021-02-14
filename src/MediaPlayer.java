public class MediaPlayer{
	public static void main( String[ ] args ){
		System.out.println("Tocadiscos Polimorfo " + "\n");
		
		Player poliPlayer;
		
		poliPlayer = new CdPlayer();
		poliPlayer.play(1, "Allá en el rancho grande"); 
				
		poliPlayer = new DvdPlayer();
		poliPlayer.play(1,"Allá en el rancho grande"); 
	}	
}

 class Player{
		public void play(int track, String media){
			System.out.println(" No hace nada con " + media + "\n");
		}
	}
	
 class CdPlayer extends Player{
		public void play(int track, String media){
			System.out.println(" Escuchando la canción #" + track + ": " + media +  "!!! \n");
		}
	}

 class DvdPlayer extends Player{
		int theTrack;
		String theMedia;
		public void play(int track, String media){
			theTrack = track;
			playing(media);
		}
		public void playing(String myMedia){
			String movie = myMedia;
			System.out.print(" Viendo la pelicula #" );
			printTrack();
			printMedia(movie);
		}
		private void printTrack( ){
			System.out.print(theTrack + ": " );
		}
		private void printMedia( String film ){
			theMedia = film;
			System.out.println( theMedia + "!!! \n" );
		}
	}