package Day13;

public class Team 
{

	 String Team_Name;
	 String Team_Capt;
	 int Size;
	 int Team_Achievement;
     String Team_Coach;
	
	public String getTeam_Name()
	{
		return Team_Name;
	}
	public String getTeam_Capt()
	{
		return Team_Capt;
	}
	public int getSize()
	{
		return Size;
	}
	public int getTeam_Achievement()
	{
		return Team_Achievement;
	}
	public String getTeam_Coach()
	{
		return Team_Coach;
	}
	
	public void setTeam_Name(String Team_Name)
	{ 
	    this.Team_Name = Team_Name; 
	} 

	public void setTeam_Capt(String Team_Capt) 
	{ 
	    this.Team_Capt = Team_Capt; 
	} 
	
	 public void setSize(int Size)
	    {
	        this.Size = Size;
	    } // setter

		public void setTeam_Achievement(int Team_Achievement) 
		{ 
		    this.Team_Achievement = Team_Achievement; 
		}
		public void setTeam_Coach(String Team_Coach) 
		{ 
		    this.Team_Coach = Team_Coach; 
		}
	
	
}
