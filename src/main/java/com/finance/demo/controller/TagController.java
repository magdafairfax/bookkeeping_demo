package com.finance.demo.controller;

import com.finance.demo.model.Tags;
import com.finance.demo.model.Transactions;
import com.finance.demo.repository.TagRepository;
import com.finance.demo.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class TagController {

    @Autowired
    private TransactionRepository transRepository;

    @Autowired
    private TagRepository tagsRepository;


    @GetMapping("/trans/{transactionId}/tags")
    public Page<Tags> getAllCommentsByPostId(@PathVariable(value = "transactionId") String transactionId,
                                             Pageable pageable) {
        return tagsRepository.findByTransactionId(transactionId, pageable);
    }
}
