INSERT INTO  screen ( total_seats, available_seats, available) VALUES (150,150,true);

-- this loop is done with the help of a GPT I did not know if and how it could be done in pgSQL
DO $$
    DECLARE
    active_row CHAR(1) :='A';
    BEGIN
        FOR i IN 1..150 LOOP
                INSERT INTO seat(id,screen_id, row, seat, available)
                VALUES (DEFAULT,1, active_row, i, true);
                IF i%15 = 0 THEN
                active_row :=CHR(ascii(active_row)+1);
                END IF;
        END LOOP;
END $$;

