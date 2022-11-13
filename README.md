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

1\.      Users can delete the account & Workers can delete vehicles from the database

2\.      Users should be able to update the account

3\.      Users can login to the account

4\.      Users can create an account & Workers can create invoices to the municipalities (Users)

5\.      Credit cards can be added by buyers (Users) & Workers can add more than one Vehicle

6\.      Users can search vehicles according to specifications

7\.      Workers can make reports about the vehicles

8\.      Users can book vehicles

9\.      Users & Workers can view vehicles and their specifications

10\.  Workers can input the vehicles IDs

&#x20;

&#x20;

**Who is going to use the database?**

&#x20;

* Workers
* Anyone who creates an account can:

1\.      Delete their Account

2\.      Update their account

3\.      Log in to their account

4\.      Add credit cards

5\.      Search vehicles according to specifications

6\.      Book vehicles

7\.      Can view vehicles

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

\-          ![](file:///C:/Users/ESKAND\~1/AppData/Local/Temp/msohtmlclip1/01/clip\_image001.gif)UserName

\-          ![Text Box: Users](file:///C:/Users/ESKAND\~1/AppData/Local/Temp/msohtmlclip1/01/clip\_image002.gif)UserPassWord

\-          UserDOB

\-          UserPhoneNumber

\-          ![](file:///C:/Users/ESKAND\~1/AppData/Local/Temp/msohtmlclip1/01/clip\_image003.gif)VehicleID

\-          VehicleName

\-          VehicleCpacity

\-          VehicleColor

\-          ![Text Box: Workers](file:///C:/Users/ESKAND\~1/AppData/Local/Temp/msohtmlclip1/01/clip\_image004.gif)WorkerID

\-          WorkerName

\-          VehiclePrice

\-          VehicleCondition

\-          VehicleSize

\-          VehicleYearModel

&#x20;

1. Users should be able to update the account

&#x20;

\-          UserName

\-          UserPassWord

\-          UserPhoneNumber

\-          UserDOB

\-          UserAddress

\-          UserEriCode

&#x20;

1. Users can login to the account

&#x20;

\-          UserName

\-          UserPassWord

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

\-          ![](file:///C:/Users/ESKAND\~1/AppData/Local/Temp/msohtmlclip1/01/clip\_image005.gif)UserName

\-          UserPassWord

\-          ![Text Box: Users](file:///C:/Users/ESKAND\~1/AppData/Local/Temp/msohtmlclip1/01/clip\_image006.gif)UserAddress

\-          UserEirCode

\-          UserPhoneNumber

\-          UserDOB

\-          ![](file:///C:/Users/ESKAND\~1/AppData/Local/Temp/msohtmlclip1/01/clip\_image007.gif)InvoiceID

\-          VehicleColor

\-          VehicleID

\-          VehicleCapacity

\-          VehicleName

\-          ![Text Box: Workers](file:///C:/Users/ESKAND\~1/AppData/Local/Temp/msohtmlclip1/01/clip\_image008.gif)UserEirCode

\-          UserAddress

\-          UserName

\-          UserPhoneNumber

\-          UserDOB

\-          WorkerName

\-          WorkerID

&#x20;

1. Credit cards can be added by buyers (Users) & Workers can add Vehicles to the database

&#x20;

&#x20;

&#x20;

\-          ![](file:///C:/Users/ESKAND\~1/AppData/Local/Temp/msohtmlclip1/01/clip\_image009.gif)UserName

\-          UserPassWord

\-          ![Text Box: Users](file:///C:/Users/ESKAND\~1/AppData/Local/Temp/msohtmlclip1/01/clip\_image002.gif)UserDOB

\-          UserPhoneNumber

\-          UserCCVNumber

\-          UserCardNumber

\-          UserCardExpirationDate

\-          ![](file:///C:/Users/ESKAND\~1/AppData/Local/Temp/msohtmlclip1/01/clip\_image010.gif)VehicleID

\-          VehicleName

\-          VehicleColor

\-          VehicleCapacity

\-          ![Text Box: Workers](file:///C:/Users/ESKAND\~1/AppData/Local/Temp/msohtmlclip1/01/clip\_image011.gif)WorkerID

\-          WorkerName

\-          VehiclePrice

\-          VehicleCondition

\-          VehicleSize

\-          VehicleYearModel

&#x20;

1. Users can search vehicles according to specifications

&#x20;

\-          VehicleID

\-          VehicleName

\-          VehicleColor

\-          VehicleCapacity

\-          VehiclePrice

\-          VehicleCondition

\-          VehicleSize

\-          VehicleYearModel

&#x20;

1. Workers can make reports about the vehicles

&#x20;

\-          VehicleID

\-          VehicleName

\-          VehicleColor

\-          VehicleCapacity

\-          WorkerName

\-          WorkerID

\-          VehiclePrice

\-          VehicleCondition

\-          VehicleSize

\-          VehicleYearModel

&#x20;

1. Users can book vehicles

&#x20;

\-          VehicleID

\-          VehicleName

\-          VehicleColor

\-          VehicleCapacity

\-          UserName

\-          UserPassWord

\-          UserDOB

\-          UserPhoneNumber

\-          VehiclePrice

\-          VehicleCondition

\-          VehicleSize

\-          VehicleYearModel

&#x20;

&#x20;

1. Users & Workers can view vehicles and their specifications

&#x20;

&#x20;

\-          VehicleID

\-          VehicleName

\-          VehicleColor

\-          VehicleCapacity

\-          VehiclePrice

\-          VehicleCondition

\-          VehicleSize

\-          VehicleYearModel

&#x20;

1. Workers can input the vehicles IDs

&#x20;

\-          VehicleName

\-          VehicleColor

\-          VehicleCapacity

\-          VehiclePrice

\-          VehicleCondition

\-          VehicleSize

\-          VehicleYearModel

\-          WorkerID

\-          WorkerName

&#x20;

\----------------------------------------------------------------------------------

&#x20;

**We need to normalize the following:**

&#x20;****&#x20;

\-          UserName

\-          VehiclePrice

\-          VehicleCondition

\-          VehicleSize

\-          VehicleYearModel

\-          UserPassWord

\-          UserDOB

\-          UserPhoneNumber

\-          VehicleID

\-          VehicleName

\-          VehicleCpacity

\-          VehicleColor

\-          UserName

\-          UserPassWord

\-          UserPhoneNumber

\-          UserDOB

\-          UserAddress

\-          UserEriCode

\-          UserName

\-          UserPassWord

\-          UserName

\-          UserPassWord

\-          UserAddress

\-          UserEirCode

\-          UserPhoneNumber

\-          UserDOB

\-          InvoiceID

\-          VehicleColor

\-          VehicleID

\-          VehicleCapacity

\-          VehicleName

\-          UserEirCode

\-          UserAddress

\-          UserName

\-          UserPhoneNumber

\-          UserDOB

\-          UserName

\-          UserPassWord

\-          UserDOB

\-          UserPhoneNumber

\-          UserCCVNumber

\-          UserCardNumber

\-          UserCardExpirationDate

\-          VehicleID

\-          VehicleName

\-          VehicleColor

\-          VehicleCapacity

\-          VehicleID

\-          VehicleName

\-          VehicleColor

\-          VehicleCapacity

\-          VehicleID

\-          VehicleName

\-          VehicleColor

\-          VehicleCapacity

\-          VehicleID

\-          VehicleName

\-          VehicleColor

\-          VehicleCapacity

\-          UserName

\-          UserPassWord

\-          UserDOB

\-          UserPhoneNumber

\-          VehicleID

\-          VehicleName

\-          VehicleColor

\-          VehicleCapacity

\-          VehicleName

\-          VehicleColor

\-          VehicleCapacity

\-          WorkerID

\-          WorkerName

&#x20;

&#x20;

&#x20;

\-------------------------------------------------------------------------------------

**Normalization**

&#x20;

1. **Normal Form – Removal of Duplicates**

&#x20;

\-          UserName

\-          UserPassWord

\-          UserDOB

\-          UserPhoneNumber

\-          UserAddress

\-          UserEriCode

\-          InvoiceID

\-          UserCCVNumber

\-          UserCardNumber

\-          UserCardExpirationDate

\-          WorkerID

\-          WorkerName

\-          VehicleID

\-          VehicleName

\-          VehicleCpacity

\-          VehicleColor

\-          VehiclePrice

\-          VehicleCondition

\-          VehicleSize

\-          VehicleYearModel

&#x20;

1. &#x20;**Removal of Partial Dependencies.**

**Separate out the fields into their groups.**

**Only allow groups that have a dependency on the Primary Key**

&#x20;

Workers:

\-          WorkerID

\-          WorkerName

\-          InvoiceID(PK)

&#x20;

Vehicles:

\-          VehicleID(PK)

\-          VehicleName

\-          VehicleCpacity

\-          VehicleColor

\-          VehiclePrice

\-          VehicleCondition

\-          VehicleSize

\-          VehicleYearModel

&#x20;

Users:

\-          UserName(PK)

\-          UserPassWord

\-          UserDOB

\-          UserPhoneNumber

\-          UserAddress

\-          UserEriCode

&#x20;

Card:

\-          UserCCVNumber

\-          UserCardNumber(PK)

\-          UserCardExpirationDate

&#x20;

&#x20;

&#x20;

1. **Normal Form – Remove Transitive Dependencies.**

![](file:///C:/Users/ESKAND\~1/AppData/Local/Temp/msohtmlclip1/01/clip\_image012.gif)![Text Box: InvoiceID(PK)
UserName(FK)
VehicleID(FK)
VehiclePrice
UserCardNumber(FK)
UserAddress
UserEirCode
WorkerID
WorkerName](file:///C:/Users/ESKAND\~1/AppData/Local/Temp/msohtmlclip1/01/clip\_image013.gif)![Text Box: UserName(PK)
UserPassWord
UserDOB
UserPhoneNumber
UserAddress
UserEriCode
VehicleID(FK)](file:///C:/Users/ESKAND\~1/AppData/Local/Temp/msohtmlclip1/01/clip\_image014.gif)

&#x20;

\


![Text Box: VehicleID(PK)
VehicleName
VehicleCpacity
VehicleColor
VehiclePrice
VehicleCondition
VehicleSize
VehicleYearModel](file:///C:/Users/ESKAND\~1/AppData/Local/Temp/msohtmlclip1/01/clip\_image015.gif)![Text Box:  UserCardNumber(PK)
UserCCVNumber
UserCardExpirationDate
UserName(FK)](file:///C:/Users/ESKAND\~1/AppData/Local/Temp/msohtmlclip1/01/clip\_image016.gif)

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

1. \

2. Table number one for VehicleID(PK)

&#x20;

| <p> </p><p>Field Name</p><p> </p>       | Field Type | Field Size |
| --------------------------------------- | ---------- | ---------- |
| <p> </p><p>VehcileID(PK)</p><p> </p>    | int        |            |
| <p> </p><p>VehicleName</p><p> </p>      | Varchar    | 255        |
| <p> </p><p>VehicleCpacity</p><p> </p>   | int        |            |
| <p> </p><p>VehicleColor</p><p> </p>     | Varchar    | 255        |
| <p> </p><p>VehiclePrice</p><p> </p>     | int        |            |
| <p> </p><p>VehicleCondition</p><p> </p> | Varchar    | 255        |
| <p> </p><p>VehicleSize</p><p> </p>      | Varchar    | 255        |
| <p> </p><p>VehicleYearModel</p><p> </p> | int        |            |

&#x20;

1. Table number two for UserName(PK)

&#x20;

| <p> </p><p>Field Name</p><p> </p>      | Field Type | Field Size |
| -------------------------------------- | ---------- | ---------- |
| <p> </p><p>UserName(PK)</p><p> </p>    | Varchar    | 255        |
| <p> </p><p>UserPassWord</p><p> </p>    | Varchar    | 255        |
| <p> </p><p>UserDOB</p><p> </p>         | Date       |            |
| <p> </p><p>UserPhoneNumber</p><p> </p> | int        |            |
| <p> </p><p>UserAddress</p><p> </p>     | Varchar    | 255        |
| <p> </p><p>UserEriCode</p><p> </p>     | Varchar    | 255        |
| <p> </p><p>VehicleID(FK)</p><p> </p>   | int        |            |

&#x20;

&#x20;

1. Table number three for InvoiceID(PK)

&#x20;

| <p> </p><p>Field Name</p><p> </p>         | Field Type | Field Size |
| ----------------------------------------- | ---------- | ---------- |
| <p> </p><p>InvoiceID(PK)</p><p> </p>      | int        |            |
| <p> </p><p>UserName(FK)</p><p> </p>       | Varchar    | 255        |
| <p> </p><p>VehicleID(FK)</p><p> </p>      | int        |            |
| <p> </p><p>VehiclePrice</p><p> </p>       | int        |            |
| <p> </p><p>UserCardNumber(FK)</p><p> </p> | int        |            |
| <p> </p><p>UserAddress</p><p> </p>        | Varchar    | 255        |
| <p> </p><p>UserEirCode</p><p> </p>        | Varchar    | 255        |
| <p> </p><p>WorkerID</p><p> </p>           | int        |            |
| <p> </p><p>WorkerName</p><p> </p>         | Varchar    | 255        |

&#x20;

&#x20;

1. Table number four for UserCardNumber(PK)

&#x20;

| <p> </p><p>Field Name</p><p> </p>             | Field Type | Field Size |
| --------------------------------------------- | ---------- | ---------- |
| <p> </p><p> UserCardNumber(PK)</p><p> </p>    | int        |            |
| <p> </p><p>UserCCVNumber</p><p> </p>          | int        |            |
| <p> </p><p>UserCardExpirationDate</p><p> </p> | Date       |            |
| <p> </p><p>UserName(FK)</p><p> </p>           | Varchar    | 255        |

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

&#x20;

&#x20;

&#x20;

&#x20;
