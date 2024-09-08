package com.example.ZipkinClient1.fiegn;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.ZipkinClient1.DTO.Player;

@FeignClient(name="ZipkinServer",url="localhost:8085")
public interface ServerFiegn {

	
	@GetMapping("/getData")
	List<Player> getdata();
}
