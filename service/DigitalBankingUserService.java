package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.DigitalWalletUserEntity;
import com.example.demo.repo.DigitalWalletUserRepo;



@Service
public class DigitalBankingUserService {

	@Autowired
    private DigitalWalletUserRepo userRepository;

    public DigitalWalletUserEntity addUser(DigitalWalletUserEntity user) {
        return userRepository.save(user);
    }

   
    public List<DigitalWalletUserEntity> getAllUsers() {
        return userRepository.findAll();
    }
    
    public Optional<DigitalWalletUserEntity> getUserById(Long id) {
        return userRepository.findById(id);
    }
}		

