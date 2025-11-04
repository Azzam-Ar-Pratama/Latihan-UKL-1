# Latihan-UKL-1
Tujuan:
Program ini menghitung ongkos pengiriman sebuah barang berdasarkan berat, jarak, dan volume paket. Jika volume paket melebihi ambang tertentu, dikenakan biaya volume tambahan.
Input yang diminta dari pengguna:
Nama barang (String)
Berat barang dalam kilogram (double)
Jarak pengiriman dalam kilometer (int)
Dimensi dalam centimeter: panjang, lebar, tinggi (double)
Proses / Perhitungan:
1. Menghitung volume paket dalam cm³: volume = panjang × lebar × tinggi.
2. Menentukan tarif per kilogram berdasarkan jarak:
jarak ≤ 10 km → biaya per kg = 4250
jarak > 10 km → biaya per kg = 6000
3. Jika volume > 100 cm³ maka dikenakan biaya volume flat sebesar 50.000 (biayaVolume).
4. Total ongkos dihitung:
jika ada biaya volume: total = (berat × biayaPerKg) + biayaVolume
jika tidak: total = berat × biayaPerKg
Output:
Program mencetak nota pengiriman yang menampilkan: nama barang, jarak, berat, volume, biaya per kg, biaya volume (jika ada), dan total ongkos.
