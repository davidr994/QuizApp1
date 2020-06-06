CREATE TABLE if not EXISTS Science (
question_id INTEGER PRIMARY KEY,
question_text TEXT NOT NULL,
question_answer INTEGER NOT NULL,
question_complement TEXT NULL
);

INSERT INTO Science VALUES (null, "The chemical symbole of gold is Au", 1, null);
INSERT INTO Science VALUES (null, "Einsteins famous equation is E=mc3", 0, null);
INSERT INTO Science VALUES (null, "There are 11 planets in our solar system", 0, null);
INSERT INTO Science VALUES (null, "Plants gain their energy through photosynthesis", 1, null);
INSERT INTO Science VALUES (null, "The crater of the asteriod that killed the dinosaurs is called Chicxulub", 1, null);
INSERT INTO Science VALUES (null, "Pi = 3.14157", 0, null);