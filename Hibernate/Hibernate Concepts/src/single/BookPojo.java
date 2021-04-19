package single;

public class BookPojo {
	
	private int bno;
	private String bname;
	private String bauthor;
	private float price;
	private Comment comment;
	public final int getBno() {
		return bno;
	}
	public final void setBno(int bno) {
		this.bno = bno;
	}
	public final String getBname() {
		return bname;
	}
	public final void setBname(String bname) {
		this.bname = bname;
	}
	public final String getBauthor() {
		return bauthor;
	}
	public final void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	public final float getPrice() {
		return price;
	}
	public final void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BookPojo [bno=" + bno + ", bname=" + bname + ", bauthor=" + bauthor + ", price=" + price + "]";
	}
	public Comment getComment() {
		return comment;
	}
	public void setComment(Comment comment) {
		this.comment = comment;
	}
	
}
