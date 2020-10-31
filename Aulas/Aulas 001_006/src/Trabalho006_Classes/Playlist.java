package Trabalho006_Classes;

public class Playlist {
    // Attributes
    private Music[] list;

    // Constructors
    public Playlist() {
        this.list = new Music[0];
    }

    public Playlist(Music[] list) {
        this.list = list;
    }

    // Methods

    public void showPlaylist() {
        System.out.println("Duration | Title");
        for (Music x : this.list) {
            System.out.println(x.getDuration() + "\t\t | " + x.getTitle());
        }
    }

    public void addMusic(Music music) {
        // check if it exist already
        if (this.isMusicinPlaylist(music)) {
            System.out.println("This music is already in the playlist");
        } else {
            Music[] list = new Music[this.list.length + 1];

            for (int i = 0; i < this.list.length; i++) {
                list[i] = this.list[i];
            }

            list[this.list.length] = music;
            this.list = list;
        }
    }

    public void removeMusic(Music music) {
        if (this.isMusicinPlaylist(music)) {
            Music[] list = new Music[this.list.length - 1];
            int i; // iterates old list (array)
            int j = 0; // iterates new list (array)
            for (i = 0;  i < this.list.length ; i++) {
                if (this.list[i] != music) {

                    list[j] = this.list[i];
                    j++;
                }
            }
            this.list = list;
        }
    }

    public int totalDuration() {
        int total = 0;
        for (Music x : this.list) {
            total += x.getDuration();
        }
        return total;
    }

    public boolean isMusicinPlaylist(Music music) {
        for (Music x : this.list) {
            if (music == x) {
                return true;
            }
        }
        return false;
    }
}