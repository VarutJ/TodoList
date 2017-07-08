/**
 This class is an Interface of MongoRepository
 that allow user to perform various (Such as CRUD)
 operation to the Object (in this case a toDoList object)
 
 @RepositoryRestResource is use to direct Spring MVC
 to create a REST end-point at taskList
 */
package core;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "taskList", path = "taskList")
public interface ToDoListRepository extends MongoRepository<toDoList, String> {
	
	public List<toDoList> findBydescription(@Param("description")String description);
	public List<toDoList> findBytask(@Param("task")String task);
	public List<toDoList> findBystatus(@Param("status")String status);
	
}
