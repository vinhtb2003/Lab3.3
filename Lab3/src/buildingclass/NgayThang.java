package buildingclass;

import java.util.Scanner;

public class NgayThang {
	private int Ngay;
	private int Thang;
	private int Nam;
public NgayThang(int Ngay, int Thang, int Nam) {
	this.Ngay=Ngay;
	this.Thang=Thang;
	this.Nam=Nam;	
}
public boolean Hople() {
	int []ngayMax = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	if(Nam<0) {
		return false;
	}
	if(Thang<0&&Thang>12) {
		return false;
	}
	if(Nam%4==0) {
		ngayMax[2]=29;
	}
	if(Ngay > ngayMax[Thang]) {
		return false;
	}
	return true;

}
public void nhapNgayThang() {
	Scanner sc= new Scanner(System.in);
	do {
		System.out.println("Ngay: ");
		Ngay=sc.nextInt();
		System.out.println("Thang: ");
		Thang=sc.nextInt();
		System.out.println("Nam: ");
		Nam=sc.nextInt();
	}while( !Hople());
}
@Override
public String toString() {
	return "["+Ngay+"/"+Thang+"/"+Nam+"]";
}

}
