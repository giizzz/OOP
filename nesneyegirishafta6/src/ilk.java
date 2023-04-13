public class ilk {
    public static void main(String[] args) {
        Araba araba1=new Araba();
        araba1.renk="Mavi";
        araba1.yolcuSayisi=5;
        araba1.uretimYili=2023;
        araba1.marka="Opel";
        araba1.model="Corsa";
        araba1.fiyat=150000;
        araba1.agirlik=1200;



        araba1.git();
        System.out.println("Arabanın markası "+araba1.marka);
        System.out.println("Arabanın modeli "+araba1.model);
        System.out.println("Arabanın ağırlığı "+araba1.agirlik);
        System.out.println("Arabanın rengi "+araba1.renk);
        System.out.println("Arabanın yolcu sayısı "+araba1.yolcuSayisi);
        System.out.println("Arabanın üretim yılı "+araba1.uretimYili);
        System.out.println("Arabanın fiyatı "+araba1.fiyat);
        araba1.dur();

    }

}
