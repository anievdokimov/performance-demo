package com.demo;

import com.github.myzhan.locust4j.AbstractTask;
import com.github.myzhan.locust4j.Locust;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.demo.ClientBuilder.useDefault;

public class OpenGoogleTask extends AbstractTask {
    public int weight = 20;
    public String name = "Successful Scenario";

    public OpenGoogleTask() {
    }

    public OpenGoogleTask(int weight) {
        this.weight = weight;
    }

    /*
     *Weight of the task
     */
    public int getWeight() {
        return this.weight;
    }

    /*
     * Name of the task that we will be shown
     * in the Locust monitoring and report
     *
     */
    public String getName() {
        return this.name;
    }

    /*
     * Contains the body of the test
     */
    public void execute() {
        Response response = null;
        try {
            response = useDefault()
                    .accept(ContentType.HTML)
                    .when().get("/");
            assert response.statusCode() == 200;
            Locust.getInstance().recordSuccess("http", getName(), response.getTime(), 1);

        } catch (Exception ex) {
            Locust.getInstance().recordFailure("http", getName(), response.getTime(), ex.getMessage());
            ex.printStackTrace();
        }

    }
}
