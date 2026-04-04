package com.school.management.controller;

import com.school.management.entity.ClassRoom;
import com.school.management.service.ClassRoomService;
import com.school.management.service.ClassRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classroom")
public class ClassRoomController {

    @Autowired
    private ClassRoomService classRoomService;

    @PostMapping("/add")
    public ClassRoom addClassRoom(@RequestBody ClassRoom classRoom) {
        return classRoomService.saveClassRoom(classRoom);
    }

    @GetMapping("/all")
    public List<ClassRoom> getAllClassRooms() {
        return classRoomService.getAllClassRooms();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteClassRoom(@PathVariable int id) {
        classRoomService.deleteClassRoom(id);
        return "ClassRoom deleted successfully";
    }
}