import java.util.*;
public class WeaponGame
{
	public static void main(String[] args)
	{
		//Generate random weapon with random quality, star, and type
		Weapon w1 = new Weapon();
		System.out.println(w1.toString());
		//Generate best weapon
		Weapon w2 = new Weapon(5,5,5);
		System.out.println();
		System.out.println(w2.toString());
	}
}