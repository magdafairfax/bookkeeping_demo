package com.finance.demo;

import com.finance.demo.model.Transactions;
import com.finance.demo.repository.TransactionRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private TransactionRepository transRepositry;

    @Test
    public void testNumberOfRecords() {
        List<Transactions> trans = transRepositry.findAll();

        Assert.assertEquals(trans.size(), 26);
    }

    @Test
    public void testAmount() {
        Optional<Transactions> trans = transRepositry.findById("rc1");

       // Assert.assertEquals(trans.get().getAmount(), 4000);
    }
}
