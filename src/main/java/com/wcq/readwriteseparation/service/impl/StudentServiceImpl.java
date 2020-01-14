package com.wcq.readwriteseparation.service.impl;

import com.wcq.readwriteseparation.aspect.DS;
import com.wcq.readwriteseparation.entity.Student;
import com.wcq.readwriteseparation.mapper.StudentMapper;
import com.wcq.readwriteseparation.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangchaoqun
 * @since 2020-01-14
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

	@DS
	@Override
	public Student getById(int id) {
		return this.baseMapper.selectById(id);
	}

}
