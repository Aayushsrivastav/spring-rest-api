package com.springboot.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.springrest.dao.CourseDao;
import com.springboot.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
//	List<Course> list;
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImpl() {
//		list = new ArrayList<Course>();
//		list.add(new Course(526, "java", "spring tutorial"));
//		list.add(new Course(488, "java spring", "spring boot tutorial"));
	}

	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
//		Course c = null;
//		for (Course course : list) {
//			if(course.getId() == courseId) {
//				c= course;
//				break;
//			}
//		}
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
//		list.forEach(e -> {
//			if(e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long courseId) {
//		list = this.list.stream().filter(e -> e.getId()!=courseId).collect(Collectors.toList());
		Course entity = courseDao.getOne(courseId);
		courseDao.delete(entity);
	}

}
