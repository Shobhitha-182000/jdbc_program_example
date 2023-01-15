package jdbc_maven_eb_user_assignment;

import java.util.Scanner;

public class UsersCrudMain {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		boolean repeat = true;
		Users users = new Users();
		UserssCrud crud = new UserssCrud();

		do {
			System.out.println("choose the option \n 1.signup \n 2.Login \n 3.exit");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1: {
				System.out.println("enter the id");
				int id = scanner.nextInt();

				System.out.println("enter the username");
				String userName = scanner.next();

				System.out.println("enter the email");
				String email = scanner.next();

				System.out.println("enter the password");
				String password = scanner.next();

				System.out.println("enter the address");
				String address = scanner.next();

				users.setId(id);
				users.setName(userName);
				users.setEmail(email);
				users.setPassword(password);
				users.setAddress(address);

				crud.saveUsers(users);

			}

			case 2: {
				System.out.println("enter the email");
				String email = scanner.next();

				System.out.println("enter the password");
				String password = scanner.next();

				users.setEmail(email);
				users.setPassword(password);

				boolean saved = crud.loginUsers(users);

				if (saved == true) {
					System.out.println("logged in successfully");

					boolean exits = true;
					do {
						System.out.println("choose any of one you want");
						System.out.println(
								" 1.Facebook Password \n 2.Instagram Password \n 3.Snapchat Password \n 4.Whatsapp Password \n 5.Twitter Password \n 6.Exit");
						System.out.println("enter your choice ");
						int choice1 = scanner.nextInt();

						switch (choice1) {
						case 1: {
							System.out.println(" 1.display \n 2.reset");
							System.out.println("enter your choice");
							int choice2 = scanner.nextInt();

							switch (choice2) {
							case 1: {
								crud.getFacebookPassword(users);

							}
								break;
							case 2: {

								System.out.println("enter the password");
								String facebook = scanner.next();

								users.setFacebook(facebook);
								crud.updateFacebookPassword(users);
								System.out.println("password update succesfully");
							}
							}
						}
							break;

						case 2: {
							System.out.println(" 1.display \n 2.reset");
							System.out.println("enter your choice");
							int choice2 = scanner.nextInt();

							switch (choice2) {
							case 1: {
								crud.getInstagramPassword(users);

							}
								break;
							case 2: {
 
								System.out.println("enter the password");
								String instagramPassword = scanner.next();
								users.setInstagram(instagramPassword);
								crud.updateInstagramPassword(users);
								System.out.println("password update succesfully");

							}
							}
						}
							break;

						case 3: {

							System.out.println(" 1.display \n 2.reset");
							System.out.println("enter your choice");
							int choice2 = scanner.nextInt();

							switch (choice2) {
							case 1: {
								crud.getSnapchatPassword(users);

							}
								break;
							case 2: {

								System.out.println("enter the password");
								String snapchat = scanner.next();
								users.setSnapchat(snapchat);

								crud.updateSnapchatPassword(users);
								System.out.println("password update succesfully");

							}
							}

						}
							break;

						case 4: {

							System.out.println(" 1.display \n 2.reset");
							System.out.println("enter your choice");
							int choice2 = scanner.nextInt();

							switch (choice2) {
							case 1: {
								crud.getWhatsappPassword(users);

							}
								break;
							case 2: {

								System.out.println("enter the password");
								String whatsapp = scanner.next();
								users.setWhatsapp(whatsapp);

								crud.updateWhatsappPassword(users);
								System.out.println("password update succesfully");

							}
							}
						}
							break;

						case 5: {

							System.out.println(" 1.display \n 2.reset");
							System.out.println("enter your choice");
							int choice2 = scanner.nextInt();

							switch (choice2) {
							case 1: {
								crud.getTwitterPassword(users);

							}
								break;
							case 2: {

								System.out.println("enter the password");
								String twitter = scanner.next();
								users.setTwitter(twitter);

								crud.updateTwitterPassword(users);
								System.out.println("password update succesfully");

							}
							}
						}
							break;

						case 6:
							exits = false;
							System.out.println("============Thank you======================");
						}

					} while (exits);

				} else {
					System.out.println("invalid password or email");
				}

			}
				break;
			case 3:
				repeat = false;
				System.out.println("==============Thank you=======================");

			}
		} while (repeat);

	}
}
