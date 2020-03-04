package com.jaehong.stringbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new  ArrayList<>(Arrays.asList(
            new Topic("java", "Spring", "Spring fun"),
            new Topic("python", "Django", "Django fun"),
            new Topic("node", "Express", "Node fun")
    ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public boolean addTopic(Topic topic) {
        if (topic == null) {
            return false;
        }
        topics.add(topic);
        return true;
    }
}
