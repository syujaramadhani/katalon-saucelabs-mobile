# Mobile Automation - Swag Labs (Katalon Studio)

Automation test aplikasi Android Swag Labs Mobile App (v2.7.1) menggunakan Katalon Studio.
Semua test case ditulis manual tanpa Record Mobile.

## Struktur

- `Data Files/apk/` - file APK
- `Test Cases/` - test case
- `Test Suites/` - `TS_SwagLabs`
- `Object Repository/` - Test Object
- `Test Listeners/` - setup dan teardown aplikasi
- `report/` - hasil run terakhir

## Cara menjalankan

1. Sambungkan device Android (USB debugging aktif), cek dengan `adb devices`.
2. Buka project di Katalon Studio.
3. Buka `Test Suites/TS_SwagLabs`, pilih Android dan device, lalu Run.

Report tersimpan di `Reports/` (HTML, CSV, log).

## Test Suite dan coverage

`TS_SwagLabs` menjalankan 4 test case:

| Test case | Jenis | Verifikasi |
|---|---|---|
| TC01_Login_Success | Positif | Halaman Products tampil |
| TC02_Login_WrongPassword | Negatif | Pesan error password salah |
| TC03_Login_EmptyUsername | Negatif | Pesan "Username is required" |
| TC04_Add_To_Cart | Positif | Produk masuk ke cart |
