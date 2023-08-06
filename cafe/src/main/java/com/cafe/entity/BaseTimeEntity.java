package com.cafe.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;

@Getter
@MappedSuperclass  // 하위 클래스에게 매핑 정보를 제공하기 위한 기본 클래스로 지정
@EntityListeners(AuditingEntityListener.class)  // 생성일자 및 수정일자 같은 감사(Audit) 정보를 자동으로 관리
public class BaseTimeEntity {

	@CreatedDate
	@Column(updatable = false)
	private LocalDateTime createDate;
	
	@LastModifiedDate
	private LocalDateTime createTime;
	
}
