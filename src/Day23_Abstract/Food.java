package Day23_Abstract;

abstract class Food 
{
	abstract void  prepareFood();
	abstract public void Sharerecipe();
}
class HealthyFood extends Food
{
	
	public void  prepareFood()
	{
		System.out.println("FOOD IS PREPARING");
		
	}
	public void Sharerecipe()
	{
		System.out.println("Share Food Recipes");
		
	}
}

class JunkFood extends Food
{
	public void  prepareFood()
	{
		System.out.println("Its Healthy FOOD");
	}
	public void  Sharerecipe()
	{
		System.out.println("Its JUNK FOOD");
	}
	
}

