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
    
'''    

![Class Diagram Banyak](https://user-images.githubusercontent.com/83533356/147459301-347ed88f-0dbc-4c8c-b7bd-46910d4253fc.PNG)


# Class Diagram

```Language
classDiagram

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
'''    

![Class Diagram Dikit](https://user-images.githubusercontent.com/83533356/147459320-7d9ced7e-605c-4221-9d6d-43a59157e2cc.PNG)

    


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
'''         

![ERD](https://user-images.githubusercontent.com/83533356/147459343-3bb51478-330f-46f1-bcd2-eb2aa6ba11cc.PNG)



