package com.yzbbanban.controller;

import com.yzbbanban.service.ifac.IConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ban on 2018/7/2.
 *
 * @author ban
 */
@RestController
public class ConsumerController {

    @Autowired
    private IConsumerService iConsumerService;

    @RequestMapping(value = "/consumer", method = RequestMethod.GET)
    public String helloConsumer() {
        //调用其他服务 config那个服务
        return iConsumerService.getService() + "_success";
    }

}
