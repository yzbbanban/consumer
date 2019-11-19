package com.yzbbanban.service.ifac;

import com.yzbbanban.service.impl.ConsumerServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ban on 2018/7/7.
 *
 * @author ban
 */
@FeignClient(value = "user-service", fallback = ConsumerServiceImpl.class)
public interface IConsumerService {
    @RequestMapping(value = "/from", method = RequestMethod.GET)
    String getService();
}
