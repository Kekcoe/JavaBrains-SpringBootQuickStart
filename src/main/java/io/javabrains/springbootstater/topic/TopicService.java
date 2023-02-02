package io.javabrains.springbootstater.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics  = Arrays.asList(				
			new Topic("spring", "Spring framework", "Spring description"),
			new Topic("java", "Java Core", "Java Core description"),
			new Topic("javascript", "Javascript", "Javascript description")			
			);

	public List<Topic>getAllTopics(){
		return topics;
	}
	
}
