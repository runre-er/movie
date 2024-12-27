
insert into languages (name) values
('English'),
('Spanish'),
('French'),
('German'),
('Japanese'),
('Chinese'),
('Korean'),
('Italian'),
('Russian'),
('Portuguese');

insert into countries (name) values
('USA'),
('Canada'),
('UK'),
('Australia'),
('Germany'),
('France'),
('Japan'),
('China'),
('India'),
('South Korea');

insert into genres (name) values
('Action'),
('Adventure'),
('Animation'),
('Biography'),
('Comedy'),
('Crime'),
('Documentary'),
('Drama'),
('Family'),
('Fantasy'),
('History'),
('Horror'),
('Music'),
('Musical'),
('Mystery'),
('Romance'),
('Science Fiction'),
('Sport'),
('Thriller'),
('War'),
('Western');


-- Production Tablosu
insert into productions (title, original_title, release_date, play_time, language_id, country_id, genre_id) values
('Frasier', 'Frasier', '2023-10-11', 30, 1, 1, 5), -- English, USA, Comedy
('Teen Wolf: The Movie', 'Teen Wolf: The Movie', '2023-01-26', 90, 1, 2, 1), -- English, USA, Action
('The Price Is Right: A Tribute to Bob Barker', 'The Price Is Right', '2023-08-31', 120, 1, 1, 7), -- English, USA, Documentary
('Mighty Morphin Power Rangers: Once & Always', 'Mighty Morphin Power Rangers', '2023-04-19', 55, 1, 2, 1), -- English, USA, Action
('Pamela, A Love Story', 'Pamela, A Love Story', '2023-01-31', 100, 1, 3, 4), -- English, USA, Biography
('Zoey 102', 'Zoey 102', '2023-07-27', 80, 1, 4, 5), -- English, USA, Comedy
('Scavengers Reign', 'Scavengers Reign', '2023-10-19', 40, 1, 6, 18), -- English, USA, Science Fiction
('Unicorn Academy', 'Unicorn Academy', '2023-11-02', 25, 1, 5, 9), -- English, USA, Family
('Beacon 23', 'Beacon 23', '2023-11-12', 50, 1, 7, 18), -- English, USA, Science Fiction
('The Curse', 'The Curse', '2023-11-02', 60, 1,8, 12), -- English, USA, Horror
('Goosebumps', 'Goosebumps', '2023-10-13', 45, 1, 9, 12), -- English, USA, Horror
('Blue Eye Samurai', 'Blue Eye Samurai', '2023-11-03', 60, 1, 10, 1), -- English, USA, Action
('Captain Laserhawk: A Blood Dragon Remix', 'Captain Laserhawk', '2023-10-19', 40, 1, 1, 3), -- English, USA, Animation
('Percy Jackson and the Olympians', 'Percy Jackson', '2023-12-19', 50, 1, 8, 2), -- English, USA, Adventure
('King Charles', 'King Charles', '2023-11-29', 90, 1, 6, 4), -- English, USA, Biography
('Monarch: Legacy of Monsters', 'Monarch: Legacy of Monsters', '2023-11-17', 45, 1, 5, 1), -- English, USA, Action
('The Heroic Quest of the Valiant Prince Ivandoe', 'The Heroic Quest of the Valiant Prince Ivandoe', '2023-11-11', 25, 1, 1, 3), -- English, USA, Animation
('Office Race', 'Office Race', '2023-09-04', 30, 1, 3, 5), -- English, USA, Comedy
('Lego Jurassic Park: The Unofficial Retelling', 'Lego Jurassic Park', '2023-10-10', 50, 1, 2, 3), -- English, USA, Animation
('South Park: Joining the Panderverse', 'South Park', '2023-10-27', 60, 1, 5, 5); -- English, USA, Comedy

insert into persons (name, surname, birth_date, birth_country) values
('James', 'McAvoy', '1979-04-21', 'UK'),
('Emma', 'Stone', '1988-11-06', 'USA'),
('Ben', 'Affleck', '1972-08-15', 'USA'),
('Jessica', 'Chastain', '1977-03-24', 'USA'),
('Chris', 'Hemsworth', '1983-08-11', 'Australia'),
('Margot', 'Robbie', '1990-07-02', 'Australia'),
('Zac', 'Efron', '1987-10-18', 'USA'),
('Natalie', 'Portman', '1981-06-09', 'Israel'),
('Tom', 'Hiddleston', '1981-02-09', 'UK'),
('Scarlett', 'Johansson', '1984-11-22', 'USA'),
('Hugh', 'Jackman', '1968-10-12', 'Australia'),
('Zendaya', 'Coleman', '1996-09-01', 'USA'),
('Millie Bobby', 'Brown', '2004-02-19', 'UK'),
('Finn', 'Wolfhard', '2002-12-23', 'Canada'),
('Pedro', 'Pascal', '1975-04-02', 'Chile'),
('Florence', 'Pugh', '1996-01-03', 'UK'),
('Ryan', 'Gosling', '1980-11-12', 'Canada'),
('Emma', 'Roberts', '1991-02-10', 'USA'),
('Jacob', 'Elordi', '1997-06-26', 'Australia'),
('Bella', 'Thorne', '1997-10-08', 'USA'),
('Christopher', 'Nolan', '1970-07-30', 'UK'),
('Greta', 'Gerwig', '1983-08-04', 'USA'),
('Martin', 'Scorsese', '1942-11-17', 'USA'),
('Kathryn', 'Bigelow', '1951-11-27', 'USA'),
('Quentin', 'Tarantino', '1963-03-27', 'USA'),
('Ava', 'DuVernay', '1972-08-24', 'USA'),
('Denis', 'Villeneuve', '1967-10-03', 'Canada'),
('Bong', 'Joon-ho', '1969-09-14', 'South Korea'),
('David', 'Fincher', '1962-08-28', 'USA'),
('Sofia', 'Coppola', '1971-05-14', 'USA'),
('Steven', 'Spielberg', '1946-12-18', 'USA'),
('Chloe', 'Zhao', '1982-03-31', 'China'),
('Jordan', 'Peele', '1979-02-21', 'USA'),
('Jane', 'Campion', '1954-04-30', 'New Zealand'),
('Alfonso', 'Cuarón', '1961-11-28', 'Mexico'),
('Guillermo', 'del Toro', '1964-10-09', 'Mexico'),
('Wes', 'Anderson', '1969-05-01', 'USA'),
('Spike', 'Lee', '1957-03-20', 'USA'),
('Ridley', 'Scott', '1937-11-30', 'UK'),
('Taika', 'Waititi', '1975-08-16', 'New Zealand'),
('Aaron', 'Sorkin', '1961-06-09', 'USA'),
('Charlie', 'Kaufman', '1958-11-19', 'USA'),
('Nora', 'Ephron', '1941-05-19', 'USA'),
('Quentin', 'Tarantino', '1963-03-27', 'USA'),
('Spike', 'Lee', '1957-03-20', 'USA'),
('Sofia', 'Coppola', '1971-05-14', 'USA'),
('Woody', 'Allen', '1935-12-01', 'USA'),
('Wes', 'Anderson', '1969-05-01', 'USA'),
('Christopher', 'Nolan', '1970-07-30', 'UK'),
('Greta', 'Gerwig', '1983-08-04', 'USA'),
('Diablo', 'Cody', '1978-06-14', 'USA'),
('Taylor', 'Sheridan', '1970-07-21', 'USA'),
('Noah', 'Baumbach', '1969-09-03', 'USA'),
('Emerald', 'Fennell', '1985-10-01', 'UK'),
('Spike', 'Jonze', '1969-10-22', 'USA'),
('Phoebe', 'Waller-Bridge', '1985-07-14', 'UK'),
('Jordan', 'Peele', '1979-02-21', 'USA'),
('Rian', 'Johnson', '1973-12-17', 'USA'),
('Alex', 'Garland', '1970-05-26', 'UK'),
('Bong', 'Joon-ho', '1969-09-14', 'South Korea'),
('Hans', 'Zimmer', '1957-09-12', 'Germany'),
('Roger', 'Deakins', '1949-05-24', 'UK'),
('Emmanuel', 'Lubezki', '1964-11-30', 'Mexico'),
('Sandy', 'Powell', '1960-04-07', 'UK'),
('Colleen', 'Atwood', '1948-09-25', 'USA'),
('Robert', 'Richardson', '1955-08-27', 'USA'),
('Thelma', 'Schoonmaker', '1940-01-03', 'Algeria'),
('Hoyte', 'van Hoytema', '1971-10-01', 'Netherlands'),
('Alexandre', 'Desplat', '1961-08-23', 'France'),
('Dariusz', 'Wolski', '1956-05-07', 'Poland'),
('John', 'Williams', '1932-02-08', 'USA'),
('Michael', 'Giacchino', '1967-10-10', 'USA'),
('Dan', 'Glass', '1966-09-15', 'UK'),
('Joe', 'Walker', '1963-10-02', 'UK'),
('Stuart', 'Craig', '1942-04-14', 'UK'),
('Nathan', 'Crowley', '1966-12-25', 'UK'),
('Alan', 'Silvestri', '1950-03-26', 'USA'),
('James', 'Newton Howard', '1951-06-09', 'USA'),
('Thomas', 'Newman', '1955-10-20', 'USA'),
('Rick', 'Carter', '1950-11-26', 'USA'),
('David', 'Lee', '1980-05-15', 'New York, USA'),
('Leslie', 'Jones', '1975-07-22', 'Chicago, USA'),
('John', 'Smith', '1985-09-30', 'Los Angeles, USA'),
('Tom', 'Green', '1979-11-12', 'Toronto, Canada'),
('Mary', 'Johnson', '1990-01-08', 'Austin, USA'),
('William', 'Turner', '1982-06-25', 'London, UK'),
('Alice', 'Walker', '1993-03-19', 'Melbourne, Australia'),
('Jessica', 'Brown', '1987-10-10', 'Manchester, UK'),
('Ethan', 'Davis', '1983-12-05', 'Los Angeles, USA'),
('Jason', 'Clark', '1980-03-29', 'Seattle, USA'),
('Sarah', 'Green', '1992-04-14', 'San Francisco, USA'),
('Michael', 'Wong', '1986-08-22', 'Beijing, China'),
('Alice', 'Fisher', '1991-09-05', 'Vancouver, Canada'),
('Liam', 'West', '1984-02-17', 'Dublin, Ireland'),
('Claire', 'Stevens', '1985-01-27', 'Boston, USA'),
('Olivia', 'Harris', '1988-05-19', 'Houston, USA'),
('George', 'Miller', '1980-11-09', 'Sydney, Australia'),
('Ethan', 'Carter', '1994-06-13', 'Phoenix, USA'),
('Caroline', 'Lee', '1991-10-07', 'Chicago, USA'),
('John', 'Marshall', '1983-12-30', 'Los Angeles, USA'),
('Rachel', 'Foster', '1989-02-18', 'London, UK'),
('Robert', 'Young', '1982-07-04', 'New York, USA'),
('Michelle', 'Adams', '1990-04-10', 'Miami, USA'),
('Lucas', 'Scott', '1984-03-28', 'Dallas, USA'),
('Mary', 'Smith', '1981-11-21', 'Los Angeles, USA'),
('Daniel', 'Brown', '1995-12-03', 'Toronto, Canada'),
('Peter', 'Garcia', '1987-10-25', 'Barcelona, Spain'),
('Henry', 'Taylor', '1992-01-19', 'Miami, USA'),
('Linda', 'Martinez', '1986-07-14', 'San Diego, USA'),
('Angela', 'Walker', '1985-05-10', 'Chicago, USA'),
('Benjamin', 'Lee', '1988-11-22', 'Atlanta, USA'),
('David', 'Harris', '1990-09-28', 'Los Angeles, USA'),
('George', 'Thompson', '1982-04-16', 'Chicago, USA'),
('Isabel', 'Scott', '1991-08-11', 'San Francisco, USA'),
('William', 'Turner', '1982-06-25', 'London, UK'),
('Natalie', 'King', '1993-03-19', 'Manchester, UK'),
('Steven', 'Wright', '1980-02-05', 'Boston, USA'),
('Olivia', 'Moore', '1989-07-10', 'Vancouver, Canada'),
('Brian', 'Clark', '1986-03-15', 'Houston, USA'),
('Abigail', 'Adams', '1991-12-18', 'New York, USA'),
('Isaac', 'Campbell', '1992-08-07', 'Miami, USA'),
('Daniel', 'Thomas', '1984-11-23', 'Chicago, USA'),
('Ethan', 'Carter', '1994-06-13', 'Phoenix, USA'),
('Chloe', 'Wilson', '1990-05-14', 'London, UK'),
('Sophia', 'Moore', '1989-01-03', 'Toronto, Canada'),
('Logan', 'Perez', '1991-04-20', 'San Francisco, USA'),
('Aaron', 'White', '1986-07-14', 'Los Angeles, USA'),
('Vanessa', 'Taylor', '1992-09-25', 'New York, USA'),
('Julian', 'Martin', '1985-06-17', 'Miami, USA'),
('Laura', 'Harris', '1987-12-03', 'Houston, USA'),
('Olivia', 'Wilson', '1989-04-18', 'Chicago, USA'),
('Noah', 'Lewis', '1982-09-21', 'Dallas, USA'),
('Emma', 'Clark', '1990-05-12', 'New York, USA'),
('Ryan', 'Scott', '1985-07-30', 'Los Angeles, USA'),
('Emily', 'James', '1991-05-08', 'Boston, USA'),
('Liam', 'Walker', '1984-11-14', 'San Francisco, USA'),
('Aiden', 'Carter', '1992-08-02', 'Miami, USA'),
('Evelyn', 'Garcia', '1993-02-21', 'Chicago, USA'),
('Hannah', 'Adams', '1990-04-10', 'Los Angeles, USA'),
('Max', 'Smith', '1985-10-23', 'Dallas, USA'),
('Katie', 'Mitchell', '1987-09-12', 'San Francisco, USA'),
('Robert', 'Davis', '1992-05-17', 'Phoenix, USA'),
('Rachel', 'Moore', '1993-01-08', 'Houston, USA'),
('Joshua', 'Lee', '1984-11-14', 'Chicago, USA'),
('Sarah', 'Johnson', '1986-07-14', 'Los Angeles, USA'),
('Marcus', 'White', '1990-06-15', 'San Francisco, USA'),
('Maya', 'Johnson', '1985-12-08', 'London, UK'),
('Naomi', 'Scott', '1991-03-24', 'Sydney, Australia'),
('Andrew', 'Green', '1984-10-17', 'Chicago, USA'),
('James', 'Taylor', '1982-05-19', 'San Francisco, USA'),
('Grace', 'Martinez', '1991-11-04', 'Miami, USA'),
('Nathan', 'Lee', '1990-02-21', 'Dallas, USA'),
('Emma', 'Scott', '1988-12-12', 'Chicago, USA'),
('Oliver', 'Perez', '1986-03-10', 'New York, USA'),
('Daniel', 'Williams', '1992-10-17', 'Toronto, Canada'),
('Victoria', 'Green', '1990-04-22', 'Los Angeles, USA'),
('Jacob', 'Evans', '1985-05-25', 'Chicago, USA'),
('Emma', 'Brown', '1994-08-03', 'Phoenix, USA'),
('Mason', 'Clark', '1984-02-19', 'Dallas, USA'),
('Samuel', 'Lee', '1987-07-10', 'Toronto, Canada'),
('Noah', 'Harris', '1991-01-04', 'San Francisco, USA'),
('Sophie', 'White', '1983-11-22', 'Los Angeles, USA'),
('Isaac', 'Moore', '1993-09-25', 'New York, USA'),
('Grace', 'Evans', '1990-04-12', 'Houston, USA'),
('James', 'Taylor', '1982-05-19', 'San Francisco, USA'),
('Benjamin', 'Carter', '1992-02-11', 'Dallas, USA'),
('Lily', 'Scott', '1991-06-07', 'Chicago, USA'),
('Sophia', 'Brown', '1985-03-12', 'Toronto, Canada'),
('Noah', 'Green', '1994-12-02', 'Los Angeles, USA'),
('Olivia', 'Martin', '1986-11-18', 'New York, USA'),
('Aiden', 'White', '1990-06-25', 'Chicago, USA'),
('Lily', 'Harris', '1992-01-07', 'Dallas, USA'),
('Benjamin', 'Lee', '1987-03-18', 'San Francisco, USA'),
('Daniel', 'Moore', '1985-05-10', 'Houston, USA'),
('Jonathan', 'Walker', '1989-10-14', 'New York, USA'),
('Isabella', 'Perez', '1992-11-04', 'Los Angeles, USA'),
('Ryan', 'Wilson', '1985-04-13', 'Chicago, USA'),
('Ava', 'Green', '1990-09-12', 'San Francisco, USA'),
('Daniel', 'White', '1982-06-23', 'Miami, USA'),
('Liam', 'Brown', '1991-07-16', 'Houston, USA');


insert into stars (production_id, person_id) values
(1, 141), (1, 142), (1, 143),
(2, 144), (2, 145), (2, 146),
(3, 147), (3, 148), (3, 149),
(4, 150), (4, 151), (4, 152),
(5, 153), (5, 154), (5, 155);

insert into writers (production_id, person_id) values
(1, 121), (1, 122),
(2, 123), (2, 124),
(3, 125), (3, 126),
(4, 127), (4, 128),
(5, 129), (5, 130);

insert into directors (production_id, person_id) values
(6, 106), (7, 107), (8, 108), (9, 109), (10, 110),
(1, 101), (2, 102), (3, 103), (4, 104), (5, 105);

insert into actors (production_id, person_id) values
(1, 81), (1, 82), (1, 83), (1, 84),
(2, 85), (2, 86), (2, 87), (2, 88),
(3, 89), (3, 90), (3, 91), (3, 92),
(4, 93), (4, 94), (4, 95), (4, 96),
(5, 86), (5, 97), (5, 98), (5, 99);

-- User Tablosu
insert into users (name, sur_name, nick, email, password, registration_time) values
('john_doe', 'Doe', 'john_doe', 'johndoe@example.com', 'hashed_password_1', '2023-11-22'),
('jane_smith', 'Smith', 'jane_smith', 'janesmith@example.com', 'hashed_password_2', '2023-12-01'),
('alice_johnson', 'Johnson', 'alice_johnson', 'alicejohnson@example.com', 'hashed_password_3', '2023-11-15'),
('michael_brown', 'Brown', 'michael_brown', 'michaelbrown@example.com', 'hashed_password_4', '2023-11-20'),
('susan_white', 'White', 'susan_white', 'susanwhite@example.com', 'hashed_password_5', '2023-10-11'),
('david_wilson', 'Wilson', 'david_wilson', 'davidwilson@example.com', 'hashed_password_6', '2023-09-30'),
('emma_jones', 'Jones', 'emma_jones', 'emmajones@example.com', 'hashed_password_7', '2023-12-05'),
('jacob_miller', 'Miller', 'jacob_miller', 'jacobmiller@example.com', 'hashed_password_8', '2023-10-01'),
('olivia_davis', 'Davis', 'olivia_davis', 'oliviadavis@example.com', 'hashed_password_9', '2023-09-25'),
('daniel_martin', 'Martin', 'daniel_martin', 'danielmartin@example.com', 'hashed_password_10', '2023-11-08'),
('mary_garcia', 'Garcia', 'mary_garcia', 'marygarcia@example.com', 'hashed_password_11', '2023-08-18'),
('ethan_rodriquez', 'Rodriquez', 'ethan_rodriquez', 'ethanrodriquez@example.com', 'hashed_password_12', '2023-12-10'),
('lucas_lopez', 'Lopez', 'lucas_lopez', 'lucaslopez@example.com', 'hashed_password_13', '2023-11-12'),
('mia_taylor', 'Taylor', 'mia_taylor', 'miataylor@example.com', 'hashed_password_14', '2023-09-10'),
('benjamin_lee', 'Lee', 'benjamin_lee', 'benjaminlee@example.com', 'hashed_password_15', '2023-11-18'),
('chloe_harris', 'Harris', 'chloe_harris', 'chloeharris@example.com', 'hashed_password_16', '2023-07-22'),
('nathan_clark', 'Clark', 'nathan_clark', 'nathanclark@example.com', 'hashed_password_17', '2023-11-14'),
('isabella_wright', 'Wright', 'isabella_wright', 'isabellawright@example.com', 'hashed_password_18', '2023-10-13'),
('joseph_scott', 'Scott', 'joseph_scott', 'josephscott@example.com', 'hashed_password_19', '2023-09-09'),
('michael_adams', 'Adams', 'michael_adams', 'michaeladams@example.com', 'hashed_password_20', '2023-11-05'),
('charlotte_martinez', 'Martinez', 'charlotte_martinez', 'charlottemartinez@example.com', 'hashed_password_21', '2023-12-07'),
('william_hernandez', 'Hernandez', 'william_hernandez', 'williamhernandez@example.com', 'hashed_password_22', '2023-09-17'),
('hannah_young', 'Young', 'hannah_young', 'hannahyoung@example.com', 'hashed_password_23', '2023-11-28'),
('james_king', 'King', 'james_king', 'jamesking@example.com', 'hashed_password_24', '2023-10-19'),
('sophia_russell', 'Russell', 'sophia_russell', 'sophiarussell@example.com', 'hashed_password_25', '2023-08-30'),
('liam_green', 'Green', 'liam_green', 'liamgreen@example.com', 'hashed_password_26', '2023-12-02'),
('avery_hall', 'Hall', 'avery_hall', 'averyhall@example.com', 'hashed_password_27', '2023-11-23'),
('mason_lee', 'Lee', 'mason_lee', 'masonlee@example.com', 'hashed_password_28', '2023-10-22'),
('ella_roy', 'Roy', 'ella_roy', 'ellaroy@example.com', 'hashed_password_29', '2023-09-15'),
('grace_walker', 'Walker', 'grace_walker', 'gracewalker@example.com', 'hashed_password_30', '2023-08-25');

insert into comments (message, user_id, language_id, production_id) values
('Great show, I loved it!', 1, 1, 1),  -- John Doe, English, Frasier
('Exciting movie with great plot!', 2, 1, 2),  -- Jane Smith, English, Teen Wolf: The Movie
('A wonderful tribute!', 3, 1, 3),  -- Alice Johnson, English, The Price Is Right
('Nostalgic and fun!', 4, 1, 4),  -- Michael Brown, English, Mighty Morphin Power Rangers
('Pamela’s story is so touching!', 5, 1, 5),  -- Susan White, English, Pamela, A Love Story
('Zoey’s adventure was amazing!', 6, 1, 6),  -- David Wilson, English, Zoey 102
('Scavengers Reign is intriguing!', 7, 1, 7),  -- Emma Jones, English, Scavengers Reign
('Unicorn Academy is magical!', 8, 1, 8),  -- Jacob Miller, English, Unicorn Academy
('Beacon 23 is thrilling!', 9, 1, 9),  -- Olivia Davis, English, Beacon 23
('The Curse was unexpected!', 10, 1, 10),  -- Daniel Martin, English, The Curse
('Goosebumps gave me chills!', 11, 1, 11),  -- Mary Garcia, English, Goosebumps
('Blue Eye Samurai is breathtaking!', 12, 1, 12),  -- Ethan Rodriquez, English, Blue Eye Samurai
('Captain Laserhawk had great action!', 13, 1, 13),  -- Lucas Lopez, English, Captain Laserhawk
('Percy Jackson is magical!', 14, 1, 14),  -- Mia Taylor, English, Percy Jackson
('King Charles is regal!', 15, 1, 15),  -- Benjamin Lee, English, King Charles
('Monarch is a monster hit!', 16, 1, 16),  -- Chloe Harris, English, Monarch
('The Heroic Quest was a great adventure!', 17, 1, 17),  -- Nathan Clark, English, The Heroic Quest
('Office Race is hilarious!', 18, 1, 18),  -- Isabella Wright, English, Office Race
('Lego Jurassic Park was entertaining!', 19, 1, 19),  -- Joseph Scott, English, Lego Jurassic Park
('South Park was wild!', 20, 1, 20),  -- Michael Adams, English, South Park
('The plot of Frasier is amazing!', 21, 1, 1),  -- Charlotte Martinez, English, Frasier
('The movie was incredible!', 22, 1, 2),  -- William Hernandez, English, Teen Wolf: The Movie
('Amazing special effects in this one!', 23, 1, 3),  -- Hannah Young, English, The Price Is Right
('Power Rangers will always be my favorite!', 24, 1, 4),  -- James King, English, Mighty Morphin Power Rangers
('Pamela’s life is so inspiring!', 25, 1, 5),  -- Sophia Russell, English, Pamela, A Love Story
('Zoey’s journey is incredible!', 26, 1, 6),  -- Liam Green, English, Zoey 102
('Scavengers Reign is a masterpiece!', 27, 1, 7),  -- Avery Hall, English, Scavengers Reign
('Unicorn Academy is full of charm!', 28, 1, 8),  -- Mason Lee, English, Unicorn Academy
('Beacon 23 kept me on the edge of my seat!', 29, 1, 9),  -- Ella Roy, English, Beacon 23
('I couldn’t stop watching The Curse!', 30, 1, 10);  -- Grace Walker, English, The Curse

-- Revenue Tablosu
insert into revenues (production_id, amount, source) values
(1, 500000.00, 'Box Office'),
(2, 750000.00, 'Streaming'),
(3, 1000000.00, 'Syndication'),
(4, 450000.00, 'DVD Sales'),
(5, 800000.00, 'Box Office'),
(6, 620000.00, 'Streaming'),
(7, 300000.00, 'Merchandising'),
(8, 250000.00, 'Streaming'),
(9, 400000.00, 'Box Office'),
(10, 550000.00, 'Streaming'),
(11, 700000.00, 'Syndication'),
(12, 900000.00, 'Box Office'),
(13, 500000.00, 'DVD Sales'),
(14, 1200000.00, 'Box Office'),
(15, 450000.00, 'Streaming'),
(16, 300000.00, 'Merchandising'),
(17, 200000.00, 'Box Office'),
(18, 100000.00, 'Syndication'),
(19, 350000.00, 'Streaming'),
(20, 600000.00, 'Box Office');

insert into imdb_scores (score, votes_count, production_id) values
(8.5, 150000, 1),  -- Frasier
(6.9, 80000, 2),  -- Teen Wolf: The Movie
(7.2, 120000, 3),  -- The Price Is Right: A Tribute to Bob Barker
(7.8, 95000, 4),  -- Mighty Morphin Power Rangers: Once & Always
(7.1, 110000, 5),  -- Pamela, A Love Story
(6.7, 70000, 6),  -- Zoey 102
(7.5, 85000, 7),  -- Scavengers Reign
(7.0, 65000, 8),  -- Unicorn Academy
(8.0, 105000, 9),  -- Beacon 23
(6.8, 78000, 10),  -- The Curse
(7.4, 92000, 11),  -- Goosebumps
(8.2, 130000, 12),  -- Blue Eye Samurai
(7.6, 80000, 13),  -- Captain Laserhawk: A Blood Dragon Remix
(8.0, 90000, 14),  -- Percy Jackson and the Olympians
(7.3, 75000, 15),  -- King Charles
(7.7, 87000, 16),  -- Monarch: Legacy of Monsters
(7.5, 92000, 17),  -- The Heroic Quest of the Valiant Prince Ivandoe
(6.9, 68000, 18),  -- Office Race
(7.2, 85000, 19),  -- Lego Jurassic Park: The Unofficial Retelling
(7.9, 105000, 20);  -- South Park: Joining the Panderverse


insert into jobs (name) values
('Producer'),
('Editor'),
('Cinematographer'),
('Sound Engineer'),
('Production Designer'),
('Composer'),
('Visual Effects Supervisor'),
('Makeup Artist'),
('Costume Designer'),
('Script Supervisor'),
('Choreographer'),
('Gaffer'),
('Key Grip'),
('Best Boy Electric'),
('Best Boy Grip'),
('Boom Operator'),
('Set Dresser'),
('Hair Stylist'),
('Foley Artist'),
('Location Manager');


insert into tech_crews (production_id, person_id, job_id) values
(1, 1, 1),   -- Frasier, Producer: David Lee
(1, 2, 2),   -- Frasier, Editor: Leslie Jones
(1, 3, 3),   -- Frasier, Cinematographer: John Smith
(1, 4, 4),   -- Frasier, Sound Engineer: Tom Green
(1, 5, 5),   -- Frasier, Production Designer: Mary Johnson
(1, 6, 6),   -- Frasier, Composer: William Turner
(1, 7, 7),   -- Frasier, Visual Effects Supervisor: Alice Walker
(1, 8, 8),   -- Frasier, Makeup Artist: Jessica Brown
(1, 9, 9),   -- Frasier, Costume Designer: Ethan Davis
(2, 10, 1),  -- Teen Wolf: The Movie, Producer: Jason Clark
(2, 11, 2),  -- Teen Wolf: The Movie, Editor: Sarah Green
(2, 12, 3),  -- Teen Wolf: The Movie, Cinematographer: Michael Wong
(2, 13, 4),  -- Teen Wolf: The Movie, Sound Engineer: Alice Fisher
(2, 14, 5),  -- Teen Wolf: The Movie, Production Designer: Liam West
(3, 15, 1),  -- The Price Is Right, Producer: Claire Stevens
(3, 16, 2),  -- The Price Is Right, Editor: Olivia Harris
(3, 17, 3),  -- The Price Is Right, Cinematographer: George Miller
(3, 18, 4),  -- The Price Is Right, Sound Engineer: Ethan Carter
(3, 19, 5),  -- The Price Is Right, Production Designer: Caroline Lee
(4, 20, 1),  -- Mighty Morphin Power Rangers, Producer: John Marshall
(4, 21, 2),  -- Mighty Morphin Power Rangers, Editor: Rachel Foster
(4, 22, 3),  -- Mighty Morphin Power Rangers, Cinematographer: Robert Young
(4, 23, 4),  -- Mighty Morphin Power Rangers, Sound Engineer: Michelle Adams
(4, 24, 5),  -- Mighty Morphin Power Rangers, Production Designer: Lucas Scott
(5, 25, 1),  -- Pamela, A Love Story, Producer: Mary Smith
(5, 26, 2),  -- Pamela, A Love Story, Editor: Daniel Brown
(5, 27, 3),  -- Pamela, A Love Story, Cinematographer: Peter Garcia
(5, 28, 4),  -- Pamela, A Love Story, Sound Engineer: Henry Taylor
(5, 29, 5),  -- Pamela, A Love Story, Production Designer: Linda Martinez
(6, 30, 1),  -- Zoey 102, Producer: Angela Walker
(6, 31, 2),  -- Zoey 102, Editor: Benjamin Lee
(6, 32, 3),  -- Zoey 102, Cinematographer: David Harris
(6, 33, 4),  -- Zoey 102, Sound Engineer: George Thompson
(6, 34, 5),  -- Zoey 102, Production Designer: Isabel Scott
(7, 35, 1),  -- Scavengers Reign, Producer: William Turner
(7, 36, 2),  -- Scavengers Reign, Editor: Natalie King
(7, 37, 3),  -- Scavengers Reign, Cinematographer: Steven Wright
(7, 38, 4),  -- Scavengers Reign, Sound Engineer: Olivia Moore
(7, 39, 5),  -- Scavengers Reign, Production Designer: Brian Clark
(8, 40, 1),  -- Unicorn Academy, Producer: Abigail Adams
(8, 41, 2),  -- Unicorn Academy, Editor: Isaac Campbell
(8, 42, 3),  -- Unicorn Academy, Cinematographer: Daniel Thomas
(8, 43, 4),  -- Unicorn Academy, Sound Engineer: Ethan Carter
(8, 44, 5),  -- Unicorn Academy, Production Designer: Chloe Wilson
(9, 45, 1),  -- Beacon 23, Producer: Sophia Moore
(9, 46, 2),  -- Beacon 23, Editor: Logan Perez
(9, 47, 3),  -- Beacon 23, Cinematographer: Aaron White
(9, 48, 4),  -- Beacon 23, Sound Engineer: Vanessa Taylor
(9, 49, 5),  -- Beacon 23, Production Designer: Julian Martin
(10, 50, 1), -- The Curse, Producer: Laura Harris
(10, 51, 2), -- The Curse, Editor: Olivia Wilson
(10, 52, 3), -- The Curse, Cinematographer: Noah Lewis
(10, 53, 4), -- The Curse, Sound Engineer: Emma Clark
(10, 54, 5), -- The Curse, Production Designer: Ryan Scott
(11, 55, 1), -- Goosebumps, Producer: Emily James
(11, 56, 2), -- Goosebumps, Editor: Liam Walker
(11, 57, 3), -- Goosebumps, Cinematographer: Aiden Carter
(11, 58, 4), -- Goosebumps, Sound Engineer: Evelyn Garcia
(11, 59, 5), -- Goosebumps, Production Designer: Hannah Adams
(12, 60, 1), -- Blue Eye Samurai, Producer: Max Smith
(12, 61, 2), -- Blue Eye Samurai, Editor: Katie Mitchell
(12, 62, 3), -- Blue Eye Samurai, Cinematographer: Robert Davis
(12, 63, 4), -- Blue Eye Samurai, Sound Engineer: Rachel Moore
(12, 64, 5), -- Blue Eye Samurai, Production Designer: Joshua Lee
(13, 65, 1), -- Captain Laserhawk, Producer: Sarah Johnson
(13, 66, 2), -- Captain Laserhawk, Editor: Marcus White
(13, 67, 3), -- Captain Laserhawk, Cinematographer: Maya Johnson
(13, 68, 4), -- Captain Laserhawk, Sound Engineer: Naomi Scott
(13, 69, 5), -- Captain Laserhawk, Production Designer: Andrew Green
(14, 70, 1), -- Percy Jackson, Producer: James Taylor
(14, 71, 2), -- Percy Jackson, Editor: Grace Martinez
(14, 72, 3), -- Percy Jackson, Cinematographer: Nathan Lee
(14, 73, 4), -- Percy Jackson, Sound Engineer: Emma Scott
(14, 74, 5), -- Percy Jackson, Production Designer: Oliver Perez
(15, 75, 1), -- King Charles, Producer: Daniel Williams
(15, 76, 2), -- King Charles, Editor: Victoria Green
(15, 77, 3), -- King Charles, Cinematographer: Jacob Evans
(15, 78, 4), -- King Charles, Sound Engineer: Emma Brown
(15, 79, 5), -- King Charles, Production Designer: Mason Clark
(16, 80, 1), -- Monarch: Legacy of Monsters, Producer: Samuel Lee
(16, 81, 2), -- Monarch: Legacy of Monsters, Editor: Noah Harris
(16, 82, 3), -- Monarch: Legacy of Monsters, Cinematographer: Sophie White
(16, 83, 4), -- Monarch: Legacy of Monsters, Sound Engineer: Isaac Moore
(16, 84, 5), -- Monarch: Legacy of Monsters, Production Designer: Grace Evans
(17, 85, 1), -- The Acolyte, Producer: James Taylor
(17, 86, 2), -- The Acolyte, Editor: Benjamin Carter
(17, 87, 3), -- The Acolyte, Cinematographer: Lily Scott
(17, 88, 4), -- The Acolyte, Sound Engineer: Sophia Brown
(17, 89, 5), -- The Acolyte, Production Designer: Noah Green
(18, 90, 1), -- Loki Season 2, Producer: Olivia Martin
(18, 91, 2), -- Loki Season 2, Editor: Aiden White
(18, 92, 3), -- Loki Season 2, Cinematographer: Lily Harris
(18, 93, 4), -- Loki Season 2, Sound Engineer: Benjamin Lee
(18, 94, 5), -- Loki Season 2, Production Designer: Daniel Moore
(19, 95, 1), -- Ahsoka, Producer: Jonathan Walker
(19, 96, 2), -- Ahsoka, Editor: Isabella Perez
(19, 97, 3), -- Ahsoka, Cinematographer: Lucas Green
(19, 98, 4), -- Ahsoka, Sound Engineer: Sophia Scott
(19, 99, 5), -- Ahsoka, Production Designer: Olivia Brown
(20, 100, 1),-- The Mandalorian, Producer: Timothy White
(20, 100, 1),  -- The Mandalorian, Producer: Timothy White
(20, 101, 2),  -- The Mandalorian, Editor: Jennifer Clark
(20, 102, 3),  -- The Mandalorian, Cinematographer: David Harris
(20, 103, 4),  -- The Mandalorian, Sound Engineer: Nicholas Brown
(20, 104, 5),  -- The Mandalorian, Production Designer: Sarah Green
(20, 105, 6),  -- The Mandalorian, Composer: Michael Turner
(20, 106, 7),  -- The Mandalorian, Visual Effects Supervisor: Emily Davis
(20, 107, 8),  -- The Mandalorian, Makeup Artist: Grace Martin
(20, 108, 9),  -- The Mandalorian, Costume Designer: Ethan Walker
(20, 109, 10), -- The Mandalorian, Art Director: Lily Young
(20, 110, 11), -- The Mandalorian, Lighting Designer: Samuel Lee
(20, 111, 12), -- The Mandalorian, Grip: Olivia Johnson
(20, 112, 13), -- The Mandalorian, Sound Mixer: Jason Scott
(20, 113, 14), -- The Mandalorian, Assistant Editor: Lauren Moore
(20, 114, 15), -- The Mandalorian, Camera Assistant: Michael Allen
(20, 115, 16), -- The Mandalorian, Post-Production Supervisor: Chloe White
(20, 116, 17), -- The Mandalorian, Location Manager: Ryan Carter
(20, 117, 18), -- The Mandalorian, Stunt Coordinator: Benjamin Lee
(20, 118, 19), -- The Mandalorian, Dialogue Editor: Victoria Scott
(20, 119, 20); -- The Mandalorian, Visual Effects Artist: Isaac Johnson



