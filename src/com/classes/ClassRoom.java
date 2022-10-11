package com.classes;

import java.util.List;

public class ClassRoom implements Room {
    public ClassRoom(int classRoomNumber, int floor, int classRoomCapacity, List<Course> courses) {
        this.classRoomNumber = classRoomNumber;
        this.floor = floor;
        this.classRoomCapacity = classRoomCapacity;
        this.courses = courses;
    }

    private int classRoomNumber;
    private int floor;
    private int classRoomCapacity;
    private List<Course> courses;

    public void addCourse(Course course){
        courses.add(course);
    }
    public void removeCourse(Course course){
        courses.remove(course);
    }
    public int totalCourses(){
        return this.courses.size();
    }

    public int getClassRoomNumber() {
        return classRoomNumber;
    }

    public void setClassRoomNumber(int classRoomNumber) {
        this.classRoomNumber = classRoomNumber;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getClassRoomCapacity() {
        return classRoomCapacity;
    }

    public void setClassRoomCapacity(int classRoomCapacity) {
        this.classRoomCapacity = classRoomCapacity;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public boolean checkCourseIsInClass(Course course){
        for(int i = 0; i < courses.size(); i++){
            if(course.getCourseId() == course.getCourseId()){
                return true;
            }
        }
        return false;
    }


    public ClassRoom() {
    }


    @Override
    public String getRoomType() {
        return "ClassRoom";
    }

    @Override
    public int getRoomCapacity() {
        return this.classRoomCapacity;
    }

    @Override
    public int roomNo() {
        return this.classRoomNumber;
    }
}
