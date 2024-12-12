-- Person Tablosu
INSERT INTO persons (person_name, person_surname, birth_country, birth_date) VALUES
('John', 'Doe', 'USA', '1980-05-15'),
('Jane', 'Smith', 'UK', '1990-07-20'),
('Alice', 'Johnson', 'Canada', '1985-02-25');

-- Production Tablosu
INSERT INTO productions (original_title, production_country, production_name, release_date, runtime) VALUES
('Movie A', 'USA', 'Production A', '2020-10-10', 120),
('Movie B', 'UK', 'Production B', '2021-05-05', 90),
('Show C', 'Canada', 'Production C', '2019-03-15', 60);

-- User Tablosu
INSERT INTO users (user_name, email, password, created_time) VALUES
('john_doe', 'johndoe@example.com', 'hashed_password_1', '2023-11-22'),
('jane_smith', 'janesmith@example.com', 'hashed_password_2', '2023-12-01'),
('alice_johnson', 'alicejohnson@example.com', 'hashed_password_3', '2023-11-15');

-- Rating Tablosu
INSERT INTO ratings (user_rating, user_comment, user_rating_date, user_id, production_id) VALUES
(9.5, 'Great movie!', '2023-11-22', 1, 1),
(6.8, 'Could be better', '2023-12-01', 2, 2),
(8.2, 'Loved the ending!', '2023-11-15', 3, 3);

-- Crew Tablosu
INSERT INTO crews (role, person_id, production_id) VALUES
('Director', 1, 1),
('Actor', 2, 1),
('Producer', 3, 2),
('Director', 1, 3);

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
(1, 1),
(2, 2),
(3, 3);

-- Revenue Tablosu
INSERT INTO revenues (production_id, revenue_amount, revenue_source) VALUES
(1, 500000.50, 'BOX_OFFICE'),
(2, 750000.75, 'STREAMING'),
(3, 1250000.25, 'MERCHANDISE');