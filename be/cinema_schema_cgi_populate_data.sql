-- populate screen table with values
INSERT INTO  screen ( total_seats, available_seats, available) VALUES (150,150,true);

-- this loop is done with the help of a GPT I did not know if and how it could be done in pgSQL
-- populate seat table with values
DO $$
    DECLARE
    active_row CHAR(1) :='A';
--TODO      check if we can request total seats and save
    BEGIN
        FOR i IN 1..150 LOOP
                INSERT INTO seat(id,screen_id, row, seat, available)
                VALUES (DEFAULT,1, active_row, i, true);
                IF i%15 = 0 THEN
                active_row :=CHR(ascii(active_row)+1);
                END IF;
        END LOOP;
END $$;

INSERT INTO booking( id, user_id, selected_row, selected_seat, movie_screening_id) VALUES (DEFAULT,1,'A',1,1); --TODO data type is wrong! change the row to char
INSERT INTO users(id, username, email, credential, admin, active) VALUES (DEFAULT,'a','a','a',true,true);
INSERT INTO genre(genre) VALUES ('horror'), ('comedy'), ('romance'), ('action'), ('family'), ('sci-fi'), ('kids');
INSERT INTO ticket_cost(regular, discount) VALUES (10,5)
INSERT INTO movie( language_en, language_est, language_rus, subtitle_en, subtitle_est, subtitle_rus, length, movie_genre_id, description, poster, trailer) VALUES (true,false,false,false,true,true,120,1,'a new movie','base64 image','url link to video');
INSERT INTO movie_genre( movie_id, genre_id) VALUES (1,1),(1,4),(1,6);
INSERT INTO movie_screening(id, movie_id, screen_id, ticket_cost_id) VALUES (DEFAULT,1,1,1);
INSERT INTO schedule (date, time, movie_screening_id) VALUES (7,1300,1) --TODO change the format to date and time for
-- booking
-- genre
--  movie
-- movie_genre
-- movie_screening
-- schedule
-- screen
-- seat
-- ticket_cost
-- users

