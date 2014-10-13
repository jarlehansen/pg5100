package no.nith.pg5100.entity;

public class Nasjonaldyr {
    private String art;
    private int stemmer;

    public Nasjonaldyr() {
    }

    public Nasjonaldyr(String art, int stemmer) {
        this.art = art;
        this.stemmer = stemmer;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public int getStemmer() {
        return stemmer;
    }

    public void setStemmer(int stemmer) {
        this.stemmer = stemmer;
    }
}
