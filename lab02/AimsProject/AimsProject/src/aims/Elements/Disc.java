package src.aims;
package Aims.media;
public class Disc extends Media {
    private int length;
    private String director;

    public Disc(String title) {
        super(title);
    }

    public Disc(String title, String category, float cost, int length, String director) {
        super(title, category, cost);
        this.length = length;
        this.director = director;
    }

    public Disc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

}
