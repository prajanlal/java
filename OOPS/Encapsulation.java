public class Encapsulation {
 private String name;
 private int age;
 private String address;
  private int phoneNumber;
  private String email;
  private String password;

  public void setname(String name){
    this.name = name;
  }
  public String getname(){
    return name;
  }
  public void setage(int age){
    this.age = age;
  }
  public int getage() {
    return age;
  }
  public void setaddress(String address) {
    this.address = address;
  }
  public String address() {
    return address;
  }
  public void setphoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  public int getphoneNumber() {
    return phoneNumber;
  }
  public void setemail(String email) {
    this.email = email;
  }
  public String getemail() {
    return email;
  }
  public void setpassword(String password){
    this.password = password;
  }
  public String getpassword() {
    return password;
  }
    public Encapsulation(String name, int age, String address, int phoneNumber, String email,String password){
        this.name = name;
        this.age =age;
        this.address =address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
    }
    public void display() {
        System.out.println("Name: " +name);
        System.out.println("age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " +email);
        System.out.println("Password: " +password);
    }
}


  
