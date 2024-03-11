CREATE DATABASE cinema_data;

\c cinema_data;

CREATE TABLE users (
                       user_id SERIAL PRIMARY KEY,
                       username VARCHAR(50) UNIQUE NOT NULL,
                       email VARCHAR(100) UNIQUE NOT NULL
);
CREATE TABLE films (
                       post_id SERIAL PRIMARY KEY,
                       title VARCHAR(255) NOT NULL,
                       content TEXT,
                       user_id INTEGER REFERENCES users(user_id) ON DELETE CASCADE
);
CREATE TABLE stats (
                          comment_id SERIAL PRIMARY KEY,
                          text TEXT NOT NULL,
                          user_id INTEGER REFERENCES users(user_id) ON DELETE CASCADE,
                          post_id INTEGER REFERENCES films(post_id) ON DELETE CASCADE
);

INSERT INTO users (username, email) VALUES
                                        ('user1', 'user1@example.com'),
                                        ('user2', 'user2@example.com');

INSERT INTO films (title, content, user_id) VALUES
                                                ('Post 1', 'Content for post 1', 1),
                                                ('Post 2', 'Content for post 2', 2);

INSERT INTO stats (text, user_id, post_id) VALUES
                                                  ('Comment on post 1', 2, 1),
                                                  ('Comment on post 2', 1, 2);