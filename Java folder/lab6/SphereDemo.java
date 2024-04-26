class SphereDemo
{    private double radius;
    private String ID;
    public double getRadius() {return radius;}
    public void placeRadius(double radius) {this.radius = radius;}
    public String placeID() {return ID;}
    public void placeID(String ID ) {this.ID = ID;}
    public double vol() {return (4.0 / 3) * Math.PI * radius * radius * radius;}
    public double zone() {return 4 * Math.PI * radius * radius;}
    @Override
    public String toString()
    {return "Id: " + ID + ", Rad: " + radius + ", Zone: " + zone() + ", Vol: " + vol();}
}