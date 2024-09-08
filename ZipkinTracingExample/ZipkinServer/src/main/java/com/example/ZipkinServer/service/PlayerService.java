package com.example.ZipkinServer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ZipkinServer.entity.Player;
import com.example.ZipkinServer.repository.PlayerInterface;

@Service
public class PlayerService {

	
	@Autowired
	private PlayerInterface repo;
	
	
	public List<Player> getDbData() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}


	public Player getPlayerdata(int id) {
		// TODO Auto-generated method stub
		Optional<Player> opt = repo.findById(id);
		return opt.get();
	}

}

