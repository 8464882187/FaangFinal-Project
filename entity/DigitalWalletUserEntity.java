package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
public class DigitalWalletUserEntity {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	Long id;
	
	String name;
	
	String emailId;
	
	public DigitalWalletUserEntity(Long id,String name,String emailId) {
		this.id=id;
		this.name=name;
		this.emailId=emailId;
	}

}
