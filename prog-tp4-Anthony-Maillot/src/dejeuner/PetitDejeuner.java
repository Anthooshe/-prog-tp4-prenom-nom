package dejeuner;



public class PetitDejeuner {


		public static void main(String[] args) {
			Menu monMenu = new Menu();
			System.out.println("Bienvenue pour votre composition de petit d�jeuner :");
			
			
			

			String commande = "Vous avez command� : " + (monMenu.getBoissons()) + " + " + monMenu.getViennoiseries() + " + ";

			if (monMenu.getOption()) {
				commande += " Vous avez pris un jus ! ";
			}
			else {
				commande += " Vous avez pris aucun jus ";
		}

			System.out.println(commande + "Prix total " + monMenu.getMontantToTal() + "�");

		

		}
	}
