import java.util.Random;
public class Weapon
{
	//Weapon qualities
	public final static int WHITE = 1;
	public final static int BLACK = 2;
	public final static int BLUE = 3;
	public final static int PINK = 4;
	public final static int RED = 5;
	//Weapon star level
	public final static int ONESTAR = 1;
	public final static int TWOSTAR = 2;
	public final static int THREESTAR = 3;
	public final static int FOURSTAR = 4;
	public final static int FIVESTAR = 5;
	//Weapon types
	public final static int SWORD = 1;
	public final static int SHIELD = 2;
	public final static int SPEAR = 3;
	public final static int GUN = 4;
	public final static int FIRECANE = 5;

	private final static int NUM_TYPES = 5;

	private int quality, starValue, weaponType;
	private double starProbs, qualityProbs;
	private String qualityName, starName, weaponName;

	public Weapon()
	{
		Random generator = new Random();
		this.weaponType = generator.nextInt(NUM_TYPES) + 1;
		weaponSetter();	

		qualityProbs = generator.nextDouble();
		System.out.println("The Quality prob is "+ qualityProbs*100 +"%");
		setWeaponQuality(qualityProbs);

		starProbs = generator.nextDouble();
		System.out.println("The Star prob is "+ starProbs*100 +"%");
		setStarValue(starProbs);		
	}
	public Weapon(int weaponT,int qualityValue,int starVal)
	{
		customizeWeaponType(weaponT);
		customizeWeaponQuality(qualityValue);
		customizeWeaponStar(starval);
		
	}
	private void setWeaponQuality(double probs)
	{
		if (probs<=0.03) //The chance of getting a RED weapon is 3%
		{
			this.quality = RED;
		}
		else if(probs>0.03 && probs <= 0.15) //The chance of getting a PINK weapon is 12%
		{
			this.quality = PINK;
		}
		else if(probs > 0.15 && probs <= 0.36) //The chance of getting a BLUE weapon is 21%
		{ 
			this.quality = BLUE;
		}
		else if (probs > 0.36 && probs <= 0.665) //The chance of getting a BLACK weapon is 30.5%
		{
			this.quality = BLACK;
		}
		else //The chance of getting a WHITE weapon is 33.5%
		{
			this.quality = WHITE;
		}
		qualitySetter();
	}
	private void setStarValue(double probs)
	{
		if (probs<=0.02)
		{
			this.starValue = FIVESTAR;
		}
		else if(probs>0.02 && probs <= 0.12)
		{
			this.starValue = FOURSTAR;
		}
		else if(probs > 0.12 && probs <= 0.25)
		{ 
			this.starValue = THREESTAR;
		}
		else if (probs > 0.25 && probs <= 0.615)
		{
			this.starValue = TWOSTAR;
		}
		else
		{
			this.starValue = ONESTAR;
		}
		starSetter();
	}
		private void weaponSetter()
	{
		switch (this.weaponType)
		{
			case SWORD:
				this.weaponName = "Sword";
				break;
			case SHIELD:
				this.weaponName = "SHIELD";
				break;
			case SPEAR:
				this.weaponName = "Spear";
				break;
			case GUN:
				this.weaponName = "Short-Gun";
				break;
			case FIRECANE:
				this.weaponName = "Fire_cane";
				break;
		}
	}
	private void qualitySetter()
	{
		switch (this.quality)
		{
			case WHITE:
				this.qualityName = "White";
				break;
			case BLACK:
				this.qualityName = "Black";
				break;
			case BLUE:
				this.qualityName = "Blue";
				break;
			case PINK:
				this.qualityName = "Pink";
				break;
			case RED:
				this.qualityName = "Red";
				break;
		} 
	}
	private void starSetter()
	{
		switch (this.starValue)
		{
			case ONESTAR:
				this.starName = "🌟";
				break;
			case TWOSTAR:
				this.starName = "🌟🌟";
				break;
			case THREESTAR:
				this.starName = "🌟🌟🌟";
				break;
			case FOURSTAR:
				this.starName = "🌟🌟🌟🌟";
				break;
			case FIVESTAR:
				this.starName = "🌟🌟🌟🌟🌟";
				break;
		}
	}
	private void customizeWeaponStar(int s)
	{
		this.starValue = s;
		starSetter();
	}
	private void customizeWeaponQuality(int q)
	{
		this.quality = q;
		qualitySetter();
	}
	private void customizeWeaponType(int t)
	{
		this.weaponType = t;
		weaponSetter();
	}
	public String getWeaponName()
	{
		return weaponName;
	}
	public String getWeaponQuality()
	{
		return qualityName;
	}
	public String getWeaponStar()
	{
		return starName;
	}
	public String toString()
	{
		return "Quality: "+ qualityName + "\n" +"Star: "+starName+"\n"+"Weapon: "+weaponName;
	}
	public void updateWeaponQuality()
	{
		this.quality +=1;
		qualitySetter();
	}
	public void updateWeaponStarLevel()
	{
		this.starValue +=1;
		starSetter();
	} 
	public boolean checkMaxStarLevel()
	{
		if (this.starValue == FIVESTAR)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean checkMaxQuality()
	{
		if (this.quality == RED)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}