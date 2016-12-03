package fcu.iecs.oop.pokemon;
import java.util.Random;
public class GYM {
	

	public static Player fight(Player... players){
		Player player1 = null,player2 = null;
		int i=0,point1=0,point2=0,level=0;
		for(Player pPlay: players) {
			
			if(i ==0){
				player1 = pPlay;
				i++;
			}
			else{
				player2 = pPlay;
			}
		}
		Pokemon[] p1Pok = player1.getPokemons();
		Pokemon[] p2Pok = player2.getPokemons();
		for(int j=0;j<player1.getPokemons().length;j++){
			
			
		    if(p1Pok[j].getType() == PokemonType.FIRE){
		    	if(p2Pok[j].getType() == PokemonType.GRASS){
		    		point1++;
		    	}
		    	else if(p2Pok[j].getType() == PokemonType.FIRE){
		    		if(p1Pok[j].getCp() > p2Pok[j].getCp()){
		    			point1++;
		    		}
		    		else if(p1Pok[j].getCp() == p2Pok[j].getCp()){
		    			Random ran = new Random();
		    			int who =  ran.nextInt(2);
		    			if(who == 1)	point1++;
		    			else	point2++;
		    		}
		    		else	point2++;
		    	}
		    	else point2++;
		    }
		    else if(p1Pok[j].getType() == PokemonType.GRASS){
		    	if(p2Pok[j].getType() == PokemonType.WATER){
		    		point1++;
		    	}
		    	else if(p2Pok[j].getType() == PokemonType.GRASS){
		    		if(p1Pok[j].getCp() > p2Pok[j].getCp()){
		    			point1++;
		    		}
		    		else if(p1Pok[j].getCp() == p2Pok[j].getCp()){
		    			Random ran = new Random();
		    			int who =  ran.nextInt(2);
		    			if(who == 1)	point1++;
		    			else	point2++;
		    		}
		    		else	point2++;
		    	}
		    	else point2++;
		    }
		    else{
		    	if(p2Pok[j].getType() == PokemonType.FIRE){
		    		point1++;
		    	}
		    	else if(p2Pok[j].getType() == PokemonType.WATER){
		    		if(p1Pok[j].getCp() > p2Pok[j].getCp()){
		    			point1++;
		    		}
		    		else if(p1Pok[j].getCp() == p2Pok[j].getCp()){
		    			Random ran = new Random();
		    			int who =  ran.nextInt(2);
		    			if(who == 1)	point1++;
		    			else	point2++;
		    		}
		    		else	point2++;
		    	}
		    	else point2++;
		    }
		    if(point1 > 1 ){
		    	level = player1.getLevel();
				level++;
		    	System.out.println("Winner is "+player1.getPlayerName()+", and his/her level becomes "+ level +".");
				return player1;
			}
			else if(point2 > 1){
				level = player2.getLevel();
				level++;
				System.out.println("Winner is "+player2.getPlayerName()+", and his/her level becomes "+ level +".");
				return player2;
			}
		}
		return player2;
	}
}

