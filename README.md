# Final_Project_Kelompok_PBO

Anggota :

- Aditya Apri Nugroho 2017051026
- Muhammad Rizki Kurniawan  2017051024
- Nur Mita Utami 2017051058

# Pembagian Tugas :

- Aditya Apri Nugroho : 

- Muhammad Rizki Kurniawan : 

- Nur Mita Utami : 

# Libraries and Tools of this project:

- mysql-connector-java-8.0.26.jar
- scene builder
- netbean editor
- JDK 1.8

# Class Diagram

```Language
classDiagram

    Nasabah <|-- Individu
    Nasabah <|-- Perusahaan
    Nasabah "1"--o"*" Rekening : has
    Nasabah o-- NasabahDataModel : Data Modeling
    NasabahDataModel <-- Controller : Data Control
    NasabahDataModel --> DBHelper : DB Connection
    Controller <.. Form : Form Control      

    class Nasabah{
      <<abstract>>
      #IntegerProperty id
      #StringProperty nama
      #StringProperty alamat
    }
    
    class Individu{
      -StringProperty nik
      -StringProperty npwp
    }
    class Perusahaan{
      -IntegerProperty rek
      -DoubleProperty saldo
    }
    class Rekening{
      -DoubleProperty balance
      +Double getSaldo()
      +Integer getRek()
    }

    class NasabahDataModel{
        Connection conn
        addNasabah()
        addRekening()
        getIndividu()
        getPerusahaan()
        getRekening()
        nextID()
        nextRek()
        updateSaldo()
    }

    class Controller{
        initialize()
        btnTambah()
        btnHapus()
        btnRefresh()
        viewIndividu()
        viewPerusahaan()
        viewRekening()
    }
    class DBHelper{
        - String USERNAME
        - String PASSWORD
        - String DB
        getConnection()
        getConnection(String driver)
        createTable();
    }
    
    ![Class Diagram Banyak](https://user-images.githubusercontent.com/83533356/147458890-955c0dd8-c9fb-4df1-8d11-5d6f0ca73620.PNG)

    Nasabah <|-- Individu
    Nasabah <|-- Perusahaan
    Nasabah "1"--o"*" Rekening : has
    
    class Nasabah{
      <<abstract>>
      #int id
      #String nama
      #String alamat
    }
    
    class Individu{
      -String nik
      -String npwp
    }
    class Perusahaan{
      -String nib
    }
    class Rekening{
      -int rek
      -double saldo
      +double getSaldo()
      +double getRek()
    }
    
    ![Class Diagram Dikit](https://user-images.githubusercontent.com/83533356/147458926-8f9cf1a1-33f0-4b7b-8b72-5f9a14f5ec6d.PNG)
    
```

# ER Diagram

```Language
erDiagram
          Nasabah ||..|| Individu : is
          Nasabah ||--|| Perusahaan : is
          Nasabah ||--|{ Rekening: "has"
          Nasabah {
            int id
            string nama
            string alamat
          }
          Individu{
            string nik
            string npwp
          }
          Perusahaan{
            string nib
          }
          Rekening{
            int rek
            double saldo
          }
          
          ![ERD](https://user-images.githubusercontent.com/83533356/147458964-614cbada-4707-4aa3-9ffd-e091015c411e.PNG)

```
