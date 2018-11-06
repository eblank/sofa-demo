package com.example;

/**
 * @author luxp
 * @date 2018/11/6
 */
public class SampleJvmServiceImpl implements SampleJvmService {
	private String message;

	public SampleJvmServiceImpl(String message) {
		this.message = message;
	}

	public SampleJvmServiceImpl() {
	}

	@Override
	public String message() {
		System.out.println(message);
		return message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
