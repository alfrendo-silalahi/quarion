package dev.alfrendosilalahi.quarion.service.controller;

import dev.alfrendosilalahi.quarion.service.service.BotService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/bot")
@RequiredArgsConstructor
public class BotController {

    private final BotService botService;

    @PostMapping("/chat")
    public String chat() {
        return "Hello world!";
    }

}
