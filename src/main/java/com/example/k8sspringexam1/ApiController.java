package com.example.k8sspringexam1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class ApiController {

    @GetMapping("/")
    public String hello() throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        long pid = ProcessHandle.current().pid();
        return "Hello World! G This is a k8s spring boot exam1 IP:" + inetAddress.getHostAddress() +"pid:"+ pid;
    }
}
