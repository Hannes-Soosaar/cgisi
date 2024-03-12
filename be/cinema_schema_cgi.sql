CREATE TABLE "movie_screening" (
  "id" serial PRIMARY KEY,
  "movie_id" integer,
  "screen_id" integer ,
  "ticket_cost_id" integer
);

CREATE TABLE "ticket_cost" (
  "id" serial PRIMARY KEY,
  "regular" integer,
  "discount" integer
);

CREATE TABLE "movie" (
  "id" serial PRIMARY KEY,
  "language_en" bool,
  "language_est" bool,
  "language_rus" bool,
  "subtitle_en" bool,
  "subtitle_est" bool,
  "subtitle_rus" bool,
  "length" integer,
  "movie_genre_id" integer,
  "description" text,
  "poster" text,
  "trailer" text
);

CREATE TABLE "movie_genre" (
  "id" serial PRIMARY KEY,
  "movie_id" integer ,
  "genre_id" integer
);

CREATE TABLE "genre" (
    "id" serial PRIMARY KEY,
    "genre" varchar
);

CREATE TABLE "screen" (
  "id" serial PRIMARY KEY,
  "total_seats" integer,
  "available_seats" integer,
  "available" bool
);

CREATE TABLE "seat" (
  "id" serial PRIMARY KEY,
  "screen_id" integer ,
  "row" varchar,
  "seat" integer,
  "available" bool
);

CREATE TABLE "schedule" (
  "id" serial PRIMARY KEY,
  "date" integer,
  "time" integer,
  "movie_screening_id" integer
);
-- the table needs to be in plural because user is not a valid table name in postgres
CREATE TABLE "users" (
  "id" serial PRIMARY KEY,
  "username" varchar,
  "email" varchar,
  "credential" varchar,
  "admin" bool,
  "active" bool
);

CREATE TABLE "booking" (
  "id" serial PRIMARY KEY,
  "user_id" integer,
  "selected_row" varchar,
  "selected_seat" integer,
  "movie_screening_id" integer
);


