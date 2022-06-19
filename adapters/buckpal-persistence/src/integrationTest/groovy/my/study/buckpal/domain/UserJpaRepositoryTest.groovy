package my.study.buckpal.domain

import my.study.buckpal.JpaTestSupport
import my.study.buckpal.domain.user.User
import my.study.buckpal.domain.user.UserJpaRepository
import org.springframework.beans.factory.annotation.Autowired

import java.time.LocalDateTime

class UserJpaRepositoryTest extends JpaTestSupport {

    private final String email = "test@gmail.com";

    @Autowired
    UserJpaRepository userRepository

    void setup() {
        User user = userRepository.save(User.builder()
                .name("홍길동")
                .password("패스워드")
                .email(email)
                .createdDate(LocalDateTime.now())
                .build()
        )
    }

    def "user가 제대로 생성되었다"() {
        when:
        User user = userRepository.findByEmail(email)

        then:
        user.name == "홍길동"
        user.password == "패스워드"
        user.email == email
    }

}
