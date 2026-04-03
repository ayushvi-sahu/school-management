package com.school.management.service.impl;

import com.school.management.entity.ClassRoom;

import java.util.List;

public interface ClassRoomDetailsService {
    ClassRoom saveClassRoom(ClassRoom classRoom);
    List<ClassRoom> getAllClassRooms();
    void deleteClassRoom(int id);
}
