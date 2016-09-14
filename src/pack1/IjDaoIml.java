package pack1;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class IjDaoIml implements IjDao {
	public void save(){
		System.out.println("this is ijdao");
	}
}
