package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Student;
import com.briup.app02.service.IStudentService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/test")
public class StudentController {
	// 注入studentService的实例
	@Autowired
	private IStudentService studentService;

	// http://127.0.0.1:8080/student/findAllStudnt即可访问
	@GetMapping("findAllStudent")
	public MsgResponse findAllStudet() {
		List<Student> list = null;
		try {
			list = studentService.getAll();
			return MsgResponse.success("查找成功", list);
		} catch (Exception e) {
			e.printStackTrace();//告诉后台
			return MsgResponse.error(e.getMessage());//告诉前台
		}
	}

	@GetMapping("findById")
	public MsgResponse findById(long id) {
		Student stu = null;
		try {
			stu = studentService.findById(id);
			return MsgResponse.success("查找成功", stu);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());//告诉前台
		}
	}

	@PostMapping("save")
	public MsgResponse save(Student student) {
		try {
			studentService.save(student);
			return MsgResponse.success("保存成功",null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@PostMapping("update")
	public MsgResponse update(Student student) {
		try {
			studentService.update(student);
			return MsgResponse.success("更新成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@GetMapping("delete")
	public MsgResponse delete(long id) {
		try {
			studentService.delete(id);
			return MsgResponse.success("删除成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

}
