class StringVariables {
    public static void main(String[] args){

        // CREATING STRINGS

        // String name = "tyler";
        // THIS WAY IS EASIER TO READ
        // String literalString1 = "abc";
        // String literalString2 = "abc";
        //THESE TWO BELOW ARE NOT THE SAME
        // String objectString = new String("xyz");
        // String objectString2= new String("xyz");

        // System.out.println(literalString1 == literalString2);
        // System.out.println(objectString == objectString2);

        //FORMATING STRINGS

        // String name = "tyler"; //%s
        // String country = "United States"; 
        // int age = 24; //%d
        // double gpa = 4.0; //%f
        // char percentSign = '%'; //%c
        // boolean tellingTheTruth = false; //%b
        
        // String formattedString = String.format("My name is %s. I am from %s. I am %d years old.", name , country, age);

        // System.out.println(formattedString);


        String name = "Tyler Letendre";
        String isEmpty = "";
        System.out.println(name.length());
        System.out.println(name.isEmpty());
        System.out.println(isEmpty.isEmpty());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.replace("Tyler","Alex"));

        String updatedName = name.replace("Tyler", "Cory");

        System.out.println(updatedName);

        String string1 = new String("abc");
        String string2 = new String("abc");

        System.out.println(string1.equalsIgnoreCase(string2));


        
    }
}
