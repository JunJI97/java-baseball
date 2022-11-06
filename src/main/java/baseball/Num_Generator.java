package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Num_Generator {

    public static List<Integer> MakeComputerNum() { // 중복없는 3자리 난수 생성
        List<Integer> MakeNum = new ArrayList<>(3);

        while (MakeNum.size() < 3) {
            int temp = Rand();
            if(!MakeNum.contains(temp)) {
                MakeNum.add(temp);
            }
        }
        return MakeNum;
    }

    public static int Rand() { // 1~9 범위 난수 생성
        Random rand = new Random();
        return rand.nextInt(9) + 1;
    }
}



