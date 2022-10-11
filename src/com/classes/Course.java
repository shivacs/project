package com.classes;

public class Course {

    private String courseId;
    private String courseName;

    private String professor;

    private double maximumMarks;

    private double passMarks;

    public boolean passStatus(double marks){
        if(passMarks <= marks){
            return true;
        }
        return false;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public double getMaximumMarks() {
        return maximumMarks;
    }

    public void setMaximumMarks(double maximumMarks) {
        this.maximumMarks = maximumMarks;
    }

    public double getPassMarks() {
        return passMarks;
    }

    public void setPassMarks(double passMarks) {
        this.passMarks = passMarks;
    }

    public Course(String courseId, String courseName, String professor, double maximumMarks, double passMarks) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.professor = professor;
        this.maximumMarks = maximumMarks;
        this.passMarks = passMarks;
    }

    public double calculatePercentage(double marks){
        double percentage = (marks / maximumMarks) * 100;
        return percentage;
    }

    public boolean checkProfessorIsAssigned(){
        if(this.professor == null){
            return false;
        }
        return true;
    }


    public Course() {
    }



}
