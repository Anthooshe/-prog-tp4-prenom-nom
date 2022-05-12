package dejeuner;

	import java.util.HashMap;
	import java.util.Map;
	import java.util.Scanner;

	public class Menu { 

		private Scanner monScanner = new Scanner(System.in);

		private Double montantTotal;
     private String choix;
     private String boisson = "";
		private String viennoiserie = "";
     private boolean option;

	
    



     
     

    

     
				

     public String getBoissons() {
    	 Map<String, Double> boissons = new HashMap<String, Double>();
         boissons.put("Café", 1.0);
         boissons.put("Thé",1.50);
         boissons.put("Cappucino", 2.0 );
         boissons.put("Lait",1.0 );
     		
    	 String menuBoisson = "Quel boisson choissierez-vous ? \n1 = Café 1€ \n2 = Thé 1.20€ \n3 = Cappucino 3€ \n4 = Lait 2€ \n Saisissez votre choix.";
  		
  		System.out.println(menuBoisson);
  		choix = monScanner.nextLine();
  		while ((!choix.equals("1")) && (!choix.equals("2")) && (!choix.equals("3")) && (!choix.equals("4"))) {
  			System.out.println(menuBoisson);
  			choix = monScanner.nextLine();

 		}

     

		switch (choix) {

		case "1":
			boisson = " Un café";
			montantTotal = 1.0;
			break;

		case "2":
			boisson = " Un thé";
			montantTotal = 1.20;
			break;

		case "3":
			boisson = " Un cappucino";
			montantTotal = 3.0;
			break;

		case "4":
			boisson = " Un lait";
			montantTotal = 2.0;
			break;

		default:
			System.out.println("Veuillez choisir à nouveau, la boisson est obligatoire.");

		}
		return boisson;
	}
		
		
		
	public String getViennoiseries() {
		
		 Map<String, Double> Jviennoiserie = new HashMap<String, Double>();
	     Jviennoiserie.put("Croissant", 1.0);
	     Jviennoiserie.put("Pain au chocolat",1.20);
	     Jviennoiserie.put("Une brioche", 1.0);
	     Jviennoiserie.put("pain aux raisins",0.90 );


		String menuViennoiserie = ("Quel viennoiserie choissierez-vous ? \n1 = croissant 2€ \n2 = pain au chocolat 1.50€ \n3 = brioche 3€ \n4 = pain au raisin 1.50€ ");
		System.out.println(menuViennoiserie);
		
		choix = monScanner.nextLine();

		while ((!choix.equals("1")) && (!choix.equals("2")) && (!choix.equals("3")) && (!choix.equals("4"))) {

			System.out.println(menuViennoiserie);
			choix = monScanner.nextLine();
			
		}

			switch (choix) {
			case "1":
				viennoiserie = " Un croissant";
				montantTotal += 2;
				break;

			case "2":
				viennoiserie = " Un pain au chocolat";
				montantTotal += 1.50;
				break;

			case "3":
				viennoiserie = " Une brioche";
				montantTotal += 3.0;
				break;

			case "4":
				viennoiserie = " Un pain au raisin";
				montantTotal += 1.50;
				break;

			default:
				viennoiserie = "pas de viennoiserie";
				break;
				
			}
			return viennoiserie;
		}

	

	public Boolean getOption() {
		
		option=false;

		
		System.out.println("Voulez vous un jus ? \n1 = Oui \n2 = Non");

		choix = monScanner.nextLine();

		if (choix.equals("1")) {
			montantTotal += 1;
			System.out.println("");
			option = true;

		} else {
			System.out.println("");
		}

		return option;
	}
	public Double getMontantToTal() {

		return montantTotal;
		}



	public String getBoisson() {
		return boisson;
	}



	public void setBoisson(String boisson) {
		this.boisson = boisson;
	}



	public String getViennoiserie() {
		return viennoiserie;
	}



	public void setViennoiserie(String viennoiserie) {
		this.viennoiserie = viennoiserie;
	}

	}



