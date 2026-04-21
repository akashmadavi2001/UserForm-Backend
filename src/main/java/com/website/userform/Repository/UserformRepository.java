package com.website.userform.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.website.userform.Entity.Userform;

@Repository
public interface UserformRepository extends JpaRepository<Userform,Long>{
    
}
