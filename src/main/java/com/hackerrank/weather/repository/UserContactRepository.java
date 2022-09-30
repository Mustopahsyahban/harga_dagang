package com.hackerrank.weather.repository;

import com.hackerrank.weather.entity.UserContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserContactRepository extends JpaRepository<UserContactEntity, String> {
}
