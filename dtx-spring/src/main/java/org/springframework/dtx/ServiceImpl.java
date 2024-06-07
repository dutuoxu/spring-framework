package org.springframework.dtx;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements InitializingBean {

	public ServiceImpl() {

		System.out.println("=================================");
	}

	public void query(){
		System.out.println("querying");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(this.getClass().getName());
	}
}
