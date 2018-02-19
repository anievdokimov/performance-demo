package com.demo;

import com.github.myzhan.locust4j.Locust;

public class LocustTest {

    public static void main(String[] args) {
        Locust locust;
        locust = Locust.getInstance();
        locust.setMasterHost("127.0.0.1");
        locust.setMasterPort(5557);
        locust.run(new OpenGoogleTask(50));
    }

}
