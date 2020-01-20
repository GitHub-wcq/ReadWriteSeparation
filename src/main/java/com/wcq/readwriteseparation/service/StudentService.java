package com.wcq.readwriteseparation.service;

import com.wcq.readwriteseparation.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangchaoqun
 * @since 2020-01-14
 */
public interface StudentService extends IService<Student> {
	
	Student getById(int id);

	int saveToDB1(Student entity);
	
	int saveToDB2(Student entity);

	Student getInfoFromDB1(int id);

	Student getInfoFromDB2(int id);

}
