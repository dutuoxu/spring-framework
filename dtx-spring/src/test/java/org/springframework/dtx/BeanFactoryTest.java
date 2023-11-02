package org.springframework.dtx;

import org.springframework.beans.factory.BeanFactoryUtils;

public class BeanFactoryTest {

	public static void main(String[] args) {
		String beanFactoryTest = BeanFactoryUtils.transformedBeanName("BeanFactoryTest");
		System.out.println(beanFactoryTest);
	}
}
