DROP TABLE IF EXISTS todoitem;

CREATE TABLE TodoItem (task_id INTEGER PRIMARY KEY, task TEXT, priority INTEGER, done BOOLEAN);

INSERT INTO todoitem (task_id, task, priority, done) VALUES (101, "Work out", 10, FALSE), (102, "Go shopping", 5, FALSE);

INSERT INTO todoitem (task_id, task, priority, done) VALUES (101, "Work out", 10, FALSE);

SELECT * FROM todoitem;

UPDATE todoitem SET task = "Do homework" WHERE task_id = 101;

DELETE FROM todoitem WHERE task_id = 101;
