package com.zscalerlabsession.Repository;

import com.zscalerlabsession.Model.AccountDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<AccountDetail, Long> {
}
