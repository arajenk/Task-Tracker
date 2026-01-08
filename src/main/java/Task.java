import java.time.*;
public class Task {
    private final int id;
    private String description;
    private String status;
    private final Instant createdAt;
    private Instant updatedAt;
    public Task(int id, String status, String description){
        this.id = id;
        this.description = description;
        this.status = status;
        this.createdAt = Instant.now();
        this.updatedAt = Instant.now();
    }
    public Instant getCreatedAt(){
        return createdAt;
    }
    public Instant getUpdatedAt(){
        return updatedAt;
    }
    public int getId(){
        return id;
    }
    public String getDescription(){
        return description;
    }
    public String getStatus(){
        return status;
    }
    public void setDescription(String description){
        this.description = description;
        this.updatedAt = Instant.now();
    }
    public void setStatus(String status){
        this.status = status;
        this.updatedAt = Instant.now();
    }
}
