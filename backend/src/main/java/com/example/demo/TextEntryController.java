package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class TextEntryController {
    private final TextEntryService textEntryService;

    @Autowired
    public TextEntryController(TextEntryService textEntryService) {
        this.textEntryService = textEntryService;
    }

    @PostMapping("/saveText")
    public ResponseEntity<String> saveText(@RequestBody TextEntry textEntry) {
        TextEntry savedEntry = textEntryService.saveTextEntry(textEntry);
        return ResponseEntity.ok("saved" + savedEntry.getId());
    }
}
