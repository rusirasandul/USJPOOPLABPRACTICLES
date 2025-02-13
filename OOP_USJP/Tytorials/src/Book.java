public class Book {
    private String Title;
    private  String Auther;

    public Book(String Title, String Auther) {
        this.Title = Title;
        this.Auther = Auther;
    }
    
    public String getTitle(){
        return Title;
        
    }

    public void setTitle(String Title){
        this.Title =Title;

    }

    public String getAuther(){
        return  Auther;
    }

    public void setAuther(String Auther){
        this.Auther=Auther;
    }



    

}
