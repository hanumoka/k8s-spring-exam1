package com.example.k8sspringexam1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class ApiController {

    @GetMapping("/")
    public String hello(HttpServletRequest request) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        long pid = ProcessHandle.current().pid();
        // reqeust에서 요청자 ip 추출
        System.out.println("remoteAddr:" + request.getRemoteAddr());
        System.out.println("pid:" + pid + " IP:" + inetAddress.getHostAddress());
        return "Hello World! G This is a k8s spring boot exam1 IP:" + inetAddress.getHostAddress() + "pid:" + pid;
    }
}
