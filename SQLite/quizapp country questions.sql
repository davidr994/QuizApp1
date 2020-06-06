CREATE TABLE if not EXISTS Country (
question_id INTEGER PRIMARY KEY,
question_text TEXT NOT NULL,
question_answer INTEGER NOT NULL,
question_complement TEXT NULL
);

INSERT INTO Country VALUES (null, "Germanys population is 63 milion people", 0, null);
INSERT INTO Country VALUES (null, "The length of Japan equals to the length from the bottom of Italy to the top of Denmark", 1, null);
INSERT INTO Country VALUES (null, "Australia was used as prison island for prisoners from Great Britian", 0, null);
INSERT INTO Country VALUES (null, "Tibet is the highest country in the world", 1, null);
INSERT INTO Country VALUES (null, "The USA has 49 different states", 0, null);
