CREATE TABLE if not EXISTS Animal (
question_id INTEGER PRIMARY KEY,
question_text TEXT NOT NULL,
question_answer INTEGER NOT NULL,
question_complement TEXT NULL
);

INSERT INTO Animal VALUES (null, "The largest animals on earth are elephants", 0, null);
INSERT INTO Animal VALUES (null, "Dolphins are mammels", 1, null);
INSERT INTO Animal VALUES (null, "The scientific term for humas is Homo Sapiens Sapiens", 1, null);
INSERT INTO Animal VALUES (null, "The fastest lion ever recorded ran 60miles/hour", 0, null);
INSERT INTO Animal VALUES (null, "Snakes and frogs are both reptiles", 0, null);
INSERT INTO Animal VALUES (null, "The platypus is the only mammel which lays eggs", 1, null);
INSERT INTO Animal VALUES (null, "Insects have no blood veins", 1, null);