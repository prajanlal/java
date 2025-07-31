public class Task {
    private String Name;
    private String status;
    private boolean important;
    private boolean delete;
    private String rename;


    public void setname(String name) {
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
    public void setdelete(boolean delete) {
      this.delete = delete;
    }
    public boolean getdelete() {
      return delete;
    }
    public void setRename(String rename) {
      this.rename = rename;
    }

         public Task(String Name, String Status, boolean Important, boolean delete, String rename) {
            this.Name =Name;
            this.status =Status;
            this.important = Important;
            this.delete = delete;
            this.rename = rename;
          }
                public String getName(){
                  return Name;
                }
                
    public void display() {
        System.out.println("Name of the task: " + Name);
        System.out.println("Status: " + status);
        System.out.println("Important task: " + (important ? "Yes" : "No"));
        System.out.println("Delete task: " + (delete ? "Yes" : "No"));
    }
}
