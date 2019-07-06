package C08;


public enum C08TrafficLight {
    RED(60),
    GREEN(15),
    YELLOW(5);
    
    private final int second;
    
    C08TrafficLight(int second){
        this.second = second;
    }
    
    public int getSecond(){return second;}
}
