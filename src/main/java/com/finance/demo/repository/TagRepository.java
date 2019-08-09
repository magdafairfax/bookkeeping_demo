package com.finance.demo.repository;

import com.finance.demo.model.Tags;
import com.finance.demo.model.Transactions;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends JpaRepository<Tags, Long> {
    Page<Tags> findByTransactionId(String id, Pageable pageable);

}
