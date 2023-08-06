package com.cafe.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor  // 기본생성자
@AllArgsConstructor
@Entity(name = "user")
public class UserEntity extends BaseTimeEntity {

	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Id // 기본키(PrimaryKey)
	private String id;
	
	@Column(length = 30, nullable = false)
	private String username;
	
	@Column(length = 30, nullable = false)
	private String password;
	
	@Column(length = 30, nullable = false)
	private String name;
	
	@Column(length = 30, nullable = false)
	private String phone;
	
	@Column(length = 30, nullable = false)
	private String email;
	
	@Column(length = 30, nullable = false)
	private String address;
	
}
