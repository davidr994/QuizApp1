CREATE TABLE if not EXISTS Java (
question_id INTEGER PRIMARY KEY,
question_text TEXT NOT NULL,
question_answer INTEGER NOT NULL,
question_complement TEXT NULL
);

INSERT INTO Java VALUES (null, "Java is the most used programming language", 0, null);
INSERT INTO Java VALUES (null, "Java is not only a programming language, but also a coffee bean", 1, null);
INSERT INTO Java VALUES (null, "Kotlin builds up on Java", 1, null);
INSERT INTO Java VALUES (null, "Java 7 release date was 28.July 2011", 1, null);
