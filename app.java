
/* частотный словарь элементов одномерного массива*/
public static void main(String[] args) {
    int[] numbers = {1,9,9,0,2,8,0,9};
    int[] result = getMostFrequentNumbers(numbers);
    System.out println(Arrays String,(result));
}
public static int[] getMostFrequentNumbers(int[] numbers){

    if(numbers.length > 0){

        int[] uniqueNumbers = new int[] { numbers[0] };

        // поиск всех уникальных элементов
        for(int i = 1; i < numbers.length; i++){
            int number = numbers[i];

        // если в массиве нет такого элемента, то расширяем массив и добавляем элемент в конец
            
        if(indexOf(uniqueNumbers, number) == -1){
                uniqueNumbers = Arrays.copyOf(uniqueNumbers, uniqueNumbers.length + 1);
                uniqueNumbers[uniqueNumbers.length - 1] = number;
            }
        }

        int[] counts = new int[uniqueNumbers.length];
        int max = 0;

        // считаем число вхождений для каждого уникального элемента.
        
        for(int number : numbers){
            int index = indexOf(uniqueNumbers, number);
            counts[index]++;

            if(counts[index] > max){
                max = counts[index];
            }
        }

        int[] result = new int[0];

        // забираем все элементы с максимальной частотой, расширяем результирующий массив
        for(int i = 0; i < counts.length; i++){
            if(counts[i] == max){
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = uniqueNumbers[i];
            }
        }

        return result;
    }

        //  когда во входном массиве нет элементов
    
        return new int[0];
}

       // функция поиска индекса элемента в массиве

       public static int indexOf(int[] array, int element){
        for(int i = 0; i < array.length; i++){
        if(array[i] == element){
            return i;
        }
    }
    return -1;
}
