package com.example.demomedia.repositories;

import com.example.demomedia.entities.Media;
import com.example.demomedia.entities.MediaAnalysis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AnalysisRepository extends JpaRepository<MediaAnalysis,Long> {
    
    @Query("SELECT a FROM MediaAnalysis a LEFT JOIN FETCH a.media WHERE a.media = ?1")
    Optional<MediaAnalysis> findByMedia(Media media);
}
