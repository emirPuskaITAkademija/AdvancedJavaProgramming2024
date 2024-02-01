-- VJEŽBA 
-- Kreirati novi OFFICE u Sarajvu i dodati 2 uposlenika
-- Kanita i Nejra 
-- PARENT: offices
-- CHILD: employees
INSERT INTO offices(office_id, address, city, state)
VALUES (13, 'Paromlinska 1', 'Sarajevo', 'BA');
SELECT last_insert_id();
INSERT INTO employees(employee_id, first_name, last_name, job_title, salary, reports_to, office_id)
VALUES 
(1213433, 'Kanita', 'Berbic', 'Software Developer', 4500, DEFAULT, 13),
(1213434, 'Nejra', 'Kadric', 'Software Developer', 4500, DEFAULT, 13);

