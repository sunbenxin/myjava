package com.sunbx.myjava.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Slf4j
@Component
public class test implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.info("Commandline runner test");
    }

    private void p(String s) {
        System.out.println(s);
    }

    private void t1() {
        System.out.println("dsaf");
        BigDecimal a = new BigDecimal("19.9188578400000001");
        BigDecimal b = a.setScale(8, BigDecimal.ROUND_DOWN);
        System.out.println(b);
        System.out.println(a.stripTrailingZeros().scale());

        Long u = 2527646l;
        System.out.println(u.intValue());
    }

    private void tt() {
        String t = "afdasdfaserr_code\":1079asffdasf";
        String targetS = "err_code\":1079";
        if (t.contains(targetS)) {
            p("hit");
        }
    }
}
