package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	//스프링이 com.cos.blog패키지 이하를 다 스캔하는게 아니라
					//특정 어노테이션이 붙어있는 파일들을 new 해서 스프링 컨테이너에서 관리함.
public class BlogControllerTest {
@GetMapping("/test/hello")
public String hello() {
	return "<h1>hello SpringBoot</h1>";
}

}
