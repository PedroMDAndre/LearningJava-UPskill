package Trabalho006_Classes;

public class Music {
    // Attributes
    String title;
    int duration;

    // Constructors
    public Music(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    // Methods
    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public String toString(){
        String texto = "Name: " + this.title + " Duration: " + this.duration;
        return texto;
    }
}
