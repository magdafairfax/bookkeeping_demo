package com.finance.demo.service;

import com.finance.demo.model.Component;
import com.finance.demo.repository.ComponentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ComponentService {
    @Resource
    private ComponentRepository compRepository;

    @Transactional // this annotaion is
    // important for transaction management in the database
    public void saveComponents(List<Component> components) {
        int size = components.size();
        int counter = 0;
        List<Component> temp = new ArrayList<>();
        for (Component emp : components) {
            temp.add(emp);
            if ((counter + 1) % 100 == 0
                    || (counter + 1) == size) {
                compRepository.saveAll(temp);
                temp.clear();
            }
            counter++;

        }
    }
}