package com.demo

import com.demo.Configuration.{httpProtocol, nUsers, rampUp}
import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import scala.concurrent.duration._

class UnsuccessfulScenario extends Simulation{
  setUp(
    Scenarios.defaultScenario
      .inject(rampUsers(nUsers) over rampUp.seconds))
    .protocols(httpProtocol)
    .assertions(forAll.responseTime.max.lt(100)
    )
}
