package com.example.springaisample;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class SpringAiSample02Service implements SpringAiService{

	private final ChatClient chatClient;

	public SpringAiSample02Service(ChatClient.Builder chatClientBuilder) {
	    this.chatClient = chatClientBuilder.build();
	}

	  @Override
	  public Answer askQuestion(Question question) {
	    var answerText = chatClient.prompt()
	        .user(question.question())
	        .call()
	        .content();
	    return new Answer(answerText);
	  }
}
