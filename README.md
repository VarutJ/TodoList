# Scale 360 Interview's Assignment
This projects is to creates a  RESTful API for a simple "To Do List"

# Prerequisites
* Maven or Gradle (for how to install Maven or Gradle please see to this url below
	* Gradle : https://docs.gradle.org/3.3/userguide/installation.html
	* Maven : https://maven.apache.org/install.html
* Mongo DB (for how to install mongo DB please see to this url below 
	* Mongo DB : https://docs.mongodb.com/manual/installation/
* Eclipse (optional)
* Postman Chromes adds-on (for REST request)

# Made With
* Eclipse IDE
* Spring Boot
* Spring Data
* Maven Dependency management
* Mongo DB

# Installation
* First User has to install MongoDB (for installation process please see in mongoDB site provided above)
* Create an Executable jar using Maven.
* This application can be run on Maven
* Or run the application using Spring Boot plugin in Eclipse IDE.
* User do not have to create a database or collections on DB. The application will create by itself if it isn't already existed.

# How to Use
This REST Api is can do a simple CRUD operation with MongoDB
The parameter use in a REST Request (such as GET POST PUT DELETE) were list as below
*task
*description
*status

URL Params
```
findBytask?task=value
findBydescription?description=value
findBystatus?status=value
```

DATA PARAMS (POST,PUT)
the default value of the parameter is below
*description = default
*status = pending
```
	{
		"task" : "test1",
		"description : "test1",
		"status" : "pending"
	}
```

URL
```
search all : /taskList
search specific records : /taskList/596110911d7d6e8162d7e784

```

Sample Call
```
http://localhost:8080/taskList/search/findBystatus?status=pending

```

```
			{
	  "_embedded" : {
	    "taskList" : [ {
	      "task" : "writes an API doc",
	      "description" : "write api doc",
	      "status" : "pending",
	      "_links" : {
	        "self" : {
	          "href" : "http://localhost:8080/taskList/596110091d7d6e8162d7e783"
	        },
	        "toDoList" : {
	          "href" : "http://localhost:8080/taskList/596110091d7d6e8162d7e783"
	        }
	      }
	    }, {
	      "task" : "try Harder",
	      "description" : "try Harder",
	      "status" : "pending",
	      "_links" : {
	        "self" : {
	          "href" : "http://localhost:8080/taskList/596110911d7d6e8162d7e784"
	        },
	        "toDoList" : {
	          "href" : "http://localhost:8080/taskList/596110911d7d6e8162d7e784"
	        }
	      }
	    } ]
	  },
	  "_links" : {
	    "self" : {
	      "href" : "http://localhost:8080/taskList/search/findBystatus?status=pending"
	    }
	  }
	}

```

#Remark
The database still has no authentication security at this moment.

# Author
* **Varut Jitthamwong** - A job applicants for Scale 360 