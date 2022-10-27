# HLD\&LLD

HLD

The database is gonna track the vehicles of a municipality that has over 200 vehicles and record all the cut distances and the amount of fuel that has been spent weekly on each vehicle.



LLD

1. Print the data of the vehicles/workers
2. Modifying data of the vehicles/workers
3. Search for the vehicles/workers
4. Create new vehicles/workers/accounts if vehicles or workers been added to the municipality.
5. Report, make reports about the vehicles/workers
6. Delete vehicles/workers from the database
7. Workers are able to create records that the vehicles need repair
8. Admin can input fuel used per week and KM completed per week&#x20;
9. workers can book time on the vehicles &#x20;
10. account users can view fuel and mileage for each vehicle&#x20;

Who is gonna use the database?

* Admin
* Anyone with an account (Can view the database only)

LLDs fields:

1\) Print the data of the vehicles/workers

* vehicleName&#x20;
* vehicleColor&#x20;
* vehicleId
* workerName
* workerShift
* vehicleFeulCapacity
* vehiclemileage
* vehicleFuelSpent
* weekNumber
* saturdayAv
* sundayAv
* mondayAv
* tuesdayAv
* wednesdayAv
* thursdayAv
* fridayAv

2\) Modifying data of the vehicles/workers

* vehicleColor
* workerShift
* workerName
* vehicleId
* vehcleName
* vehicleFuelCapacity
* vehiclemileage
* vehicleFuelSpent

3\) Search for the vehicles/workers

* vehicleColor
* workerShift
* workerName
* vehicleId
* vehcleName
* vehicleFeulCapacity
* vehiclDictanceCut
* vehicleFuelSpent
* saturdayAv
* sundayAv
* mondayAv
* tuesdayAv
* wednesdayAv
* thursdayAv
* fridayAv

4\) Create new vehicles/workers/accounts if vehicles or workers been added to the municipality.

* vehicleColor
* workerShift
* workerName
* vehicleId
* vehcleName
* vehicleFeulCapacity
* vehiclemileage
* vehicleFuelSpent
* saturdayAv
* sundayAv
* mondayAv
* tuesdayAv
* wednesdayAv
* thursdayAv
* fridayAv

5\) Report, make reports about the vehicles/workers

* vehicleColor
* workerShift
* workerName
* vehicleId
* vehcleName
* vehicleFeulCapacity
* vehiclemileage
* vehicleFuelSpent
* saturdayAv
* sundayAv
* mondayAv
* tuesdayAv
* wednesdayAv
* thursdayAv
* fridayAv
* weekNumber

6\) Delete vehicles/workers from the database

* vehicleColor
* workerShift
* workerName
* vehicleId
* vehcleName
* vehicleFuelCapacity
* vehiclemileage
* vehicleFuelSpent
* saturdayAv
* sundayAv
* mondayAv
* tuesdayAv
* wednesdayAv
* thursdayAv
* fridayAv

7\) Workers are able to create records that the vehicles need repair

* vehicleColor
* workerShift
* workerName
* vehicleId
* vehicleName
* weekNumber

8\) Admin can input fuel used per week and KM completed per week

* vehicleFuelSpent
* weekNumber

9\) workers can book time on the vehicles &#x20;

* saturdayAv
* sundayAv
* mondayAv
* tuesdayAv
* wednesdayAv
* thursdayAv
* fridayAv
* weekNumber

10\) account users can view fuel and mileage for each vehicle&#x20;

* vehicleId
* weekNumber



\----------------------------------------------------------------------------------





* vehicleName&#x20;
* vehicleColor&#x20;
* vehicleId
* workerName
* workerShift
* vehicleFeulCapacity
* vehiclemileage
* vehicleFuelSpent
* weekNumber
* saturdayAv
* sundayAv
* mondayAv
* tuesdayAv
* wednesdayAv
* thursdayAv
* fridayAv
* vehicleColor
* workerShift
* workerName
* vehicleId
* vehcleName
* vehicleFuelCapacity
* vehiclemileage
* vehicleFuelSpent
* vehicleColor
* workerShift
* workerName
* vehicleId
* vehcleName
* vehicleFeulCapacity
* vehiclDictanceCut
* vehicleFuelSpent
* saturdayAv
* sundayAv
* mondayAv
* tuesdayAv
* wednesdayAv
* thursdayAv
* fridayAv
* vehicleColor
* workerShift
* workerName
* vehicleId
* vehcleName
* vehicleFeulCapacity
* vehiclemileage
* vehicleFuelSpent
* saturdayAv
* sundayAv
* mondayAv
* tuesdayAv
* wednesdayAv
* thursdayAv
* fridayAv
* vehicleColor
* workerShift
* workerName
* vehicleId
* vehcleName
* vehicleFeulCapacity
* vehiclemileage
* vehicleFuelSpent
* saturdayAv
* sundayAv
* mondayAv
* tuesdayAv
* wednesdayAv
* thursdayAv
* fridayAv
* weekNumber
* vehicleColor
* workerShift
* workerName
* vehicleId
* vehcleName
* vehicleFuelCapacity
* vehiclemileage
* vehicleFuelSpent
* saturdayAv
* sundayAv
* mondayAv
* tuesdayAv
* wednesdayAv
* thursdayAv
* fridayAv
* vehicleColor
* workerShift
* workerName
* vehicleId
* vehicleName
* weekNumber
* vehicleFuelSpent
* weekNumber
* saturdayAv
* sundayAv
* mondayAv
* tuesdayAv
* wednesdayAv
* thursdayAv
* fridayAv
* weekNumber
* vehicleId
* weekNumber

\-------------------------------------------------------------------------------------

Normalisation&#x20;

1. st Normal Form – Removal of Duplicates

* vehicleName&#x20;
* vehicleColor&#x20;
* workerName&#x20;
* workerShift&#x20;
* vehicleFeulCapacity&#x20;
* vehiclemileage&#x20;
* vehicleFuelSpent&#x20;
* weekNumber&#x20;
* saturdayAv&#x20;
* sundayAv&#x20;
* mondayAv&#x20;
* tuesdayAv&#x20;
* wednesdayAv&#x20;
* thursdayAv&#x20;
* fridayAv&#x20;
* vehicleId
* vehiclDictanceCut

2\. Removal of Partial Dependencies

Vehicles:

* [ ] vehiclDictanceCut&#x20;
* [ ] vehicleColor&#x20;
* [ ] vehicleFeulCapacity&#x20;
* [ ] vehicleFuelSpent&#x20;
* [x] vehicleId&#x20;
* [ ] vehiclemileage&#x20;
* [ ] vehicleName



Workers:

* [x] WorkerID
* [ ] workerName&#x20;
* [ ] workerShift

DaysOfTheWeek:

* [x] WeekNumber
* [ ] fridayAv&#x20;
* [ ] mondayAv&#x20;
* [ ] saturdayAv&#x20;
* [ ] sundayAv&#x20;
* [ ] thursdayAv&#x20;
* [ ] tuesdayAv&#x20;
* [ ] wednesdayAv
