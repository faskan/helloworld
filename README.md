# helloworld
Say a hello world to different technologies
### spring-cloud-contract-server
A helloworld application for spring cloud contract as an API provider. The package has a normal contract test *EmployeeControllerTest.java* as well as one using spring cloud contract *shouldReturn200OK.groovy*

run `mvn spring-cloud-contract:generateTests` to generate the contract tests
An `mvn clean install` will generate a *-stubs.jar as well which can be shared with the consumer of this API 