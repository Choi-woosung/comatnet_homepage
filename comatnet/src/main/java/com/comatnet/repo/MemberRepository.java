package com.comatnet.repo;

import com.comatnet.model.Member;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    
    @Select("select count(*) from member where mem_id = #{paramId} and mem_pw = #{paramPw}")
    public int countByMemIdAndMemPw(@Param("paramId") String id, @Param("paramPw") String pw);
    
}
