package my.study.buckpal


import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import spock.lang.Specification;

// Spring DataJpaTest의 기본 설정들을 포함하는 상위 클래스
@DataJpaTest
@ContextConfiguration(classes = [TestApplicationContextLoader])
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("local")
@RunWith(SpringRunner.class)
abstract class JpaTestSupport extends Specification {
}
