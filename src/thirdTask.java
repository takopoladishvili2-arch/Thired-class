void main() {

    int [] numbers = {11, 222, 333, 44, -55, 6, 7, 8,};

    for (int i =0; i < numbers.length; i++){
        if (i ==5 )
            continue;
        System.out.println(numbers[i]);
    }

}