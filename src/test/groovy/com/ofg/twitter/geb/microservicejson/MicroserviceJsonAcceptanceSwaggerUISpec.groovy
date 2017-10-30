package com.ofg.twitter.geb.microservicejson

import com.ofg.twitter.geb.AcceptanceSwaggerUISpec
import org.springframework.boot.test.context.SpringBootTest

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.DEFINED_PORT

@SpringBootTest(properties = "spring.profiles.active:dev", webEnvironment = DEFINED_PORT)
class MicroserviceJsonAcceptanceSwaggerUISpec extends AcceptanceSwaggerUISpec {
}
