-- Person Tablosu
INSERT INTO persons (person_name, person_surname, birth_country, birth_date) VALUES
('Kelsey', 'Grammer', 'USA', '1955-02-21'),  -- Frasier (Actor/Director)
('Matt', 'Damon', 'USA', '1970-10-08'),      -- Teen Wolf: The Movie (Actor)
('Bob', 'Barker', 'USA', '1923-12-12'),      -- The Price Is Right: A Tribute to Bob Barker (Actor)
('David', 'Yost', 'USA', '1969-01-07'),      -- Mighty Morphin Power Rangers (Actor)
('Pamela', 'Anderson', 'Canada', '1967-07-01'), -- Pamela, A Love Story (Actor)
('Jamie', 'Tartt', 'USA', '1987-12-20'),     -- Zoey 102 (Actor)
('Isaiah', 'Mustafa', 'USA', '1974-02-11'),  -- Scavengers Reign (Actor)
('Emma', 'Roberts', 'USA', '1991-02-10'),    -- Unicorn Academy (Actor)
('Lake', 'Bell', 'USA', '1979-03-24'),       -- Beacon 23 (Actor)
('Timothy', 'Olyphant', 'USA', '1968-05-20'), -- The Curse (Actor)
('Ben', 'Robson', 'USA', '1984-02-04'),      -- Goosebumps (Actor)
('Maya', 'Hawke', 'USA', '1998-07-08'),      -- Blue Eye Samurai (Actor)
('Stephen', 'Amell', 'Canada', '1981-05-08'), -- Captain Laserhawk (Actor)
('Walker', 'Scobell', 'USA', '2009-01-06'),  -- Percy Jackson and the Olympians (Actor)
('Hugh', 'Grant', 'UK', '1960-09-09'),       -- King Charles (Actor)
('John', 'C. Reilly', 'USA', '1965-05-24'),  -- Monarch: Legacy of Monsters (Actor)
('Keith', 'David', 'USA', '1956-06-04'),     -- The Heroic Quest of the Valiant Prince Ivandoe (Actor)
('Tom', 'Hanks', 'USA', '1956-07-09'),       -- Office Race (Actor)
('Bryce', 'Dallas Howard', 'USA', '1981-03-02'), -- Lego Jurassic Park (Actor)
('Matt', 'Stone', 'USA', '1971-05-26');       -- South Park: Joining the Panderverse (Actor)


-- Production Tablosu
INSERT INTO productions (original_title, production_country, production_name, release_date, runtime) VALUES
('Frasier', 'USA', 'Frasier', '2023-10-11', 30),
('Teen Wolf: The Movie', 'USA', 'Teen Wolf: The Movie', '2023-01-26', 90),
('The Price Is Right: A Tribute to Bob Barker', 'USA', 'The Price Is Right', '2023-08-31', 120),
('Mighty Morphin Power Rangers: Once & Always', 'USA', 'Mighty Morphin Power Rangers', '2023-04-19', 55),
('Pamela, A Love Story', 'USA', 'Pamela, A Love Story', '2023-01-31', 100),
('Zoey 102', 'USA', 'Zoey 102', '2023-07-27', 80),
('Scavengers Reign', 'USA', 'Scavengers Reign', '2023-10-19', 40),
('Unicorn Academy', 'USA', 'Unicorn Academy', '2023-11-02', 25),
('Beacon 23', 'USA', 'Beacon 23', '2023-11-12', 50),
('The Curse', 'USA', 'The Curse', '2023-11-02', 60),
('Goosebumps', 'USA', 'Goosebumps', '2023-10-13', 45),
('Blue Eye Samurai', 'USA', 'Blue Eye Samurai', '2023-11-03', 60),
('Captain Laserhawk: A Blood Dragon Remix', 'USA', 'Captain Laserhawk', '2023-10-19', 40),
('Percy Jackson and the Olympians', 'USA', 'Percy Jackson', '2023-12-19', 50),
('King Charles', 'USA', 'King Charles', '2023-11-29', 90),
('Monarch: Legacy of Monsters', 'USA', 'Monarch: Legacy of Monsters', '2023-11-17', 45),
('The Heroic Quest of the Valiant Prince Ivandoe', 'USA', 'The Heroic Quest of the Valiant Prince Ivandoe', '2023-11-11', 25),
('Office Race', 'USA', 'Office Race', '2023-09-04', 30),
('Lego Jurassic Park: The Unofficial Retelling', 'USA', 'Lego Jurassic Park', '2023-10-10', 50),
('South Park: Joining the Panderverse', 'USA', 'South Park', '2023-10-27', 60);


-- User Tablosu
INSERT INTO users (user_name, email, password, created_time) VALUES
('john_doe', 'johndoe@example.com', 'hashed_password_1', '2023-11-22'),
('jane_smith', 'janesmith@example.com', 'hashed_password_2', '2023-12-01'),
('alice_johnson', 'alicejohnson@example.com', 'hashed_password_3', '2023-11-15'),
('michael_brown', 'michaelbrown@example.com', 'hashed_password_4', '2023-11-20'),
('susan_white', 'susanwhite@example.com', 'hashed_password_5', '2023-10-11'),
('david_wilson', 'davidwilson@example.com', 'hashed_password_6', '2023-09-30'),
('emma_jones', 'emmajones@example.com', 'hashed_password_7', '2023-12-05'),
('jacob_miller', 'jacobmiller@example.com', 'hashed_password_8', '2023-10-01'),
('olivia_davis', 'oliviadavis@example.com', 'hashed_password_9', '2023-09-25'),
('daniel_martin', 'danielmartin@example.com', 'hashed_password_10', '2023-11-08'),
('mary_garcia', 'marygarcia@example.com', 'hashed_password_11', '2023-08-18'),
('ethan_rodriquez', 'ethanrodriquez@example.com', 'hashed_password_12', '2023-12-10'),
('lucas_lopez', 'lucaslopez@example.com', 'hashed_password_13', '2023-11-12'),
('mia_taylor', 'miataylor@example.com', 'hashed_password_14', '2023-09-10'),
('benjamin_lee', 'benjaminlee@example.com', 'hashed_password_15', '2023-11-18'),
('chloe_harris', 'chloeharris@example.com', 'hashed_password_16', '2023-07-22'),
('nathan_clark', 'nathanclark@example.com', 'hashed_password_17', '2023-11-14'),
('isabella_wright', 'isabellawright@example.com', 'hashed_password_18', '2023-10-13'),
('joseph_scott', 'josephscott@example.com', 'hashed_password_19', '2023-09-09'),
('michael_adams', 'michaeladams@example.com', 'hashed_password_20', '2023-11-05'),
('charlotte_martinez', 'charlottemartinez@example.com', 'hashed_password_21', '2023-12-07'),
('william_hernandez', 'williamhernandez@example.com', 'hashed_password_22', '2023-09-17'),
('hannah_young', 'hannahyoung@example.com', 'hashed_password_23', '2023-11-28'),
('james_king', 'jamesking@example.com', 'hashed_password_24', '2023-10-19'),
('sophia_russell', 'sophiarussell@example.com', 'hashed_password_25', '2023-08-30'),
('liam_green', 'liamgreen@example.com', 'hashed_password_26', '2023-12-02'),
('avery_hall', 'averyhall@example.com', 'hashed_password_27', '2023-11-23'),
('mason_lee', 'masonlee@example.com', 'hashed_password_28', '2023-10-22'),
('ella_roy', 'ellaroy@example.com', 'hashed_password_29', '2023-09-15'),
('grace_walker', 'gracewalker@example.com', 'hashed_password_30', '2023-08-25');

-- Rating Tablosu
INSERT INTO ratings (user_rating, user_comment, user_rating_date, user_id, production_id) VALUES
(9.5, 'Great movie!', '2023-11-22', 1, 1),  -- User 1 rated Movie A
(6.8, 'Could be better', '2023-12-01', 2, 2),  -- User 2 rated Movie B
(8.2, 'Loved the ending!', '2023-11-15', 3, 3),  -- User 3 rated Show C
(7.9, 'Interesting but slow', '2023-11-19', 4, 4),  -- User 4 rated TV Series D
(9.0, 'Amazing performance!', '2023-11-25', 5, 5),  -- User 5 rated Documentary E
(8.5, 'Good but predictable', '2023-12-03', 6, 6),  -- User 6 rated Movie F
(7.0, 'Could be improved', '2023-11-30', 7, 7),  -- User 7 rated TV Series G
(8.7, 'Great plot twist!', '2023-12-10', 8, 8),  -- User 8 rated Documentary H
(9.1, 'A must-watch!', '2023-11-17', 9, 9),  -- User 9 rated Movie I
(6.5, 'Too long and boring', '2023-11-20', 10, 10),  -- User 10 rated TV Series J
(7.8, 'Entertaining but too many cliches', '2023-11-28', 11, 11),  -- User 11 rated Show K
(8.3, 'Captivating from start to finish', '2023-12-02', 12, 12),  -- User 12 rated Movie L
(9.4, 'Incredible acting!', '2023-11-21', 13, 13),  -- User 13 rated Movie M
(8.0, 'A bit slow in the middle', '2023-11-26', 14, 14),  -- User 14 rated Show N
(7.2, 'Good, but needs more character development', '2023-12-05', 15, 15),  -- User 15 rated Movie O
(8.8, 'Beautiful visuals', '2023-11-23', 16, 16),  -- User 16 rated Documentary P
(7.5, 'Nice storyline, could use more depth', '2023-12-04', 17, 17),  -- User 17 rated TV Series Q
(9.0, 'A masterpiece', '2023-12-06', 18, 18),  -- User 18 rated Movie R
(8.1, 'Loved the characters!', '2023-11-18', 19, 19),  -- User 19 rated Show S
(6.9, 'Not as good as the previous one', '2023-12-09', 20, 20);  -- User 20 rated Movie T


-- Crew Tablosu
INSERT INTO crews (role, person_id, production_id) VALUES
('Director', 1, 1),  -- John Doe as Director for Movie A
('Actor', 2, 1),  -- Jane Smith as Actor for Movie A
('Producer', 3, 1),  -- Alice Johnson as Producer for Movie A
('Director', 4, 2),  -- Michael Brown as Director for Movie B
('Actor', 5, 2),  -- Susan White as Actor for Movie B
('Producer', 6, 2),  -- David Wilson as Producer for Movie B
('Director', 7, 3),  -- Emma Jones as Director for Show C
('Actor', 8, 3),  -- Jacob Miller as Actor for Show C
('Producer', 9, 3),  -- Olivia Davis as Producer for Show C
('Director', 10, 4),  -- Daniel Martin as Director for TV Series D
('Actor', 11, 4),  -- Mary Garcia as Actor for TV Series D
('Producer', 12, 4),  -- Ethan Rodriquez as Producer for TV Series D
('Director', 13, 5),  -- Lucas Lopez as Director for Documentary E
('Actor', 14, 5),  -- Mia Taylor as Actor for Documentary E
('Producer', 15, 5),  -- Benjamin Lee as Producer for Documentary E
('Director', 16, 6),  -- Chloe Harris as Director for Movie F
('Actor', 17, 6),  -- Nathan Clark as Actor for Movie F
('Producer', 18, 6),  -- Isabella Wright as Producer for Movie F
('Director', 19, 7),  -- Joseph Scott as Director for TV Series G
('Actor', 20, 7);  -- Michael Adams as Actor for TV Series G


-- Category Tablosu
INSERT INTO categories(name) VALUES
('Drama'),
('Action'),
('Comedy'),
('Horror'),
('Thriller'),
('Romance'),
('Sci-Fi'),
('Fantasy'),
('Documentary'),
('Animation'),
('Crime'),
('Adventure'),
('Mystery'),
('Biography'),
('History'),
('Family'),
('Music'),
('Musical'),
('War'),
('Western');


-- Production_Category_Mapping Tablosu
INSERT INTO production_categories (category_id, production_id) VALUES
(1, 1),  -- Drama for Movie A
(2, 2),  -- Action for Movie B
(3, 3),  -- Comedy for Show C
(1, 4),  -- Drama for TV Series D
(5, 5),  -- Horror for Documentary E
(2, 6),  -- Action for Movie F
(7, 7),  -- Sci-Fi for TV Series G
(4, 8),  -- Thriller for Documentary H
(6, 9),  -- Romance for Movie I
(10, 10), -- Animation for TV Series J
(11, 11), -- Crime for Show K
(1, 12),  -- Drama for Movie L
(14, 13), -- History for Movie M
(3, 14),  -- Comedy for TV Series N
(13, 15), -- Mystery for Documentary O
(12, 16), -- Adventure for Movie P
(17, 17), -- Music for TV Series Q
(18, 18), -- Musical for Movie R
(16, 19), -- Family for Show S
(15, 20); -- War for Movie T


-- Revenue Tablosu
INSERT INTO revenues (production_id, revenue_amount, revenue_source) VALUES
(1, 100000000.00, 'BOX_OFFICE'),  -- Movie A, Box Office Earnings (fictional data)
(2, 50000000.00, 'STREAMING'),  -- Movie B, Streaming Revenue (fictional data)
(3, 2000000.00, 'MERCHANDISE'),  -- Show C, Merchandise Sales (fictional data)
(4, 3000000.00, 'BOX_OFFICE'),  -- TV Series D, Box Office Earnings (fictional data)
(5, 1500000.00, 'STREAMING'),  -- Documentary E, Streaming Revenue (fictional data)
(6, 120000000.00, 'BOX_OFFICE'),  -- Movie F, Box Office Earnings (fictional data)
(7, 45000000.00, 'STREAMING'),  -- TV Series G, Streaming Revenue (fictional data)
(8, 5000000.00, 'MERCHANDISE'),  -- Documentary H, Merchandise Sales (fictional data)
(9, 25000000.00, 'STREAMING'),  -- Movie I, Streaming Revenue (fictional data)
(10, 8000000.00, 'BOX_OFFICE'),  -- TV Series J, Box Office Earnings (fictional data)
(11, 10000000.00, 'MERCHANDISE'),  -- Show K, Merchandise Sales (fictional data)
(12, 40000000.00, 'STREAMING'),  -- Movie L, Streaming Revenue (fictional data)
(13, 5000000.00, 'MERCHANDISE'),  -- Movie M, Merchandise Sales (fictional data)
(14, 7000000.00, 'STREAMING'),  -- TV Series N, Streaming Revenue (fictional data)
(15, 3000000.00, 'MERCHANDISE'),  -- Documentary O, Merchandise Sales (fictional data)
(16, 100000000.00, 'BOX_OFFICE'),  -- Movie P, Box Office Earnings (fictional data)
(17, 25000000.00, 'STREAMING'),  -- TV Series Q, Streaming Revenue (fictional data)
(18, 15000000.00, 'BOX_OFFICE'),  -- Movie R, Box Office Earnings (fictional data)
(19, 7000000.00, 'MERCHANDISE'),  -- Show S, Merchandise Sales (fictional data)
(20, 60000000.00, 'BOX_OFFICE');  -- Movie T, Box Office Earnings (fictional data)
