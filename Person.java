public class Person {
	String id;
	String name;
	String language;
	private int age;
	public Person(){
	
		this.name="John";
		this.language="English";
		this.age=21;
	}
	public Person(String name, String language, int age){
		this.name = name;
		this.language = language;
		this.age=age;
	}
	public String speak(){
		return language;
	}
	public String getname(){
		return name;
	}
	public void setname(String name){
		this.name=name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
	public String toString(){
		return "Name" + name + "\n Language" + language + "\n Age" + age;
	}
	public boolean equals(Person obj){
		return this.name.equals(obj.getname()) && this.language.equals(obj);
		
	}




}
