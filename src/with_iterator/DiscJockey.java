package with_iterator;

import java.util.Iterator;

// class which gets all songs information by iterating over different collections received
public class DiscJockey {
	
	SongsOfThe70s songsOfThe70s;
	SongsOfThe80s songsOfThe80s;
	SongsOfThe90s songsOfThe90s;
	
	SongIterator iterSongsOfThe70s;
	SongIterator iterSongsOfThe80s;
	SongIterator iterSongsOfThe90s;
	
	public DiscJockey(SongIterator newSongsOfThe70s, SongIterator newSongsOfThe80s, SongIterator newSongsOfThe90s) {
		iterSongsOfThe70s = newSongsOfThe70s;
		iterSongsOfThe80s = newSongsOfThe80s;
		iterSongsOfThe90s = newSongsOfThe90s;
	}
	
	public void showTheSongs() {
		
		Iterator songs70s = iterSongsOfThe70s.createIterator(); // Notice that each class in their respective implementation of this method calling a .iterator which create a instance of it for each Collection type
		Iterator songs80s = iterSongsOfThe80s.createIterator();
		Iterator songs90s = iterSongsOfThe90s.createIterator();
			
		System.out.println("Songs of the 70s");
		printeSongs(songs70s);
		System.out.println("Songs of the 80s");
		printeSongs(songs80s);
		System.out.println("Songs of the 90s");
		printeSongs(songs90s);
	}

	public void printeSongs(Iterator iterator) {
		while(iterator.hasNext()) {
			SongInfo songInfo = (SongInfo) iterator.next();
			System.out.println(songInfo);
		}
	}
}
