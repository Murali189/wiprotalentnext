
class Author{
	private String name,email;
	private char gender;
	public Author(String name,String email,char gender) {
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getName() {
		return(name);
	}
	public String getEmail() {
		return(email);
	}
	public char getGender() {
		return(gender);
	}
	@Override
	public String toString(){
		return("Author(name="+name+",email="+email+",gender="+gender+")");
	}
}
class Book{
	private String name;
	private Author author;
	private int qtyInStock;
	private double price;
	public Book(String name,Author author,double price,int qtyInStock) {
		this.name=name;
		this.author=author;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	public String getName() {
		return(name);
	}
	public Author author() {
		return(author);
	}
	public double price() {
		return(price);
	}
	public int qtyInStock() {
		return(qtyInStock);
	}
	@Override
	public String toString(){
		return("Book(name="+name+",author="+author+",price="+price+",qtyInStock="+qtyInStock+")");
	}
}
public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Author a=new Author("Steven pinker","steve123@gmail.com",'M');
      Book b=new Book("Enlightment now",a,1500,150);
      System.out.println(b);
	}

}
