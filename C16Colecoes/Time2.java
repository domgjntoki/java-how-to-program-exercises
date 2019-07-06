package C16Colecoes;

import javaapplication1.desorganizado.*;

public class Time2 {
    private int hour;
    private int minute;
    private int second;
    
    public Time2(){
        this(0, 0, 0);
    }
    
    public Time2(int hour){
        this(hour, 0, 0);
    }
    
    public Time2(int hour, int minute){
        this(hour, minute, 0);
    }
    
    public Time2(int hour, int minute, int second){
        if (hour < 0 || hour >= 60)
            throw new IllegalArgumentException("hour must be 0-23");
        
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");
        
        this.second = hour * 3600 + minute * 60 + second;
    }
    
    public Time2 (Time2 time){
        this(time.getHour(), time.getMinute(), time.getSecond());
    }
    
    public void setTime(int hour, int minute, int second){
        if (hour < 0 || hour >= 60)
            throw new IllegalArgumentException("hour must be 0-23");
        
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");

        this.second = hour * 3600 + minute * 60 + second;
    }
    
    public void setHour(int hour){
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        
        int diferença = hour - this.hour;
        this.second += diferença * 3600;
    }
    
    public void setMinute(int minute){
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        
        int diferença = minute - this.minute;
        this.second = diferença * 60;
    }
    
    public void setSecond(int second){
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");
        
        int diferença = second - this.second;
        this.second += diferença;
    }
    
    public int getHour(){return second / 3600;}
    public int getMinute(){return second / 60 % 60;}
    public int getSecond(){
        int hora = second / 3600;
        int minuto = second / 60 % 60;
        return second - hora * 3600 - minuto * 60;
    }
    
    public String toUniversalString(){
        int hora = second / 3600;
        int minuto = second / 60 % 60;
        int segundo = second - hora * 3600 - minuto * 60;
        
        return String.format("%02d:%02d:%02d", 
                hora, minuto, segundo);
    }
    
    public String toString(){
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? getHour() : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12) ? "AM" : "PM");
                
    }
    
    public void tick(){
        second++;
        
        if(second / 3600 == 24)
            second = 0;
    }
    
    public void incrementMinute(){
        second += 60;
        if(second / 3600 == 24)
            second = 0;
    }
    
    public void incrementHour(){
        second += 3600;
        if(second / 3600 == 24)
            second = 0;
    }
}
