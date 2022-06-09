package com.example.demo.Orphan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrphanRepo extends JpaRepository<Orphan,Integer> {

}
