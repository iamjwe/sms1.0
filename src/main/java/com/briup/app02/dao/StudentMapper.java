package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Student;

public interface StudentMapper {
//	接口内所有方法都是public abstract修饰
	public abstract List<Student> findAll();
	Student findById(long id);
	void saveStudent(Student student);
	void updateStudent(Student student);
	void deleteStudent(long id);
}
