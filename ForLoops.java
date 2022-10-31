class ForLoops {
    public static void main(String[] args) {
        // for(int number = 0; number < 10 ; number ++){
        //     if (number == 0){
        //         System.out.println("printed");
        //     }else{
        //         System.out.println("printed again");
        //     }
        // } 

        // int numbers[] = {1,2,3,4,5,6,7,8,9,10};

        // int sum = 0;

        // for(int index = 0; index < numbers.length ;  index++){
        //         sum += numbers[index];
        //     }
        // System.out.println(sum);

        for(int number = 1; number <= 10; number++){
            for(int multipler = 1; multipler <= 10 ; multipler++){
                System.out.printf("%d x %d = %d \n", number, multipler, number * multipler);
            }
        }
    }
}
