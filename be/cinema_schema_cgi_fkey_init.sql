
ALTER TABLE "movie_screening" ADD FOREIGN KEY ("movie_id") REFERENCES "movie" ("id");

ALTER TABLE "screen" ADD FOREIGN KEY ("id") REFERENCES "movie_screening" ("screen_id");

ALTER TABLE "screen" ADD FOREIGN KEY ("id") REFERENCES "seat" ("screen_id");

ALTER TABLE "movie_screening" ADD FOREIGN KEY ("id") REFERENCES "schedule" ("movie_screening_id");

ALTER TABLE "movie_screening" ADD FOREIGN KEY ("ticket_cost_id") REFERENCES "ticket_cost" ("id");

ALTER TABLE "movie_genre" ADD FOREIGN KEY ("movie_id") REFERENCES "movie" ("id");

ALTER TABLE "movie_genre" ADD FOREIGN KEY ("genre_id") REFERENCES "genre" ("id");

ALTER TABLE "movie_screening" ADD FOREIGN KEY ("id") REFERENCES "booking" ("movie_screening_id");

ALTER TABLE "booking" ADD FOREIGN KEY ("user_id") REFERENCES "users" ("id");