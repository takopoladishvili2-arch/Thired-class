void main() {

//    for (int i = 1; i < 50 ; i++) {
//        System.out.println(i);
//    }

//    for (int i = 1; i <20 ; i ++) {
//        if (i == 7 || i ==13 )
//            continue;
//
//        System.out.println(i);
//    }
//

//
//for (int i = 1; i < 100; i ++ ){
//     if (i == 47)
//         break;
//    System.out.println(i);
//}

//    int i = 2;
//
//    for (; i <= 10; i = i * 2 ){
//        System.out.println(i);
//    }

    int [] numbers = {2, 4, 6, 34, 45, 23, 45, 32, 34};
   int sum = 0;
  for (int i = 0; i < numbers.length; i++) {
      sum = sum + numbers[i];
      System.out.println(numbers[sum]);
  }





}