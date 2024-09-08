package com.example.ZipkinServer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.ZipkinServer.entity.Player;
import com.example.ZipkinServer.service.PlayerService;


@RestController
public class PlayerController {

	
	@Autowired
	private PlayerService service;
	
	
	
	@GetMapping("/getData")
	public List<Player> getdata()
	{
		return service.getDbData();
	}
	
	
	@GetMapping("/getData/{id}")
	public Player getPlayerdata(@PathVariable int id)
	{
		return service.getPlayerdata(id);
	}
}
