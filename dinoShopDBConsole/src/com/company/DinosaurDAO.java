package com.company;

import java.util.List;

public interface DinosaurDAO {
    public List<Dinosaur> getAllStudents();
    public Dinosaur getStudent
            (
                int rollNo
            );
    public void updateStudent(Dinosaur student);
    public void deleteStudent(Dinosaur student);
}
