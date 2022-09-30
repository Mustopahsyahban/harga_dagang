package com.hackerrank.weather.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name ="USER_CONTACT")
public class UserContactEntity {

    @Id
    @Column(name = "id")
   @Getter @Setter private String id;

//    @Column(name = "user_code")
//    @Getter @Setter private String userCode;

    @OneToOne
    @JoinColumn(name = "user_code", insertable = false,updatable = false)
    @Getter @Setter private UserEntity user;

    @Column(name = "address")
    @Getter @Setter private String address;



}
