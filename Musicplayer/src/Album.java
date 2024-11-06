import java.util.ArrayList;

public class Album {
    private String title;
    private double duration;
    private ArrayList<Song> songs;
    public Album(String title,double duration,ArrayList<Song> songs){
        this.title = title;
        this.duration = duration;
        this.songs = songs;

    }
    public Song findsong(String title){
        for (Song checkedSong:songs){
            if (checkedSong.getTitle().equals(title)) return checkedSong;

        }
        return null;
    }
    public boolean addsong(String title,double duration){
        if (findsong(title)==null){
            songs.add(new Song(title,duration));
            System.out.println(title+" the song is succesfully added in playlist");
            return true;
        }else {
            System.out.println(title+" the song is not added");

            return false;
        }

    }


}
