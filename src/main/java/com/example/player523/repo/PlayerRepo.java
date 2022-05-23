package com.example.player523.repo;

import com.example.player523.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface PlayerRepo extends JpaRepository<Player, Integer> {
}
