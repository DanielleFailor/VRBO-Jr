import java.util.ArrayList;
import java.util.Scanner;

public class vrboJr
	{
		static ArrayList<Condos> rental = new ArrayList<Condos>();
		static boolean stillLooking = true;
		static boolean atSite = true;
		static Scanner userInput = new Scanner(System.in);
		static Scanner userInput1 = new Scanner(System.in);
		static Scanner userInput2 = new Scanner(System.in);
		static Scanner userInput3 = new Scanner(System.in);
		static Scanner userInput4 = new Scanner(System.in);
		static Scanner userInput5 = new Scanner(System.in);
		static Scanner userInput6 = new Scanner(System.in);
		static Scanner userInput7 = new Scanner(System.in);
		static Scanner userInput8 = new Scanner(System.in);
		static Scanner userInput9 = new Scanner(System.in);
		static ArrayList<String> dates = new ArrayList<String>();

		public static void main(String[] args)
			{

				intro();
				fillrental();
				fillDates();
				site();

				while (atSite){
					System.out.println("Click enter to start looking at condos.");
					String fake1 = userInput1.nextLine();
								
				while (stillLooking)
					{
						printWhere();
						whichOne();
						rental();
						playing();
					}
				site();
				}
				System.out.println("Come again soon!");
			}

		public static void intro()
			{
				System.out.println("Hello user, What's your name?");
				String name = userInput.nextLine();
				System.out.println(" Hello " + name + ", welcome to Rent.com. We have a series of condos for you to "
						+ "look at today, so you can rent a day in January. Good luck in finding a condo you want to rent. ");
				

			}

		public static void fillrental()
			{

				rental.add(new Condos("Granby Ranch, Colorado", "3rd", "Jeff", 170.50, 2, 2, "not allow pets",
						"no air conditioning"));
				rental.add(new Condos("Savannah, Georgia", "1st", "George", 210.00, 5, 4, "not allow pets",
						" air conditioning"));
				rental.add(new Condos("Columbus, Ohio", "2nd", "Bob", 230.50, 5, 6, "allows dogs only",
						" no air conditioning"));
				rental.add(new Condos("Orlando, Florida", "1st", "Dolly", 300.50, 3, 2, "allows pets",
						" air conditioning"));
				rental.add(new Condos("Fowler, Kansas", "2nd", "Lily", 180.50, 3, 2, "allows dogs only",
						" air conditioning"));
				rental.add(new Condos("Boston, Massachetts", "3rd", "Fred", 280.50, 3, 2, "allows pets",
						" air conditioning"));
			}

		public static void printWhere()
			{

				for (int i = 0; i < rental.size(); i++)
					{
						System.out.println((i + 1) + ". " + rental.get(i).getPlace() + " is on the "
								+ rental.get(i).getFloor() + " Floor, owned by " + rental.get(i).getOwner()
								+ ". It costs $" + rental.get(i).getCost() + " for every 2 days. It has "
								+ rental.get(i).getBedrooms() + " bedroooms and " + rental.get(i).getBathrooms()
								+ " bathrooms." + " It does " + rental.get(i).getPets() + ", and has "
								+ rental.get(i).getConditioning() + ".");

					}

			}

		public static void whichOne()
			{

				System.out.println("Which one of these are you interested in?");
				int location = userInput2.nextInt();
				if (rental.get(location - 1).getPlace() == rental.get(0).getPlace())
					{
						String[] privilegesG = new String[6];
						privilegesG[0] = "Wifi";
						privilegesG[1] = "hot tub";
						privilegesG[2] = "pool";
						privilegesG[3] = "library";
						privilegesG[4] = "fitness area";
						privilegesG[5] = "great view";
						System.out.println("The privileges of " + rental.get(0).getPlace() + " are: ");
						for (int i = 0; i < privilegesG.length; i++)
							{

								System.out.println(privilegesG[i]);
							}

					} else if (rental.get(location - 1).getPlace() == rental.get(1).getPlace())
					{
						String[] privilegesS = new String[4];
						privilegesS[0] = "Wifi";
						privilegesS[1] = "pool";
						privilegesS[2] = "library";
						privilegesS[3] = "fitness area";
						System.out.println("The privileges of " + rental.get(1).getPlace() + " are: ");
						for (String s : privilegesS)
							{

								System.out.println(s);
							}
					} else if (rental.get(location - 1).getPlace() == rental.get(2).getPlace())
					{
						String[] privilegesC = new String[3];
						privilegesC[0] = "Wifi";
						privilegesC[1] = "hot tub";
						privilegesC[2] = "library";

						System.out.println("The privileges of " + rental.get(2).getPlace() + " are: ");
						for (String s : privilegesC)
							{

								System.out.println(s);
							}
					} else if (rental.get(location - 1).getPlace() == rental.get(3).getPlace())
					{
						String[] privilegesO = new String[6];
						privilegesO[0] = "Wifi";
						privilegesO[1] = "hot tub";
						privilegesO[2] = "pool";
						privilegesO[3] = "library";
						privilegesO[4] = "fitness area";
						privilegesO[5] = "great view";

						System.out.println("The privileges of " + rental.get(3).getPlace() + " are: ");
						for (String s : privilegesO)
							{

								System.out.println(s);
							}

					} else if (rental.get(location - 1).getPlace() == rental.get(4).getPlace())
					{
						String[] privilegesF = new String[3];
						privilegesF[0] = "Wifi";

						privilegesF[1] = "pool";
						privilegesF[2] = "library";

						System.out.println("The privileges of " + rental.get(4).getPlace() + " are: ");
						for (String s : privilegesF)
							{

								System.out.println(s);
							}

					} else if (rental.get(location - 1).getPlace() == rental.get(5).getPlace())
					{
						String[] privilegesB = new String[5];
						privilegesB[0] = "Wifi";

						privilegesB[1] = "pool";
						privilegesB[2] = "library";
						privilegesB[3] = "fitness area";
						privilegesB[4] = "great view";

						System.out.println("The privileges of " + rental.get(5).getPlace() + " are: ");
						for (String s : privilegesB)
							{

								System.out.println(s);
							}

					}
				System.out.println("Click enter to continue to the next page" + ".");

				String fake2 = userInput3.nextLine();

			}

		public static void fillDates()
			{
				dates.add("January 1");
				dates.add("January 2");
				dates.add("January 3");
				dates.add("January 4");
				dates.add("January 5");
				dates.add("January 6");
				dates.add("January 7");
				dates.add("January 8");
				dates.add("January 9");
				dates.add("January 10");
				dates.add("January 11");
				dates.add("January 12");
				dates.add("January 13");
				dates.add("January 14");
				dates.add("January 15");
				dates.add("January 16");
				dates.add("January 17");
				dates.add("January 18");
				dates.add("January 19");
				dates.add("January 20");
				dates.add("January 21");
				dates.add("January 22");
				dates.add("January 23");
				dates.add("January 24");
				dates.add("January 25");
				dates.add("January 26");
				dates.add("January 27");
				dates.add("January 28");
				dates.add("January 29");
				dates.add("January 30");
				dates.add("January 31");
			}

		public static void rental()
			{

				System.out.println("Would you like to rent a day in January?");
				System.out.println("(1) Yes");
				System.out.println("(2) No");
				int answer = userInput4.nextInt();

				if (answer == 1)
					{

						for (int i = 0; i < dates.size(); i++)
							{
								System.out.println((i + 1) + ". " + dates.get(i));
							}
						System.out.println("Which day in January do you want rent?");
						int day = userInput5.nextInt();
						System.out.println("You want to rent on " + dates.get(day - 1) + ".");

					} else if (answer == 2)
					{
						System.out.println("Ok");
					}
				System.out.println("Click enter to continue to the next page.");

				String fake3 = userInput6.nextLine();
			}

		public static void playing()
			{
				System.out.println("Do you want to go back and look at more Condos?");
				System.out.println("(1)Yes");
				System.out.println("(2)No");
				int look = userInput7.nextInt();
				if (look == 1)
					{
						System.out.println("Hope you find what you want!");
						System.out.println("Click enter to continue.");

						String fake4 = userInput8.nextLine();
					} else if (look == 2)
					{
						System.out.println("Bye");
						stillLooking = false;
					}

			}
	public static void site()
		{
			System.out.println("Do you want to exit from this site?");
			System.out.println("(1)Yes");
			System.out.println("(2)No");
			int look = userInput9.nextInt();
			if (look == 1)
				{
					System.out.println("Bye");
					atSite = false;
				} else if (look == 2)
				{
					System.out.println("Please, continue");
					
				}
		}

	}
