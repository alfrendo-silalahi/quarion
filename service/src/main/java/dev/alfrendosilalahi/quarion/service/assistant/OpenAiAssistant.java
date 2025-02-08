package dev.alfrendosilalahi.quarion.service.assistant;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface OpenAiAssistant {

    @SystemMessage("You are a polite assistant")
    String chat(String message);

}
