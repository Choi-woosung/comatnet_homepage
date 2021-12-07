package com.comatnet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(builderMethodName = "memberBuilder")
@Entity
@Table(name = "member")
@ToString
public class Member {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long memSeq;

    @Column(nullable = false, unique = true, length = 45)
    private String memId;

    @Column(nullable = false, length = 45)
    private String memPw;

    @Column(nullable = false, length = 45)
    private String memName;

}
