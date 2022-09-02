package com.example.swagger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.swagger.domain.Member;
import com.example.swagger.service.MemberService;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    private MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("")
    public ResponseEntity<List<Member>> getAllMembers() {
        List<Member> memberList = memberService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(memberList);
    }

    @GetMapping("/{memberId}")
    public ResponseEntity<Member> getMember(@PathVariable("memberId") String memberId) {
        Member member = memberService.findByMemberId(memberId).get();
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(member);
    }

    @PostMapping
    public ResponseEntity<Member> signUp(@RequestBody Member member) {
        Member signUpMember = memberService.save(member);
        return ResponseEntity.status(HttpStatus.CREATED).body(signUpMember);
    }

    @PutMapping("/{memberId}")
    public ResponseEntity<Member> update(@RequestBody Member member) {
        Member updateMember = memberService.update(member);
        return ResponseEntity.status(HttpStatus.OK).body(updateMember);
    }

    @DeleteMapping("/{memberId}")
    public ResponseEntity<Object> delete(@PathVariable("memberId") String memberId, Member member) {
        memberService.delete(memberId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(member);
    }

}