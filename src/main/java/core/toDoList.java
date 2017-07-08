/**
Create a Domain object to presents a taskList
also a contains a generic Getter and Setter 
method for parameter received from REST request.

@Document annotation will define which collection for the API
 to perform the CRUD operaions on.
 
 @Id this annotation from Spring Data library is for mapping the
 ID fields in MongoDB
**/

package core;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "taskList")
public class toDoList {

	
	@Id
    private String id;
	
    private String task;
    private String description;
    private String status;  
    
    public String getTask() {
    	return task;
    }
    public void setTask(String task) {
    	this.task = task;
    }
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

 }