## Running Gatling tests
Tests are executed via [Gatling Maven Plugin](https://gatling.io/docs/2.3/extensions/maven_plugin/) 

To run tests simply execute:

```mvn -pl gatling-demo gatling:test```

or 

```mvn -pl gatling-demo gatling:test -Dgatling.simulationClass=com.demo.SuccessfulScenario```

Test reports can be found in gatling-demo\target\gatling\ folder.
## Running jMeter tests
Tests are executed via [JMeter Maven Plugin](https://github.com/jmeter-maven-plugin/jmeter-maven-plugin/) 

To run tests simply execute:

```mvn -pl jmeter-demo jmeter:jmeter```
## Running jMeter test with Taurus
To run jMeter test with Taurus you need:
1. Install Taurus
2. in taurus-demo folder execute:
 ```bzt jmeter-test.yml```

## Running Locust tests
To run Locust you need:
1. Open locust-demo directory
2. Start locust master server by executing:
```locust -f dummy.py --master --master-bind-host=127.0.0.1```
3. Run main class com.demo.LocustTest.java

