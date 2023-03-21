package com.swa.DataInputService.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DataInputRepository {
    private List<String> messages;

    public DataInputRepository() {
        this.messages = new ArrayList<>();
    }

    public List<String> getMessages() {
        return messages;
    }

    public void save(String message) {
        this.messages.add(message);
    }

    public void clear(){
        this.messages.clear();
    }

    public List<String> findAll() {
        return this.messages;
    }
}
