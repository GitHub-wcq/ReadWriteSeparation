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

}
