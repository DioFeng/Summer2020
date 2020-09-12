import java.util.*;
public class WeaponGame
{
	public static void main(String[] args)
	{
		Weapon w1 = new Weapon();
		System.out.println(w1.toString());
		Weapon w2 = new Weapon(5,1,5);
		System.out.println();
		System.out.println(w2.toString());
	}
}