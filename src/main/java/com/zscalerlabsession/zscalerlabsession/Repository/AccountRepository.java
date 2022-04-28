package com.zscalerlabsession.zscalerlabsession.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.zscalerlabsession.zscalerlabsession.Model.Accounts;

@Repository
public interface AccountRepository extends JpaRepository<Accounts, Long> {

    @Query("select * from Accounts")
    long count();
}
