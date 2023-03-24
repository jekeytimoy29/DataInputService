package com.swa.DataInputService.controller;

import com.swa.DataInputService.service.DataInputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("/datainput/messages")
public class DataInputController {
    @Autowired
    DataInputService service;

    @GetMapping
    public ResponseEntity<?> getMessages(){
        return new ResponseEntity<List<String>>(service.getMessages(), HttpStatus.OK);
    }

    @PostMapping("/stop")
    public ResponseEntity<?> setScheduledTasksFalse(){
        service.setScheduledTasks(false);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    @PostMapping("/start")
    public ResponseEntity<?> setScheduledTasksTrue(){
        service.setScheduledTasks(true);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/clear")
    public ResponseEntity<?> clearAllMessages(){
        service.clearAllMessages();
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
