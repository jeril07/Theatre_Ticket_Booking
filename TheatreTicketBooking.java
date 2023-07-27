package project1;

import java.util.Scanner;

public class TheatreTicketBooking {

	public static void main(String[] args) {
		
				Scanner inp = new Scanner(System.in);
				int []arr[]= new int [5][4];
				
				System.out.println("ENTER SEAT AVAILABILITY :");
				for(int i=0;i<=4;i++) {
					for(int j=0;j<=3;j++) {
						arr[i][j]=inp.nextInt();
					}
				}
				
				System.out.println();
				System.out.println("THEATRE SEATS :");
				for(int i=0;i<=4;i++) {
					for(int j=0;j<=3;j++) {
						System.out.print(arr[i][j]+" ");
					}
					System.out.println();
				}
				
				System.out.println();
				System.out.println("ENTER SEAT ROW , COLUMN AND COUNT : ");
				
				char ch = inp.next().charAt(0);
				ch = Character.toUpperCase(ch);
				int chascii = ch;
				int row ;
				
				int column = inp.nextInt();
				int col = column;
				column--;
				
				int count = inp.nextInt();
				
				if(chascii<70 && col<4) {
				int check = 65;
				int allseat=1;
				for(int i=65;i<97;i++) {
					if(chascii==i) {
						row = i;
						for(int k=0;k<=4;k++) {
							if(row==check) {
								for(int j=0;j<=3;j++) {
									if(column==j) {
										while(count!=0) {
										if(arr[k][j]==0) {
											
											allseat++;
											count--;
										}
										else {
											System.out.println("THE SEAT REQUESTED WONT BE CONTINOUS");
										}
										j++;
										}
									}
								}
							}
							check++;
						}
					}
				}
				
				if(allseat==col) {
				for(int i=65;i<97;i++) {
					if(chascii==i) {
						row = i;
						for(int k=0;k<=4;k++) {
							if(row==check) {
								for(int j=0;j<=3;j++) {
									if(column==j) {
										while(count!=0) {
										if(arr[k][j]==0) {
											
											boolean a = true;
											System.out.println();
											arr[k][j]=1;
											System.out.println(a);
											System.out.println("YOU HAVE BOOKED A SEAT IN "+ch+ col++);
											System.out.println();
											count--;
										}
										else {
											boolean f=false;
											System.out.println(f);
											System.out.println("SEAT IS ALREADY BOOKED");
											System.out.println();
										}
										j++;
										}
									}
								}
							}
							check++;
						}
					}
				}
				
				System.out.println("SEATS AVAILABLITY AFTER BOOKING");
				for(int i=0;i<=4;i++) {
					for(int j=0;j<=3;j++) {
						System.out.print(arr[i][j]+" ");
					}
					System.out.println();
				}
				}
				else if(chascii>=70 || col>4)
					System.out.println("ROW OR COLUMN YOU ENTERED IS BEYOND RANGE");
				}

	}

}
