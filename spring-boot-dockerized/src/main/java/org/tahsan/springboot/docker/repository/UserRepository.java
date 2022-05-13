package org.tahsan.springboot.docker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tahsan.springboot.docker.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
