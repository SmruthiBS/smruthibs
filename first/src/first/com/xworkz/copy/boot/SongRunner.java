package first.com.xworkz.copy.boot;

import first.com.xworkz.copy.things.Song;

public class SongRunner {
	public static void main(String[] args) {
		Song song=new Song();
		song.name="kavithe";
		song.lang="kannada";
		song.lyricst=" V. Harikrishna";
		song.singer="vijay prakash";
		song.type="melody";
		System.out.println("name: "+song.name);
		System.out.println("language: "+song.lang);
		System.out.println( "lyricst: "+song.lyricst);
		System.out.println( "singer: "+song.singer);
		System.out.println("type: "+song.type);
		
	}
}

