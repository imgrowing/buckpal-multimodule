package my.study.buckpal

import groovy.util.logging.Slf4j
import org.springframework.boot.autoconfigure.SpringBootApplication

import javax.annotation.PostConstruct

/**
 * DataJpaTest 에서 필요한 ApplicationContext를 로드합니다.
 */
@Slf4j
@SpringBootApplication
class TestApplicationContextLoader {

    @PostConstruct
    private void init() {
        log.warn("test application init")
    }

}
