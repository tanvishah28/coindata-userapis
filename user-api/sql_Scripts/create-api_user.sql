-- Create a new user
CREATE USER 'api_user'@'localhost' IDENTIFIED BY 'user';

-- Grant privileges on the database to the api_user
GRANT ALL PRIVILEGES ON *.* TO 'api_user'@'localhost';


