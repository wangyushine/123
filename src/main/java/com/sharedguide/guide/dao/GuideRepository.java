package com.sharedguide.guide.dao;

import com.sharedguide.guide.model.Guide;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GuideRepository extends JpaRepository<Guide, Integer> {

    @Query(value = "select * from guide where id = ?", nativeQuery = true)
    public Guide findById(int id);

//    @Query(value = "select  new com.coolwen.experimentplatform.model.DTO.QuestionStudentDto(q.id,q.sid,q.content,q.dic_datetime,s.stuUname,q.isreply) from Question q,Student s where q.sid=s.id order by q.isreply,q.dic_datetime desc ")
//    public Page<QuestionStudentDto> findAndUname(Pageable pageable);

}
