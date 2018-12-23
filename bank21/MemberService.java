package bank21;

public interface MemberService {

	public MemberBean join(String name,String id,String pass,String ssn) ;
	
	public void login();
	
	public void update();
	
	public void delete();
		
}
