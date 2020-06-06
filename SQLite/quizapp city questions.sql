CREATE TABLE if not EXISTS City (
question_id INTEGER PRIMARY KEY,
question_text TEXT NOT NULL,
question_answer INTEGER NOT NULL,
question_complement TEXT NULL
);

INSERT INTO City VALUES (null, "The biggest city in the world is Tokyo", 1, null);
INSERT INTO City VALUES (null, "The fall of the wall in berlin happend in 1981", 0, null);
INSERT INTO City VALUES (null, "A very famous place in NYC is called Time Square", 1, null);
INSERT INTO City VALUES (null, "The city of Istanbul connects europe and asia", 1, null);
INSERT INTO City VALUES (null, "Paris is the biggest city in europe", 0, null);
INSERT INTO City VALUES (null, "The capitol of Australia is Sidney", 0, null);
