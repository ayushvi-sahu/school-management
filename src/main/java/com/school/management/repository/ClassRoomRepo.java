package com.school.management.repository;

import com.school.management.entity.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRoomRepo extends JpaRepository<ClassRoom, Integer> {
}