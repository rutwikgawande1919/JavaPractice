package Conditions;

public class LadderCondition_elseif {
public static void main(String[] args) {
	int a=55;
	
	if(a>=90) {
		System.out.println("Grade A");
	}
	else if(a>=70) {
		System.out.println("Grade B");
	}
	else if(a>=50) {
		System.out.println("Grade C");
	}
	else if(a>=35) {
		System.out.println("Grade D");
	}
	else {
		System.out.println("Failed");
	}
}
}
