# HLD\&LLD

**Vehicles Database**

&#x20;

&#x20;

**HLD**

&#x20;

My database is a shop selling vehicles to municipalities in cities, the database will be able to track, search, add and view all the available vehicles that are ready to be sold to the municipalities.

&#x20;

**LLD**

&#x20;

1\.     Users can delete the account & Workers can delete vehicles from the database

2\.     Users should be able to update the account

3\.     Users can login to the account

4\.     Users can create an account & Workers can create invoices to the municipalities (Users)

5\.     Credit cards can be added by buyers (Users) & Workers can add more than one Vehicle

6\.     Users can search vehicles according to specifications

7\.     Workers can make reports about the vehicles

8\.     Users can buy vehicles with their card.

9\.     Users & Workers can view vehicles and their specifications

10\.  Workers can input the details of the vehicle.

&#x20;

&#x20;

**Who is going to use the database?**

&#x20;

* Workers
* Anyone who creates an account can:

1\.     Delete their Account

2\.     Update their account

3\.     Log in to their account

4\.     Add credit cards

5\.     Search vehicles according to specifications

6\.     Book vehicles

7\.     Can view vehicles

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

**Data Modelling**

**Fields needed to satisfy each LLD**

&#x20;

1. Users can delete the account & Workers can delete vehicles from the database

&#x20;

\-        UserName

\-        UserPassWord

\-        UserDOB

\-        UserPhoneNumber

\-        VehicleID

\-        VehicleName

\-        VehicleCpacity

\-        VehicleColor

\-        WorkerID

\-        WorkerName

\-        VehiclePrice

\-        VehicleCondition

\-        VehicleSize

\-        VehicleYearModel

&#x20;

1. Users should be able to update the account

&#x20;

\-        UserName

\-        UserPassWord

\-        UserPhoneNumber

\-        UserDOB

\-        UserAddress

\-        UserEriCode

&#x20;

1. Users can login to the account

&#x20;

\-        UserName

\-        UserPassWord

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

1. Users can create an account & Workers can create invoices to the municipalities (Users)

&#x20;

\-        UserName

\-        UserPassWord

\-        UserAddress

\-        UserEirCode

\-        UserPhoneNumber

\-        UserDOB

\-        InvoiceID

\-        VehicleColor

\-        VehicleID

\-        VehicleCapacity

\-        VehicleName

\-        UserEirCode

\-        UserAddress

\-        UserName

\-        UserPhoneNumber

\-        UserDOB

\-        WorkerName

\-        WorkerID

&#x20;

1. Credit cards can be added by buyers (Users) & Workers can add Vehicles to the database

&#x20;

&#x20;

&#x20;

\-        UserName

\-        UserPassWord

\-        UserDOB

\-        UserPhoneNumber

\-        UserCCVNumber

\-        UserCardNumber

\-        UserCardExpirationDate

\-        VehicleID

\-        VehicleName

\-        VehicleColor

\-        VehicleCapacity

\-        WorkerID

\-        WorkerName

\-        VehiclePrice

\-        VehicleCondition

\-        VehicleSize

\-        VehicleYearModel

&#x20;

1. Users can search vehicles according to specifications

&#x20;

\-        VehicleID

\-        VehicleName

\-        VehicleColor

\-        VehicleCapacity

\-        VehiclePrice

\-        VehicleCondition

\-        VehicleSize

\-        VehicleYearModel

&#x20;

1. Workers can make reports about the vehicles

&#x20;

\-        VehicleID

\-        VehicleName

\-        VehicleColor

\-        VehicleCapacity

\-        WorkerName

\-        WorkerID

\-        VehiclePrice

\-        VehicleCondition

\-        VehicleSize

\-        VehicleYearModel

&#x20;

1. Users can book vehicles

&#x20;

\-        VehicleID

\-        VehicleName

\-        VehicleColor

\-        VehicleCapacity

\-        UserName

\-        UserPassWord

\-        UserDOB

\-        UserPhoneNumber

\-        VehiclePrice

\-        VehicleCondition

\-        VehicleSize

\-        VehicleYearModel

&#x20;

&#x20;

1. Users & Workers can view vehicles and their specifications

&#x20;

&#x20;

\-        VehicleID

\-        VehicleName

\-        VehicleColor

\-        VehicleCapacity

\-        VehiclePrice

\-        VehicleCondition

\-        VehicleSize

\-        VehicleYearModel

&#x20;

1. Workers can input the vehicles IDs

&#x20;

\-        VehicleName

\-        VehicleColor

\-        VehicleCapacity

\-        VehiclePrice

\-        VehicleCondition

\-        VehicleSize

\-        VehicleYearModel

\-        WorkerID

\-        WorkerName

&#x20;

\----------------------------------------------------------------------------------

&#x20;

**We need to normalize the following:**

&#x20;****&#x20;

\-        UserName

\-        VehiclePrice

\-        VehicleCondition

\-        VehicleSize

\-        VehicleYearModel

\-        UserPassWord

\-        UserDOB

\-        UserPhoneNumber

\-        VehicleID

\-        VehicleName

\-        VehicleCpacity

\-        VehicleColor

\-        UserName

\-        UserPassWord

\-        UserPhoneNumber

\-        UserDOB

\-        UserAddress

\-        UserEriCode

\-        UserName

\-        UserPassWord

\-        UserName

\-        UserPassWord

\-        UserAddress

\-        UserEirCode

\-        UserPhoneNumber

\-        UserDOB

\-        InvoiceID

\-        VehicleColor

\-        VehicleID

\-        VehicleCapacity

\-        VehicleName

\-        UserEirCode

\-        UserAddress

\-        UserName

\-        UserPhoneNumber

\-        UserDOB

\-        UserName

\-        UserPassWord

\-        UserDOB

\-        UserPhoneNumber

\-        UserCCVNumber

\-        UserCardNumber

\-        UserCardExpirationDate

\-        VehicleID

\-        VehicleName

\-        VehicleColor

\-        VehicleCapacity

\-        VehicleID

\-        VehicleName

\-        VehicleColor

\-        VehicleCapacity

\-        VehicleID

\-        VehicleName

\-        VehicleColor

\-        VehicleCapacity

\-        VehicleID

\-        VehicleName

\-        VehicleColor

\-        VehicleCapacity

\-        UserName

\-        UserPassWord

\-        UserDOB

\-        UserPhoneNumber

\-        VehicleID

\-        VehicleName

\-        VehicleColor

\-        VehicleCapacity

\-        VehicleName

\-        VehicleColor

\-        VehicleCapacity

\-        WorkerID

\-        WorkerName

&#x20;

&#x20;

&#x20;

\-------------------------------------------------------------------------------------

**Normalization**

&#x20;

1. **Normal Form – retaining only unique variables**

&#x20;

\-        UserID

\-        VehicleID

\-        UserName

\-        UserPassWord

\-        UserDOB

\-        UserPhoneNumber

\-        UserAddress

\-        UserEriCode

\-        InvoiceID

\-        UserCCVNumber

\-        UserCardNumber

\-        UserCardExpirationDate

\-        WorkerID

\-        WorkerName

\-        VehicleID

\-        VehicleName

\-        VehicleCpacity

\-        VehicleColor

\-        VehiclePrice

\-        VehicleCondition

\-        VehicleSize

\-        VehicleYearModel

&#x20;

1. &#x20;**Removal of Partial Dependencies. (Ensuring only FULL dependence on the primary key) Separate out the fields into their groups. Only allow groups that have a dependency on the Primary Key**

&#x20;

Invoice:

&#x20;

\-        WorkerID

\-        WorkerName

\-        InvoiceDate

\-        InvoiceID(PK)

&#x20;

&#x20;

Vehicles:

&#x20;

\-        VehicleID(PK)

\-        VehicleName

\-        VehicleCpacity

\-        VehicleColor

\-        VehiclePrice

\-        VehicleCondition

\-        VehicleSize

\-        VehicleYearModel

&#x20;

Users:

&#x20;

\-        UserID(PK)

\-        UserName

\-        UserPassWord

\-        UserDOB

\-        UserPhoneNumber

\-        UserAddress

\-        UserEriCode

\-        UserCCVNumber

\-        UserCardNumber

\-        UserCardExpirationDate

&#x20;

1. **Normal Form – Remove Transitive Dependencies. (Ensure full dependency on the primary key and separation of fields that would require repeating. This will create foreign keys).**

&#x20;****&#x20;

Invoice:

&#x20;

\-        WorkerID

\-        WorkerName

\-        InvoiceID(PK)

\-        InvoiceDate

\-        VehicleID(FK)

\-        UserID(FK)

\-        UserCardNumber(FK)

&#x20;

Vehicles:

&#x20;

\-        VehicleID(PK)

\-        VehicleName

\-        VehicleCpacity

\-        VehicleColor

\-        VehiclePrice

\-        VehicleCondition

\-        VehicleSize

\-        VehicleYearModel

&#x20;

Users:

&#x20;

\-        UserID(PK)

\-        UserName

\-        UserPassWord

\-        UserDOB

\-        UserPhoneNumber

\-        UserAddress

\-        UserEriCode

&#x20;

Card:

&#x20;

\-        UserCCVNumber

\-        UserCardNumber(PK)

\-        UserCardExpirationDate

\-        UserID(FK)

&#x20;

&#x20;****&#x20;

&#x20;

&#x20;

&#x20;

العميل للعديد من الفواتير

فواتير للعديد من بطاقات الائتمان

مركبة لكثير من العملاء

&#x20;

&#x20;****&#x20;

&#x20;****&#x20;

&#x20;****&#x20;

**ERD**

&#x20;****&#x20;

![](file:///C:/Users/escan/AppData/Local/Temp/msohtmlclip1/01/clip\_image001.gif)![Text Box: InvoiceID(PK)
VehicleID(FK)
WorkerID
UserCardNumber(FK)
WorkerName
InvoiceDate
UserID(FK)](file:///C:/Users/escan/AppData/Local/Temp/msohtmlclip1/01/clip\_image002.gif)![](file:///C:/Users/escan/AppData/Local/Temp/msohtmlclip1/01/clip\_image003.gif)![Text Box: VehicleID(PK)
VehicleName
VehicleCpacity
VehicleColor
VehiclePrice
VehicleCondition
VehicleSize
VehicleYearModel](file:///C:/Users/escan/AppData/Local/Temp/msohtmlclip1/01/clip\_image004.gif)

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

\


![Text Box: UserID(PK)
UserPassWord
UserDOB
UserPhoneNumber
UserAddress
UserEriCode
VehicleID(FK)
UserName](file:///C:/Users/escan/AppData/Local/Temp/msohtmlclip1/01/clip\_image008.gif)

![Text Box:  UserCardNumber(PK)
UserCCVNumber
UserCardExpirationDate
UserID(FK)](file:///C:/Users/escan/AppData/Local/Temp/msohtmlclip1/01/clip\_image010.gif)

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

![](file:///C:/Users/escan/AppData/Local/Temp/msohtmlclip1/01/clip\_image011.gif)&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

1. \

2. Table number one for VehicleID(PK)

&#x20;

| <p> </p><p><strong>Field Name</strong></p><p> </p> | **Field Type** | **Field Size** |
| -------------------------------------------------- | -------------- | -------------- |
| <p> </p><p>VehcileID(PK)</p><p> </p>               | Char           | 255            |
| <p> </p><p>VehicleName</p><p> </p>                 | Varchar        | 255            |
| <p> </p><p>VehicleCpacity</p><p> </p>              | int            |                |
| <p> </p><p>VehicleColor</p><p> </p>                | Varchar        | 255            |
| <p> </p><p>VehiclePrice</p><p> </p>                | float          |                |
| <p> </p><p>VehicleCondition</p><p> </p>            | Varchar        | 255            |
| <p> </p><p>VehicleSize</p><p> </p>                 | Varchar        | 255            |
| <p> </p><p>VehicleYearModel</p><p> </p>            | int            |                |

&#x20;

1. Table number two for UserID(PK)

&#x20;

| <p> </p><p><strong>Field Name</strong></p><p> </p> | **Field Type** | **Field Size** |
| -------------------------------------------------- | -------------- | -------------- |
| <p> </p><p>UserID(PK)</p><p> </p>                  | Char           | 255            |
| <p> </p><p>UserPassWord</p><p> </p>                | Varchar        | 255            |
| <p> </p><p>UserDOB</p><p> </p>                     | Date           |                |
| <p> </p><p>UserPhoneNumber</p><p> </p>             | int            |                |
| <p> </p><p>UserAddress</p><p> </p>                 | Varchar        | 255            |
| <p> </p><p>UserEriCode</p><p> </p>                 | Varchar        | 255            |
| <p> </p><p>VehicleID(FK)</p><p> </p>               | Char           | 255            |

&#x20;

&#x20;

1. Table number three for InvoiceID(PK)

&#x20;

| <p> </p><p><strong>Field Name</strong></p><p> </p> | **Field Type** | **Field Size** |
| -------------------------------------------------- | -------------- | -------------- |
| <p> </p><p>InvoiceID(PK)</p><p> </p>               | Char           | 255            |
| <p> </p><p>UserID(FK)</p><p> </p>                  | Char           | 255            |
| <p> </p><p>VehicleID(FK)</p><p> </p>               | Char           | 255            |
| <p> </p><p>UserCardNumber(FK)</p><p> </p>          | Char           | 255            |
| <p> </p><p>WorkerID</p><p> </p>                    | int            |                |
| <p> </p><p>WorkerName</p><p> </p>                  | Varchar        | 255            |
| <p> </p><p>InvoiceDate</p><p> </p>                 | Date           |                |

&#x20;

&#x20;

1. Table number four for UserCardNumber(PK)

&#x20;

| <p> </p><p><strong>Field Name</strong></p><p> </p> | **Field Type** | **Field Size** |
| -------------------------------------------------- | -------------- | -------------- |
| <p> </p><p>UserCardNumber(PK)</p><p> </p>          | Char           | 255            |
| <p> </p><p>UserCCVNumber</p><p> </p>               | int            |                |
| <p> </p><p>UserCardExpirationDate</p><p> </p>      | Date           |                |
| <p> </p><p>UserID(FK)</p><p> </p>                  | Char           | 255            |

&#x20;****&#x20;

&#x20;****&#x20;

&#x20;****&#x20;

&#x20;****&#x20;

&#x20;****&#x20;

&#x20;****&#x20;

&#x20;****&#x20;

**Data Dictionary**

| **WorkerID** | **WorkerName** | **InvoiceID(PK)** | **InvoiceDate** | **VehicleID(FK)** | **UserID(FK)** | **UserCardNumber(FK)** |
| ------------ | -------------- | ----------------- | --------------- | ----------------- | -------------- | ---------------------- |
| **1**        | **Alex**       | **101**           | **2021-1-1**    | **201**           | **301**        | **987654321**          |
| **2**        | **Josh**       | **102**           | **2021-2-2**    | **202**           | **302**        | **123456789**          |
| **3**        | **Yonas**      | **103**           | **2021-3-3**    | **203**           | **303**        | **728364238**          |
| **4**        | **Ann**        | **104**           | **2021-4-4**    | **204**           | **304**        | **141242455**          |
| **5**        | **Eskandar**   | **105**           | **2021-5-5**    | **205**           | **305**        | **242465375**          |
| **6**        | **Garvin**     | **106**           | **2021-6-6**    | **206**           | **306**        | **357342151**          |
| **7**        | **Pat**        | **107**           | **2021-7-7**    | **207**           | **307**        | **845876554**          |
| **8**        | **Joshua**     | **108**           | **2021-8-8**    | **208**           | **308**        | **124162790**          |
| **9**        | **Ali**        | **109**           | **2021-9-9**    | **209**           | **309**        | **987087655**          |
| **10**       | **Feby**       | **110**           | **2021-10-10**  | **210**           | **310**        | **235375978**          |

&#x20;

&#x20;****&#x20;

| **UserCardNumber(PK)** | **UserCCVNumber** | **UserCardExpirationDate** | **UserID(FK)** |
| ---------------------- | ----------------- | -------------------------- | -------------- |
| **987654321**          | **111**           | **2025-1-1**               | **301**        |
| **123456789**          | **222**           | **2025-2-2**               | **302**        |
| **728364238**          | **333**           | **2025-3-3**               | **303**        |
| **141242455**          | **444**           | **2025-4-4**               | **304**        |
| **242465375**          | **555**           | **2025-5-5**               | **305**        |
| **357342151**          | **666**           | **2025-6-6**               | **306**        |
| **845876554**          | **777**           | **2025-7-7**               | **307**        |
| **124162790**          | **888**           | **2025-8-8**               | **308**        |
| **987087655**          | **999**           | **2025-9-9**               | **309**        |
| **235375978**          | **100**           | **2025-10-10**             | **310**        |

&#x20;****&#x20;

&#x20;****&#x20;

| **VehicleID(PK)** | <p><strong>VehicleName</strong></p><p> <strong></strong> </p> | <p><strong>VehicleColor</strong></p><p> <strong></strong> </p> | <p><strong>VehiclePrice</strong></p><p> <strong></strong> </p> | <p><strong>VehicleCondition</strong></p><p> <strong></strong> </p> | **VehicleSize** | <p><strong>VehicleYearModel</strong></p><p> <strong></strong> </p> | **VehicleCpacity** |
| ----------------- | ------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | ------------------------------------------------------------------ | --------------- | ------------------------------------------------------------------ | ------------------ |
| **201**           | **Nissan**                                                    | **#FFFFFF**                                                    | **500000**                                                     | **New**                                                            | **Big**         | **2010**                                                           | **1000**           |
| **202**           | **Nissan**                                                    | **#FFFFFF**                                                    | **500100**                                                     | **New**                                                            | **Big**         | **2011**                                                           | **1001**           |
| **203**           | **Hondai**                                                    | **#FFFFFF**                                                    | **500200**                                                     | **New**                                                            | **Big**         | **2012**                                                           | **1002**           |
| **204**           | **Hondai**                                                    | **#FFFFFF**                                                    | **500300**                                                     | **New**                                                            | **Big**         | **2013**                                                           | **1003**           |
| **205**           | **Nissan**                                                    | **#FFFFFF**                                                    | **500400**                                                     | **New**                                                            | **Big**         | **2014**                                                           | **1004**           |
| **206**           | **Mercedes**                                                  | **#FFFFFF**                                                    | **500500**                                                     | **New**                                                            | **Big**         | **2015**                                                           | **1005**           |
| **207**           | **Mercedes**                                                  | **#FFFFFF**                                                    | **500600**                                                     | **New**                                                            | **Big**         | **2016**                                                           | **1006**           |
| **208**           | **Hondai**                                                    | **#FFFFFF**                                                    | **500700**                                                     | **New**                                                            | **Medium**      | **2017**                                                           | **1007**           |
| **209**           | **MAN**                                                       | **#FFFFFF**                                                    | **500800**                                                     | **New**                                                            | **Small**       | **2018**                                                           | **1008**           |
| **210**           | **Hondai**                                                    | **#FF93FA**                                                    | **500900**                                                     | **New**                                                            | **Big**         | **2019**                                                           | **1009**           |

&#x20;****&#x20;

&#x20;****&#x20;

| <p><strong>UserID(PK)</strong></p><p> <strong></strong> </p> | **UserPassWord** | <p><strong>UserDOB</strong></p><p> <strong></strong> </p> | <p><strong>UserPhoneNumber</strong></p><p> <strong></strong> </p> | <p><strong>UserAddress</strong></p><p> <strong></strong> </p> | <p><strong>UserEriCode</strong></p><p> <strong></strong> </p> | <p><strong>VehicleID(FK)</strong></p><p> <strong></strong> </p> | <p><strong>UserName</strong></p><p> <strong></strong> </p> |
| ------------------------------------------------------------ | ---------------- | --------------------------------------------------------- | ----------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | --------------------------------------------------------------- | ---------------------------------------------------------- |
| **301**                                                      | **123456789**    | **1980-1-1**                                              | **07123456**                                                      | **Queen’s Road**                                              | **123 ABC**                                                   | **201**                                                         | **Tran**                                                   |
| **302**                                                      | **123456780**    | **1981-2-2**                                              | **07123457**                                                      | **King’s Road**                                               | **234 BCD**                                                   | **202**                                                         | **Linda**                                                  |
| **303**                                                      | **123456790**    | **1982-3-3**                                              | **07123467**                                                      | **Prince Road**                                               | **345 CDE**                                                   | **203**                                                         | **Alexa**                                                  |
| **304**                                                      | **123456890**    | **1983-4-4**                                              | **07123567**                                                      | **Cool Road**                                                 | **456 DEF**                                                   | **204**                                                         | **May**                                                    |
| **305**                                                      | **123456890**    | **1984-5-5**                                              | **07124567**                                                      | **Hill Road**                                                 | **567 EFG**                                                   | **205**                                                         | **Lara**                                                   |
| **306**                                                      | **123457890**    | **1985-6-6**                                              | **07124567**                                                      | **Haven Road**                                                | **678 FGH**                                                   | **206**                                                         | **Yara**                                                   |
| **307**                                                      | **123467890**    | **1986-7-7**                                              | **07134567**                                                      | **College Road**                                              | **789 GHI**                                                   | **207**                                                         | **Sabrina**                                                |
| **308**                                                      | **123567890**    | **1987-8-8**                                              | **07234567**                                                      | **Uni Road**                                                  | **890 HIJ**                                                   | **208**                                                         | **Kristina**                                               |
| **309**                                                      | **124567890**    | **1988-9-9**                                              | **01234567**                                                      | **Camden Road**                                               | **901 IJK**                                                   | **209**                                                         | **Maria**                                                  |
| **310**                                                      | **134567890**    | **1989-10-10**                                            | **71234567**                                                      | **School Road**                                               | **012 JKL**                                                   | **210**                                                         | **Mia**                                                    |

&#x20;****&#x20;

&#x20;****&#x20;

&#x20;****&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

CREATE TABLE VEHICLES (

&#x20;   VehicleID Char NOT NULL,

&#x20;   VehicleName Varchar NOT NULL,

&#x20;   VehicleCpacity int NOT NULL,

&#x20;   VehicleColor Varchar NOT NULL,

&#x20;   VehiclePrice float NOT NULL,

&#x20;   VehicleCondition Varchar NOT NULL,

&#x20;   VehicleSize Varchar NOT NULL,

&#x20;   VehicleYearModel int NOT NULL,

&#x20;   PRIMARY KEY (VehicleID)

);

&#x20;

INSERT INTO VEHICLES

VALUES

('201', 'Nissan', 1000, '#FFFFFF', 500000, 'New', 'Big', 2010),

('202', 'Nissan', 1001, '#FFFFFF', 500100, 'New', 'Big', 2011),

('203', 'Hondai', 1002, '#FFFFFF', 500200, 'New', 'Big', 2012),

('204', 'Hondai', 1003, '#FFFFFF', 500300, 'New', 'Big', 2013),

('205', 'Nissan', 1004, '#FFFFFF', 500400, 'New', 'Big',2014),

('206', 'Mercedes', 1005, '#FFFFFF', 500500,'New', 'Big', 2015),

('207', 'Mercedes', 1006, '#FFFFFF', 500600, 'New', 'Big', 2016),

('208', 'Hondai', 1007, '#FFFFFF', 500700, 'New', 'Medium', 2017),

('209', 'MAN', 1008, '#FFFFFF', 500800, 'New', 'Small', 2018),

('210', 'Hondai', 1009, '#FF93FA', 500900, 'New', 'Big', 2019);

&#x20;

CREATE TABLE USERS (

&#x20;   UserID Char NOT NULL,

&#x20;   UserPassWord Varchar NOT NULL,

&#x20;   UserDOB Date NOT NULL,

&#x20;   UserPhoneNumber int NOT NULL,

&#x20;   UserAddress Varchar NOT NULL,

&#x20;   UserEriCode Varchar NOT NULL,

&#x20;   VehicleID Char NOT NULL,

&#x20;   UserName Varchar NOT NULL,

&#x20;   PRIMARY KEY (UserID),

&#x20;   FOREIGN KEY (VehicleID) REFERENCES VEHICLES(VehicleID)

);

&#x20;

INSERT INTO USERS

VALUES

('301', '123456789', '1980-01-01', 7123456, 'Queen’s Road' , '123 ABC', '201', 'Tran'),

('302', '123456780', '1981-02-02', 7123457, 'King’s Road' , '234 BCD', '202', 'Linda'),

('303', '123456790', '1982-03-03', 7123467, 'Prince Road' , '345 CDE', '203', 'Alexa'),

('304', '123456890', '1983-04-04', 7123567, 'Cool Road' , '456 DEF', '204', 'May'),

('305', '123456890', '1984-05-05', 7124567, 'Hill Road' , '567 EFG', '205', 'Lara'),

('306', '123457890', '1985-06-06', 7124567, 'Haven Road' , '678 FGH', '206', 'Yara'),

('307', '123467890', '1986-07-07', 7134567, 'College Road' , '789 GHI', '207', 'Sabrina'),

('308', '123567890', '1987-08-08', 7234567, 'Uni Road' , '890 HIJ', '208', 'Kristina'),

('309', '124567890', '1988-09-09', 1234567, 'Camden Road' , '901 IJK', '209', 'Maria'),

('310', '134567890', '1989-10-10', 71234567, 'School Road' , '012 JKL', '210', 'Mia');

&#x20;

CREATE TABLE CREDITCARD (

&#x20;   UserCardNumber Char NOT NULL,

&#x20;   UserCCVNumber int NOT NULL,

&#x20;   UserCardExpirationDate Date NOT NULL,

&#x20;   UserID Char NOT NULL,

&#x20;   PRIMARY KEY (UserCardNumber),

&#x20;   FOREIGN KEY (UserID) REFERENCES USERS (UserID)

);

&#x20;

INSERT INTO CREDITCARD

VALUES

('987654321', 111, '2025-01-01', '301'),

('123456789', 222, '2025-02-02', '302'),

('728364238', 333, '2025-03-03', '303'),

('141242455', 444, '2025-04-04', '304'),

('242465375', 555, '2025-05-05', '305'),

('357342151', 666, '2025-06-06', '306'),

('845876554', 777, '2025-07-07', '307'),

('124162790', 888, '2025-08-08', '308'),

('987087655', 999, '2025-09-09', '309'),

('235375978', 100, '2025-10-10', '310');

&#x20;

CREATE TABLE INVOICE (

&#x20;   WorkerID int NOT NULL,

&#x20;   WorkerName  Varchar NOT NULL,

&#x20;   InvoiceID Char NOT NULL,

&#x20;   InvoiceDate DATE NOT NULL,

&#x20;   VehicleID Char NOT NULL,

&#x20;   UserID Char NOT NULL,

&#x20;   UserCardNumber Char NOT NULL,

&#x20;   PRIMARY KEY (InvoiceID),

&#x20;   FOREIGN KEY (VehicleID) REFERENCES VEHICLES (VehicleID),

&#x20;   FOREIGN KEY (UserID) REFERENCES USERS (UserID),

&#x20;   FOREIGN KEY (UserCardNumber) REFERENCES CREDITCARD (UserCardNumber)

);

&#x20;

INSERT INTO INVOICE

VALUES

(1, 'Alex', '101', '2021-1-1', '201', '301', '987654321'),

(2, 'Josh', '102', '2021-2-2', '202', '302', '123456789'),

(3, 'Yonas', '103', '2021-3-3', '203', '303', '728364238'),

(4, 'Ann', '104', '2021-4-4', '204', '304', '141242455'),

(5, 'Eskandar', '105', '2021-5-5', '205', '305', '242465375'),

(6, 'Garvin', '106', '2021-6-6', '206', '306', '357342151'),

(7, 'Pat', '107', '2021-7-7', '207', '307', '845876554'),

(8, 'Joshua', '108', '2021-8-8', '208', '308', '124162790'),

(9, 'Ali', '109', '2021-9-9', '209', '309', '987087655'),

(10, 'Feby', '110', '2021-10-10', '210', '310', '235375978');

&#x20;

&#x20;

&#x20;

&#x20;

**SQL for the features and functions of the database**

&#x20;****&#x20;

1. Users can delete the account & Workers can delete vehicles from the database
2. Users should be able to update the account
3. Users can login to the account
4. Users can create an account & Workers can create invoices to the municipalities (Users)

&#x20;

INSERT INTO USERS ()

VALUES

(),

(),

();

&#x20;

1. Credit cards can be added by buyers (Users) & Workers can add more than one Vehicle
2. Users can search vehicles according to specifications

&#x20;

SELECT VehcileID, VehicleName, VehicleCpacity, VehicleColor, VehiclePrice, VehicleCondition, VehicleSize, VehicleYearModel FROM VEHICLES WHERE VehicleName = “Nissan”

&#x20;

1. Workers can make reports about the vehicles
2. Users can buy vehicles with their card.
3. Users & Workers can view vehicles and their specifications

&#x20;

SELECT VehcileID, VehicleName, VehicleCpacity, VehicleColor, VehiclePrice, VehicleCondition, VehicleSize, VehicleYearModel FROM VEHICLES

&#x20;

1. Workers can input the details of the vehicle.

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;

&#x20;
