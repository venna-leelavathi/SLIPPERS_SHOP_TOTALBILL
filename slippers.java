import java.util.Scanner;
class slippers
{
String request;
float dis=50.00f;
float finalamount;
String h;
float sum;
void reading()
{
        System.out.println("==========WELCOME TO SLIPPERS SHOPPING MALL===================================");
        System.out.println("all types of slippers are available in this shop.............");
	System.out.println("========================================");
	System.out.println("1.womens slippers");
	System.out.println("2.mens slippers");
	System.out.println("footwear");
        Scanner s=new Scanner(System.in);
        request=s.next();
        
  
}//read
void logic()
{        
       do{
        Scanner s2=new Scanner(System.in);
	System.out.println("enter the request in string format");
        String req=s2.next();
         switch(request)
            {  

	       case "footwear":
		       {
			System.out.println("please select the below two options");
			System.out.println("1.for womens");
			System.out.println("2.for mens");
                        Scanner f=new Scanner(System.in);
			System.out.println("enter g in string format");
			String g=f.next();
			if(g.equalsIgnoreCase("forwomens"))
			{
				System.out.println("=============================================================");
				System.out.println("please select one from the below  options");		
				System.out.println("=================================================");
				System.out.println("1.flats");
				System.out.println("2.sandals");
				System.out.println("3.slippers");
				System.out.println("4.heels");
				System.out.println("5.wedges");
				System.out.println("6.bellis");
				System.out.println("7.ethnic footwear");
				System.out.println("======================================");
				Scanner L=new Scanner(System.in);
				System.out.println("Please enter  your preffered choice in string format");
				String l=L.next();
				if(l.equalsIgnoreCase("bellis"))
					{
						System.out.println("=============================================================");
						System.out.println("please select one from the below  brand options");		
						System.out.println("=================================================");
						System.out.println("1.bata");
						System.out.println("2.sparx");
						System.out.println("3.catwalk");
						System.out.println("4.paragon");
						System.out.println("5.walkaro");
						System.out.println("6.puma");
						System.out.println("7.mochi");
						System.out.println("8.walkmate");
						System.out.println("======================================");
						Scanner o=new Scanner(System.in);
						System.out.println("Please enter  your preffered choice in string format");
						String d=o.next();
						switch(d)
						{
							case "puma":
							{
								float cost=800.00f;
								System.out.println("The price of puma is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
								break;
                                                          }
							case "walkaro":
							{
								float cost=200.00f;
								System.out.println("The price of walkaro is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+" is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}
							case "paragon":
							{
								float cost=180.00f;
								System.out.println("The price of paragon is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}	
							case "bata":
							{
								float cost=250.00f;
								System.out.println("The price of bata  is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}
							case "sparx":
							{
								float cost=350.00f;
								System.out.println("The price of plastic decoration is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}
							case "mochi":
							{
								float cost=350.00f;
								System.out.println("The price of Plastic key chans set  is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                               break;
							}
							case "walkamte":
							{
								float cost=800.00f;
								System.out.println("The price of puma is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}
							case "catwalk":
							{
								float cost=200.00f;
								System.out.println("The price of walkaro is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+" is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}

							default:
							{
								System.out.println("you enter the invalid choice");
								System.out.println("============================================================================");
							}
						}			
					
	
					}
				else if(l.equalsIgnoreCase("ethnicfootwear"))
					{
						System.out.println("=============================================================");
						System.out.println("please select one from the below  brand options");		
						System.out.println("=================================================");
						System.out.println("1.bata");
						System.out.println("2.sparx");
						System.out.println("3.catwalk");
						System.out.println("4.paragon");
						System.out.println("5.walkaro");
						System.out.println("6.puma");
						System.out.println("7.mochi");
						System.out.println("8.walkmate");
						System.out.println("======================================");
						Scanner o=new Scanner(System.in);
						System.out.println("Please enter  your preffered choice in string format");
						String d=o.next();
						switch(d)
						{
							case "puma":
							{
								float cost=800.00f;
								System.out.println("The price of puma is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}
							case "walkaro":
							{
								float cost=200.00f;
								System.out.println("The price of walkaro is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+" is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                 break;
							}
							case "paragon":
							{
								float cost=180.00f;
								System.out.println("The price of paragon is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                 break;
							}	
							case "bata":
							{
								float cost=250.00f;
								System.out.println("The price of bata  is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}
							case "sparx":
							{
								float cost=350.00f;
								System.out.println("The price of plastic decoration is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}
							case "mochi":
							{
								float cost=350.00f;
								System.out.println("The price of Plastic key chans set  is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}
							case "walkamte":
							{
								float cost=800.00f;
								System.out.println("The price of puma is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}
							case "catwalk":
							{
								float cost=200.00f;
								System.out.println("The price of walkaro is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+" is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}

							default:
							{
								System.out.println(" please select the preffered choice only those are available only not invalid choice....");
								System.out.println("============================================================================");
							}
						}
					}
				else if(l.equalsIgnoreCase("Wedges"))
					{
						System.out.println("=============================================================");
						System.out.println("please select one from the below  brand options");		
						System.out.println("=================================================");
						System.out.println("1.bata");
						System.out.println("2.sparx");
						System.out.println("3.catwalk");
						System.out.println("4.paragon");
						System.out.println("5.walkaro");
						System.out.println("6.puma");
						System.out.println("7.mochi");
						System.out.println("8.walkmate");
						System.out.println("======================================");
						Scanner o=new Scanner(System.in);
						System.out.println("Please enter  your preffered choicein string format");
						String d=o.next();
						switch(d)
						{
							case "puma":
							{
								float cost=800.00f;
								System.out.println("The price of puma is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}
							case "walkaro":
							{
								float cost=200.00f;
								System.out.println("The price of walkaro is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+" is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}
							case "paragon":
							{
								float cost=180.00f;
								System.out.println("The price of paragon is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}	       
							case "bata":
							{
								float cost=250.00f;
								System.out.println("The price of bata  is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                 break;
							}
							case "sparx":
							{
								float cost=350.00f;
								System.out.println("The price of plastic decoration is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;

							}
							case "mochi":
							{
								float cost=350.00f;
								System.out.println("The price of Plastic key chans set  is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");                                                                                                        
                                                                sum=sum+(cost-disval);
                                                                break;
							}
							case "walkamte":
							{
								float cost=800.00f;
								System.out.println("The price of puma is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");                                                                                                                            
                                                                sum=sum+(cost-disval); 
                                                                break;
							}
							case "catwalk":
							{
								float cost=200.00f;
								System.out.println("The price of walkaro is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+" is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}

							default:
							{
								System.out.println("not invalid, please select the preffered choice only those are available only....");
								System.out.println("============================================================================");
							}
						}
					}
				else if(l.equalsIgnoreCase("heels"))
					{
						System.out.println("=============================================================");
						System.out.println("please select one from the below  brand options");		
						System.out.println("=================================================");
						System.out.println("1.bata");
						System.out.println("2.sparx");
						System.out.println("3.catwalk");
						System.out.println("4.paragon");
						System.out.println("5.walkaro");
						System.out.println("6.puma");
						System.out.println("7.mochi");
						System.out.println("8.walkmate");
						System.out.println("======================================");
						Scanner o=new Scanner(System.in);
						System.out.println("Please enter  your preffered choice in string format");
						String d=o.next();
						switch(d)
						{
							case "puma":
							{
								float cost=800.00f;
								System.out.println("The price of puma is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}
							case "walkaro":
							{
								float cost=200.00f;
								System.out.println("The price of walkaro is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+" is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}
							case "paragon":
							{
								float cost=180.00f;
								System.out.println("The price of paragon is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}	
							case "bata":
							{
								float cost=250.00f;
								System.out.println("The price of bata  is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}
							case "sparx":
							{
								float cost=350.00f;
								System.out.println("The price of plastic decoration is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}
							case "mochi":
							{
								float cost=350.00f;
								System.out.println("The price of Plastic key chans set  is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                 break;
							}
							case "walkamte":
							{
								float cost=800.00f;
								System.out.println("The price of puma is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                               break;
							}
							case "catwalk":
							{
								float cost=200.00f;
								System.out.println("The price of walkaro is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+" is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                 break;
							}

							default:
							{
								System.out.println("please select the valid one, please select the preffered choice only those are available only....");
								System.out.println("============================================================================");
							}
						}
					}

				else if(l.equalsIgnoreCase("slippers"))
					{
							System.out.println("=============================================================");
						System.out.println("please select one from the below  brand options");		
						System.out.println("=================================================");
						System.out.println("1.bata");
						System.out.println("2.sparx");
						System.out.println("3.catwalk");
						System.out.println("4.paragon");
						System.out.println("5.walkaro");
						System.out.println("6.puma");
						System.out.println("7.mochi");
						System.out.println("8.walkmate");
						System.out.println("======================================");
						Scanner o=new Scanner(System.in);
						System.out.println("Please enter  your preffered choice in string format");
						String d=o.next();
						switch(d)
						{
							case "puma":
							{
								float cost=800.00f;
								System.out.println("The price of puma is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
								sum=sum+(cost-disval);
								break;
							}
							case "walkaro":
							{
								float cost=200.00f;
								System.out.println("The price of walkaro is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+" is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}
							case "paragon":
							{
								float cost=180.00f;
								System.out.println("The price of paragon is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}	
							case "bata":
							{
								float cost=250.00f;
								System.out.println("The price of bata  is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}
							case "sparx":
							{
								float cost=350.00f;
								System.out.println("The price of plastic decoration is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                               break;

							}
							case "mochi":
							{
								float cost=350.00f;
								System.out.println("The price of Plastic key chans set  is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}
							case "walkamte":
							{
								float cost=800.00f;
								System.out.println("The price of puma is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}
							case "catwalk":
							{
								float cost=200.00f;
								System.out.println("The price of walkaro is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+" is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}

							default:
							{
								System.out.println("you enterd invalid choice....");
								System.out.println("============================================================================");
							}
						}
					}

				else if(l.equalsIgnoreCase("sandals"))
					{
						System.out.println("=============================================================");
						System.out.println("please select one from the below  brand options");		
						System.out.println("=================================================");
						System.out.println("1.bata");
						System.out.println("2.sparx");
						System.out.println("3.catwalk");
						System.out.println("4.paragon");
						System.out.println("5.walkaro");
						System.out.println("6.puma");
						System.out.println("7.mochi");
						System.out.println("8.walkmate");
						System.out.println("======================================");
						Scanner o=new Scanner(System.in);
						System.out.println("Please enter  your preffered choice in string format");
						String d=o.next();
						switch(d)
						{
							case "puma":
							{
								float cost=800.00f;
								System.out.println("The price of puma is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}
							case "walkaro":
							{
								float cost=200.00f;
								System.out.println("The price of walkaro is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+" is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                 break;
							}
							case "paragon":
							{
								float cost=180.00f;
								System.out.println("The price of paragon is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}	
							case "bata":
							{
								float cost=250.00f;
								System.out.println("The price of bata  is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}
							case "sparx":
							{
								float cost=350.00f;
								System.out.println("The price of plastic decoration is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}
							case "mochi":
							{
								float cost=350.00f;
								System.out.println("The price of Plastic key chans set  is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}
							case "walkamte":
							{
								float cost=800.00f;
								System.out.println("The price of puma is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
								System.out.println("Thank you for visiting our webiste");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}
							case "catwalk":
							{
								float cost=200.00f;
								System.out.println("The price of walkaro is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+" is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}

							default:
							{
								System.out.println("it is invalid, please select the preffered choice only those are available only....");
								System.out.println("============================================================================");
							}
						}
					}
				else if(l.equalsIgnoreCase("flats"))
					{
						System.out.println("=============================================================");
						System.out.println("please select one from the below  brand options");		
						System.out.println("=================================================");
						System.out.println("1.bata");
						System.out.println("2.sparx");
						System.out.println("3.catwalk");
						System.out.println("4.paragon");
						System.out.println("5.walkaro");
						System.out.println("6.puma");
						System.out.println("7.mochi");
						System.out.println("8.walkmate");
						System.out.println("======================================");
						Scanner o=new Scanner(System.in);
						System.out.println("Please enter  your preffered choice in string format");
						String d=o.next();
						switch(d)
						{
							case "puma":
							{
								float cost=800.00f;
								System.out.println("The price of puma is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}
							case "walkaro":
							{
								float cost=200.00f;
								System.out.println("The price of walkaro is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+" is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}
							case "paragon":
							{
								float cost=180.00f;
								System.out.println("The price of paragon is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}	
							case "bata":
							{
								float cost=250.00f;
								System.out.println("The price of bata  is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                 break;
							}
							case "sparx":
							{
								float cost=350.00f;
								System.out.println("The price of plastic decoration is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}
							case "mochi":
							{
								float cost=350.00f;
								System.out.println("The price of Plastic key chans set  is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                 break;
							}
							case "walkamte":
							{
								float cost=800.00f;
								System.out.println("The price of puma is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}
							case "catwalk":
							{
								float cost=200.00f;
								System.out.println("The price of walkaro is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+" is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							}

							default:
							{
								System.out.println("it is invalid......., please select the preffered choice only those are available only....");
								System.out.println("============================================================================");
							}
						}
					}
				else
					{
					System.out.println("please select the available options only,if your search is not there.a very sory for our side and we will intimate the  upcoming stock with 2 days");
					}	
			}
			else if(g.equalsIgnoreCase("formens"))
			{
				System.out.println("=============================================================");
				System.out.println("please select one from the below  options");		
				System.out.println("=================================================");
				System.out.println("1.casual shoes");
				System.out.println("2.formal shoes");
				System.out.println("3.sandals");
				System.out.println("4.slippers");
				System.out.println("5.boots");
				System.out.println("======================================");
				Scanner L=new Scanner(System.in);
				System.out.println("Please enter  your preffered choice in string format");
				String l=L.next();
				if(l.equalsIgnoreCase("casualshoes"))
					{
						System.out.println("=============================================================");
						System.out.println("please select one from the below  brand options");		
						System.out.println("=================================================");
						System.out.println("1.bata");
						System.out.println("2.red-hato");
						System.out.println("3.nike");
						System.out.println("4.adidas");
						System.out.println("5.walkaro");
						System.out.println("======================================");
						Scanner o=new Scanner(System.in);
						System.out.println("Please enter  your preffered choice in string format");
						String n=o.next();
						switch(n)
							{

							case "red-hato":
							    {
								float cost=800.00f;
								System.out.println("The price of redhato brand  is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							    }
							case "walkaro":
							   {
								float cost=200.00f;
								System.out.println("The price of walkaro is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+" is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                 break;
							   }
							case "paragon":
							   {
								float cost=180.00f;
								System.out.println("The price of paragon is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							   }	
							case "adidas":
							   {
								float cost=250.00f;
								System.out.println("The price of adidas  is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							   }
							case "bata":
							   {
								float cost=350.00f;
								System.out.println("The price of bata is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							   }
							default:
							  {
								System.out.println("it is .invalid, please select the preffered choice only those are available only....");
								System.out.println("============================================================================");
							  }
					   	}//switch
					}
                                
				else if(l.equalsIgnoreCase("formalshoes"))
					{
						System.out.println("=============================================================");
						System.out.println("please select one from the below  brand options");		
						System.out.println("=================================================");
						System.out.println("1.bata");
						System.out.println("2.red-hato");
						System.out.println("3.nike");
						System.out.println("4.adidas");
						System.out.println("5.walkaro");
						System.out.println("======================================");
						Scanner o=new Scanner(System.in);
						System.out.println("Please enter  your preffered choice in string format");
						String d=o.next();
						switch(d)
							{
							case "red-hato":
							    {
								float cost=800.00f;
								System.out.println("The price of redhato brand  is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							    }
							case "walkaro":
							   {
								float cost=200.00f;
								System.out.println("The price of walkaro is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+" is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							   }
							case "paragon":
							   {
								float cost=180.00f;
								System.out.println("The price of paragon is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							   }	
							case "adidas":
							   {
								float cost=250.00f;
								System.out.println("The price of adidas  is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							   }
							case "bata":
							   {
								float cost=350.00f;
								System.out.println("The price of bata is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting the shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							   }
							default:
							  {
								System.out.println("invalid selection, please select the preffered choice only those are available only....");
								System.out.println("============================================================================");
							  }
					   	}

					}
				else if(l.equalsIgnoreCase("sandals"))
					{
							System.out.println("=============================================================");
						System.out.println("please select one from the below  brand options");		
						System.out.println("=================================================");
						System.out.println("1.bata");
						System.out.println("2.red-hato");
						System.out.println("3.nike");
						System.out.println("4.adidas");
						System.out.println("5.walkaro");
						System.out.println("======================================");
						Scanner o=new Scanner(System.in);
						System.out.println("Please enter  your preffered choice in string format");
						String d=o.next();
					        switch(d)
							{
							case "red-hato":
							    {
								float cost=800.00f;
								System.out.println("The price of redhato brand  is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							    }
							case "walkaro":
							   {
								float cost=200.00f;
								System.out.println("The price of walkaro is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("you will get more shopping,we provide the discount "+dis+" is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							   }
							case "paragon":
							   {
								float cost=180.00f;
								System.out.println("The price of paragon is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							   }	
							case "adidas":
							   {
								float cost=250.00f;
								System.out.println("The price of adidas  is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							   }
							case "bata":
							   {
								float cost=350.00f;
								System.out.println("The price of bata is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							   }
							case "nike":
							    {
								float cost=900.00f;
								System.out.println("The price of nike brand  is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  you need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");                                                                    
                                                                sum=sum+(cost-disval);
                                                                break;
							    }

							default:
							  {
								System.out.println("please enter the correct choice....");
								System.out.println("============================================================================");
							  }
					   	}//elseif

				       }//switch
				else if(l.equalsIgnoreCase("slippers"))
					{
						System.out.println("=============================================================");
						System.out.println("please select one from the below  brand options");		
						System.out.println("=================================================");
						System.out.println("1.bata");
						System.out.println("2.red-hato");
						System.out.println("3.nike");
						System.out.println("4.adidas");
						System.out.println("5.walkaro");
						System.out.println("======================================");
						Scanner o=new Scanner(System.in);
						System.out.println("Please enter  your preffered choice in string format");
						String i=o.next();
						switch(i)
							{
							case "red-hato":
							    {
								float cost=800.00f;
								System.out.println("The price of redhato brand  is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
								System.out.println("Thank you for visiting the shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							    }
							case "walkaro":
							   {
								float cost=200.00f;
								System.out.println("The price of walkaro is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+" is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							   }
							case "paragon":
							   {
								float cost=180.00f;
								System.out.println("The price of paragon is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill is: "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting the shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							   }	
							case "adidas":
							   {
								float cost=250.00f;
								System.out.println("The price of adidas  is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							   }
							case "bata":
							   {
								float cost=250.00f;
								System.out.println("The price of adidas  is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							   }
	
							default:
							  {
								System.out.println("please enter the correct cost....");
								                                                                                                          								System.out.println("===================================================================");
							  }
					   	}//switch

					}
				else if(l.equalsIgnoreCase("boots"))
					{
						System.out.println("=============================================================");
						System.out.println("please select one from the below  brand options");		
						System.out.println("=================================================");
						System.out.println("1.bata");
						System.out.println("2.red-hato");
						System.out.println("3.nike");
						System.out.println("4.adidas");
						System.out.println("5.walkaro");
						System.out.println("======================================");
						Scanner o=new Scanner(System.in);
						System.out.println("Please enter  your preffered choice in string format");
						String d=o.next();
						switch(d)
							{
							case "red-hato":
							    {
								float cost=800.00f;
								System.out.println("The price of redhato brand  is :"+cost);
								float disval=(cost*dis)/100;
                                                                
								System.out.println("The final amount is: + cost");
								System.out.println("Thank you for shopping");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							    }
							case "walkaro":
							   {
								float cost=200.00f;
								System.out.println("The price of walkaro is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("the discount value is:" +(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							   }
							case "paragon":
							   {
								float cost=180.00f;
								System.out.println("The price of paragon is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The bill is:"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							   }	
							case "adidas":
							   {
								float cost=250.00f;
								System.out.println("The price of adidas  is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                 break;
							   }
							case "bata":
							   {
								float cost=350.00f;
								System.out.println("The price of bata is :"+cost);
								float disval=(cost*dis)/100;
								System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
								System.out.println("Thank you for visiting our shop");
								System.out.println("====================================");
                                                                sum=sum+(cost-disval);
                                                                break;
							      }
								default:
								{
								System.out.println("Enter available brands only");
								}

                                                        }
							 }//switch
                                                         
			else
			{
			System.out.println("please select the available  options");
			}
			}//casefootwear    
                       /*System.out.println("please select the below  options");
			System.out.println("1.select the size 3");
			System.out.println("2.select the size 4");
			System.out.println("3.select the size 5");
                        System.out.println("4.select the size 6");
			System.out.println("5.select the size 7");
			System.out.println("6.select the size 8");
			System.out.println("7.select the size 9");
			System.out.println("8.select the size 10");
			System.out.println("9.select the size 11");
			System.out.println("10.select the size 12");
			System.out.println("11.select the size 13");

                        Scanner j=new Scanner(System.in);
                        System.out.println("enter the correct size");
                        int m=j.nextInt();
                        
             
                        switch(m)
                        {  

                      case 3:
                       {
                       int size=3;
                       float cost=300.00f;
		       System.out.println("The price of redhato brand  is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);
                       break;
                       }
             case 4:
                       {
                       int size=4;
                       float cost=350.00f;
		       System.out.println("The price of redhato brand  is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
                       }
            case 5:
                       {
                       int size=5;
                       float cost=400.00f;
		       System.out.println("The price of redhato brand  is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
                       }             
            case 6:
                       {
                       int size=6;
                       float cost=450.00f;
		       System.out.println("The price of redhato brand  is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
                       }
             case 7:
                       {
                       int size=7;
                       float cost=500.00f;
		       System.out.println("The price of redhato brand  is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
                       }
             case 8:
                       {
                       int size=8;
                       float cost=550.00f;
		       System.out.println("The price of redhato brand  is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
                       }
             case 9:
                       {
                       int size=9;
                       float cost=600.00f;
		       System.out.println("The price of redhato brand  is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                        sum=sum+(cost-disval);

		       break;
                       }
             case 10:
                       {
                       int size=10;
                       float cost=800.00f;
		       System.out.println("The price of redhato brand  is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
                       }
            case 11:
                       {
                       int size=10;
                       float cost=800.00f;
		       System.out.println("The price of redhato brand  is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
                       }
           case 12:
                       {
                       int size=10;
                       float cost=800.00f;
		       System.out.println("The price of redhato brand  is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
                       }
           case 13:
                       {
                       int size=10;
                       float cost=900.00f;
		       System.out.println("The price of redhato brand  is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+"is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);
                       break;
                       }
	        default:
                        {
                       System.out.println("please enter correct size");
                       System.out.println("you  entered invalid size");
                       System.out.println("=========================================");
                        }
              }//switch
			System.out.println("please select the below  options");
			System.out.println("1.select the color pink");
			System.out.println("2.select the color blue");
			System.out.println("3.select the color violet");
                        System.out.println("4.select the color red");
			System.out.println("5.select the color green");
			System.out.println("6.select the color black");
			System.out.println("7.select the color orange");
			System.out.println("8.select the color purple");
			System.out.println("9.select the color brown");

                        Scanner j=new Scanner(System.in);
                        System.out.println("enter the correct color");
                        String k=j.next();


               switch(k)
                {
	       case "brown":
                      { 
                       String color="brown";
		       float cost=310.00f;
		       System.out.println("The price of paragon is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break; 
   			}
                case "pink":
		       {
                       String color="pink";
		       float cost=310.00f;
		       System.out.println("The price of paragon is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
		       } 
                case "blue":
		       {
                       String color="blue";
		       float cost=200.00f;
		       System.out.println("The price of paragon is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
		       }
                case "violet":
		       {
                       String color="violet";
		       float cost=210.00f;
		       System.out.println("The price of paragon is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
		       }
                case "red":
		       {
                       String color="red";
		       float cost=220.00f;
		       System.out.println("The price of paragon is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
		       }
                case "green":
		       {
                       String color="green";
		       float cost=250.00f;
		       System.out.println("The price of paragon is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
		       }
                case "black":
		       {
                       String color="black";
		       float cost=310.00f;
		       System.out.println("The price of paragon is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
		       }
                case "orange":
		       {
                       String color="orange";
		       float cost=260.00f;
		       System.out.println("The price of paragon is :"+cost);
	 	       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
		       }
                case "purple":
		       {
                       String color="purple";
		       float cost=280.00f;
		       System.out.println("The price of paragon is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
		       }
                case "pink":
		       {
                       String color="pink";
		       float cost=310.00f;
		       System.out.println("The price of paragon is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		                       break;
		       }


		       float cost=310.00f;
		       System.out.println("The price of paragon is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
		       }
                       case "bata":
		       {
                       String color="green";
		       float cost=310.00f;
		       System.out.println("The price of paragon is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
		       }
                 case "bata":
		       {
                       String color="black";
		       float cost=350.00f;
		       System.out.println("The price of paragon is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
		       }
                 case "bata":
		       {
                       String color="orange";
		       float cost=310.00f;
		       System.out.println("The price of paragon is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
		       }
                 case "bata":
		       {
                       String color="purple";
		       float cost=350.00f;
		       System.out.println("The price of paragon is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
		       }
                 case "paragon":
		       {
                       String color="pink";
		       float cost=150.00f;
		       System.out.println("The price of paragon is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
		       }
                 case "paragon":
		       {
                       String color="violet";
		       float cost=180.00f;
		       System.out.println("The price of paragon is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
		       }
                 case "paragon":
		       {
                       String color="blue";
		       float cost=180.00f;
		       System.out.println("The price of paragon is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which you need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
		       }
                 case "paragon":
		       {
                       String color="red";
		       float cost=150.00f;
		       System.out.println("The price of paragon is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
		       }
                 case "paragon":
		       {
                       String color="green";
		       float cost=150.00f;
		       System.out.println("The price of paragon is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
		       }
                 case "paragon":
		       {
                       String color="black";
		       float cost=150.00f;
		       System.out.println("The price of paragon is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
		       }
                 case "paragon":
		       {
                       String color="orange";
		       float cost=150.00f;
		       System.out.println("The price of paragon is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
		       }
                 
                 case "paragon":
		       {
                       String color="purple";
		       float cost=150.00f;
		       System.out.println("The price of paragon is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
		       }
                 case "adidas":
		       {
                       String color="pink";
		       float cost=250.00f;
		       System.out.println("The price of paragon is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
		       }
                 case "adidas":
		       {
                       String color="violet";
		       float cost=200.00f;
		       System.out.println("The price of paragon is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
		       }
                  case "adidas":
		       {
                       String color="blue";
		       float cost=250.00f;
		       System.out.println("The price of paragon is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
		       }
                  case "adidas":
		       {
                       String color="red";
		       float cost=250.00f;
		       System.out.println("The price of paragon is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
		       }
                   case "adidas":
		       {
                       String color="green";
		       float cost=250.00f;
		       System.out.println("The price of paragon is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                        sum=sum+(cost-disval);

		       break;
		       }
                   case "adidas":
		       {
                       String color="black";
		       float cost=300.00f;
		       System.out.println("The price of paragon is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
		       }
                   case "adidas":
		       {
                       String color="orange";
		       float cost=250.00f;
		       System.out.println("The price of paragon is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
		       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
		       }
                   case "adidas":
		       {
                       String color="purple";
		       float cost=250.00f;
		       System.out.println("The price of paragon is :"+cost);
		       float disval=(cost*dis)/100;
		       System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		       System.out.println("Thank you for visiting our shop");
                       System.out.println("visit again---------------------------");
                       System.out.println("====================================");
                       sum=sum+(cost-disval);

		       break;
		       }
                      
                       default:
                           {
                           System.out.println("you are entered the invalid color");
                           }

            }//switch                             
                                               
                                              	      System.out.println("=======================================");
                                                     System.out.println(" Near by locations.....................");
                                                     System.out.println("please select the below options ");
                                                     System.out.println("1.abids ");
                                                     System.out.println("2.koti ");
                                                     System.out.println("3.ameerpet ");
                                                     System.out.println("4.punjagutta ");
                                                     System.out.println("5.banjara hills ");
                                                     System.out.println("6.kukatpally/hitech city ");
                                                     System.out.println("7.dilsukhnagar ");
                                                     System.out.println("8.mehdipatnam ");
                                                     System.out.println("9.secunderabad ");
                                                     System.out.println("10.LB nagar ");
                                                     System.out.println("11.miyapur ");
                                                     System.out.println("12.uppal ");                                                                                                                                               
                                                     System.out.println("13.hyderabad ");
                                                     Scanner s=new Scanner(System.in);
                                                     System.out.println("enter the correct size");
                                                     String v=s.next();
                               switch(v)
                                       {

                                     case "abids":
                                                {
		       				float cost=250.00f;
		      		                System.out.println("The price of paragon is :"+cost);
		       			        float disval=(cost*dis)/100;
		       				System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		      			        System.out.println("Thank you for visiting our shop");
		                              System.out.println("====================================");
                                                sum=sum+(cost-disval);
                                                 break;
		                               }
                                    case "ameerpet":
                                                {
		       				float cost=250.00f;
		      		                System.out.println("The price of paragon is :"+cost);
		       			        float disval=(cost*dis)/100;
		       				System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		      			        System.out.println("Thank you for visiting our shop");
		                              System.out.println("====================================");
                                               sum=sum+(cost-disval);

		                              break;
		                               }
                                    case "punjagutta":
                                                {
		       				float cost=250.00f;
		      		                System.out.println("The price of paragon is :"+cost);
		       			        float disval=(cost*dis)/100;
		       				System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		      			        System.out.println("Thank you for visiting our shop");
		                              System.out.println("====================================");
                                               sum=sum+(cost-disval);

		                              break;
		                               }

                                    case "kukatpally":
                                                {
		       				float cost=250.00f;
		      		                System.out.println("The price of paragon is :"+cost);
		       			        float disval=(cost*dis)/100;
		       				System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		      			        System.out.println("Thank you for visiting our shop");
		                                System.out.println("====================================");
                                                sum=sum+(cost-disval);

		                              break;
		                               }
                                    case "dilsukhnagar":
                                                {
		       				float cost=250.00f;
		      		                System.out.println("The price of paragon is :"+cost);
		       			        float disval=(cost*dis)/100;
		       				System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		      			        System.out.println("Thank you for visiting our shop");
		                                System.out.println("====================================");
                                                sum=sum+(cost-disval);

		                              break;
		                               }
                                    case "mehdipatnam":
                                                {
		       				float cost=250.00f;
		      		                System.out.println("The price of paragon is :"+cost);
		       			        float disval=(cost*dis)/100;
		       				System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		      			        System.out.println("Thank you for visiting our shop");
		                              System.out.println("====================================");
                                                sum=sum+(cost-disval);

		                              break;
		                               }
                                    case "secunderabad":
                                                {
		       				float cost=250.00f;
		      		                System.out.println("The price of paragon is :"+cost);
		       			        float disval=(cost*dis)/100;
		       				System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		      			        System.out.println("Thank you for visiting our shop");
		                              System.out.println("====================================");
                                                sum=sum+(cost-disval);

		                              break;
		                               }
                                   case "LB nagar":
                                                {
		       				float cost=250.00f;
		      		                System.out.println("The price of paragon is :"+cost);
		       			        float disval=(cost*dis)/100;
		       				System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		      			        System.out.println("Thank you for visiting our shop");
		                                System.out.println("====================================");
                                                sum=sum+(cost-disval);
		                              break;
		                               }
                                   case "miyapur":
                                                {
		       				float cost=250.00f;
		      		                System.out.println("The price of paragon is :"+cost);
		       			        float disval=(cost*dis)/100;
		       				System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		      			        System.out.println("Thank you for visiting our shop");
		                              System.out.println("====================================");
                                                sum=sum+(cost-disval);

		                              break;
		                               }
                                    case "uppal":
                                                {
		       				float cost=250.00f;
		      		                System.out.println("The price of paragon is :"+cost);
		       			        float disval=(cost*dis)/100;
		       				System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		      			        System.out.println("Thank you for visiting our shop");
		                              System.out.println("====================================");
                                                sum=sum+(cost-disval);

		                              break;
		                               }
                                     case "hyderabad":
                                                {
		       				float cost=250.00f;
		      		                System.out.println("The price of paragon is :"+cost);
		       			        float disval=(cost*dis)/100;
		       				System.out.println("The requires bill which  u need to pay is,we provide the discount "+dis+ "is :"+(cost-disval));
		      			        System.out.println("Thank you for visiting our shop");
		                              System.out.println("====================================");
                                              sum=sum+(cost-disval);

		                              break;
		                               }
                                               default:
                                                     {
                                                       System.out.println("you entered invalid location...");
                                                     }
                                    }//switch

							System.out.println("================================");
							System.out.println("select payment mode:");
							System.out.println("================================");
							System.out.println("1. Cash");
							System.out.println("2. Card");
							System.out.println("3. UPI");
							System.out.println("4. Net Banking");
                                                        System.out.println("5.google pay");
                                                        System.out.println("6.phone pay");
                                                        System.out.println("7. paytm");
                                                        System.out.println("8.BHIM UPI pay");
                                                        System.out.println("9.amazon pay upi");
                                                        System.out.println("10.whatsapp pay");    
                                                        Scanner sc=new Scanner(System.in);
                                                        System.out.print("Enter your choice: ");
							 int paymentMode = sc.nextInt();
                                                        

							switch(paymentMode) {

   							 case 1:
                                                            {
                                                         
       							 System.out.println("Payment Mode: Cash");
        	-					 cost=800;
                                                         sum=sum+cost;  
        						 break;
							    }  

                                                      case 2:
                                                              {
                                                          System.out.println("Payment Mode: Card");
                                                          System.out.println("Insert or Swipe your Card.");
                                                          cost=800;
                                                          sum=sum+cost;  

                                                           break;
							     }

   							 case 3:
                                                                {
        							System.out.println("Payment Mode: UPI");
       								 System.out.println("Scan QR or enter UPI ID.");
        							 cost=800;
                                                                 sum=sum+cost;  

       								 break;
                                                                 }
                                                         case 4:
                                                                {
        							System.out.println("Payment Mode: Net Banking");
        						        System.out.println("Login to bank account.");
       							        cost=800;
                                                                 sum=sum+cost;
       								 break;
                                                                 }
    							case 5:
                                                                {
        							System.out.println("Payment Mode: google pay");
        						        System.out.println("Login to password.");
       							        cost=800;
                                                                sum=sum+cost;
       								 break;
                                                                }
    							case 6:
                                                                {
        							System.out.println("Payment Mode: phohe pay");
        						        System.out.println("Login to password.");
       							        cost=800;
                                                                sum=sum+cost;  

       								 break;
                                                                }

    							case 7:
                                                                {
        							System.out.println("Payment Mode:paytm");
        						        System.out.println("Login to password.");
       							        cost=800;
                                                                sum=sum+cost;  
                                                                break;
                                                                }
    							case 8:
                                                                {
        							System.out.println("Payment Mode:BHIM UPI pay");
        						        System.out.println("Login to password.");
       							        cost=800;
                                                                sum=sum+cost;  
                                                                 break;
                                                                }
    							case 9:
                                                                {
        							System.out.println("Payment Mode: amazon pay upi");
        						        System.out.println("Login to password.");
       							        price=800;
                                                                sum=sum+cost;  
                                                                 break;
                                                                }
    							case 10:
                                                                {
        							System.out.println("Payment Mode: whatsapp pay");
        						        System.out.println("Login to password.");
       							        cost=800;
                                                                sum=sum+cost;  
                                                                 break;
                                                                }

    							default:
                                                             {
                                                              System.out.println("Invalid Payment Mode Selected");
                                                              }
                                                   }//switch*/  
						}}
			        System.out.println("if you want yes else no");
     				Scanner sd=new Scanner(System.in);
     				  h=sd.next();
			      

                                               }//do close
   		while(h.equalsIgnoreCase("yes"));
		System.out.println("your final bill:"+sum);
}//logic
public static void main(String[] args)
{
slippers p=new slippers();
p.reading();
p.logic();
}//public
 }//class

