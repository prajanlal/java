package java;


public class Task {
    private String Name;
    private String status;
    private boolean important;

    public void setname(String name){
      this.Name = name;
    }
    public String getname(){
      return  Name;
    }
    public void setStatus(String status) {
       this.status = status;
    }
    public String getStatus(){
       return status;
    }

    public void setImportant(boolean important){
         this.important = important;
    }

    public boolean getImportant() {
         return  important;
    }

         public Task(String Name,String Status,boolean Important) {
            this.Name =Name;
            this.status =Status;
            this.important = Important;
          }
                public String getName(){
                  return Name;
                }
                
    public void display() {
        System.out.println("Name of the task: " + Name);
        System.out.println("Status: " + status);
        System.out.println("Important task: " + (important ? "Yes" : "No"));
    }
}
