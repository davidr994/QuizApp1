CREATE TABLE if not EXISTS Computer (
question_id INTEGER PRIMARY KEY,
question_text TEXT NOT NULL,
question_answer INTEGER NOT NULL,
question_complement TEXT NULL
);

INSERT  INTO Computer VALUES (null, "The first computer was created by Steve Jobs", 0, null);
INSERT INTO Computer VALUES (null, "The operatingsystem Windows XP was released in the year 1993", 1, null);
INSERT INTO Computer VALUES (null, "SSD is the shortcut for solid state drive", 0, null);
INSERT INTO Computer VALUES (null, "Nvidia is a famous keyboard manufactur company", 1, null);
INSERT INTO Computer VALUES (null, "", 1, null);
INSERT INTO Computer VALUES (null, "", 1, null);
INSERT INTO Computer VALUES (null, "", 1, null);