package dao;
import java.util.List;

import javax.xml.stream.events.Comment;

import model.Apply;
import model.Board;
import model.Bookmark;
import model.Police;
import model.Score;
import model.User;

public interface daoInterface {
	public int insert_Board(Board board);
	public int update_Board(Board board);
	public int delete_Board(int boradNo);
	public List<Board> select_BoardAll();
	public Board select_BoardOne(int boardNo);
	
	public int insert_User(User user);
	public int update_User(User user);
	public int delete_User(int user_index);
	public User select_User(int user_index);
	

	public int insert_Comment(Comment comment);
	public int update_Comment(Comment comment);
	public int delete_Comment(int boardNo);
	public Comment select_CommentByBoardNo(int boardNo);
	public List<Comment> selectAllComment_ByBoardNo(int boardNo);
	
	public int insert_Apply(Apply apply);
	public int update_Apply(Apply apply);
	public List<Apply> selectAllApply_ByBoardNo(int boardNo);
	public List<Apply> selectAllApply_ByUserIndex(int User_Index);


	public int insert_Score(Score score);
	public int update_Score(Score score);
//	public Score select_ScoreByUser1Id(int user1_index);
//	public Score select_ScoreByUser2Id(int user2_index);
	public Score select_ScoreByBoardNo(int boardNo);

	public int insert_BookMark(Bookmark bookmark);
	public int delete_BookMark(Bookmark bookmark);
	public Bookmark select_BookMark(Bookmark bookmark);

	public int insert_Police(Police police);
	public int select_Police(Police police);

	public String select_addr1(int addr1No);
	public String select_addr2(int addr2No);

}
