import java.util.Scanner;

public class Index {
  
  String x = "Daffa"; // Create Objects in Index class
  int Angka = 19;     // modiefier Objects in Index class

  int Number = 20;    // Multiple Objects in Index.class
  
  // Multiple atributes
  String fName = "Aguss yudha"; // fullname
  String sName = "aguss";       // Short name
  int age = 24;
  // Multiple atributes

  public static void main(String[] args) {
    // Java - 00p (Java object Oriented Programming)
     Myoop();
  }
  
  static void Myoop() {

     // first Objects in Myoop

     Scanner Myobj = new Scanner(System.in);  // Scanner Java oop
     System.out.println("Masukkan inputan");
     String var = Myobj.nextLine();           // Scanner Java oop
     System.out.println(var);

     // first Objects in Myoop

     // Second Objects in Myoop

     Index getVar = new Index();
     System.out.println(getVar.x); // call Objects Index in  function Myoop
     Index Num = new Index();
     Num.Angka = 40;       // Change value Index class in Function Myoop
     System.out.println(Num.Angka);

     // Second Objects in Myoop

     // Third Objects in Myoop

     Index Getvar = new Index();   // call Multiple Objects Index in function Myoop
     Index Getvar2 = new Index();  // call Multiple Objects Index in function Myoop
     Getvar2.Number = 100;
     System.out.println(Getvar.Number);
     System.out.println(Getvar.Number);

    // Third Objects in Myoop
    

    // Four Objects in Myoop
    Index Name = new Index();
    Index Name1 = new Index();
    

    System.out.println("Hallo nama saya " + Name.fName + "A.K.A " + Name1.sName);
    System.out.println("Umur saya adalah " +  Name1.age);
  }
}