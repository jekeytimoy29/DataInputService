package com.swa.DataInputService.service;

import com.swa.DataInputService.component.DataInputScheduledTasks;
import com.swa.DataInputService.repository.DataInputRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataInputService {
    @Autowired
    DataInputRepository repository;

    public boolean isEnabled() {
        return enabled;
    }

    private boolean enabled;

    public void addMessage(String message){
        repository.save(message);
    }

    public List<String> getMessages(){
        return repository.findAll();
    }

    public void clearAllMessages(){
        repository.clear();
    }

    public void setScheduledTasks(boolean enabled){
        this.enabled = enabled;
    }
}
