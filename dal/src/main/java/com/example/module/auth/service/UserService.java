package com.example.module.auth.service;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.module.auth.dao.UserDao;
import com.example.module.auth.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2017-08-07
 */
@Slf4j
@SofaService
public class UserService extends ServiceImpl<UserDao, User> implements IUserService {
	@Override
	public String getById(Long id) {
		User user = selectById(id);
		return user.toString();
	}
}

