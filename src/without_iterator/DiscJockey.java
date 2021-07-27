package without_iterator;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

// class which gets all songs information by iterating over different collections received
public class DiscJockey {
	
	SongsOfThe70s songsOfThe70s;
	SongsOfThe80s songsOfThe80s;
	SongsOfThe90s songsOfThe90s;
	
	public DiscJockey(SongsOfThe70s newSongsOfThe70s, SongsOfThe80s newSongsOfThe80s, SongsOfThe90s newSongsOfThe90s) {
		songsOfThe70s = newSongsOfThe70s;
		songsOfThe80s = newSongsOfThe80s;
		songsOfThe90s = newSongsOfThe90s;
	}
	
	public void showTheSongs() {
		
		System.out.println("Songs of the 70's");
		
		ArrayList<SongInfo> arrayList70sSongs = songsOfThe70s.getSongs();
		
		for(SongInfo ofThe70s : arrayList70sSongs) {
			System.out.println(ofThe70s);
		}
		
		System.out.println("Songs of the 80's");
		
		SongInfo[] arrays80sSongs = songsOfThe80s.getSongs();
		
		for(SongInfo ofThe80s : arrays80sSongs) {
			System.out.println(ofThe80s);
		}
		
		System.out.println("Songs of the 90's");
		
		Hashtable<Integer, SongInfo> hashTable90sSongs = songsOfThe90s.getSongs();
		
		for(Enumeration<Integer> e = hashTable90sSongs.keys(); e.hasMoreElements();) {
			System.out.println(hashTable90sSongs.get(e.nextElement()));
		}
	}
	
}
