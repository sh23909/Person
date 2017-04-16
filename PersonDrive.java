public class PersonDriver {
	public static void main(String [] args){
		Person person=new Person();
		
		System.out.println(person.name);
		System.out.println(person.language);
		Person sung=new Person();
		sung.setname("Sung");
		sung.setAge(28);
		Person dom= new Person("Dom","English",20);
		
		System.out.println(sung.speak());
		System.out.println(dom.speak());
		System.out.println(dom.getname());
		
		System.out.println(dom.toString());
		System.out.println(person);
		System.out.println(sung);
		System.out.println(sung.equals(dom));
		if(sung.getAge() == dom.getAge()){
			System.out.println("same age");
			
		}else{
			System.out.println("not same age");
		}
		if(sung.getAge() > dom.getAge()){
			System.out.println("sung is older");
			
		}else{
			System.out.println("dom is older");
		}
	}

}

