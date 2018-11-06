package com.example;

import com.alipay.sofa.runtime.api.client.ClientFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author luxp
 * @date 2018/11/6
 */
public class JvmServiceConsumer {
	private ClientFactory clientFactory;

	@Autowired
	private SampleJvmService sampleJvmService;

	public void init() {
		sampleJvmService.message();
	}
}
