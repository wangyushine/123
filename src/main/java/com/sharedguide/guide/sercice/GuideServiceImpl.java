package com.sharedguide.guide.sercice;

import com.sharedguide.guide.dao.GuideRepository;
import com.sharedguide.guide.model.Guide;
import org.springframework.beans.factory.annotation.Autowired;

public class GuideServiceImpl implements GuideService {

    @Autowired
    private GuideRepository guideRepository;

    @Override
    public Guide findById(int id) {
        Guide guide = new Guide();
        guide = guideRepository.findById(id);
        return guide;
    }
}
