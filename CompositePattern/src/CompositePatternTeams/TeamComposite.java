package CompositePatternTeams;

import java.util.ArrayList;
import java.util.List;

public class TeamComposite implements Team {
	
	private String name;
	private int numAthletes;
	private int numGoldMedals;
	private List <Team> childTeams = new ArrayList<Team>();
	
	public TeamComposite(String name, int numAthletes, int numGoldMedals) {
		this.name = name;
		this.numAthletes = numAthletes;
		this.numGoldMedals = numGoldMedals;
	}
	
	public void add(Team team) {
		childTeams.add(team);
		
	}

	public void remove(Team team) {
		childTeams.remove(team);
		
	}

	public List<Team> getChildren() {
		return childTeams;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getAthletesNum() {
		return numAthletes;
	}

	@Override
	public int getGoldMedalsNum() {
		return numGoldMedals;
	}

	@Override
	public void printNameAndAthletes() {
		System.out.print("Team:" + getName());
		System.out.print(", Number of Athletes: " + getAthletesNum());
		System.out.print("\r" + "\t");
		childTeams.forEach((Team team) -> {
			 team.printNameAndAthletes();
		});
		
	}

	@Override
	public void printNameAndGoldMedals() {
		System.out.print("Team: " + getName());
		System.out.print(", Number of Gold Medals: " + getGoldMedalsNum());
		System.out.print("\r" + "\t");
		
		childTeams.forEach((Team team) -> {
			 team.printNameAndGoldMedals();
		});
		
	}

	@Override
	public void print() {
		System.out.print("Team: " + getName());
		System.out.print(", Number of Athletes: " + getAthletesNum());
		System.out.print(", Number of Gold Medals: " + getGoldMedalsNum());
		System.out.print("\r" + "\t");
		
		childTeams.forEach((Team team) -> {
			 team.printNameAndGoldMedals();
			 team.printNameAndAthletes();
		});
		
	}

}
