package com.demo

import io.gatling.http.Predef.http
import io.gatling.core.Predef._

object Configuration {

  val nUsers: Int = Integer.getInteger("load.test.nUsers" , 10)
  val rampUp: Int = Integer.getInteger("load.test.rampUp.time" , 2)
  val testDuration: Int = Integer.getInteger("load.test.duration" , 20)
  val scenarioBaseURL = "https://gatling.io"

  val defaultHeaders = Map("Accept" -> "text/html,application/xhtml+xml")

  val httpProtocol = http
    .baseURL(Configuration.scenarioBaseURL)
    .headers(defaultHeaders)
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:16.0) Gecko/20100101 Firefox/16.0")
}
