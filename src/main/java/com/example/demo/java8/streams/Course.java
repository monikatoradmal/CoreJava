package com.example.demo.java8.streams;

public class Course implements Comparable{

    private String course;
    private int reviewScore,students;

    public Course(String course,int reviewScore,int students){
        this.course = course;
        this.reviewScore = reviewScore;
        this.students=students;
    }
    
    @Override
    public String toString() {
        return course + ":" +reviewScore+":" + students;
    }

    public String getCourse() {
        return course;
    }
    public int getReviewScore() {
        return reviewScore;
    }
    public int getStudents() {
        return students;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }
    public void setStudents(int students) {
        this.students = students;
    }

    @Override
    public int compareTo(Object o) {
        Course c = (Course)o;

        return this.getReviewScore() > c.getReviewScore() ? -1 :1;
    }
    
    
}
