package no.nith.pg5100.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
public class Book {
    @Id
    private int id;

    private String title;

    @ElementCollection
    @CollectionTable(name = "Tag")
    @Column(name = "tag_name")
    private List<String> tags;

    @ElementCollection
    @CollectionTable(name = "ExtraInfo")
    @MapKeyColumn(name = "key")
    @Column(name = "info")
    private Map<String, String> extraInfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Map<String, String> getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(Map<String, String> extraInfo) {
        this.extraInfo = extraInfo;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", tags=" + tags +
                ", extraInfo=" + extraInfo +
                '}';
    }
}
