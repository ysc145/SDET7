package gun20;

public class ödev4 {
    public static void main(String[] args) {
        //4. int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        //Arraydaki en büyük 2. elemanı yazdıran bir program yazın.


        int[]sayılar={15,25,22,18,30};

        int max=sayılar[0];

        for (int i=0;i<sayılar.length;i++){

            if (max<sayılar[i]){

                max=sayılar[i];


            }
        }
        System.out.println("max = " + max);
    }
}
