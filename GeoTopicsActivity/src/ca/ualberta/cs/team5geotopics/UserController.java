package ca.ualberta.cs.team5geotopics;

public class UserController {
	private User mUser;
	
	public UserController(){
		this.mUser = User.getInstance();
	}
	
	/**
	 * Used to add OR remove a comment ID from the bookmark's list. If the 
	 * ID exists its removed, else its added.
	 * @param ID The comment ID
	 */
	public void bookmark(CommentModel comment){
		if(!(mUser.inBookmarks(comment))){
			mUser.addBookmark(comment);
		}else{
			mUser.removeBookmark(comment);
		}
	}
	
}
