void main() {

//String text = "იუპიტერის მთვარე — იო — არის ყველაზე ვულკანური ობიექტი მთელ მზის სისტემაში";
//char [] vowels = {'ა', 'ე', 'ი', 'ო', 'უ'};
//
//    int sum = 0;
//    for (int i = 0; i < text.length(); i++) {
//
//        if (text.charAt(i) == 'ა') {
//            sum++;
//        }
//    }
//        System.out.println("ტექსტში არის  " + sum + " ხმოვანი");


    String text = "იუპიტერის მთვარე — იო — არის ყველაზე ვულკანური ობიექტი მთელ მზის სისტემაში";
    char [] vowels = {'ა', 'ე', 'ი', 'ო', 'უ'};
       int sum =0;
    for (int i = 0;i <text.length(); i++){
        char symbol = text.charAt(i);


        for (int j =0; j< vowels.length; j++) {
           if (symbol == vowels[j]) {
               sum++;

            }
        }


    }
    System.out.println("ტექსტში არის " + sum + " ხმოვანი");



}