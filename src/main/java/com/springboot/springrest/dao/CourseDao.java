package com.springboot.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.springrest.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

}
