
public class QB {
	private String firstName;
	private String lastName;
	private double interceptions;
	private double comp;
	private double att;
	private double yards;
	private double td;
	private double passRating;
	
	private double part1;
	private double part2;
	private double part3;
	private double part4;
	private double part5;
	
	QB(String userFirst, String userLast, double userInt, double userAtt, double userYard, double userComp, double userTouch)
	{
		firstName = userFirst;
		lastName = userLast;
		interceptions = userInt;
		att = userAtt;
		yards = userYard;
		comp = userComp;
		td = userTouch;
	}
	
	public void setRating() {
		part1 = ((comp/att)-.3)*5; System.out.println("part1: " + part1 );
		part2 = ((yards/att)-3)*.25;  System.out.println("part2: " + part2 );
		part3 = ((td / att) * 20 ) + 2.375;  System.out.println("part3: " + part3 );
		part4 = (((interceptions / att) * 25)) ;System.out.println("part4: " + part4 );
		part5 = (part1 + part2 + part3 - part4) / 6; System.out.println("part5: " + part5 );
		passRating = part5 * 100;   System.out.println("PR: " + passRating );
	}
	
	String getProfile() {
		String profile;
		profile = "\n\n\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nInterceptions: " + interceptions + 
				"\nComplete Passes: " + comp + "\nAttempts: " + att + "\nYards: " + yards + "\nTouch Downs: " + td 
				+ "\nPass Rating: " + passRating;
		System.out.println(profile);
		return profile;
	}
}
