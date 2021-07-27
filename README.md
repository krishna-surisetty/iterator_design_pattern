## Iterator Design Pattern

Iterator design pattern provides us with a uniform way to access different collections of objects

Lets say, we have an Array, ArrayList and Hashtable of objects. To iterate over each type we can pop out an iterator for each and treat them same which provides us uniform way to cycle through different collections

We can also write polymorphic code because we can refer to each collection of objects since they all implement same interface


## Example 

Consider a Radio station where there are 3 radio jockey's who provides songs of 70's, 80's and 90's with each song detail having song name, band name and the year it was released

The problem is each jockey is sending the songs information in different collection format. 70's info is released in ArrayList, Arrays and HashTable

Let's keep Song information class as SongInfo.java
The collection format in which each jockey is going to add songs corresponds to SongsOfThe70s, SongsOfThe80s and SongsOfThe90s

Each of these classes has a constructor which provides songs data and an addSong() method to add songs and a getSong() method to get songs

DiscJockey class is place where all different jockeys provided songs in different formats are retrieved by providing method to iterate over different collections

RadioStation is the main class which calls these classes for retrieving all the songs

# Without Iterator

As we can see from the package without_iterator, in DiscJockey class we need to provide different iteration mechanisms for different collections. Manually implementing them is quite error prone

# With Iterator

Based on the package with_iterator, we can see that a new interface SongIterator is created

	public interface SongIterator {
		public Iterator createIterator();
	}

Each class - SongsOfThe70s, SongsOfThe80s and SongsOfThe90s implements this interface which returns result of type Iterator (Each collection class (like ArrayList, HashTable - uses Enumeration and Iterator interfaces,...) has these iterator methods)

Now in the DisJockey class we can simply create an instance of Iterator by calling the interface method and iterate over each collection just by checking the presence of next element using the hasNext() method




