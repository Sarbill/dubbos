package com.mj.demo.dubbotestprovider.service;

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
        return "provider1------- talk:"+content;
    }

    @Override
    public String talkMyself(String content) {
        System.out.println("provider1-------talkMyself:"+content);
        return "provider1-------talkMyself:"+content;
    }
}
