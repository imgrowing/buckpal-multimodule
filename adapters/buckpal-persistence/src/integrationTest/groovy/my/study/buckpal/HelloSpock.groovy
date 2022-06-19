package my.study.buckpal;

import spock.lang.Specification

class HelloSpock extends Specification {

    def "hello"() {
        expect:
        "hello" == "hello"
    }
}