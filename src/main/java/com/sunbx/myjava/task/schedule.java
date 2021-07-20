package com.sunbx.myjava.task;

import com.binance.client.RequestOptions;
import com.binance.client.SyncRequestClient;
import com.binance.client.model.trade.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class schedule {
    @Scheduled(fixedRate = 10000)
    public void run() {
        log.info("Test schedule");
    }

    private void test() {
        RequestOptions reqOpt = new RequestOptions();
        reqOpt.setUrl("https://dapi.binance.com");
        SyncRequestClient syncRequestClient = SyncRequestClient.create("tq3VPymrtGR06PGHbganjgZ7yQhvmNXa8GktWT8ZSVNQeAG3kCj1mvQTzTqwdvbt", "8n0IF7ICfhtgXwrfYjdBHRJex8Lqk9HX1zauf3OmKmBySRPCQmzMaoGxKDVmY3Y6", reqOpt);
        List<Order> allOrders = syncRequestClient.getAllOrders("BTC/USDT", null, null, null, null);
        System.out.println("11");
    }
}
