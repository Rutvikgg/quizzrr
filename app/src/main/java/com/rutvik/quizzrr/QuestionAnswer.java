package com.rutvik.quizzrr;

public class QuestionAnswer {
    public static String question[] ={
            "1. What is the correct way to declare an integer variable in C?",
            "2. Which keyword is used to exit from a loop in C?",
            "3. How do you dynamically allocate memory in C?",
            "4. What is the operator used for pointer access in C?",
            "5. Which function is used to print formatted output in C?",
            "6. Which header file should be included to work with files in C?",
            "7. How do you create a single-line comment in C?",
            "8. In C, what is the maximum value that an unsigned int can hold?",
            "9. What is the purpose of the \"if\" statement in C?",
            "10. How do you declare a constant in C?",
            "11. What is the C standard library function for finding the length of a string?",
            "12. What does the \"sizeof\" operator return in C?",
            "13. How do you declare and initialize a character array in C?",
            "14. Which C data type is used to store a single character?",
            "15. What is the symbol for the \"logical OR\" operator in C?",
            "16. Which function is used to read a character from the standard input in C?",
            "17. What is the purpose of the \"switch\" statement in C?",
            "18. Which data type is used to represent true or false values in C?",
            "19. How do you include a header file named \"example.h\" in your C program?",
            "20. What is the correct syntax for a \"while\" loop in C?"
    };

    public static String choices[][] = {
            {"int x;"," x int;","integer x;"," int = x;"},
            {"break","exit","quit","return"},
            {"malloc()","allocate()","create()","new()"},
            {".","->","::",":"},
            {"printf()","print()","display()","show()"},
            {"stdlib.h","string.h","math.h","stdio.h"},
            {"// Comment","/* Comment */","-- Comment","# Comment"},
            {"32767","65535","2147483647","4294967295"},
            {"To declare a variable","To loop through code","To perform conditional execution","To define a function"},
            {"const x;","x constant;","constant int x;","const int x;"},
            {"strlength()","strlen()","lengthof()","strcount()"},
            {"The size of an expression","The size of a variable","The address of a variable","The data type of a variable"},
            {"char str[] = \"Hello\";","char str = \"Hello\";","char str[5] = \"Hello\";","char[] = \"Hello\";"},
            {"char","character","chr","singlechar"},
            {"&","|","&&","||"},
            {"getc()","read()","input()","getchar()"},
            {"To declare a switch variable","To perform arithmetic operations","To define a function","To select among multiple cases"},
            {"bool","boolean","int","truefalse"},
            {"#include \"example.h\"","include example.h","include <example.h>","#include <example.h>"},
            {"for (int i = 0; i < 10; i++)","repeat (int i = 0; i < 10; i++)","while (i < 10)","loop (int i = 0; i < 10; i++)"},
    };

    public static String correctAnswers[] = {
            "int x;",
            "break",
            "malloc()",
            "->",
            "printf()",
            "stdio.h",
            "// Comment",
            "4294967295",
            "To perform conditional execution",
            "const int x;",
            "strlen()",
            "The size of a variable",
            "char str[] = \"Hello\";",
            "char",
            "||",
            "getchar()",
            "To select among multiple cases",
            "bool",
            "#include \"example.h\"",
            "while (i < 10)"
    };
}
