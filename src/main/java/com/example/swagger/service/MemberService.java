package com.example.swagger.service;

import com.example.swagger.domain.Member;
import com.example.swagger.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public List<Member> findAll() {
        return memberRepository.findAll();
    }

    public Member save(Member member) {
        return memberRepository.save(member);
    }

    public Optional<Member> findByMemberId(String memberId) {
        return memberRepository.findByMemberId(memberId);
    }

    public Member update(Member member) {

        Member updateMember = memberRepository.findByMemberId(member.getMemberId()).get();
        updateMember.setMemberId(member.getMemberId());
        updateMember.setPassword(member.getPassword());
        updateMember.setName(member.getName());
        updateMember.setAddress(member.getAddress());
        updateMember.setBirth(member.getBirth());
        updateMember.setPhone(member.getPhone());

        return memberRepository.save(updateMember);
    }

    public void delete (String memberId) {
        memberRepository.deleteByMemberId(memberId);
    }
}
