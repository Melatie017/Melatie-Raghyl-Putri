import javax.swing.JOptionPane;

public class JavaLibs5026211017 {
	public static void main(String[] Args) {
		String nama;
		String alamatEmail;
		String namaBarang1;
		String namaBarang2;
		String namaBarang3;
		
		int jumlahBarang1;
		int jumlahBarang2;
		int jumlahBarang3;
		
		double harga1;
		double harga2;
		double harga3;
		
		
		nama = JOptionPane.showInputDialog("Tuliskan nama lengkap anda!");
		alamatEmail = JOptionPane.showInputDialog("Tuliskan alamat E-mail anda!");
		

		namaBarang1 = JOptionPane.showInputDialog("Tuliskan nama barang pertama yang " + nama + " beli!");
		jumlahBarang1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Berapa jumlah " + namaBarang1 + " yang " + nama + " beli?"));
		harga1 = Double.parseDouble(JOptionPane.showInputDialog("Berapa harga satuan dari " + namaBarang1 + "? (contoh:1.000)"));

		namaBarang2 = JOptionPane.showInputDialog("Tuliskan nama barang kedua yang " + nama + " beli!");		
		jumlahBarang2 = Integer.parseInt(JOptionPane.showInputDialog("Berapa jumlah " + namaBarang2 + " yang " + nama + " beli?"));
		harga2 = Double.parseDouble(JOptionPane.showInputDialog("Berapa harga satuan dari " + namaBarang2 + "? (contoh:1.000)"));

		namaBarang3 = JOptionPane.showInputDialog(null,"Tuliskan nama barang ketiga yang " + nama + " beli!");
		jumlahBarang3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Berapa jumlah " + namaBarang3 + " yang " + nama + " beli?"));
		harga3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Berapa harga satuan dari " + namaBarang3 + "? (contoh:1.000)"));

		String barang = namaBarang1 + ", " + namaBarang2 + ", " + namaBarang3;
		int totalSemuaBarang = jumlahBarang1 + jumlahBarang2 + jumlahBarang3;
		double totalSemuaHarga = jumlahBarang1*harga1 + jumlahBarang2*harga2 + jumlahBarang3*harga3;
		
		JOptionPane.showMessageDialog(null, nama + " telah membeli " + barang + " dengan total " + totalSemuaBarang + " buah.");
		JOptionPane.showMessageDialog(null, "Jadi, total belanjaan yang harus " + nama + " bayar sebesar Rp " + totalSemuaHarga);
		JOptionPane.showMessageDialog(null, "Tagihan telah kami kirim ke alamat E-mail " + alamatEmail);
		JOptionPane.showMessageDialog(null, "TERIMA KASIH KARENA SUDAH MENGUNJUNGI TOKO KAMI");

	}
}
