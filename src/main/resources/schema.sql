DROP TABLE IF EXISTS Transactions;

CREATE TABLE Transactions (
    id VARCHAR (10) PRIMARY KEY,
    transaction_Date DATE NOT NULL,
    amount float NOT NULL,
    frequency ENUM('DAILY', 'WEEKLY', 'FORTNIGHTLY', 'MONTHLY', 'YEARLY' )
);


DROP TABLE IF EXISTS Tags;

CREATE TABLE Tags (
  id int(11) unsigned NOT NULL AUTO_INCREMENT,
  transaction_Id VARCHAR(10) unsigned NOT NULL,
  tagtype_id int unsigned NOT NULL
);

DROP TABLE IF EXISTS TagType;

CREATE TABLE TagType (
    id INT  PRIMARY KEY,
    tagtype VARCHAR(250) NOT NULL,
    description VARCHAR(250),
);

DROP TABLE IF EXISTS Component;
CREATE TABLE Component (
    id              INT(11) unsigned NOT NULL AUTO_INCREMENT,
    value_one       INT NOT NULL,
    value_two       INT NOT NULL,
    value_three     DECIMAL NOT NULL
)