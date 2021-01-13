package javaapplication6;


    public class Item {
    private String name;
    private double weight;
    private double cost;
    

        public Item(String name, double weight, double cost){
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }
        public String getName() {
        return name;
    }
 
    public double getWeight() {
        return weight;
    }
 
    public double getCost() {
        return cost;
    }
 
    public void setWeight(double weight) {
        this.weight = weight;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public void setCost(double cost) {
        this.cost = cost;
    }
    @Override
    public String toString() {
        return name + '\''
                + "весом ="+ '\'' + weight +'\''
                + "стоимостью" +'\'' + cost + '}';
    
    
}
}

