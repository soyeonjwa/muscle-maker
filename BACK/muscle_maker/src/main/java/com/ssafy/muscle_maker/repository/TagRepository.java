package com.ssafy.muscle_maker.repository;

import com.ssafy.muscle_maker.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagRepository extends JpaRepository<Tag,Long> {
    List<Tag>  findByTag(String tag);
}
