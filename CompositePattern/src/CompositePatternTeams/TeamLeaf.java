package CompositePatternTeams;

public class TeamLeaf implements Team {
	
	private String name;
	private int numAthletes;
	private int numGoldMedals;
	
	public TeamLeaf(String name, int numAthletes, int numGoldMedals) {
		this.name = name;
		this.numAthletes = numAthletes;
		this.numGoldMedals = numGoldMedals;
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
		System.out.print("\t" + "Team: " + getName());
		System.out.print(", Number of Athletes: " + getAthletesNum());	
		System.out.print("\r" + "\t");
	}

	@Override
	public void printNameAndGoldMedals() {
		System.out.print("\t" + "Team: " + getName());
		System.out.print(", Number of Gold Medals: " + getGoldMedalsNum());
		System.out.print("\r" + "\t");
	}

	@Override
	public void print() {
		System.out.print("\t" + "Team: " + getName());
		System.out.print(", Number of Athletes: " + getAthletesNum());
		System.out.print(", Number of Gold Medals: " + getGoldMedalsNum());
		System.out.print("\r" + "\t");
	}

}
