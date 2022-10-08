package Day13;

public class IPL 
{

	public static void main(String []args)
	{
		Team t = new Team();
		t.setTeam_Name("India");
		t.setTeam_Capt("M.S Dhoni");
		t.setSize(11);
		t.setTeam_Achievement(100);
		t.setTeam_Coach("Dravid");
		System.out.println("TEAM NAME  : "+t.getTeam_Name());
		System.out.println("TEAM CAPTION  : "+t.getTeam_Capt());
		System.out.println("TEAM SIZE  : "+t.getSize());
		System.out.println("TEAM ACHIVEMENT  : "+t.getTeam_Achievement());
		System.out.println("TEAM COACH  : "+t.getTeam_Coach());
	}
}
