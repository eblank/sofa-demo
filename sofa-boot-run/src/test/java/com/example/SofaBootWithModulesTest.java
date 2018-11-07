package com.example;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.example.module.auth.service.IUserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author luxp
 * @date 2018/11/6
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SofaBootWithModulesTest {
	@SofaReference
	private SampleJvmService sampleJvmService;
	@SofaReference
	private IUserService userService;

	@Test
	public void test() {
		Assert.assertEquals("Hello, jvm service xml implementation.", sampleJvmService.message());
	}

	@Test
	public void testMybatisConfig() {
		Assert.assertNotNull(userService);
		System.out.println(userService.getById(1L));
	}
}