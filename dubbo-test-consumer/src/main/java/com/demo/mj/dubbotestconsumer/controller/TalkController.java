package com.demo.mj.dubbotestconsumer.controller;

import com.mj.demo.ListenService;
import com.mj.demo.TalkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 *
 * @date Created by mj on 2018/4/27.
 */
@RestController
public class TalkController {


    @Autowired
    TalkService talkService;

    @Autowired
    ListenService listenService;

    @RequestMapping("/talk")
    public String talkSome(String content) {
        String result = talkService.talk(content);
        System.out.println(result);

        return result;
    }

    @RequestMapping("/listen")
    public String hear(String content) {
        String result = listenService.hear(content);
        System.out.println(result);

        return result;
    }


}
