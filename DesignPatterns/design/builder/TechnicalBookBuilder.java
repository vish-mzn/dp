package builder;

class TechnicalBookBuilder implements BookBuilder{  
	 private Book book;  
	  
	 public TechnicalBookBuilder()  
	 {  
	  book=new Book();  
	 }  
	 public void buildTableOfContent() {  
	  System.out.println("printing technical table of content");  
	  book.setTableOfContent("technical table of content");  
	 }  
	   
	 public void buildPreface() {  
	  System.out.println("printing preface");  
	  book.setTableOfContent("preface");  
	 }  
	 public void buildIntroduction() {  
	  System.out.println("printing technical introduction");  
	  book.setTableOfContent("technical introduction");  
	 }  
	  
	 public void buildChapters() {  
	  System.out.println("printing technical chapters");  
	  book.setChapters("technical chapters");  
	 }  
	  
	 public void buildGlossary() {  
	  System.out.println("printing technical glossary");  
	  book.setGlossary("Technical glossary");  
	 }  
	  
	 public Book getBook() {  
	  return book;  
	 }  
	}  

	