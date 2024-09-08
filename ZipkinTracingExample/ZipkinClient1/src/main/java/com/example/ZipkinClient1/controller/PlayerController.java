package com.example.ZipkinClient1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ZipkinClient1.DTO.Player;
import com.example.ZipkinClient1.fiegn.ServerFiegn;

@RestController
public class PlayerController {

	
	@Autowired
	private ServerFiegn fiegn;
	
	
	@GetMapping("/getdata")
	public String getdata()
	{
		return "Strign";
	}
	
	@GetMapping("/getDatafromService")
	public List<Player> getdataList()
	{
		return fiegn.getdata();
	}
}
