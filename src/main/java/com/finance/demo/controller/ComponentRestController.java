package com.finance.demo.controller;

import com.finance.demo.model.Component;
import com.finance.demo.service.ComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ComponentRestController {
    @Autowired
    private ComponentService compService;
    @PostMapping("/components/save")
    public ResponseEntity<Void> saveComponent(@RequestBody List<Component> components) {
        compService.saveComponents(components);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}

