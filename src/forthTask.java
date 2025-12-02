void main() {
    String text = "იუპიტერის მთვარე — იო — არის ყველაზე ვულკანური ობიექტი მთელ მზის სისტემაში";
    char[] vowels = {'ა', 'ე', 'ი', 'ო', 'უ'};

    int sum = 0;
    int i = 0;
    while (i < text.length()) {
        char symbol = text.charAt(i);

        int j = 0;
        while (j < vowels.length){
            if (symbol != vowels[j]) {
                sum++;
                break;
            }
            j++;
            }
        i++;
    }


    System.out.println("ამ წინადადებაში არის " + sum + " თანხმოვანირ");
}
