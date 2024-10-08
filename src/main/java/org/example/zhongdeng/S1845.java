package org.example.zhongdeng;

public class S1845 {

    boolean[]  seats;
    int minNum=1;
    int avaiSeats=0;
    int avaiSeatsStart=1;
    public S1845(int n) {
        seats = new boolean[n+1];
    }

    public int reserve() {
        if(avaiSeats>0){
            for(;avaiSeatsStart<minNum;avaiSeatsStart++){
                if(!seats[avaiSeatsStart]){
                    seats[avaiSeatsStart]=true;
                    avaiSeats--;
                    return avaiSeatsStart;
                }
            }
        }
        seats[minNum]=true;
        return minNum++;
    }

    public void unreserve(int seatNumber) {
        seats[seatNumber]=false;
        avaiSeats++;
        if(avaiSeatsStart>seatNumber){
            avaiSeatsStart = seatNumber;
        }
    }

}