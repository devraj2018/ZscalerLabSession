package com.zscalerlabsession.zscalerlabsession.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.zscalerlabsession.zscalerlabsession.Model.Customers;

@Repository
public interface CustomerRepository extends JpaRepository<Customers, Long> {

    @Query("SELECT a FROM Customers a WHERE a.emailId=?1")
    Customers fetchCustomerByEmail(String emailId);

}
