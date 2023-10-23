/*Omar Negron
 * 11/29/2022
 * Weight on Planets  
 */


package Planet_Weight;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Weight_Conversion {

	public static void main(String[] args) {
		Double mer = 0.38;
		Double ven = 0.91;
		Double mar = 0.38;
		Double jup = 2.36;
		Double sat = 0.92;
		Double ura = 0.89;
		Double nep = 1.13;			
		DecimalFormat dfresult = new DecimalFormat("#.###");
		
		
		try {
		Scanner in = new Scanner (System.in);
		Double fin = 0.0;
		System.out.println("Enter your Weight: ");
		double weight = in.nextDouble();
		System.out.println("Enter a Planet From the List below:" +'\n' + "Mercury"
				+'\n'+"Venus"+'\n'+"Mars"+'\n'+"Jupiter"+'\n'+"Saturn"+'\n'
				+"Uranus"+'\n'+"Neptune");
		String choice = in.next().toLowerCase();
		
								
			
		
		switch (choice) {
		case "mercury" : fin = mer * weight;
						break;
		case "venus" : fin = ven * weight;
		break;
		case "mars" : fin = mar * weight;
		break;
		case "jupiter" : fin = jup * weight;
		break;
		case "saturn" : fin = sat * weight;
		break;
		case "uranus" : fin = ura * weight;
		break;
		case "neptune" : fin = nep * weight;
		break;
		default: System.out.println("Please enter a valid Planet, Check Spelling");	
		}
									
		
		in.close();
		System.out.println("Your Weight on " + choice.substring(0,1).toUpperCase()+ choice.substring(1) + " is: " + dfresult.format(fin)+" lbs");
				
	
	}catch(Exception all){
		System.out.println("Numerical digits only.");
	
	}
		
		
		

	}

}
