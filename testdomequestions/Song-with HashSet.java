import java.util.HashSet;


public class Song {
    private String name;
    private Song nextSong;

    public Song(String name) {
        this.name = name;
    }

    public void setNextSong(Song nextSong) {
        this.nextSong = nextSong;
    }

    public boolean isRepeatingPlaylist() {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
    	
    	Song mainSong = this;
    	HashSet<Song> songs = new HashSet<Song>();
    	
    	int myCount = 1;
    	boolean ok = true;
    	songs.add(mainSong);
    	while(ok) {
    		
    		if (mainSong.nextSong != null) {
    			mainSong = mainSong.nextSong;
    		} else {
    			return false;
    		}
    		
    		songs.add(mainSong);
    		myCount++;
    		
    		if (myCount != songs.size()) {
    			return true;
    		}
    	}
    	
    	return false;
    	
    }

    public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");
        
        Song third = new Song("third");
        Song fourth = new Song("fourth");
        Song fifth = new Song("fifth");
        


        first.setNextSong(second);
        second.setNextSong(third);
        
        third.setNextSong(fourth);
        fourth.setNextSong(fifth);
        fifth.setNextSong(first);

        System.out.println(first.isRepeatingPlaylist());
    }
}