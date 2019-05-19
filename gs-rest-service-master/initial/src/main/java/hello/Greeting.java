package hello;

public class Greeting {

    private  long id;
    private  String content;
    private  String createdTime;//"createdTime": "2019-05-15T00:00:00Z"

    public Greeting(long id, String content,String createdTime) {
        this.id = id;
        this.content = content;
        this.createdTime=createdTime;
    }

    public long getId() {
        return id;
    }
	
	  public void setId(long id) { this.id=id; }
	 

	
	  public String getContent() { return content; }
	 
	
	  public void setContent(String content) { this.content=content; }
	 

	
	  public String getCreatedTime() { return createdTime; }
	 
	
	  public void setCreatedTime(String createdTime) {
	  this.createdTime=createdTime; }
	 
    @Override
    public String toString() {
        return "Greeting{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", createdTime=" + createdTime +
                '}';
    }
   
}