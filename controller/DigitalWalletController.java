package com.example.demo.controller;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.DigitalWalletUserEntity;
import com.example.demo.service.DigitalBankingUserService;

@RestController
public class DigitalWalletController {
	
	@Autowired
	DigitalBankingUserService dbus;
	
	@PostMapping("/insert")
	public String insertRecord(@RequestBody DigitalWalletUserEntity c) {
		dbus.addUser(c);
		return "Id Created::"+c.getId();
	}
	
	@PutMapping("/update")
	public String updateRecord(@RequestBody DigitalWalletUserEntity c) {
		return "record updated::"+c.getEmailId();
	}
	
	@GetMapping("/retriveSingleRecord/")
	public Optional<DigitalWalletUserEntity> retriveRecord(@RequestParam("Id") Long id){
		return dbus.getUserById(id);
		
	}
	
	@GetMapping("/retriveAllRecord")
	public Iterable<DigitalWalletUserEntity> retriveAllRecord(){
		return dbus.getAllUsers();
		
	}	
}
