/*
6.  Write a class Time with three data members to store hr, min and seconds. Create two constructors and apply checks to set valid time.
(hr<24, min<60, sec<60). Also create display function which displays all data members.

*/



package assignment_4;

public class Time {

	    private int hr;
	    private int min;
	    private int sec;

	    public Time() {
	        this.hr = 0;
	        this.min = 0;
	        this.sec = 0;
	    }

	    
	    public Time(int hr, int min, int sec) {
	        
	        if (hr >= 0 && hr < 24) {
	            this.hr = hr;
	        } else {
	            this.hr = 0; 
	        }

	        if (min >= 0 && min < 60) {
	            this.min = min;
	        } else {
	            this.min = 0; 
	        }

	        if (sec >= 0 && sec < 60) {
	            this.sec = sec;
	        } else {
	            this.sec = 0; 
	        }
	    }

	 
	    public void displayTime() {
	        System.out.printf("Time: %02d:%02d:%02d\n", hr, min, sec);
	    }

	    
	    public static void main(String[] args) {
	        
	        Time time1 = new Time();
	        time1.displayTime(); 
	        
	        Time time2 = new Time(12, 30, 45);
	        time2.displayTime();

	        
	        Time time3 = new Time(25, 61, 70); 
	        time3.displayTime(); 
	    }

	}


