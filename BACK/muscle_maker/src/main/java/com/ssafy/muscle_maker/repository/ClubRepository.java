package com.ssafy.muscle_maker.repository;

import com.ssafy.muscle_maker.entity.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClubRepository extends JpaRepository<Club, Long> {
    //club 기본 정보 조회
    Optional<Club> findClubByClubIdAndFlagFalse(Long club_id);

    List<Club> findAll();
}
