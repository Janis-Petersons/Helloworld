package lekcijaCetri.labDarbs;

public class Velosipeds {
  String zimols;
  int ramjaIzmers;
  int atrums=0;

  public void printAtrums(){
    System.out.println(atrums);
  }

  public void paatrinajums(){
    System.out.println("Velo paatrinas");
    atrums = atrums +5;
  }

  public void bremzesana(){
    System.out.println("Velo Bremze");
    atrums = atrums -5;
  }
    }

