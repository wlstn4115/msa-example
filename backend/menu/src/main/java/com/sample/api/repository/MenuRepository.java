package com.sample.api.repository;

import com.sample.api.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MenuRepository extends JpaRepository<Menu, Integer> {
    List<Menu> findAllByOrderByPositionAsc();
//    Optional<List<Menu>> findAll(Menu menu);
}