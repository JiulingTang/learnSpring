package pack1;

import org.springframework.stereotype.Repository;

@Repository
public class IjDaoIml2 implements IjDao {
	public void save(){
		System.out.println("this is ijdao2");
	}

}
