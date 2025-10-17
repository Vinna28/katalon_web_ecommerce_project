# Katalon Web E-Commerce Automation Project

## Overview
Proyek ini adalah **personal project** yang menggunakan **Katalon Studio** untuk melakukan automation testing pada situs web e-commerce (misalnya situs demo seperti Carmudi). Tujuannya adalah membuktikan kemampuan otomatisasi end-to-end menggunakan Katalon.

---

##  What the Project Covers
- Web UI Automation Testing untuk fitur-fitur e-commerce seperti pencarian produk, navigasi kategori, detail produk, dan checkout.
- Pengelolaan **Object Repository**, **Test Cases**, dan penggunaan fitur seperti **Self-Healing** di Katalon Studio.
- Pembuatan struktur proyek yang bersih dengan folders: `Scripts`, `Test Cases`, `Object Repository`, `Include/Config`, `Profiles`, `Reports`.

---

##  Hasil Running
[Screenshot](https://drive.google.com/file/d/1BCGcfUTWY9w9GcXqhkmmhYOn_cQWG71t/view?usp=sharing)

---

##  Getting Started

### Prerequisites
- Katalon Studio terbaru  
- Java JDK (jika belum termasuk di dalam Katalon installer)  
- Git (opsional, untuk version control)

### How to Run
1. Clone repositori:
   ```bash
   git clone https://github.com/Vinna28/katalon_web_ecommerce_project.git
Buka Katalon Studio, lalu pilih File → Open Project, dan arahkan ke folder project
Pilih Test Case yang ingin dijalankan (misalnya bagian carmudi) dan klik tombol Run
Setelah test selesai, laporan hasil akan tersedia di folder Reports/

Project Structure
```bash
.
├── Scripts/                # Kode automation script
├── Object Repository/      # Object-based locator yang reusable
├── Test Cases/             # Test case-driven workflows
├── Reports/                # Hasil test execution dan self-healing logs
├── include/ config/        # Test data atau konfigurasi global
├── Profiles/               # Konfigurasi environment (prod, staging)
└── settings/               # Project-specific Katalon settings

### What I Learned

Membangun automatisasi web end-to-end dengan Katalon Studio
Mengelola lokasi elemen secara efisien menggunakan Object Repository
Menyusun struktur proyek QA automation yang maintainable dan reusable, meski hanya di tingkat personal project
Penggunaan Page Object Model (POM) agar kode lebih modular dan scalable

### Future Improvements

Tambahkan data-driven testing untuk skenario checkout atau input variatif
Integrasi reporting seperti HTML atau Allure report agar hasil test terdokumentasi lebih menarik
Tambahkan GitHub Actions atau pipeline CI/CD untuk menjalankan test otomatis saat commit (seperti contoh pada [Katalon CI integrations]) 

License
MIT License — feel free to explore, reuse, or adapt this project for learning and demo purposes.
