-- Person Tablosu
INSERT INTO person (person_name, person_surname, birth_country, birth_date) VALUES
('John', 'Doe', 'USA', '1980-05-15'),
('Jane', 'Smith', 'UK', '1990-07-20'),
('Alice', 'Johnson', 'Canada', '1985-02-25');

-- Production Tablosu
INSERT INTO production (original_title, production_country, production_name, release_date, runtime) VALUES
('Movie A', 'USA', 'Production A', '2020-10-10', 120),
('Movie B', 'UK', 'Production B', '2021-05-05', 90),
('Show C', 'Canada', 'Production C', '2019-03-15', 60);

-- Rating Tablosu
INSERT INTO rating (user_rating, user_votes_count, production_id) VALUES
(8.5, 1500, 1),
(7.3, 1200, 2),
(9.0, 2000, 3);

-- Crew Tablosu
INSERT INTO crew (role, person_id, production_id) VALUES
('Director', 1, 1),
('Actor', 2, 1),
('Producer', 3, 2),
('Director', 1, 3);

-- Category Tablosu
INSERT INTO category(name) VALUES
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
INSERT INTO production_category (category_id, production_id) VALUES
(1, 1),
(2, 2),
(3, 3);

-- Revenue Tablosu
INSERT INTO revenue (production_id, revenue_amount, revenue_source) VALUES
(1, 500000.50, 'BOX_OFFICE'),
(2, 750000.75, 'STREAMING'),
(3, 1250000.25, 'MERCHANDISE');