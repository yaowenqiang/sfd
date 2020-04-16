package com.ywq.repository;
import com.ywq.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    public List<Speaker> findAll()
    {
        List<Speaker> speakers = new ArrayList<Speaker>();
        Speaker speaker = new Speaker();
        speaker.setFirstName("jacky");
        speaker.setLastName("yao");
        speakers.add(speaker);
        return speakers;

    }

}
