package com.sharedguide.guide.dao;

import com.sharedguide.guide.dao.basedao.BaseRepository;
import com.sharedguide.guide.model.About;

import org.springframework.data.jpa.repository.Query;

/**
 * @author 18710
 */
public interface AboutRepository extends BaseRepository<About,Integer> {
    @Query(value = "select * from about where id = ?", nativeQuery = true)
    public About findById(int id);//联合查询

}
