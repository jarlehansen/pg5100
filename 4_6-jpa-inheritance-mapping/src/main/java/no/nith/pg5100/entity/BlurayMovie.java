package no.nith.pg5100.entity;

import javax.persistence.Entity;

@Entity
public class BlurayMovie extends Item {
    private String genre;
    private int duration;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "BlurayMovie{" +
                "genre='" + genre + '\'' +
                ", duration=" + duration +
                "} " + super.toString();
    }
}
