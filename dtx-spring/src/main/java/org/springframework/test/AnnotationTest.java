package org.springframework.test;

import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.test.anno.AA;
import org.springframework.web.bind.annotation.RestController;


public class AnnotationTest {

	public static void main(String[] args) {
		boolean b = AnnotatedElementUtils.hasAnnotation(AA.class, Component.class);
		System.out.println(b);
	}
}
