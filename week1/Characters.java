package oops;

public abstract class Characters {
 protected String name;
 protected String race;
 protected int level;
 protected int health;
 public Characters(String name,String race, int level)
 { 
	this.name=name;
	this.race=race;
	this.level=level;
	this.health=100;
 }
 public void attack()
 {
	 this.health-=30;
 }
 public void drinkPotion()
 {
	 this.health+=50;
	 if(this.health>100)
	 {
		 this.health=100;
	 }
	 
 }
 public abstract void uniqueAbility();
}
class Human extends Characters{
	public Human(String name, int level) {
		super(name,"Human",level);
	}
	@Override
	public void uniqueAbility()
	{
		System.out.println(name+"uses Courageous Leadership");
	}	
}
class Elf extends Characters{
	public Elf(String name, int level) {
		super(name,"Elf",level);
	}
	@Override
	public void uniqueAbility()
	{
		System.out.println(name+"uses Elven Immortality");
	}	
}

class Dwarf extends Characters{
	public Dwarf(String name, int level) {
		super(name,"Dwarf",level);
	}
	@Override
	public void uniqueAbility()
	{
		System.out.println(name+"Dwarvan Resilience");
	}	
}

class Hobbit extends Characters{
	public Hobbit(String name, int level) {
		super(name,"Hobbit",level);
	}
	@Override
	public void uniqueAbility()
	{
		System.out.println(name+"Hobbit Stealth");
	}
}
 interface CharacterClass{
	void classAbility();
}
class Ranger implements CharacterClass{
	 @Override
	 public void classAbility(){
		 System.out.println("Ranger uses Tracking!");
	 }
 }
class Wizard implements CharacterClass{
	 @Override
	 public void classAbility(){
		 System.out.println("Wizard uses Spellcasting!");
	 }
}

class Warrior implements CharacterClass{
	 @Override
	 public void classAbility(){
		 System.out.println("Warrior uses Combat prowess");
	 }
}
class Commoner implements CharacterClass{
	 @Override
	 public void classAbility(){
		 System.out.println("Commoner performs chores");
	 }
}

abstract class Creature{
	protected String creatureType;
	protected int attackPower;
	protected String specialAbility;
	
	public Creature(String creatureType, int attackPower, String specialAbility)
	{
		this.creatureType=creatureType;
		this.attackPower=attackPower;
		this.specialAbility=specialAbility;
	}
	public String getCreatureType()
	{
		return creatureType;
	}
	public int getattackPower()
	{
		return attackPower;
	}
	public String getspecialAbility()
	{
		return specialAbility;
	}
}
class Orc extends Creature{
	public Orc()
	{
		super("Orc",10,"xyz");
	}	
}

class Troll extends Creature{
	public Troll()
	{
		super("Troll",20,"xyz");
	}
}

class Dragon extends Creature{
	public Dragon()
	{
		super("Dragon",30,"xyz");
	}
}

class Nazgul extends Creature{
	public Nazgul()
	{
		super("Nazgul",20,"xyz");
	}
}

class CombatSystem{
	public static void main(String[] args)
	{
		Characters pranathi=new Human("Pranathi",1);
		Characters kirru=new Elf("Kirru",2);
		//Characters gO=new Dwarf("gO",3);
		//Characters suzi=new Hobbit("suzi",4);
	
        
		CharacterClass ranger = new Ranger();
        CharacterClass wizard = new Wizard();
        CharacterClass warrior = new Warrior();
        CharacterClass commoner = new Commoner();
         
       // Creature orc = new Orc();
        //Creature troll = new Troll();
        //Creature dragon = new Dragon();
       // Creature nazgul = new Nazgul();

     
       pranathi.attack();
        kirru.drinkPotion();
        //gO.uniqueAbility();
       // suzi.uniqueAbility();
        ranger.classAbility();
        wizard.classAbility();
        warrior.classAbility();
        commoner.classAbility();

       
	}
}

