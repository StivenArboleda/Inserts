
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

**Example**

![](https://github.com/StivenArboleda/Inserts/blob/master/images/Tabla%20ejemplo%20Deparment.jpeg)

**Employee** with his attributes:
* Employee ID
* Name
* direction
* Date of birth
* Position
* Department id

**Example**

![](https://github.com/StivenArboleda/Inserts/blob/master/images/Tabla%20ejemplo%20Employee.jpeg)

**Project** with its attributes:
* Project id
* Project's name
* ID of the department in charge of developing the project

**Example**

![](https://github.com/StivenArboleda/Inserts/blob/master/images/Tabla%20ejemplo%20Project.jpeg)

**Works** On with its attributes:
* Department id
* Project id
* Date of project development
* Hours worked on the project

**Example**

![](https://github.com/StivenArboleda/Inserts/blob/master/images/Tabla%20ejemplo%20WorksOn.jpeg)

------------

### Specs

* Departments are randomly generated. They are **20 in total in any case**.

* All departments are generated with the boss in **Null** until the employees are created

* The minimum number of inserts must be **20**

* The **inserts for the WorksOn table** are created randomly according to the Projects

* The **employees date** of birth must be in the format *DD/MM/YYYY*
	- The **date of birth** is between *1949 and 2003*

------------

#### Console

Menu
![](https://github.com/StivenArboleda/Inserts/blob/master/images/Menu.jpeg)

- To run you must use the Java -jar command followed by the name of the executable, in this case InsertsExecutable
	* Note: To run you must have *the latest version of the Java JDK*


------------

#### Members:

- [Sean Quintero](https://github.com/SeanQO "Sean Quintero")
- [Jhon Stiven Arboleda](https://github.com/StivenArboleda "Jhon Stiven Arboleda")
