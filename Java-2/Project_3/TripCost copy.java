package doctor_jay;

public class TripCost {
   private final double KILOMETERS_PER_MILE = 1.609347;
   private final double LITERS_PER_GALLON = 3.78541178;

   private final double distance;
   private final double gasCost;
   private final double gasMileage;
/*////////////////////*//*////////////////////*//*////////////////////*//*////////////////////*/
/*////////////////////*//*////////////////////*//*////////////////////*//*////////////////////*/
   private final int days;
   private final double hotelCost;
   private final double foodCost;
   private final double attractionsCost;
/*////////////////////*//*////////////////////*//*////////////////////*//*////////////////////*/
/*////////////////////*//*////////////////////*//*////////////////////*//*////////////////////*/
   /**
    * Constructs a TripCost object with the given parameters.
    * @param distance The total distance of the trip (in miles or kilometers)
    * @param gasCost The cost of gasoline (per gallon or liter)
    * @param gasMileage The gas mileage (miles per gallon or kilometers per liter)
    * @param days The number of days of the trip
    * @param hotelCost The cost of accommodation per day
    * @param foodCost The cost of food per day
    * @param attractionsCost The cost of attractions for the entire trip
    */
   public TripCost(double distance,
                   double gasCost,
                   double gasMileage,
                   int days, double hotelCost, double foodCost, double attractionsCost) {
       this.distance = distance;
       this.gasCost = gasCost;
       this.gasMileage = gasMileage;
/*////////////////////*//*////////////////////*//*////////////////////*//*////////////////////*/
/*////////////////////*//*////////////////////*//*////////////////////*//*////////////////////*/
       this.days = days;
       this.hotelCost = hotelCost;
       this.foodCost = foodCost;
       this.attractionsCost = attractionsCost;
   }
/*////////////////////*//*////////////////////*//*////////////////////*//*////////////////////*/
/*////////////////////*//*////////////////////*//*////////////////////*//*////////////////////*/
   /**
    * Calculates the total trip cost.
    * @return The total trip cost
    */
   public double calculateTotalTripCost() {
       double gasolineCost = (distance / gasMileage) * gasCost;
       double totalAccommodationCost = hotelCost * days;
       double totalFoodCost = foodCost * days;
       return gasolineCost + totalAccommodationCost + totalFoodCost + attractionsCost;
   }
}
