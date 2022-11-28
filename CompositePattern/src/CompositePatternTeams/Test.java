package CompositePatternTeams;

public class Test {
	
	public static void main (String []args) {
		
		//Initialisieren
		TeamComposite OlympicsTeams = new TeamComposite("Olympics Teams",94, 42);
		TeamComposite AsiaTeam = new TeamComposite("Asia Team", 29, 13);
		TeamComposite ChinaTeam = new TeamComposite("China Team", 23, 12);
	    TeamComposite AfghanistanTeam = new TeamComposite("Afghanistan Team", 6, 1);
		TeamComposite AfricaTeam = new TeamComposite("Africa Team", 10, 9);
		TeamComposite EuropeTeam = new TeamComposite("Europe Team", 50, 19);
		TeamComposite GermanyTeam = new TeamComposite("Germany Team", 32, 10);
		TeamComposite ItalyTeam = new TeamComposite("Italy Team", 18, 9);
		TeamComposite SouthAmericaTeam = new TeamComposite("South America Team", 5, 1);
		TeamComposite WomenChina = new TeamComposite("China-Women", 19, 10);
		TeamComposite MenChina = new TeamComposite("China-Men", 4, 2);
		TeamComposite WomenGermany = new TeamComposite("Germany-Women", 13, 3);
		TeamComposite MenGermany = new TeamComposite("Germany-Men", 25, 7);
		TeamComposite WomenItaly = new TeamComposite("Italy-Women", 7, 3);
		TeamComposite MenItaly = new TeamComposite("Italy-Men", 11, 6);
		TeamLeaf Teakwondo = new TeamLeaf("Women's Teackwondo", 4, 3);
		TeamLeaf Waterpolo = new TeamLeaf("Women's Waterpolo", 9, 2);
		TeamLeaf ArtisticGym = new TeamLeaf("Women's Artistic Gymnastics", 6, 5);
		TeamLeaf Shooting = new TeamLeaf("Men's Shooting", 4, 2);
		TeamLeaf Cycling = new TeamLeaf("Women's Cycling", 5, 2);
		TeamLeaf Tennis = new TeamLeaf("Women's Tennis", 8, 1);
		TeamLeaf TableTennis = new TeamLeaf("Men's Table Tennis", 10, 1);
		TeamLeaf FootballGER = new TeamLeaf("Men's Football", 15, 6);
		TeamLeaf AlpineSky = new TeamLeaf("Women's Alpine Sky", 7, 3);
		TeamLeaf FootballIT = new TeamLeaf("Men's Football", 6, 4);
		TeamLeaf SwimmingTeam = new TeamLeaf("Men's Swimming Team", 5, 2);
		
		//Men's and Women's Teams
		MenItaly.add(SwimmingTeam);
		MenItaly.add(FootballIT);
		WomenItaly.add(AlpineSky);
		ItalyTeam.add(MenItaly);
		ItalyTeam.add(WomenItaly);
		MenGermany.add(FootballGER);
		MenGermany.add(TableTennis);
		WomenGermany.add(Tennis);
		WomenGermany.add(Cycling);
		GermanyTeam.add(MenGermany);
		GermanyTeam.add(WomenGermany);
		EuropeTeam.add(ItalyTeam);
		EuropeTeam.add(GermanyTeam);
		
		//Asia
		MenChina.add(Shooting);
		WomenChina.add(ArtisticGym);
		WomenChina.add(Waterpolo);
		WomenChina.add(Teakwondo);
		ChinaTeam.add(MenChina);
		ChinaTeam.add(WomenChina);
		AsiaTeam.add(ChinaTeam);
		AsiaTeam.add(AfghanistanTeam);
		
		//OlympicsTeams
		OlympicsTeams.add(AsiaTeam);
		OlympicsTeams.add(AfricaTeam);
		OlympicsTeams.add(EuropeTeam);
		OlympicsTeams.add(SouthAmericaTeam);
	
		//Ausfuehrung der print-Aufgaben
		MenGermany.printNameAndAthletes();
		//GermanyTeam.printNameAndGoldMedals();
		//AsiaTeam.printNameAndGoldMedals();
		//OlympicsTeams.printNameAndAthletes();
	}
}
