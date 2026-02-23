public class Task {
    private int id;
    private String title;
    private String description;
    private Status status;

    public Task(int id, String title, String description, Status status){
        this.id=id;
        this.title=title;
        this.description=description;
         this.status=status;
}

public int getId(){
        return id;
   }

 public String getTitle(){
        return title;
    }


     public String getDescription(){
        return description;
     }

     public Status getStatus(){
        return status;
     }

     public void setId(int id){
        this.id=id;
     }

     public void setTitle(String title){
        this.title=title;
     }

     public void setStatus(Status status){
        this.status=status;
     }
    @Override
     public String toString(){
        return "Task ID:" + id + "\n" +
                "Title" + title + "\n" +
                "Description" + description + "\n"+
                "Status" + status;
    }
     //Method to display task
    public void displayTask(){
        System.out.println("Task ID:" + id);
        System.out.println("Title" + title);
        System.out.println("Description" + description);
        System.out.println("Status" + status);
    }
}


