package without_iterator;

import java.util.ArrayList;

public class SongsOfThe80s {

	SongInfo[] bestSongs;
	int arrayValue = 0;

	public SongsOfThe80s() {

		bestSongs = new SongInfo[3];

		addSong("Roam", "B 52s", 1989);
		addSong("Cruel Summer", "Bananarama", 1984);
		addSong("Head Over Heels", "Tears For Fears", 1985);

	}

	// method to add songs info in Array format
	public void addSong(String songName, String bandName, int yearReleased) {
		SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
		bestSongs[arrayValue] = songInfo;
		arrayValue++;
	}

	// method to return songs info in Array format
	public SongInfo[] getSongs() {
		return bestSongs;
	}

}
