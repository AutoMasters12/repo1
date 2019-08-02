package componnets;

public class Flights {

	public static void SearchFlights() throws Exception {
		SearchFlights.selectTriptype();
		SearchFlights.setFromLoc();
		SearchFlights.setToLoc();
		SearchFlights.selectDate();
		SearchFlights.selectAdults();
		SearchFlights.selectChildren();
		SearchFlights.selectInfants();
		SearchFlights.submit();
	}
}
