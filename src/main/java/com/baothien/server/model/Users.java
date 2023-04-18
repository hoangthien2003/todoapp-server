package com.baothien.server.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Users {
	@Id
	@SequenceGenerator(name = "user_sequence", sequenceName = "user_sequence", allocationSize = 1)
	@GeneratedValue(generator = "user_sequence", strategy = GenerationType.SEQUENCE)
	private Long ID;
	private String email;
	private String fullName;
	private int roleNum;
	private String password;
}
