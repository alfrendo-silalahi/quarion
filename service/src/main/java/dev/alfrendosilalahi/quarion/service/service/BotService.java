package dev.alfrendosilalahi.quarion.service.service;

import dev.alfrendosilalahi.quarion.service.assistant.OpenAiAssistant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BotService {

    // private final ChatLanguageModel chatLanguageModel;

    private final OpenAiAssistant openAiAssistant;

    public String chat(String message) {
        return openAiAssistant.chat(message);
    }

}
