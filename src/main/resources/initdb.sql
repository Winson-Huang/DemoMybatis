DROP TABLE IF EXISTS demo_user;
CREATE TABLE demo_user (
    id INTEGER AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(64) NOT NULL,
    password VARCHAR(64) NOT NULL,
    email VARCHAR(64) NOT NULL
);

INSERT INTO demo_user(name, password, email) VALUES
('Bob', 'secret', 'bob@bob.org'),
('Alice', 'secret', 'alice@bob.org');