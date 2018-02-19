package demo

import demo.Configuration.testDuration
import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._

object Scenarios {
  val defaultScenario = scenario("Get Main Page Scenario")
    .during(testDuration seconds) {
      exec(
        http("Get Main Page")
          .get("/")
          .check(status is 200)
      )
    }
}
