package com.hackerrank.weather.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="USER_MASTER")
public class UserEntity {

    @Id
    @Column(name = "id")
   @Getter @Setter private String id;

    @Column(name = "name")
    @Getter @Setter private String name;

    @Column(name = "age")
    @Getter @Setter private String age;





}
