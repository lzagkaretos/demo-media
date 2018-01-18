package com.example.demomedia.repositories;

import com.example.demomedia.entities.MediaAnalysis;
import com.example.demomedia.entities.NewsReport;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnalysisRepositoryTest {
    
    @Autowired
    private AnalysisRepository analysisRepository;
    
    @Test
    public void findByMedia() throws Exception {
        Optional<MediaAnalysis> byMedia = analysisRepository.findByMedia(new NewsReport(1L));
    }
    
}