package com.ywq.service;

import com.ywq.model.Speaker;
import com.ywq.repository.HibernateSpeakerRepositoryImpl;
import com.ywq.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();
    public List<Speaker> findAll()
    {
       return repository.findAll();
    }
}

