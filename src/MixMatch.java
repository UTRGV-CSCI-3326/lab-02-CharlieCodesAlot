public class MixMatch {
    public static void main(String[] args){
        String name = "Joann";
        System.out.println(name + " <- String, this is my girlfriend");
        char c = 'C';                       // char has a size of 2 bytes
        System.out.println(c + " <- char, this is my first initial");
        short var_short = 32767;                // short has a size of 2 bytes
        System.out.println(var_short + " <- short, stores whole numbers between -32,768 and +32,767");
        int var_int = 2147483647;                     // int has a size of 4 bytes
        System.out.println(var_int + " <- Integer, stores whole numbers from -2,147,483,648 to 2,147,483,647");
        long big_num = 9223372036854775807L;           // long has a size of 8 bytes
        System.out.println(big_num + " <- long, stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.");
        float var_float = 3.14f;             // float has a size of 4 bytes
        System.out.println(var_float + " <- float, stores fractional numbers up to 6-7 decimal digits.");
        double var_double = 3.1415926535;     // double has a size of 8 bytes
        System.out.println(var_double + " <- double, stores fractional numbers up to 15 decimal digits.");
        boolean varBoolean = true;              // boolean has a size of one bit (0 or 1)
        System.out.println(varBoolean + " <- boolean, stores true or false values");

    }
}