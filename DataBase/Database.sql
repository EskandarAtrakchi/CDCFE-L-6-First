CREATE TABLE VEHICLES (
    VehicleID Char NOT NULL,
    VehicleName Varchar NOT NULL,
    VehicleCpacity int NOT NULL,
    VehicleColor Varchar NOT NULL,
    VehiclePrice float NOT NULL,
    VehicleCondition Varchar NOT NULL,
    VehicleSize Varchar NOT NULL,
    VehicleYearModel int NOT NULL,
    PRIMARY KEY (VehicleID)
);

INSERT INTO VEHICLES
VALUES 
('201', 'Nissan', 1000, '#FFFFFF', 500000, 'New', 'Big', 2010),
('202', 'Nissan', 1001, '#FFFFFF', 500100, 'New', 'Big', 2011),
('203', 'Hondai', 1002, '#FFFFFF', 500200, 'New', 'Big', 2012),
('204', 'Hondai', 1003, '#FFFFFF' 500300, 'New', 'Big' 2013),
('205', 'Nissan', 1004, '#FFFFFF', 500400, 'New', 'Big',2014),
('206',	'Mercedes', 1005, '#FFFFFF', 500500,'New', 'Big', 2015),
('207',	'Mercedes', 1006, '#FFFFFF', 500600, 'New', 'Big', 2016),
('208',	'Hondai' 1007, '#FFFFFF', 500700, 'New', 'Medium',2017),
('209',	'MAN', 1008, '#FFFFFF', 500800, 'New', 'Small', 2018),
('210',	'Hondai', 1009, '#FF93FA', 500900, 'New', 'Big', 2019);