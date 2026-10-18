# Praktikum Pemrograman Berorientasi Objek (PBO / ADPL) - Modul 5
## Penerapan Prinsip SOLID Part 1 (SRP, OCP, LSP)

**Identitas Mahasiswa:**
- **Nama** : Satria Bakti Wijaya
- **NIM**  : 109092500017
- **Kelas/Prodi** : S1 Rekayasa Perangkat Lunak
- **Fakultas** : Fakultas Informatika
- **Perguruan Tinggi** : Telkom University Purwokerto
- **Tahun** : 2026

---

## 📌 Deskripsi Proyek
Proyek ini berisi implementasi kode praktikum Modul 5 mengenai **Prinsip SOLID Part 1 (Single Responsibility Principle, Open-Closed Principle, dan Liskov Substitution Principle)** dalam bahasa pemrograman Java (Maven Project). Proyek ini mencakup kode sebelum direfaktor (*bad practice*) dan kode setelah direfaktor sesuai pedoman *clean code* dan prinsip SOLID.

### 1. S: Single Responsibility Principle (SRP)
- **Sebelum Refaktor** (`unrefactored/services/UserService.java`): Kelas `UserService` memiliki 3 tanggung jawab sekaligus (logika user, eksekusi query SQL mentah, dan pengiriman email).
- **Setelah Refaktor** (`src/main/java/services/`):
  - `UserRepository.java`: Khusus menangani penyimpanan data dan query SQL.
  - `EmailService.java`: Khusus menangani pengiriman email dan notifikasi.
  - `UserService.java`: Khusus menangani aturan logika bisnis pembuatan akun pengguna.

### 2. O: Open-Closed Principle (OCP)
- **Sebelum Refaktor** (`unrefactored/calculator/AreaCalculator.java`): Menggunakan pemeriksaan tipe objek dengan `instanceof` dan percabangan `if-else`. Penambahan bentuk baru memerlukan modifikasi kode kalkulator.
- **Setelah Refaktor** (`src/main/java/calculator/`):
  - `Shape.java`: Interface abstraksi dengan method `double calculateArea()`.
  - `Rectangle.java`, `Circle.java`, `Triangle.java`: Mengimplementasikan interface `Shape`.
  - `AreaCalculator.java`: Menerima tipe `Shape` secara polimorfis (*terbuka untuk ekstensi, tertutup untuk modifikasi*).

### 3. L: Liskov Substitution Principle (LSP)
- **Sebelum Refaktor** (`unrefactored/birds/Chicken.java`): Mewarisi `Bird.java` namun melempar `UnsupportedOperationException` pada method `fly()`.
- **Setelah Refaktor** (`src/main/java/birds/`):
  - `Bird.java`: Superclass dengan karakteristik universal burung (`eat()`).
  - `Flyable.java`: Interface kapabilitas terbang.
  - `FlyingBird.java`: Burung yang dapat terbang (`implements Flyable`).
  - `Chicken.java`: Mewarisi `Bird` tanpa mengimplementasikan `Flyable`. Objek `Chicken` dapat menggantikan `Bird` secara aman tanpa menimbulkan runtime error.

---

## 🚀 Struktur Direktori
```
Code/
├── pom.xml                                  <- Konfigurasi Maven Project NetBeans
├── nbactions.xml                            <- Pemetaan shortcut Run F6 NetBeans ke Main
├── README.md                                <- Dokumentasi Proyek
├── unrefactored/                            <- Lampiran kode bad practice (sebelum refaktor)
│   ├── services/UserService.java
│   ├── calculator/AreaCalculator.java & Shapes.java
│   └── birds/Bird.java & Chicken.java
└── src/
    └── main/
        └── java/                            <- Lampiran kode refaktor SOLID
            ├── Main.java                    <- Driver uji coba demonstrasi SOLID
            ├── services/                    <- Implementasi SRP
            │   ├── UserRepository.java
            │   ├── EmailService.java
            │   └── UserService.java
            ├── calculator/                  <- Implementasi OCP
            │   ├── Shape.java
            │   ├── Rectangle.java
            │   ├── Circle.java
            │   ├── Triangle.java
            │   └── AreaCalculator.java
            └── birds/                       <- Implementasi LSP
                ├── Bird.java
                ├── Flyable.java
                ├── FlyingBird.java
                └── Chicken.java
```

---

## 💻 Cara Menjalankan Program
Proyek ini dapat langsung dibuka menggunakan **Apache NetBeans** (`File -> Open Project`) atau dijalankan melalui terminal:

```bash
# Kompilasi seluruh berkas Java
javac -d target/classes $(Get-ChildItem -Recurse src/main/java/*.java).FullName

# Jalankan program pengujian SOLID
java -cp target/classes Main
```
