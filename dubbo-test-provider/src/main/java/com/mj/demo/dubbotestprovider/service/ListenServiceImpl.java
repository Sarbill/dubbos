package com.mj.demo.dubbotestprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.mj.demo.ListenService;
import org.springframework.stereotype.Component;

/**
 * Description
 *
 * @date Created by mj on 2018/5/29.
 */

@Service(interfaceClass = ListenService.class, version = "0.0.1", group = "listen")
@Component
public class ListenServiceImpl implements ListenService {

    @Override
    public String hear(String talks) {
        System.out.println("provider1-------listening:" + talks);
        return "provider1-------listening:" + talks;
    }

    @Override
    public String listenMusic(String music) {
        System.out.println("provider1-------music:" + music);
        return "provider1-------music:" + music;
    }
}
