package oops_concept;
class IPL2024{
	public void team () {
		System.out.println("CSK");
	}
}
class IPL2023 extends IPL2024{
	public void team () {
		System.out.println("MI");
	}
	
	
}
class IPL2022 extends IPL2024{
	public void team () {
		System.out.println("LSG");
	}
}
class IPL2019 extends IPL2024{
	public void team () {
		System.out.println("PBKS");
	}
}
class IPL2018 extends IPL2024{
	public void team () {
		System.out.println("SRH");
	}
}
class IPL2017 extends IPL2024{
	public void team () {
		System.out.println("DD");
	}
}

public class Methodoverriding {

	public static void main(String[] args) {
		IPL2017 obj = new IPL2017();
		obj.team();
		IPL2024 input = new IPL2024();
		input.team();
		

	}

}
