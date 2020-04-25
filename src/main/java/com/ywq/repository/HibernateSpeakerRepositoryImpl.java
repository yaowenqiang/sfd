package com.ywq.repository;
import com.ywq.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository("speakerRepository")
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
