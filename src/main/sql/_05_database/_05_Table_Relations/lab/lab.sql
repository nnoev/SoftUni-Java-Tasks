-- ===============================================
-- 1. Mountains and Peaks
-- ===============================================

CREATE TABLE mountains (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL
); 
CREATE TABLE peaks(
id int PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(50),
mountain_id INT NOT NULL,
CONSTRAINT fk_mountain_id_peak FOREIGN KEY(mountain_id) REFERENCES mountains(id)
);

-- ===============================================
-- 2. Trip Organization
-- ===============================================

SELECT driver_id, vehicle_type , concat(first_name,' ',last_name)
FROM vehicles
JOIN campers on vehicles.driver_id = campers.id

-- ===============================================
-- 3. SoftUni Hiking
-- ===============================================

SELECT starting_point,end_point,leader_id,concat(first_name,' ',last_name) 
FROM routes
JOIN campers on routes.leader_id = campers.id;

-- ===============================================
-- 4. Delete Mountains
-- ===============================================

CREATE TABLE mountains (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL
);
CREATE TABLE peaks (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    mountain_id INT NOT NULL,
    CONSTRAINT fk_mountain_id_peak FOREIGN KEY (mountain_id)
        REFERENCES mountains (id)
        ON DELETE CASCADE
);
