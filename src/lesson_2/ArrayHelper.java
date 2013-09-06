package lesson_2;


public final
class ArrayHelper {



    public static void populateArrayRandom(int[] array, int maxValue){

        for (int i = 0; i < array.length; i++){
            array[i] = generateRandomInt(maxValue);
        }

    }

    public static int generateRandomInt(int maxValue) {

        return (int)((Math.random()*(maxValue-1))+1);
    }

    public static boolean isValueInArray (int[] array, int j){
        for (int i = 0; i < array.length; i++){
            if (array[i] == j) return true;
        }
        return false;
    }

    static int countDublicate(int[] arrayleft, int[]arrayright){
        int n = 0;
        for (int i= 0; i < arrayleft.length; i++){
            if (isValueInArray(arrayright, arrayleft[i])) n++;
        }
        return n;
    }

    // Простое обьединение
    public static int[] merge (int[] arrayLeft, int[] arrayRight){
        int count = 0;

        boolean[] array3 = new boolean[5000];

        for(int i = 0; i < arrayLeft.length; i++){
            array3[arrayLeft[i]] = true;
        }

        for(int i = 0; i < arrayRight.length; i++){
            array3[arrayRight[i]] = true;
        }

        for (int i = 0; i < 5000; i++){
            if (array3[i] == true) count++;
        }

        int[] arrayResult = new int[count];

        int item = 0;
        for (int i = 0; i < 5000; i++){
            if (array3[i] == true) {
                arrayResult[item] = i;
                item++;
            }

        }

        return arrayResult;
    }

}
