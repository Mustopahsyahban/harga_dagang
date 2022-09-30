package com.hackerrank.weather.repository;

import com.hackerrank.weather.dto.UserContactDTO;
import com.hackerrank.weather.entity.UserContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserContactRepository extends JpaRepository<UserContactEntity, String> {

    @Query("""
			SELECT new com.hackerrank.weather.dto.UserContactDTO(usCon.id,suEn.id,usCon.address)
			FROM UserContactEntity AS usCon
				LEFT JOIN usCon.userEntity AS suEn
			""")
    List<UserContactDTO> findAllData();
}
