package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Student;
import com.briup.app02.dao.StudentMapper;
import com.briup.app02.service.IStudentService;
//记住下面的报错
@Service
public class StudentServiceImpl implements IStudentService{
//	@Autowired注入
	@Autowired
	private StudentMapper studentMapper;
	@Override
	public List<Student> getAll() throws Exception {
		List<Student> list = studentMapper.findAll();
		return list;
	}
	@Override
	public Student findById(long id) throws Exception {
		Student stu = studentMapper.findById(id);
		return stu;
	}
	@Override
	public void save(Student student) throws Exception {
		studentMapper.saveStudent(student);
	}
	@Override
	public void update(Student student) throws Exception {
		studentMapper.updateStudent(student);
	}
	@Override
	public void delete(long id) throws Exception {
		if(findById(id)!=null)
		studentMapper.deleteStudent(id);
		else throw new Exception("删除失败");
	}

}
