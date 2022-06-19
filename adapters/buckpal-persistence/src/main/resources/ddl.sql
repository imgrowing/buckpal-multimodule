CREATE TABLE board
(
    board_id     BIGINT AUTO_INCREMENT,
    board_type   VARCHAR(255),
    content      VARCHAR(255),
    created_date TIMESTAMP,
    sub_title    VARCHAR(255),
    title        VARCHAR(255),
    updated_date TIMESTAMP,
    user_id      BIGINT,
    PRIMARY KEY (board_id)
);

CREATE TABLE user
(
    user_id      BIGINT AUTO_INCREMENT,
    created_date TIMESTAMP,
    email        VARCHAR(255),
    name         VARCHAR(255),
    password     VARCHAR(255),
    updated_date TIMESTAMP,
    PRIMARY KEY (user_id)
);
