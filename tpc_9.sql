
use pocbase;
SELECT* FROM UserAccounts;

INSERT INTO useraccounts (Firstname, Lastname, Username, Password) VALUES ("Neo", "Anderson", "matrix", "kung fu");
INSERT INTO UserAccounts (Firstname, Lastname, Username, Password) VALUES('Obiwan','kenobi','master', 'jedi');

ALTER TABLE useraccounts DROP COLUMN Passowrd;
ALTER TABLE UserAccounts ADD COLUMN Password VARCHAR(255);

SELECT count(1) from UserAccounts WHERE username ="matrix" AND password= "kung fu"
