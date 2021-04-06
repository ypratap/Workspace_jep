package com.shiprock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shiprock.Entity.CvsStore;

@Repository
public interface CvsRepository extends JpaRepository<CvsStore, Integer> {

}
