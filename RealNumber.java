public class RealNumber{
  //Instance variables
  private double value;
  //Constructor for making a real number
  public RealNumber(double num){
    value = num;
  }
  //Get variables
  public double getValue(){
    return value;
  }
  //toString
  public String toString(){
    return "" + value;
  }
  //Setters and basic operations
  /*Return the sum of this and the other*/
  public double add(RealNumber other){
    return value + other.getValue();
  }
  /*Return the product of this and the other*/
  public double multiply(RealNumber other){
    return value * other.getValue();
  }
  /*Return the this divided by the other*/
  public double divide(RealNumber other){
    return value / other.getValue();
  }
  /*Return the this minus the other*/
  public double subtract(RealNumber other){
    return value - other.getValue();
  }
  //Comparison functions
  public boolean equals(RealNumber num){
    return value == num.getValue();
  }
  public boolean greaterThan(RealNumber num){
    return value > num.getValue();
  }
  //Method that returns a copy of RealNumber
  public RealNumber copy(){
    return new RealNumber(this.value);
  }
}
