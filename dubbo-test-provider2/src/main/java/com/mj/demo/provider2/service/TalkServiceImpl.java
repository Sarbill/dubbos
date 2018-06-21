package com.mj.demo.provider2.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.mj.demo.TalkService;
import org.springframework.stereotype.Component;

/**
 * Description
 *
 * @date Created by mj on 2018/4/20.
 */
@Service(interfaceClass = TalkService.class,version = "1.0.0")
@Component
public class TalkServiceImpl implements TalkService {

    @Override
    public String talk(String content) {
        System.out.println("provider2-------talk:"+content);
        return "provider2------- talk:"+content;
    }

    @Override
    public String talkMyself(String content) {
        System.out.println("provider2-------talkMyself:"+content);
        return "provider2-------talkMyself:"+content;
    }
}
