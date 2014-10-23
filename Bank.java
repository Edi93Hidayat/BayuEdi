import java.io.*;
import javax.swing.JOptionPane;

class Tabungan {
	String bank;
	String nama_nasabah;
	String rekening;
	int nabung;
	int penarikan;
	void saldo2() {
		JOptionPane.showMessageDialog(null,"Saldo Anda = "+ (nabung - penarikan));
	}
}
public class Bank {
	static BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] bank) throws Exception {
		Tabungan t;
		t= new Tabungan();
		boolean status = false;
		int kembali=0;
		while (kembali!=1){
		System.out.println("=====MENU=====");
		System.out.println("1. Menabung");
		System.out.println("2. Penarikan");
		System.out.println("3. Cek Saldo");
		System.out.println("4. View Data");
		System.out.println("5. Exit");
		System.out.println("==============\n");
		System.out.print("Silahkan Masukan Pilihan Anda : ");
		int pilihan=Integer.parseInt(input.readLine());		
		switch(pilihan){
			case 1:
				JOptionPane.showMessageDialog(null,"Silahkan Masukkan Data Anda");
				t.nama_nasabah = String.valueOf(JOptionPane.showInputDialog("Nama Nasabah"));
				t.rekening = String.valueOf(JOptionPane.showInputDialog("No Rekening"));
				t.nabung = Integer.valueOf(JOptionPane.showInputDialog("Menabung"));
				status = true;
				System.out.println("==============\n");
				System.out.println();
				System.out.println("Tekan Enter Untuk Kembali.....");
				String case1=input.readLine();
				kembali=0;
				break;
			case 2:
				if (status == true){
					int result = JOptionPane.showConfirmDialog(null,"Apakah Anda Ingin Melakukan Penarikan...?",
					"Konfirmasi",
					JOptionPane.OK_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE);
					String message;
						if (result == JOptionPane.OK_OPTION)
							t.penarikan = Integer.valueOf(JOptionPane.showInputDialog("Lakukan Penarikan"));
						else if (result == JOptionPane.CANCEL_OPTION)
							message="Anda Memilih Cancel";
				} else {
					JOptionPane.showMessageDialog(null,"Maaf Tabungan Anda Tidak Ada","Perhatian",
					JOptionPane.WARNING_MESSAGE);
				}
				break;
			case 3:
				int result2 = JOptionPane.showConfirmDialog(null,"Apakah Anda Ingin Melakukan Cek Saldo...?",
				"KONFIRMASI",
				JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE);
				String message;
				if (result2 == JOptionPane.OK_OPTION){
					t.saldo2();
				}
				else if (result2 == JOptionPane.CANCEL_OPTION)
					message ="Anda Memilih Cancel";
				break;
			case 4:
				int result3 = JOptionPane.showConfirmDialog(null,"Apakah Anda Ingin Melihat Data Transaksi...?",
				"Konfirmasi",
				JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE);
				String message3;
				if (result3 == JOptionPane.OK_OPTION){
					JOptionPane.showMessageDialog(null,
					"Nama Nasabah :"+t.nama_nasabah+"\n"+
					"Rekening :"+t.rekening+"\n"+
					"Nabung :"+t.nabung+"\n"+
					"Penarikan :"+t.penarikan);
				}
				else if(result3 == JOptionPane.CANCEL_OPTION)
					message3="Anda Memilih Cancel";
				break;
			case 5:
				JOptionPane.showMessageDialog(null,"Terima Kasih Telah Bertransaksi Di Bank Kami"+
				"\nSemoga Anda Enjoy");
				System.exit(0);
				break;
		}
	}
	}
}