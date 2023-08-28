package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository; 

public interface TextEntryRepository extends JpaRepository<TextEntry, Long> {

    // Use a query method with parameterized input
    TextEntry findByText(String text);
}