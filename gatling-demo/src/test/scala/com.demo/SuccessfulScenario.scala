package com.demo

import com.demo.Configuration.{httpProtocol, nUsers, rampUp}
import com.demo.Scenarios.defaultScenario
import io.gatling.core.Predef._

import scala.concurrent.duration._


class SuccessfulScenario extends Simulation {

  setUp(
    defaultScenario.inject(rampUsers(nUsers) over rampUp.seconds)).protocols(httpProtocol)
}
