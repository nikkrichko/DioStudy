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

    public static int[] innerJoin(int[] arrayLeft, int[] arrayRight){

        int[] arrayResult = new int[countDublicate(arrayLeft,arrayRight)];
        int item = 0;
        for(int i = 0; i < arrayLeft.length; i++){

            if (ArrayHelper.isValueInArray(arrayRight, arrayLeft[i])){

                {
                    arrayResult[item++] = arrayLeft[i];

                }
            }
        }
        return arrayResult;

    }

    public static int[] leftJoin(int[] arrayLeft, int[] arrayRight){
        int i = 0;
        int[] arrayResult = new int[arrayLeft.length + countDublicate(arrayRight, arrayLeft)];
        for (i = 0; i < arrayLeft.length; i++){
            arrayResult[i] = arrayLeft[i];
        }
        for (int j = 0; j < arrayRight.length; j++) {
            if(ArrayHelper.isValueInArray(arrayLeft, arrayRight[j])){
                arrayResult[i++] = arrayRight[j];
            }

        }
        return arrayResult;
    }

    public static int[] outerJoin(int[] arrayLeft, int[] arrayRight){
        int razmer = 0;
        int item = 0;

        for (int i = 0; i < arrayLeft.length; i++ ){
            if (!isValueInArray(arrayRight, arrayLeft[i]))
                razmer++;
        }

        for (int i = 0; i < arrayRight.length; i++ ){
            if (!isValueInArray(arrayLeft, arrayRight[i]))
                razmer++;
        }
        int[] arrayResult = new int[razmer];

        for (int i = 0; i < arrayLeft.length; i++ ){
            if (!isValueInArray(arrayRight, arrayLeft[i]))
                arrayResult[item++] = arrayLeft[i];
        }

        for (int i = 0; i < arrayRight.length; i++ ){
            if (!isValueInArray(arrayLeft, arrayRight[i])){
                arrayResult[item++] = arrayRight[i];
            }
        }
        return arrayResult;
    }

}
