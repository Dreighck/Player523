package com.example.player523.service;

import com.example.player523.model.Player;

import java.util.List;

public interface PlayerService {
    List<Player> getAllPlayers();
    Player getPlayerById(int id);
    Player addNewPlayer(Player player);
    void deletePlayer(int id);
    Player updatePlayer(Player player);
}
