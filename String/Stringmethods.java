class stringdemo{
  public static void main(String args[])
  {
    char ch;
    ch="abcd".charAt(1);
    System.out.println("charAt:");
    System.out.println(ch);
    String age="9";
    System.out.println("String Concatenation:");
    String s1="he is"+age+"years old";
     System.out.println(s1);
    char chars[]={'a','b','c','d','e','f','g'};
    String s2=new String(chars);
    System.out.println("String length:");
    System.out.println("s2.length());
    char Chars[]={'a','b','c'};
    String s3=new String(chars,1,2);
    System.out.println("Using start index:");
    System.out.println(s3);
    String s4="javapoint";
    System.out.println("s4.substring(2,4));
    System.out.println("s4.substring(2));
    System.out.println("Substring:"+s4);
    String s5="Hello".replace('l','w');
    System.out.println("String replace:"+s5);
    String s6="hello";
    String s7="HELLO";
    System.out.println("Equals method:");
    System.out.println(s6+"equals"+s7+"=="+s6.equals(s7));
    String s8="This is index example";
    int index1=s8.lastindexOf("is");
    int index2=s8.indexOf("index"):
      System.out.println("Searching strings:");
      System.out.println("index1+" "+index2);
      String s9="hello";
      System.out.println("Trim method:"):
        System.out.println(s9+"how are you");
        System.out.println(s9.trim()+"how are you");
  }
}

        
      
    
      
      
