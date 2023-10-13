package com.hemanth.tutorialsexamplewithunittest.service;

import com.hemanth.tutorialsexamplewithunittest.entity.Tutorial;
import com.hemanth.tutorialsexamplewithunittest.repository.TutorialRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class TutorialService {

    private final TutorialRepository tutorialRepository;

    public TutorialService(TutorialRepository tutorialRepository) {
        this.tutorialRepository = tutorialRepository;
    }

    public Tutorial createTutorial(Tutorial tutorial) {
        try {
            Tutorial _tutorial = tutorialRepository.save(new Tutorial(tutorial.getTitle(), tutorial.getDescription(), false));
            return _tutorial;
        } catch (Exception e) {
            return null;
        }
    }
}
