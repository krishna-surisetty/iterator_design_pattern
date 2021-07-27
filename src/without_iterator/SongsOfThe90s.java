package without_iterator;

import java.util.Hashtable;

public class SongsOfThe90s {

	Hashtable<Integer, SongInfo> bestSongs;

	int hashKey = 0;

	public SongsOfThe90s() {
		bestSongs = new Hashtable<Integer, SongInfo>();
		addSong("Losing My Religion", "REM", 1991);
		addSong("Creep", "Radiohead", 1993);
		addSong("Walk on the Ocean", "Toad The Wet Sprocket", 1991);
	}

	// method to add songs info in Hash table format
	public void addSong(String songName, String bandName, int yearReleased) {
		SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
		bestSongs.put(hashKey, songInfo);
		hashKey++;
	}

	// method to return songs info in Hash table format
	public Hashtable<Integer, SongInfo> getSongs() {
		return bestSongs;
	}
}
