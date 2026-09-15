package com.example.springaisample;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AskController {

  private final SpringAiService springAiService;

  public AskController(SpringAiService springAiService) {
    this.springAiService = springAiService;
  }

  @PostMapping(path="/ask", produces="application/json")
  public Answer ask(@RequestBody Question question) {
      return springAiService.askQuestion(question);
  }

}