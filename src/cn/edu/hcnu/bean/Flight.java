package cn.edu.hcnu.bean;

import cn.edu.hcnu.bean.Customer;

import java.util.Set;

public class Flight {
    private String id;
    private String FlightId;
    private String planeType;//飞机型号
    private String currentSeatsNum; //当前座位数
    private String departureAirPort;//出发机场
    private String destinationAirPort;//到达机场
    private String departureDate;//出发日期


    @Override
    public String toString() {
        return "Flight{" +
                "FlightId='" + FlightId + '\'' +
                ", planeType='" + planeType + '\'' +
                ", currentSeatsNum='" + currentSeatsNum + '\'' +
                ", departureAirPort='" + departureAirPort + '\'' +
                ", destinationAirPort='" + destinationAirPort + '\'' +
                ", departureDate='" + departureDate + '\'' +
                '}';
    }

    public Flight(String flightId, String planeType, String currentSeatsNum, String departureAirPort, String destinationAirPort, String departureDate) {
       this.FlightId = flightId;
        this.planeType = planeType;
        this.currentSeatsNum = currentSeatsNum;
        this.departureAirPort = departureAirPort;
        this.destinationAirPort = destinationAirPort;
        this.departureDate = departureDate;
    }

    public String getCurrentSeatsNum() {
        return currentSeatsNum;
    }

    public void setCurrentSeatsNum(String currentSeatsNum) {
        this.currentSeatsNum = currentSeatsNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getDepartureAirPort() {
        return departureAirPort;
    }

    public void setDepartureAirPort(String departureAirPort) {
        this.departureAirPort = departureAirPort;
    }

    public String getDestinationAirPort() {
        return destinationAirPort;
    }

    public void setDestinationAirPort(String destinationAirPort) {
        this.destinationAirPort = destinationAirPort;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureData) {
        this.departureDate = departureData;
    }
}
