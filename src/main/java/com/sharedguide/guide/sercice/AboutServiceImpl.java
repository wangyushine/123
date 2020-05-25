package com.sharedguide.guide.sercice;

import com.sharedguide.guide.dao.AboutRepository;
import com.sharedguide.guide.model.About;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 18710
 */
@Service
public class AboutServiceImpl implements AboutService {
    @Autowired
    private AboutRepository aboutRepository;
    @Override
    public About findByid(int id) {
        About about = new About();
        about = aboutRepository.findById(id);
        return about;
    }
}
