package com.finance.demo.controller;

import com.finance.demo.model.Transactions;
import com.finance.demo.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class TransactionController {
    @Autowired
    private TransactionRepository transRepository;

    @GetMapping("/trans")
    public Page<Transactions> getAllPosts(Pageable pageable) {
        return transRepository.findAll(pageable);
    }

    @GetMapping("/trans/{transactionId}")
    public Optional<Transactions> getTransactionByid(@PathVariable(value = "transactionId") String transactionId,
                                                     Pageable pagable) {
        Optional<Transactions> trans = transRepository.findById(transactionId);
        return trans;
    }

    @PostMapping("/trans/{transactionId}")
    public Transactions createTrans(@Valid @RequestBody Transactions trans) {
        return transRepository.save(trans);
    }
}
