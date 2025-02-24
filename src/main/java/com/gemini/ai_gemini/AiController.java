package com.gemini.ai_gemini;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class AiController {

    private final AiService aiService;

    @PostMapping("/gemini")
    public ResponseEntity<String> sendQuestion(@RequestBody Map<String, String> payload) {

        String question = payload.get("question");
        String answer = aiService.getAnswer(question);
        return ResponseEntity.ok(answer);
    }

}
