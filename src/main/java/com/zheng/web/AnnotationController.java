package com.zheng.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zheng.service.AnnotationService;

@Controller
@RequestMapping("/annotation")
public class AnnotationController {
	
	@Reference(version="0.0.1")
	private AnnotationService annotationService;
	
	@RequestMapping("/")
	public void test() {
		String result = annotationService.say("dubbo");
		System.out.println(result);
	}
	
}
