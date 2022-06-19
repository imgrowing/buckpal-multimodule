package my.study.buckpal.domain.board;

import my.study.buckpal.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
    Board findByUser(User user);
}
