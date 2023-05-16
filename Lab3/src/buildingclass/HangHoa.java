package buildingclass;

import java.util.Scanner;

public class HangHoa {
private String maHang;
private String tenHang;
private String nhaSanxuat;
private int gia;

public HangHoa() {
}
public HangHoa(String maHang, String tenHang, String nhaSanxuat, int gia) {
	this.maHang= maHang;
	this.tenHang=tenHang;
	this.nhaSanxuat=nhaSanxuat;
	this.gia=gia;	
}
public String getmaHang() {
	return maHang;
}
public void setmaHang(String maHang) {
	this.maHang=maHang;
}
public String gettenHang() {
	return tenHang;
}
public void settenHang(String tenHang) {
	this.tenHang=tenHang;
}
public String getnhaSanxuat() {
	return nhaSanxuat;
}
public void setnhaSanxuat(String nhaSanxuat) {
	this.nhaSanxuat=nhaSanxuat;
}
public int getgia() {
	return gia;
}
public void setgia(int gia) {
	this.gia=gia;
}

public void nhapHangHoa() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Ma hang: ");
	maHang=sc.nextLine();
	System.out.println("Ten hang: ");
	tenHang=sc.nextLine();
	System.out.println("Nha san xuat: ");
	nhaSanxuat=sc.nextLine();
	System.out.println("Gia tien: ");
    gia=sc.nextInt();
}

public String toString() {
	return " [maHang=" + maHang + ", tenHang=" + tenHang + ", nhaSanxuat=" + nhaSanxuat + ", gia=" + gia + "]";
}



}