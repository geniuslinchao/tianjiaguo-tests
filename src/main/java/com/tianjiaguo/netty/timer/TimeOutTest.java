package com.tianjiaguo.netty.timer;

import org.jboss.netty.util.HashedWheelTimer;
import org.jboss.netty.util.Timeout;
import org.jboss.netty.util.Timer;
import org.jboss.netty.util.TimerTask;

import java.util.concurrent.TimeUnit;

/**
 * 12-6-6 下午2:46
 *
 * @author jiaguotian Copyright 2012 Sohu.com Inc. All Rights Reserved.
 */
public class TimeOutTest {
    public static void main(String[] argv) {
        final Timer timer = new HashedWheelTimer();
        timer.newTimeout(new TimerTask() {
            public void run(Timeout timeout) throws Exception {
                System.out.println("timeout 5");
            }
        }, 5, TimeUnit.SECONDS);
        timer.newTimeout(new TimerTask() {
            public void run(Timeout timeout) throws Exception {
                System.out.println("timeout 10");
            }
        }, 10, TimeUnit.SECONDS);
        System.out.println("xxxx");
    }
}
