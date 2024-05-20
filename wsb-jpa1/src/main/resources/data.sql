-- Inserting addresses
INSERT INTO address (id, address_line1, address_line2, city, postal_code)
VALUES (1, 'xx', 'yy', 'city', '62-030');

INSERT INTO address (id, address_line1, address_line2, city, postal_code)
VALUES (2, 'Main St', 'Suite 1', 'Warsaw', '00-001');

INSERT INTO address (id, address_line1, address_line2, city, postal_code)
VALUES (3, 'Second St', 'Apt 202', 'Krakow', '30-002');

-- Inserting doctors
INSERT INTO doctor (id, doctor_number, email, first_name, last_name, specialization, telephone_number, address_id)
VALUES (1, 'D123', 'doctor1@example.com', 'John', 'Doe', 'CARDIOLOGY', '123456789', 2);

INSERT INTO doctor (id, doctor_number, email, first_name, last_name, specialization, telephone_number, address_id)
VALUES (2, 'D124', 'doctor2@example.com', 'Anna', 'Smith', 'DERMATOLOGY', '123456780', 3);

-- Inserting patients
INSERT INTO patient (id, date_of_birth, email, first_name, last_name, patient_number, telephone_number, address_id, age)
VALUES (1, '1980-01-01', 'patient1@example.com', 'Jane', 'Smith', 'P123', '987654321', 3, 42);

INSERT INTO patient (id, date_of_birth, email, first_name, last_name, patient_number, telephone_number, address_id, age)
VALUES (2, '1990-05-15', 'patient2@example.com', 'Mark', 'Johnson', 'P124', '987654322', 1, 32);

-- Inserting medical treatments
INSERT INTO medical_treatment (id, description, type)
VALUES (1, 'Physical Therapy', 'Therapy');

INSERT INTO medical_treatment (id, description, type)
VALUES (2, 'Chemotherapy', 'Oncology');

-- Inserting visits
INSERT INTO visit (id, description, time, doctor_id, patient_id, medical_treatment_id)
VALUES (1, 'Regular check-up', '2024-05-20 10:00:00', 1, 1, 1);

INSERT INTO visit (id, description, time, doctor_id, patient_id, medical_treatment_id)
VALUES (2, 'Skin check-up', '2024-06-15 14:00:00', 2, 2, 2);
-- Inserting additional visits
INSERT INTO visit (id, description, time, doctor_id, patient_id, medical_treatment_id)
VALUES (3, 'Check-up', '2024-07-01 09:00:00', 1, 1, 1);

INSERT INTO visit (id, description, time, doctor_id, patient_id, medical_treatment_id)
VALUES (4, 'Follow-up', '2024-08-01 10:00:00', 2, 2, 2);

INSERT INTO visit (id, description, time, doctor_id, patient_id, medical_treatment_id)
VALUES (5, 'Consultation', '2024-09-01 11:00:00', 1, 2, 1);
