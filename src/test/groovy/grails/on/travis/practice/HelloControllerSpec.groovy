package grails.on.travis.practice

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class HelloControllerSpec extends Specification implements ControllerUnitTest<HelloController> {

    void "test message"() {
        when: "The message action is invoked"
        controller.message()

        then: "Hello is returned"
        response.text == 'Hello'
    }
}