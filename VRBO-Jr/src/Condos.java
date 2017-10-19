
public class Condos
	{
String Place;
String Floor;
String Owner;
Double Cost;
int Bedrooms;
int Bathrooms;
String Pets;
String Conditioning;

public Condos (String pl ,String f, String o , double c, int be ,int ba , String pt , String a){
	 Place = pl;
	 Floor= f;
	 Owner= o;
	 Cost = c;
	Bedrooms= be;
	 Bathrooms = ba;
	Pets = pt ;
	 Conditioning = a;
 
}
public String getFloor()
	{
		return Floor;
	}
public void setFloor(String floor)
	{
		Floor = floor;
	}
public String getConditioning()
	{
		return Conditioning;
	}
public void setConditioning(String conditioning)
	{
		Conditioning = conditioning;
	}
public String getPlace()
	{
		return Place;
	}
public void setPlace(String place)
	{
		Place = place;
	}
public String getOwner()
	{
		return Owner;
	}
public void setOwner(String owner)
	{
		Owner = owner;
	}
public Double getCost()
	{
		return Cost;
	}
public void setCost(Double cost)
	{
		Cost = cost;
	}
public int getBedrooms()
	{
		return Bedrooms;
	}
public void setBedrooms(int bedrooms)
	{
		Bedrooms = bedrooms;
	}
public int getBathrooms()
	{
		return Bathrooms;
	}
public void setBathrooms(int bathrooms)
	{
		Bathrooms = bathrooms;
	}
public String getPets()
	{
		return Pets;
	}
public void setPets(String pets)
	{
		Pets = pets;
	}

	}
