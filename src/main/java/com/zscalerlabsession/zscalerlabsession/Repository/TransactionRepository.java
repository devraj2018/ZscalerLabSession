package com.zscalerlabsession.zscalerlabsession.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zscalerlabsession.zscalerlabsession.Model.Transactions;

@Repository
public interface TransactionRepository extends JpaRepository<Transactions, Long> {
}

