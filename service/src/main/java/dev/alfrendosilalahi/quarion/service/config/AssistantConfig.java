package dev.alfrendosilalahi.quarion.service.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AssistantConfig {

    /*
    @Bean
    public ChatLanguageModel chatLanguageModel() {
        return OpenAiChatModel.builder()
                .apiKey(System.getenv("OPENAI_API_KEY"))
                .modelName(System.getenv("OPENAI_MODEL_NAME"))
                .build();
    }
     */

    /*
    @Bean
    public OpenAiAssistant openAiAssistant() {
        return AiServices.builder(OpenAiAssistant.class)
                .chatLanguageModel(chatLanguageModel())
                .chatMemory(MessageWindowChatMemory.withMaxMessages(10))
                .build();
    }
     */

}
