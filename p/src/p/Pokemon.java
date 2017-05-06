package p;

public class Pokemon extends card{
 static int maxhp ;
 static int hp;
 static String aname;
 static int apower;
 static int turns;
 static int type;//1 for fire, 2 for grass, 3 for water, 4 for electric
 static int evolvenumber=0;//0 is original,1 is mid tier,2 is final tier
 public static enum type{
	 FIRE, GRASS, ELECTRIC, WATER

	 }
 
 
 
 
 

 public static String getName() {
		return name;//from card
	}
 
 
 public static void evolve(Pokemon q){
	//specific pokemon define a list called etypes which is a list of lists, the inner lists are the specific attributes(eacher inner list is an evolve type)
	 //the outer lists are the 2 evolve states
	 maxhp=etypes.get(q.evolvenumber).get(0);
	 hp=etypes.get(q.evolvenumber).get(1);
	 aname=etypes.get(q.evolvenumber).get(2);
	 apower=etypes.get(q.evolvenumber).get(3);
	 turns=etypes.get(q.evolvenumber).get(4);
	 type=etypes.get(q.evolvenumber).get(5);
	 evolvenumber=q.evolvenumber+1;
	 
	 
 }
 public static void attack(Pokemon e){
	 e.hp -= apower;
	 System.out.println(getName() + " did " + apower + " damage to " + e.getName() + "!");
	 if (e.hp <= 0) {
		 bench.remove(0);//bench list
		 System.out.println(e.getName() + " died!");
	 }
	 else {
			System.out.println("Now " + e.getName() + " has " + e.hp + "/" + e.maxhp + " HP.");
 }
 
}
}



/*public static class enumc extends Pokemon{
static type specific;
public enumc(type Type){
	 this.specific=Type;
}
public static void attack(Pokemon e){

	//define codifsh like enumc codfish=new enumc(type.GRASS);
		 
		 switch(specific){
		 case FIRE:
			 e.hp -= apower;
			 System.out.println(getName() + " did " + apower + " damage to " + e.getName() + "!");
			 break;
		 case GRASS:
			 
			 break;
		 case ELECTRIC:
			 
			 break;
			 
		 case WATER:
			 
			 break;
			 
		default:
			
			break;
		 }
	 }
}

static enumc codfish=new enumc(type.GRASS);*/