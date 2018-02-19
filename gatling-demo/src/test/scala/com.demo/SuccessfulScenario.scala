package demo

import demo.Configuration.{httpProtocol, nUsers, rampUp}
import demo.Scenarios.defaultScenario
import io.gatling.core.Predef._

import scala.concurrent.duration._


class SuccessfulScenario extends Simulation {

  setUp(
    defaultScenario.inject(rampUsers(nUsers) over rampUp.seconds)).protocols(httpProtocol)
}
