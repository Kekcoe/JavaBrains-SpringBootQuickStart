package io.javabrains.springbootstater.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List <Topic> getAllTopics() {
		return Arrays.asList(				
				new Topic("spring", "Spring framework", "Spring description"),
				new Topic("java", "Java Core", "Java Core description"),
				new Topic("javascript", "Javascript", "Javascript description")
				
				);
	}

}
