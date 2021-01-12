package cn.edu.hcnu.ui;


import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.bill.mpl.FlightServicempl;
import cn.edu.hcnu.bill.mpl.IFlightService;

import java.util.Scanner;
import java.util.UUID;

public class MainUI  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("输入你想要操作的对应数字");
            System.out.println("按1，录入航班信息");
            System.out.println("按2，显示所有航班信息");
            System.out.println("按3，查看航班信息");
            System.out.println("按4，机票预定");
            System.out.println("按5，机票退改");
            System.out.println("按6，退出系统");

            int choice = sc.nextInt();
            if (choice == 1) {
                String id = UUID.randomUUID().toString();
                System.out.print("请输入航班编号:");
                String flightId = sc.next();
                System.out.print("请输入机型:");
                String planeType = sc.next();
                System.out.print("请输入座位数:");
                String currentSeatsNum = sc.next();
                System.out.print("请输入起飞机场:");
                String departureAirPort = sc.next();
                System.out.print("请输入目的机场:");
                String destinationAirPort = sc.next();
                System.out.print("请输入起飞时间:");
                String departureDate = sc.next();
                Flight flight = new Flight(flightId, planeType, currentSeatsNum, departureAirPort, destinationAirPort, departureDate);
                IFlightService iFlightService = new FlightServicempl();
                iFlightService.insertFlight(flight);
                System.out.println(flight.toString()+"\n");
            }

        }
    }
}
