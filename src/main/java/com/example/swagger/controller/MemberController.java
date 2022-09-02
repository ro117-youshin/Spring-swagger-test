package com.example.swagger.controller;

import com.example.swagger.domain.Member;
import com.example.swagger.repository.MemberRepository;
import com.example.swagger.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;
    public MemberController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }



    /*@Autowired
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

//    @PostMapping
//    public ResponseEntity<Member> signUp(@RequestBody Member member) {
//        Member signUpMember = memberService.save(member);
//        return ResponseEntity.status(HttpStatus.CREATED).body(signUpMember);
//    }

    @PostMapping
    public ResponseEntity<Member> signUp(@RequestBody Member member) {
        Member signUpMember = .save(member);
        return ResponseEntity.status(HttpStatus.CREATED).body(signUpMember);
    }

    @PutMapping("/{memberId")
    public ResponseEntity<Member> update(@PathVariable("memberId") String memberId, @RequestBody Member member) {
        Member updateMember = memberService.update(member);
        return ResponseEntity.status(HttpStatus.OK).body(updateMember);
    }

    @DeleteMapping("/{memberId}")
    public ResponseEntity<Object> delete(@PathVariable("memberId") String memberId) {
        memberService.delete(memberId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }*/

}
