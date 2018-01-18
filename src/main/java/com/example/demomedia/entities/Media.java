package com.example.demomedia.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "media", schema = "infominer")
@Inheritance(
        strategy = InheritanceType.SINGLE_TABLE
)
@DiscriminatorColumn(name = "TYPE", length = 1, discriminatorType = DiscriminatorType.STRING)
public abstract class Media {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    @Column(name = "TITLE", nullable = false)
    private String title;
    
    @Column(name = "LINK", length = 500, nullable = false)
    private String link;
    
    @Column(name = "AUTHOR", length = 45, nullable = false)
    private String author;
    
    // @OneToOne(mappedBy = "media", optional = false)
    // private MediaAnalysis analysis;
    
    Media(){}
    
    public Media(Long id) {
        this.id = id;
    }
    
    public Media(String title, String link, String author) {
        this.title = title;
        this.link = link;
        this.author = author;
    }
    
    // getters
    
    // public Optional<MediaAnalysis> getAnalysis() {
    //     return Optional.ofNullable(analysis);
    // }
}
