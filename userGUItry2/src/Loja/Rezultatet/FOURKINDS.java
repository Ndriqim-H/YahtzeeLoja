package Rezultatet;

public class FOURKINDS {

    private int shuma=0;
    private int count1s = 0, count2s = 0, count3s = 0, count4s = 0, count5s = 0, count6s = 0;

    public FOURKINDS(int[] rezultatiRoll) {
        for (int i = 0; i < rezultatiRoll.length; i++) {
            switch (rezultatiRoll[i]) {
                case 1:
                    count1s++;
                    break;
                case 2:
                    count2s++;
                    break;
                case 3:
                    count3s++;
                    break;
                case 4:
                    count4s++;
                    break;
                case 5:
                    count5s++;
                    break;
                case 6:
                    count6s++;
                    break;
            }
        }

        for(int j = 0; j < 5; j++) {
            if ((count1s == 4) || (count2s == 4) || (count3s == 4) || (count4s == 4) || (count5s == 4) || (count6s == 4)) {
                shuma += rezultatiRoll[j];
            }
        }

    }

    public int getShuma() {
        return shuma;
    }
}

