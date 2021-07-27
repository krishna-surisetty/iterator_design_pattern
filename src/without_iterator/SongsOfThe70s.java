package without_iterator;

import java.util.ArrayList;

public class SongsOfThe70s {

	ArrayList<SongInfo> bestSongs;

	public SongsOfThe70s() {
		bestSongs = new ArrayList<SongInfo>();
		
		addSong("Imagine", "John Lennon", 1971);
		addSong("American Pie", "Don McLean", 1971);
		addSong("I Will Survive", "Gloria Gaynor", 1979);
	}
	
	// method to add songs info in an ArrayList
	public void addSong(String songName, String bandName, int yearReleased) {
		SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
		bestSongs.add(songInfo);
	}
	
	// method to return songs info in ArrayList format
	public ArrayList<SongInfo> getSongs() {
		return bestSongs;
	}

}
