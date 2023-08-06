package com.cafe.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {

	private String id;
	private String username;
	private String password;
	private String name;
	private String phone;
	private String email;
	private String address;
}
