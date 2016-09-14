package pack1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class IjserviceIml implements Ijservice {
	
	@Autowired
	private List<IjDao> ijDaos;
	
	public void save(){
		System.out.println("this is service");
		for (IjDao i:ijDaos){
			i.save();
		}
	}

	public List<IjDao> getIjDaos() {
		return ijDaos;
	}

	public void setIjDaos(List<IjDao> ijDaos) {
		this.ijDaos = ijDaos;
	}



}
