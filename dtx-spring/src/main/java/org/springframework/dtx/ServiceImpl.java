package org.springframework.dtx;


import org.springframework.stereotype.Service;

@Service
public class ServiceImpl {

	public ServiceImpl() {

		System.out.println("=================================");
	}

	public void query(){
		System.out.println("querying");
	}
}
