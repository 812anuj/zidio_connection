package com.zidio.DTO;

import com.zidio.Enum.Role;

//@Data
//@noArgsConstructor
//@AllArgsConstructor

public class RegisterRequest {
	public String name;
	public String email;
	public String password;
	public Role role;
}
