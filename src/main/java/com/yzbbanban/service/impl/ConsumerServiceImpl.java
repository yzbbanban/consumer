package com.yzbbanban.service.impl;

import com.yzbbanban.service.ifac.IConsumerService;
import org.springframework.stereotype.Component;

/**
 * Created by ban on 2018/7/7.
 */
@Component
public class ConsumerServiceImpl implements IConsumerService {


    @Override
    public String getService() {
        return "lalalalal";
    }
}
