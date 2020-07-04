

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
    	Song checkingSong = this.nextSong;
    	
    	
    	
    	boolean ok = true;
    	while(ok) {
    		if(mainSong.nextSong == null) {
        		return false;
        	}
    		
    		if ( checkingSong == null ) {
    			return false;
    		} else  {
    			 if (checkingSong.nextSong == null) {
    				 return false;
    			 }
    		}
        	
        	if (checkingSong.nextSong == mainSong) {
        		return true;
        	}
    		
    		mainSong = mainSong.nextSong;
    		checkingSong = checkingSong.nextSong.nextSong;
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