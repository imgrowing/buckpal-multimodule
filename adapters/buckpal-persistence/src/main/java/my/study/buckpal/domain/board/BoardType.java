package my.study.buckpal.domain.board;

import lombok.Getter;

public enum BoardType {
    notice("공지사항"),
    free("자유게시판");

    @Getter
    private final String description;

    BoardType(String description) {
        this.description = description;
    }
}
