
# INSERTS CREATOR

The code found here is a script which helps with the creation of the sql INSERT function for specific [tables](#Tables).

The script generates a .sql file in the [Data](https://github.com/StivenArboleda/Inserts/tree/master/data "Data") folder with the inserts, this file can be loaded into SQLDevelopment.

Finally, this script is fully developed in **Java**.

------------


#### Tables:

**Department** with its attributes:
* Department number
* Department name
* ID of the department head

**Employee** with his attributes:
* Employee ID
* Name
* direction
* Date of birth
* Position
* Department id

**Project** with its attributes:
* Project id
* Project's name
* ID of the department in charge of developing the project

**Works** On with its attributes:
* Department id
* Project id
* Date of project development
* Hours worked on the project

------------

### Specs

- To create any table, a **department** must first exist
- The **employees date** of birth must be in the format *DD/MM/YYYY*
	- The **date of birth** is between *1959 and 2003*
- **Project** is the table that contains the information of the projects assigned to each department. *A project is executed by a single department*.
- **WorksOn** is the table that contains the details of the hours worked by the employees of each project.


------------

#### Console

![Menu](https://github.com/StivenArboleda/Inserts/blob/master/images/Menu.jpeg "Menu")

- To run you must use the Java -jar command followed by the name of the executable, in this case InsertsExecutable
	* Note: To run you must have *the latest version of the Java JDK*


------------

#### Members:

- [Sean Quintero](https://github.com/SeanQO "Sean Quintero")
- [Jhon Stiven Arboleda](https://github.com/StivenArboleda "Jhon Stiven Arboleda")
