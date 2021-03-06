package entity;
// Generated Jan 28, 2016 5:30:30 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Posts generated by hbm2java
 */
public class Posts  implements java.io.Serializable {


     private Long postId;
     private Category category;
     private Users users;
     private Date postDate;
     private String postTitle;
     private String postContent;
     private Set commentses = new HashSet(0);

    public Posts() {
    }

	
    public Posts(Category category, Users users, Date postDate, String postTitle, String postContent) {
        this.category = category;
        this.users = users;
        this.postDate = postDate;
        this.postTitle = postTitle;
        this.postContent = postContent;
    }
    public Posts(Category category, Users users, Date postDate, String postTitle, String postContent, Set commentses) {
       this.category = category;
       this.users = users;
       this.postDate = postDate;
       this.postTitle = postTitle;
       this.postContent = postContent;
       this.commentses = commentses;
    }
   
    public Long getPostId() {
        return this.postId;
    }
    
    public void setPostId(Long postId) {
        this.postId = postId;
    }
    public Category getCategory() {
        return this.category;
    }
    
    public void setCategory(Category category) {
        this.category = category;
    }
    public Users getUsers() {
        return this.users;
    }
    
    public void setUsers(Users users) {
        this.users = users;
    }
    public Date getPostDate() {
        return this.postDate;
    }
    
    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }
    public String getPostTitle() {
        return this.postTitle;
    }
    
    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }
    public String getPostContent() {
        return this.postContent;
    }
    
    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }
    public Set getCommentses() {
        return this.commentses;
    }
    
    public void setCommentses(Set commentses) {
        this.commentses = commentses;
    }




}


