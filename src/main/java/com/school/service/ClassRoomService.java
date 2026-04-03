package com.school.service;

import com.school.entity.ClassRoom;
import com.school.repository.ClassRoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClassRoomService {

    @Autowired
    private ClassRoomRepo classRoomRepo;

    public ClassRoom saveClassRoom(ClassRoom classRoom) {
        return classRoomRepo.save(classRoom);
    }

    public List<ClassRoom> getAllClassRooms() {
        return classRoomRepo.findAll();
    }

    public void deleteClassRoom(int id) {
        classRoomRepo.deleteById(id);
    }
}