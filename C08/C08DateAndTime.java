package C08;

import javaapplication1.desorganizado.Date2;

public class C08DateAndTime {
    private int hour;
    private int minute;
    private int second;
    Date2 date;
       
    public C08DateAndTime(int hour, int minute, int second, Date2 date){
        if (hour < 0 || hour >= 60)
            throw new IllegalArgumentException("hour must be 0-23");
        
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");
        
        this.second = hour * 3600 + minute * 60 + second;
        this.date = date;
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
        
        return String.format("%02d:%02d:%02d | %s", 
                hora, minuto, segundo, date);
    }
    
    public String toString(){
        return String.format("%d:%02d:%02d %s | %s",
                ((getHour() == 0 || getHour() == 12) ? getHour() : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12) ? "AM" : "PM", date);
                
    }
    
    public void tick(){
        second++;
        if(second >= 3600 * 24)
            date.nextDay();
        if(second / 3600 == 24)
            second = 0;
    }
    
    public void incrementMinute(){
        second += 60;
        if(second >= 3600 * 24)
            date.nextDay();
        if(second / 3600 == 24)
            second = 0;
    }
    
    public void incrementHour(){
        second += 3600;
        if(second >= 3600 * 24)
            date.nextDay();
        if(second / 3600 == 24)
            second = 0;
        
    }
}
