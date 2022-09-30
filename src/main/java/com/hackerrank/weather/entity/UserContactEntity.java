package com.hackerrank.weather.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="USER_CONTACT")
public class UserContactEntity {

    @Id
    @Column(name = "id")
   @Getter @Setter private String id;

    @Column(name = "user_code")
    @Getter @Setter private String userCode;

    @Column(name = "address")
    @Getter @Setter private String address;





}
