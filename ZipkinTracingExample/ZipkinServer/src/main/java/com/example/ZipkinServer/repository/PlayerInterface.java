package com.example.ZipkinServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ZipkinServer.entity.Player;

public interface PlayerInterface extends JpaRepository<Player, Integer>{

}
