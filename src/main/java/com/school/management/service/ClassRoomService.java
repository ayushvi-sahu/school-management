package com.school.management.service;

import com.school.management.entity.ClassRoom;
import com.school.management.repository.ClassRoomRepo;
import com.school.management.service.impl.ClassRoomDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClassRoomService implements ClassRoomDetailsService {

    private final ClassRoomRepo classRoomRepo;

    public ClassRoomService(ClassRoomRepo classRoomRepo) {
        this.classRoomRepo = classRoomRepo;
    }

    @Override
    public ClassRoom saveClassRoom(ClassRoom classRoom) {
        return classRoomRepo.save(classRoom);
    }

    @Override
    public List<ClassRoom> getAllClassRooms() {
        return classRoomRepo.findAll();
    }

    @Override
    public void deleteClassRoom(int id) {
        classRoomRepo.deleteById(id);
    }
}