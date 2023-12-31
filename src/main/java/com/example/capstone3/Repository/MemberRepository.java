package com.example.capstone3.Repository;

import com.example.capstone3.Model.Hackathon;
import com.example.capstone3.Model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member,Integer> {
    Member findMemberById(Integer id);

    Member findMemberByEmail(String email);

    @Query("select s from Member s where s.role='Leader'")
    List<Member> findLeaders();
}
