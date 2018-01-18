package com.example.demomedia.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mediaanalysis", schema = "infominer")
public class MediaAnalysis {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    @Column(name = "SUCCESS", nullable = false)
    private Boolean success;
    
    //@OneToOne
    // @JoinColumn(
    //         name = "MED_ID",
    //         nullable = false,
    //         foreignKey = @ForeignKey(name="MEA_MED_FK")
    // )
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "MED_ID")
    private Media media;
    
    @Column(name = "CONTENT", nullable = false)
    private String content;
    
    MediaAnalysis() { }
    
    public MediaAnalysis(Media media, Boolean success, String content) {
        this.media = media;
        this.success = success;
        this.content = content;
    }
    
    // getters
    
    public Media getMedia() {
        return media;
    }
    
    public String getContent() {
        return content;
    }
}
