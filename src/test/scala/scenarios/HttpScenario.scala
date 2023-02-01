package scenarios

import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder

object HttpScenario {

  val scn: ScenarioBuilder = scenario("Http Scenario")
    .feed(csv("boo/foo.csv")) // navigation doesn't work
    .feed(csv("bar.csv"))     // navigation is working

}
