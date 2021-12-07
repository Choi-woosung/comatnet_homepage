package com.comatnet.restController;

import javax.servlet.http.HttpServletRequest;

import com.comatnet.repo.MemberRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MemberController
 */
@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    HttpServletRequest req;

    @PostMapping("/login")
    public String loginProc() {
        String id = req.getParameter("id");
        String pw = req.getParameter("pw");
        
        int foundMemberCount = memberRepository.countByMemIdAndMemPw(id, pw);

        if(foundMemberCount == 1) return "success";
        else return "fail";
    }

}