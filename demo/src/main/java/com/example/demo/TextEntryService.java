package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TextEntryService {
    private final TextEntryRepository textEntryRepository;

    @Autowired
    public TextEntryService(TextEntryRepository textEntryRepository) {
        this.textEntryRepository = textEntryRepository;
    }

    public TextEntry saveTextEntry(TextEntry textEntry) {
        return textEntryRepository.save(textEntry);
    }
}



