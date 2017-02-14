CREATE TABLE account (
  account_id   BIGSERIAL PRIMARY KEY,
  first_name   VARCHAR(255) NOT NULL,
  last_name    VARCHAR(255) NOT NULL,
  phone_number VARCHAR(255) NOT NULL,
  email        VARCHAR(255) NOT NULL,
  passhash     VARCHAR(255) NOT NULL
);