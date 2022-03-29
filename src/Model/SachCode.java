
package Model;


public class SachCode {
    int masach ;
    String Tensach ;
    String TheLoaiSach;
    String Tacgia ;
    int SoLuong ;
    String TinhTrang ;
    String TacGia ;
    String NhaXuatBan ;
    int NamXB ;
    String TomTatNoiDung ;
    byte[] picture;

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public SachCode(int masach, String Tensach, String TheLoaiSach, String Tacgia, int SoLuong, String TinhTrang, String TacGia, String NhaXuatBan, int NamXB, String TomTatNoiDung, byte[] image) {
        this.masach = masach;
        this.Tensach = Tensach;
        this.TheLoaiSach = TheLoaiSach;
        this.Tacgia = Tacgia;
        this.SoLuong = SoLuong;
        this.TinhTrang = TinhTrang;
        this.TacGia = TacGia;
        this.NhaXuatBan = NhaXuatBan;
        this.NamXB = NamXB;
        this.TomTatNoiDung = TomTatNoiDung;
        
        this.picture = image;
    }

    public SachCode() {
        
    }
    
        public int getMasach() {
             return masach;
        }
    	public void setMasach(int masach) {
		this.masach = masach;
	}
	public String getTensach() {
		return Tensach;
	}
	public void setTensach(String tensach) {
		Tensach = tensach;
	}
	public String getTheLoaiSach() {
		return TheLoaiSach;
	}
	public void setTheLoaiSach(String theLoaiSach) {
		TheLoaiSach = theLoaiSach;
	}
	public String getTacgia() {
		return Tacgia;
	}
	public void setTacgia(String tacgia) {
		Tacgia = tacgia;
	}
	public int getSoLuong() {
		return SoLuong;
	}
	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}
	public String getTinhTrang() {
		return TinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		TinhTrang = tinhTrang;
	}
	public String getTacGia() {
		return TacGia;
	}
	public void setTacGia(String tacGia) {
		TacGia = tacGia;
	}
	public String getNhaXuatBan() {
		return NhaXuatBan;
	}
	public void setNhaXuatBan(String nhaXuatBan) {
		NhaXuatBan = nhaXuatBan;
	}
	public int getNamXB() {
		return NamXB;
	}
	public void setNamXB(int namXB) {
		NamXB = namXB;
	}
	public String getTomTatNoiDung() {
		return TomTatNoiDung;
	}
	public void setTomTatNoiDung(String tomTatNoiDung) {
		TomTatNoiDung = tomTatNoiDung;
	}
        public byte[] getImage(){
            return picture;
        }
}
