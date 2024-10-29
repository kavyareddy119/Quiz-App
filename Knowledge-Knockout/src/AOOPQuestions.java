public class AOOPQuestions implements Questions {
    private String[][] questions;
    private String[][] answers;

    public AOOPQuestions() {
        questions = new String[100][5];
        answers = new String[100][1];

        questions[0][0] = "Which is used to find and fix bugs in the Java programs?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";
        answers[0][0] = "JDB";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";
        answers[1][0] = "int";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";
        answers[2][0] = "java.util package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";
        answers[3][0] = "Marker Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";
        answers[4][0] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";
        answers[5][0] = "Remote interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";
        answers[6][0] = "import";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";
        answers[7][0] = "Java Archive";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";
        answers[8][0] = "java.lang.StringBuilder";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";
        answers[9][0] = "Bytecode is executed by JVM";

        // Adding additional questions

        questions[10][0] = "Which keyword is used to create a subclass in Java?";
        questions[10][1] = "super";
        questions[10][2] = "this";
        questions[10][3] = "extends";
        questions[10][4] = "instanceof";
        answers[10][0] = "extends";

        questions[11][0] = "Which method is used to start a thread in Java?";
        questions[11][1] = "init()";
        questions[11][2] = "start()";
        questions[11][3] = "run()";
        questions[11][4] = "resume()";
        answers[11][0] = "start()";

        questions[12][0] = "Which collection class allows you to grow or shrink its size and provides indexed access to its elements?";
        questions[12][1] = "Array";
        questions[12][2] = "ArrayList";
        questions[12][3] = "LinkedList";
        questions[12][4] = "HashSet";
        answers[12][0] = "ArrayList";

        questions[13][0] = "Which method must be implemented by all threads?";
        questions[13][1] = "run()";
        questions[13][2] = "start()";
        questions[13][3] = "stop()";
        questions[13][4] = "main()";
        answers[13][0] = "run()";

        questions[14][0] = "Which of the following is not an OOP concept in Java?";
        questions[14][1] = "Inheritance";
        questions[14][2] = "Encapsulation";
        questions[14][3] = "Polymorphism";
        questions[14][4] = "Compilation";
        answers[14][0] = "Compilation";

        questions[15][0] = "Which operator is used to create an object in Java?";
        questions[15][1] = "new";
        questions[15][2] = "create";
        questions[15][3] = "new()";
        questions[15][4] = "create()";
        answers[15][0] = "new";

        questions[16][0] = "Which method can be defined only once in a program?";
        questions[16][1] = "main method";
        questions[16][2] = "finalize method";
        questions[16][3] = "static method";
        questions[16][4] = "private method";
        answers[16][0] = "main method";

        questions[17][0] = "Which keyword is used in the definition of the subclass?";
        questions[17][1] = "extends";
        questions[17][2] = "super";
        questions[17][3] = "this";
        questions[17][4] = "instanceof";
        answers[17][0] = "extends";

        questions[18][0] = "Which of these is used to interface with a database in Java?";
        questions[18][1] = "JDBC";
        questions[18][2] = "JNDI";
        questions[18][3] = "J2EE";
        questions[18][4] = "JVM";
        answers[18][0] = "JDBC";

        questions[19][0] = "Which of the following is not a Java features?";
        questions[19][1] = "Dynamic";
        questions[19][2] = "Architecture Neutral";
        questions[19][3] = "Use of pointers";
        questions[19][4] = "Object-oriented";
        answers[19][0] = "Use of pointers";

        questions[20][0] = "Which of these are selection statements in Java?";
        questions[20][1] = "break";
        questions[20][2] = "continue";
        questions[20][3] = "for()";
        questions[20][4] = "if()";
        answers[20][0] = "if()";

        questions[21][0] = "Which of these is used to generate an HTML file in Java?";
        questions[21][1] = "Applet";
        questions[21][2] = "Servlet";
        questions[21][3] = "RMI";
        questions[21][4] = "JSP";
        answers[21][0] = "JSP";

        questions[22][0] = "Which of these are used to convert source code into byte code in Java?";
        questions[22][1] = "JDK";
        questions[22][2] = "JRE";
        questions[22][3] = "JIT";
        questions[22][4] = "JVM";
        answers[22][0] = "JDK";

        questions[23][0] = "Which keyword is used for method overriding in Java?";
        questions[23][1] = "this";
        questions[23][2] = "super";
        questions[23][3] = "extends";
        questions[23][4] = "static";
        answers[23][0] = "super";

        questions[24][0] = "Which of the following is not a Java reserved word?";
        questions[24][1] = "array";
        questions[24][2] = "goto";
        questions[24][3] = "const";
        questions[24][4] = "switch";
        answers[24][0] = "array";

        questions[25][0] = "Which of these is returned by operator '&' ?";
        questions[25][1] = "Character";
        questions[25][2] = "Boolean";
        questions[25][3] = "Integer";
        questions[25][4] = "Float";
        answers[25][0] = "Boolean";

        questions[26][0] = "Which of these is a wrapper class?";
        questions[26][1] = "Integer";
        questions[26][2] = "int";
        questions[26][3] = "float";
        questions[26][4] = "boolean";
        answers[26][0] = "Integer";

        questions[27][0] = "Which of these is used to declare a constant in Java?";
        questions[27][1] = "static";
        questions[27][2] = "final";
        questions[27][3] = "abstract";
        questions[27][4] = "volatile";
        answers[27][0] = "final";

        questions[28][0] = "Which of these methods is a part of String class?";
        questions[28][1] = "length()";
        questions[28][2] = "size()";
        questions[28][3] = "getSize()";
        questions[28][4] = "toString()";
        answers[28][0] = "length()";

        questions[29][0] = "Which of these is a loop construct that will always be executed at least once?";
        questions[29][1] = "for";
        questions[29][2] = "while";
        questions[29][3] = "do-while";
        questions[29][4] = "None";
        answers[29][0] = "do-while";

        questions[30][0] = "Which of these packages contains the exception Stack Overflow in Java?";
        questions[30][1] = "java.lang";
        questions[30][2] = "java.util";
        questions[30][3] = "java.io";
        questions[30][4] = "java.net";
        answers[30][0] = "java.lang";

        questions[31][0] = "Which of these is not an access modifier?";
        questions[31][1] = "protected";
        questions[31][2] = "void";
        questions[31][3] = "public";
        questions[31][4] = "private";
        answers[31][0] = "void";

        questions[32][0] = "Which of these is not a feature of Java?";
        questions[32][1] = "Dynamic";
        questions[32][2] = "Architecture Neutral";
        questions[32][3] = "Use of pointers";
        questions[32][4] = "Object-oriented";
        answers[32][0] = "Use of pointers";

        questions[33][0] = "Which of these is used to access a member of a class before the object of that class is created?";
        questions[33][1] = "static";
        questions[33][2] = "this";
        questions[33][3] = "final";
        questions[33][4] = "super";
        answers[33][0] = "static";

        questions[34][0] = "Which of these methods is a part of Thread class?";
        questions[34][1] = "yield()";
        questions[34][2] = "sleep()";
        questions[34][3] = "wait()";
        questions[34][4] = "notify()";
        answers[34][0] = "yield()";

        questions[35][0] = "Which of these is used to implement an abstract method?";
        questions[35][1] = "Abstract class";
        questions[35][2] = "Interface";
        questions[35][3] = "Concrete class";
        questions[35][4] = "None";
        answers[35][0] = "Concrete class";

        questions[36][0] = "Which of these is not a type of constructor in Java?";
        questions[36][1] = "Default constructor";
        questions[36][2] = "Parameterized constructor";
        questions[36][3] = "Copy constructor";
        questions[36][4] = "None";
        answers[36][0] = "Copy constructor";

        questions[37][0] = "Which of these keywords is used to refer to a member of the base class from the subclass?";
        questions[37][1] = "super";
        questions[37][2] = "this";
        questions[37][3] = "final";
        questions[37][4] = "static";
        answers[37][0] = "super";

        questions[38][0] = "Which of these is not a part of the Java collection framework?";
        questions[38][1] = "Maps";
        questions[38][2] = "Sets";
        questions[38][3] = "List";
        questions[38][4] = "Array";
        answers[38][0] = "Array";

        questions[39][0] = "Which of these classes is used to handle file operations in Java?";
        questions[39][1] = "File";
        questions[39][2] = "FileReader";
        questions[39][3] = "FileWriter";
        questions[39][4] = "FileInputStream";
        answers[39][0] = "File";

        questions[40][0] = "Which of these is not a feature of exception handling in Java?";
        questions[40][1] = "Try";
        questions[40][2] = "Catch";
        questions[40][3] = "Throw";
        questions[40][4] = "Finally";
        answers[40][0] = "Throw";

        questions[41][0] = "Which of these is a member of the java.lang package?";
        questions[41][1] = "String";
        questions[41][2] = "ArrayList";
        questions[41][3] = "LinkedList";
        questions[41][4] = "HashMap";
        answers[41][0] = "String";

        questions[42][0] = "Which of these is not a keyword in Java?";
        questions[42][1] = "double";
        questions[42][2] = "switch";
        questions[42][3] = "then";
        questions[42][4] = "instanceof";
        answers[42][0] = "then";

        questions[43][0] = "Which of these methods belongs to the String class?";
        questions[43][1] = "length()";
        questions[43][2] = "size()";
        questions[43][3] = "getSize()";
        questions[43][4] = "toString()";
        answers[43][0] = "length()";

        questions[44][0] = "Which of these classes is not included in java.util package?";
        questions[44][1] = "ArrayList";
        questions[44][2] = "HashSet";
        questions[44][3] = "HashMap";
        questions[44][4] = "Vector";
        answers[44][0] = "Vector";

        questions[45][0] = "Which of these keywords is not a part of exception handling in Java?";
        questions[45][1] = "try";
        questions[45][2] = "catch";
        questions[45][3] = "finally";
        questions[45][4] = "throw";
        answers[45][0] = "finally";

        questions[46][0] = "Which of these operators is used to allocate memory to array variables in Java?";
        questions[46][1] = "malloc";
        questions[46][2] = "new";
        questions[46][3] = "calloc";
        questions[46][4] = "free";
        answers[46][0] = "new";

        questions[47][0] = "Which of these classes is not a part of Java I/O?";
        questions[47][1] = "File";
        questions[47][2] = "FileReader";
        questions[47][3] = "FileInputStream";
        questions[47][4] = "FileReaderStream";
        answers[47][0] = "FileReaderStream";

        questions[48][0] = "Which of these methods is a part of the java.util.Collections class?";
        questions[48][1] = "sort()";
        questions[48][2] = "length()";
        questions[48][3] = "size()";
        questions[48][4] = "getSize()";
        answers[48][0] = "sort()";

        questions[49][0] = "Which of these is not a reserved keyword in Java?";
        questions[49][1] = "null";
        questions[49][2] = "volatile";
        questions[49][3] = "transient";
        questions[49][4] = "strictfp";
        answers[49][0] = "null";

        questions[50][0] = "Which of these is not a method of the java.lang.Object class?";
        questions[50][1] = "equals()";
        questions[50][2] = "toString()";
        questions[50][3] = "wait()";
        questions[50][4] = "length()";
        answers[50][0] = "length()";

        questions[51][0] = "Which of these is not a part of the Java exception hierarchy?";
        questions[51][1] = "Error";
        questions[51][2] = "Throwable";
        questions[51][3] = "Exception";
        questions[51][4] = "Class";
        answers[51][0] = "Class";

        questions[52][0] = "Which of these is not a method of the java.lang.String class?";
        questions[52][1] = "equals()";
        questions[52][2] = "toString()";
        questions[52][3] = "wait()";
        questions[52][4] = "length()";
        answers[52][0] = "wait()";

        questions[53][0] = "Which of these is not a method of the java.lang.Thread class?";
        questions[53][1] = "yield()";
        questions[53][2] = "sleep()";
        questions[53][3] = "wait()";
        questions[53][4] = "notify()";
        answers[53][0] = "notify()";

        questions[54][0] = "Which of these is not a feature of exception handling in Java?";
        questions[54][1] = "Try";
        questions[54][2] = "Catch";
        questions[54][3] = "Throw";
        questions[54][4] = "Finally";
        answers[54][0] = "Throw";

        questions[55][0] = "Which of these is not a feature of Java?";
        questions[55][1] = "Dynamic";
        questions[55][2] = "Architecture Neutral";
        questions[55][3] = "Use of pointers";
        questions[55][4] = "Object-oriented";
        answers[55][0] = "Use of pointers";

        questions[56][0] = "Which of these is not a type of constructor in Java?";
        questions[56][1] = "Default constructor";
        questions[56][2] = "Parameterized constructor";
        questions[56][3] = "Copy constructor";
        questions[56][4] = "None";
        answers[56][0] = "Copy constructor";

        questions[57][0] = "Which of these methods is a part of the java.lang.Object class?";
        questions[57][1] = "equals()";
        questions[57][2] = "toString()";
        questions[57][3] = "wait()";
        questions[57][4] = "length()";
        answers[57][0] = "equals()";

        questions[58][0] = "Which of these is not a feature of exception handling in Java?";
        questions[58][1] = "Try";
        questions[58][2] = "Catch";
        questions[58][3] = "Throw";
        questions[58][4] = "Finally";
        answers[58][0] = "Throw";

        questions[59][0] = "Which of these is not a keyword in Java?";
        questions[59][1] = "double";
        questions[59][2] = "switch";
        questions[59][3] = "then";
        questions[59][4] = "instanceof";
        answers[59][0] = "then";

        questions[60][0] = "Which of these methods belongs to the String class?";
        questions[60][1] = "length()";
        questions[60][2] = "size()";
        questions[60][3] = "getSize()";
        questions[60][4] = "toString()";
        answers[60][0] = "length()";

        questions[61][0] = "Which of these is a loop construct that will always be executed at least once?";
        questions[61][1] = "for";
        questions[61][2] = "while";
        questions[61][3] = "do-while";
        questions[61][4] = "None";
        answers[61][0] = "do-while";

        questions[62][0] = "Which of these packages contains the exception Stack Overflow in Java?";
        questions[62][1] = "java.lang";
        questions[62][2] = "java.util";
        questions[62][3] = "java.io";
        questions[62][4] = "java.net";
        answers[62][0] = "java.lang";

        questions[63][0] = "Which of these is not an access modifier?";
        questions[63][1] = "protected";
        questions[63][2] = "void";
        questions[63][3] = "public";
        questions[63][4] = "private";
        answers[63][0] = "void";

        questions[64][0] = "Which of these is not a feature of Java?";
        questions[64][1] = "Dynamic";
        questions[64][2] = "Architecture Neutral";
        questions[64][3] = "Use of pointers";
        questions[64][4] = "Object-oriented";
        answers[64][0] = "Use of pointers";

        questions[65][0] = "Which of these is used to access a member of a class before the object of that class is created?";
        questions[65][1] = "static";
        questions[65][2] = "this";
        questions[65][3] = "final";
        questions[65][4] = "super";
        answers[65][0] = "static";

        questions[66][0] = "Which of these methods is a part of Thread class?";
        questions[66][1] = "yield()";
        questions[66][2] = "sleep()";
        questions[66][3] = "wait()";
        questions[66][4] = "notify()";
        answers[66][0] = "yield()";

        questions[67][0] = "Which of these is used to implement an abstract method?";
        questions[67][1] = "Abstract class";
        questions[67][2] = "Interface";
        questions[67][3] = "Concrete class";
        questions[67][4] = "None";
        answers[67][0] = "Concrete class";

        questions[68][0] = "Which of these is not a type of constructor in Java?";
        questions[68][1] = "Default constructor";
        questions[68][2] = "Parameterized constructor";
        questions[68][3] = "Copy constructor";
        questions[68][4] = "None";
        answers[68][0] = "Copy constructor";

        questions[69][0] = "Which of these keywords is used to refer to a member of the base class from the subclass?";
        questions[69][1] = "super";
        questions[69][2] = "this";
        questions[69][3] = "final";
        questions[69][4] = "static";
        answers[69][0] = "super";

        questions[70][0] = "Which of these is not a part of the Java collection framework?";
        questions[70][1] = "Maps";
        questions[70][2] = "Sets";
        questions[70][3] = "List";
        questions[70][4] = "Array";
        answers[70][0] = "Array";

        questions[71][0] = "Which of these classes is used to handle file operations in Java?";
        questions[71][1] = "File";
        questions[71][2] = "FileReader";
        questions[71][3] = "FileWriter";
        questions[71][4] = "FileInputStream";
        answers[71][0] = "File";

        questions[72][0] = "Which of these is not a feature of exception handling in Java?";
        questions[72][1] = "Try";
        questions[72][2] = "Catch";
        questions[72][3] = "Throw";
        questions[72][4] = "Finally";
        answers[72][0] = "Throw";

        questions[73][0] = "Which of these is a member of the java.lang package?";
        questions[73][1] = "String";
        questions[73][2] = "ArrayList";
        questions[73][3] = "LinkedList";
        questions[73][4] = "HashMap";
        answers[73][0] = "String";

        questions[74][0] = "Which of these is not a keyword in Java?";
        questions[74][1] = "double";
        questions[74][2] = "switch";
        questions[74][3] = "then";
        questions[74][4] = "instanceof";
        answers[74][0] = "then";

        questions[75][0] = "Which of these methods belongs to the String class?";
        questions[75][1] = "length()";
        questions[75][2] = "size()";
        questions[75][3] = "getSize()";
        questions[75][4] = "toString()";
        answers[75][0] = "length()";

        questions[76][0] = "Which of these is a loop construct that will always be executed at least once?";
        questions[76][1] = "for";
        questions[76][2] = "while";
        questions[76][3] = "do-while";
        questions[76][4] = "None";
        answers[76][0] = "do-while";

        questions[77][0] = "Which of these packages contains the exception Stack Overflow in Java?";
        questions[77][1] = "java.lang";
        questions[77][2] = "java.util";
        questions[77][3] = "java.io";
        questions[77][4] = "java.net";
        answers[77][0] = "java.lang";

        questions[78][0] = "Which of these is not an access modifier?";
        questions[78][1] = "protected";
        questions[78][2] = "void";
        questions[78][3] = "public";
        questions[78][4] = "private";
        answers[78][0] = "void";

        questions[79][0] = "Which of these is not a feature of Java?";
        questions[79][1] = "Dynamic";
        questions[79][2] = "Architecture Neutral";
        questions[79][3] = "Use of pointers";
        questions[79][4] = "Object-oriented";
        answers[79][0] = "Use of pointers";

        questions[80][0] = "Which of these is used to access a member of a class before the object of that class is created?";
        questions[80][1] = "static";
        questions[80][2] = "this";
        questions[80][3] = "final";
        questions[80][4] = "super";
        answers[80][0] = "static";

        questions[81][0] = "Which of these methods is a part of Thread class?";
        questions[81][1] = "yield()";
        questions[81][2] = "sleep()";
        questions[81][3] = "wait()";
        questions[81][4] = "notify()";
        answers[81][0] = "yield()";

        questions[82][0] = "Which of these is used to implement an abstract method?";
        questions[82][1] = "Abstract class";
        questions[82][2] = "Interface";
        questions[82][3] = "Concrete class";
        questions[82][4] = "None";
        answers[82][0] = "Concrete class";

        questions[83][0] = "Which of these is not a type of constructor in Java?";
        questions[83][1] = "Default constructor";
        questions[83][2] = "Parameterized constructor";
        questions[83][3] = "Copy constructor";
        questions[83][4] = "None";
        answers[83][0] = "Copy constructor";

        questions[84][0] = "Which of these keywords is used to refer to a member of the base class from the subclass?";
        questions[84][1] = "super";
        questions[84][2] = "this";
        questions[84][3] = "final";
        questions[84][4] = "static";
        answers[84][0] = "super";

        questions[85][0] = "Which of these is not a part of the Java collection framework?";
        questions[85][1] = "Maps";
        questions[85][2] = "Sets";
        questions[85][3] = "List";
        questions[85][4] = "Array";
        answers[85][0] = "Array";

        questions[86][0] = "Which of these classes is used to handle file operations in Java?";
        questions[86][1] = "File";
        questions[86][2] = "FileReader";
        questions[86][3] = "FileWriter";
        questions[86][4] = "FileInputStream";
        answers[86][0] = "File";

        questions[87][0] = "Which of these is not a feature of exception handling in Java?";
        questions[87][1] = "Try";
        questions[87][2] = "Catch";
        questions[87][3] = "Throw";
        questions[87][4] = "Finally";
        answers[87][0] = "Throw";

        questions[88][0] = "Which of these is a member of the java.lang package?";
        questions[88][1] = "String";
        questions[88][2] = "ArrayList";
        questions[88][3] = "LinkedList";
        questions[88][4] = "HashMap";
        answers[88][0] = "String";

        questions[89][0] = "Which of these is not a keyword in Java?";
        questions[89][1] = "double";
        questions[89][2] = "switch";
        questions[89][3] = "then";
        questions[89][4] = "instanceof";
        answers[89][0] = "then";

        questions[90][0] = "Which of these methods belongs to the String class?";
        questions[90][1] = "length()";
        questions[90][2] = "size()";
        questions[90][3] = "getSize()";
        questions[90][4] = "toString()";
        answers[90][0] = "length()";

        questions[91][0] = "Which of these is a loop construct that will always be executed at least once?";
        questions[91][1] = "for";
        questions[91][2] = "while";
        questions[91][3] = "do-while";
        questions[91][4] = "None";
        answers[91][0] = "do-while";

        questions[92][0] = "Which of these packages contains the exception Stack Overflow in Java?";
        questions[92][1] = "java.lang";
        questions[92][2] = "java.util";
        questions[92][3] = "java.io";
        questions[92][4] = "java.net";
        answers[92][0] = "java.lang";

        questions[93][0] = "Which of these is not an access modifier?";
        questions[93][1] = "protected";
        questions[93][2] = "void";
        questions[93][3] = "public";
        questions[93][4] = "private";
        answers[93][0] = "void";

        questions[94][0] = "Which of these is not a feature of Java?";
        questions[94][1] = "Dynamic";
        questions[94][2] = "Architecture Neutral";
        questions[94][3] = "Use of pointers";
        questions[94][4] = "Object-oriented";
        answers[94][0] = "Use of pointers";

        questions[95][0] = "Which of these is used to access a member of a class before the object of that class is created?";
        questions[95][1] = "static";
        questions[95][2] = "this";
        questions[95][3] = "final";
        questions[95][4] = "super";
        answers[95][0] = "static";

        questions[96][0] = "Which of these methods is a part of Thread class?";
        questions[96][1] = "yield()";
        questions[96][2] = "sleep()";
        questions[96][3] = "wait()";
        questions[96][4] = "notify()";
        answers[96][0] = "yield()";

        questions[97][0] = "Which of these is used to implement an abstract method?";
        questions[97][1] = "Abstract class";
        questions[97][2] = "Interface";
        questions[97][3] = "Concrete class";
        questions[97][4] = "None";
        answers[97][0] = "Concrete class";

        questions[98][0] = "Which of these is not a type of constructor in Java?";
        questions[98][1] = "Default constructor";
        questions[98][2] = "Parameterized constructor";
        questions[98][3] = "Copy constructor";
        questions[98][4] = "None";
        answers[98][0] = "Copy constructor";

        questions[99][0] = "Which of these keywords is used to refer to a member of the base class from the subclass?";
        questions[99][1] = "super";
        questions[99][2] = "this";
        questions[99][3] = "final";
        questions[99][4] = "static";
        answers[99][0] = "super";
    }

    public String[][] getQuestions() {
        return questions;
    }

    public String[][] getAnswers() {
        return answers;
    }
}