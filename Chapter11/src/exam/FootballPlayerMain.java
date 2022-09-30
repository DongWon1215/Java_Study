package exam;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class FootballPlayerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<FootballPlayer> illustratedbook = new LinkedList<FootballPlayer>();
		illustratedbook.add(new FootballPlayer(1,2,"aaa","bbb"));
		illustratedbook.add(new FootballPlayer(2,1,"bbb","ccc"));
		illustratedbook.add(new FootballPlayer(3,0,"ccc","ddd"));
		for(FootballPlayer player : illustratedbook)
			player.toString();
		
		
		System.out.println();
		
		Set<FootballPlayer> playerSet = new HashSet<FootballPlayer>();
		playerSet.add(new FootballPlayer(1,2,"aaa","bbb"));
		playerSet.add(new FootballPlayer(2,3,"aaa","bbb"));
		playerSet.add(new FootballPlayer(3,4,"ccc","ccc"));
		for(FootballPlayer player : playerSet)
			player.toString();
		
		
		TreeSet<FootballPlayer> playerTreeSet = new TreeSet<FootballPlayer>();
		playerTreeSet.add(new FootballPlayer(1,2,"aaa","bbb"));
		playerTreeSet.add(new FootballPlayer(2,3,"aaa","bbb"));
		playerTreeSet.add(new FootballPlayer(3,4,"ccc","ccc"));
		playerTreeSet.add(new FootballPlayer(4,5,"ddd","ddd"));
		playerTreeSet.add(new FootballPlayer(5,6,"eee","eee"));
		playerTreeSet.add(new FootballPlayer(6,7,"fff","fff"));
		for(FootballPlayer player : playerTreeSet)
			player.toString();
		
		
		
		HashMap<Integer, FootballPlayer> playerMap = new HashMap<Integer, FootballPlayer>();
		FootballPlayer a = new FootballPlayer(1,1,"aaa","aaa");
		playerMap.put(a.getNumber(), a);
		//FootballPlayer b = new FootballPlayer(2,2,"bbb","bbb");
		//playerMap.put(b.getNumber(), b);
		FootballPlayer c = new FootballPlayer(1,1,"aaa","aaa");
		playerMap.put(c.getNumber(), c);
		System.out.println(playerMap.size());
			//playerMap.get(2).toString();
			playerMap.get(1).toString();
	}

}
