package lifeStyleFoodPrep;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Gui extends JFrame  { 
	
	/*Adding new menu items
	 * Create Variables to store each type of meals macros
	 * 1. qtyTemp
	 * 2. meatSizeTemp#/'A'
	 * 3. sideSizeTemp#
	 * 4. veggieSizeTemp#
	 */
	
	
	
	/*Calculation
	 * 1.For each meal, Create the following.
	 * 2. itemSizeTemp => Temp varible to grab amount needed
	 * 3. qtyTemp# => temp qty variable for  the number of that type of meal
	 * Under calculations event...
	 * 4. itemTotal = (itemSizeTemp1 * qtyTemp1) + (itemSizeTemp2 * qtyTemp2)
	 * 5.resultsDisplay.append("Item Total =" + Integer.toString(itemTotal) + "\n")
	 */
	


	private static final long serialVersionUID = 1L;
	//Meals				
	Meal cbrRG = new Meal("Chicken and Brown Rice",65,170,90);		//meat, side, veggie bowl
	Meal cwrRG = new Meal("Chicken and White Rice",65,190,90);		//meat, side, veggie bowl
	Meal cspRG = new Meal("Chicken and Sweet Potato",65,230,90);	//meat, side, veggie bowl
	Meal sbrRG = new Meal("Steak and Brown Rice",60,170,90);		//meat, side, veggie bowl
	Meal swrRG = new Meal("Steak and White Rice",60,170,90);		//meat, side, veggie bowl
	Meal sspRG = new Meal("Steak and Sweet Potato",60,170,90);		//meat, side, veggie bowl
	Meal ccsRG = new Meal("Chicken Salad",65,15,15,15,.17,.17);	 	// meat, almonds, sunflower, cheese, spinach, lettuce
	Meal tbbRG = new Meal("Turkey Bean Bowl",65,50,100,20); 		//meat, side, pepper, onion
	
	Meal cbrLG = new Meal("Chicken and Brown Rice", 114,280,90);  	//meat, side, veggie bowl
	Meal cwrLG = new Meal("Chicken and White Rice", 114,250,90);	//meat, side, veggie bowl
	Meal cspLG = new Meal("Chicken and Sweet Potato", 114,300,90);	//meat, side, veggie bowl
	Meal sbrLG = new Meal("Steak and Brown Rice", 111,280,90);		//meat, side, veggie bowl
	Meal swrLG = new Meal("Steak and White Rice", 111,250,90);		//meat, side, veggie bowl
	Meal sspLG = new Meal("Steak and Sweet Potato", 111,300,90);	//meat, side, veggie bowl
	Meal ccsLG = new Meal("Chicken Salad",111,30,30,30,.24,.24);	// meat, almonds, sunflower, cheese, spinach, lettuce
	Meal tbbLG = new Meal("Turkey Bean Bowl",115,75,140,30); 		//meat, side, pepper, onion
	// Main Panel Structure
	private JPanel mainPan;
	private JPanel leftPan;
	private JPanel rightPan;
	
	//Labels
	private JLabel regularTitle = new JLabel("Regular Meals");
	private JLabel quantityTitle = new JLabel("Quantity");
	private JLabel quantityTitle1 = new JLabel("Quantity");
	private JLabel largeTitle= new JLabel("Large Meals");
	private JLabel geniusAtWork = new JLabel("Genius At Work",  SwingConstants.CENTER);
	
	//Buttons
	private JButton calculate = new JButton("Calculate");
	
	
	//CheckBoxes
		//Regular Size
	private JCheckBox cbrReg = new JCheckBox("Chicken Brown Rice");
	private JCheckBox cwrReg = new JCheckBox("Chicken White Rice");
	private JCheckBox cspReg = new JCheckBox("Chicken Sweet Pot");
	private JCheckBox sbrReg = new JCheckBox("Steak Brown Rice");
	private JCheckBox swrReg = new JCheckBox("Steak White Rice");
	private JCheckBox sspReg = new JCheckBox("Steak Sweet Pot");
	private JCheckBox ccsReg = new JCheckBox("Chicken Caesar Salad");
	private JCheckBox tbbReg = new JCheckBox("Turkey Bean Bowl");
		//Large Size
	private JCheckBox cbrLg = new JCheckBox("Chicken Brown Rice");
	private JCheckBox cwrLg = new JCheckBox("Chicken White Rice");
	private JCheckBox cspLg = new JCheckBox("Chicken Sweet Pot");
	private JCheckBox sbrLg = new JCheckBox("Steak Brown Rice");
	private JCheckBox swrLg = new JCheckBox("Steak White Rice");
	private JCheckBox sspLg = new JCheckBox("Steak Sweet Pot");
	private JCheckBox ccsLg = new JCheckBox("Chicken Caesar Salad");
	private JCheckBox tbbLg = new JCheckBox("Turkey Bean Bowl");
	
	//Textfield text and # of allowed characters to enter into field
	private JTextField quantity1 = new JTextField("Qty.",3); 
	private JTextField quantity2= new JTextField("Qty.",3);
	private JTextField quantity3= new JTextField("Qty.",3);
	private JTextField quantity4= new JTextField("Qty.",3);
	private JTextField quantity5= new JTextField("Qty.",3);
	private JTextField quantity6= new JTextField("Qty.",3);
	private JTextField quantity7= new JTextField("Qty.",3);
	private JTextField quantity8= new JTextField("Qty.",3);
	
	
	
	private JTextField quantityA= new JTextField("Qty.",3);
	private JTextField quantityB= new JTextField("Qty.",3);
	private JTextField quantityC= new JTextField("Qty.",3);
	private JTextField quantityD= new JTextField("Qty.",3);
	private JTextField quantityE= new JTextField("Qty.",3);
	private JTextField quantityF= new JTextField("Qty.",3);
	private JTextField quantityG= new JTextField("Qty.",3);
	private JTextField quantityH= new JTextField("Qty.",3);
	
	
	private JTextArea resultsDisplay = new JTextArea(20,20);
	private JScrollPane scroll = new JScrollPane(resultsDisplay);
	private ImageIcon eminem = new ImageIcon("eminemLogo.png");
	private JLabel eminemImage = new JLabel("", eminem,JLabel.CENTER);
	private JPanel eminemPanel = new JPanel(new BorderLayout());
	

	
		//chicken brown rice bowl cbrRG
		private int qtyTemp1 = 0;			//JTextField to store number
		private int chickenRegTemp1 = 0;	//JcheckBox Meal to store chicken weight in grams
		private int brownRiceRegTemp = 0;	//JecheckBox Meal to store side
		private int veggieRegTemp1 = 0;		//JecheckBox Meal to store veggies
		//chicken white rice bowl cwrRG
		private int qtyTemp2 = 0;			
		private int chickenRegTemp2 = 0;	
		private int whiteRiceRegTemp = 0;		
		private int veggieRegTemp2 = 0;		
		//chicken sweet pot bowl cspRG
		private int qtyTemp3 = 0;			
		private int chickenRegTemp3 = 0;	
		private int sweetPotRegTemp = 0;		
		private int veggieRegTemp3 = 0;
		//steak brown rice bowl sbrRG
		private int qtyTemp4 = 0;			
		private int steakRegTemp1 = 0;	
		private int brownRiceRegTemp1 = 0;		
		private int veggieRegTemp4 = 0;
		//steak white rice bowl swrRG
		private int qtyTemp5 = 0;			
		private int steakRegTemp2 = 0;	
		private int whiteRiceRegTemp1 = 0;		
		private int veggieRegTemp5 = 0;
		//steak sweet pot bowl sspRG
		private int qtyTemp6 = 0;			
		private int steakRegTemp3 = 0;	
		private int sweetPotRegTemp1 = 0;		
		private int veggieRegTemp6 = 0;
		
		//regular chicken salad
		private int qtyTemp7 = 0;
		private int chickenRegTemp4 = 0;
		private int almondRegTemp  = 0;
		private int sunflowerRegTemp = 0;
		private int cheeseRegTemp = 0;
		private double spinachRegTemp = 0;
		private double lettuceRegTemp = 0;
		
		//Turkey Bean Bowl (Regular)
		private int qtyTemp8 =0;
		private int turkeyRegTemp1;
		private int beanRegTemp1;
		private int pepperRegTemp1;
		private int onionRegTemp1;
		
		
		
		// Large SIDE Temp variable for checkBoxes and quantity TextField
		private int qtyTempA = 0;			//JTextField to store number
		private int chickenLgTemp1 = 0;		//JcheckBox Meal to store chicken weight in grams
		private int brownRiceLgTemp = 0;	//JecheckBox Meal to store side			private int veggieLGTemp1 = 0;		//JecheckBox Meal to store veggies
		private int veggieLGTemp1 = 0;
		
		private int qtyTempB = 0;						
		private int chickenLgTemp2 = 0;	
		private int whiteRiceLgTemp = 0;		
		private int veggieLGTemp2 = 0;		
		
		private int qtyTempC = 0;			
		private int chickenLgTemp3 = 0;	
		private int sweetPotLgTemp = 0;		
		private int veggieLGTemp3 = 0;
			
		private int qtyTempD = 0;			
		private int steakLgTemp1 = 0;	
		private int brownRiceLgTemp1 = 0;		
		private int veggieLGTemp4 = 0;
			
		private int qtyTempE = 0;			
		private int steakLgTemp2 = 0;	
		private int whiteRiceLgTemp1 = 0;		
		private int veggieLGTemp5 = 0;
			
		private int qtyTempF = 0;			
		private int steakLgTemp3 = 0;	
		private int sweetPotLgTemp1 = 0;		
		private int veggieLGTemp6 = 0;

		//Chicken Salad (Large)
		private int qtyTempG = 0;
		private int chickenLgTemp4 = 0;
		private int almondLgTemp  = 0;
		private int sunflowerLgTemp = 0;
		private int cheeseLgTemp = 0;
		private double spinachLgTemp = 0;
		private double lettuceLgTemp = 0;
		
		//Turkey Bean Bowl (Regular)
		private int qtyTempH =0;
		private int turkeyLgTemp1;
		private int beanLgTemp1;
		private int pepperLgTemp1;
		private int onionLgTemp1;
			
				
	//Calculate to calculate and print results
	private int turkeyTotal;
	private int beanTotal;
	private int pepperTotal;
	private int onionTotal;
	private int steakTotal;
	private int chickenTotal;		
	private int brownRiceTotal;
	private int whiteRiceTotal;
	private int sweetPotTotal;
	private int veggieTotal;
	private int almondTotal;
	private int sunflowerTotal;
	private int cheeseTotal;
	private double spinachTotal;
	private double lettuceTotal;
	
	
	
	public Gui() {
		super("LifeStyle Food Prep Grocery Calculator");
		
		RegularMealCheckBox regularMealCheckBox = new RegularMealCheckBox(); //handler class for regular meals
		LargeMealCheckBox largeMealCheckBox = new LargeMealCheckBox(); //handler class for large meals
			
		//Main content Panel
		Container contentPane = getContentPane();
		BorderLayout contentPaneLayout = new BorderLayout();
		contentPane.setLayout(contentPaneLayout);
		geniusAtWork.setForeground(Color.white);
		geniusAtWork.setFont(new Font("Tahoma", Font.ITALIC, 30));
		contentPane.add(geniusAtWork, BorderLayout.PAGE_START);
		
		//Layout for left and right Panels (Main panlel => Line_st, Line_end)
		GridLayout gLayoutLeft = new GridLayout(0,2);//zero rows and 2 col per unit
		GridLayout gLayoutRight = new GridLayout(0,2);
		
		//create Main Panel (content pane => center)
		mainPan = new JPanel(new BorderLayout());
		contentPane.setBackground(Color.BLACK);
		contentPane.add(mainPan, BorderLayout.CENTER);	
		//adds results display
		contentPane.add(scroll, BorderLayout.PAGE_END); //adds the resultsDisplay with scroll bar to content pane
		resultsDisplay.setEditable(false);
		
		//create left panel
		leftPan = new JPanel();
		leftPan.setBackground(Color.BLACK);
		leftPan.setLayout(gLayoutLeft);
		mainPan.add(leftPan, BorderLayout.LINE_START);
		
		//Logo (main panel => center)
		eminemPanel.add(eminemImage);
		eminemPanel.setBackground(Color.black);
		mainPan.add(eminemPanel , BorderLayout.CENTER);
		
		//Titles of left panel
		regularTitle.setForeground(Color.WHITE);
		leftPan.add(regularTitle);	//Label
		quantityTitle.setForeground(Color.WHITE);
		leftPan.add(quantityTitle);		//Label
		
		//left Panel Functionality
			//CheckBoxes
			cbrReg.addItemListener(regularMealCheckBox);
			cwrReg.addItemListener(regularMealCheckBox);
			cspReg.addItemListener(regularMealCheckBox);
			sbrReg.addItemListener(regularMealCheckBox);
			swrReg.addItemListener(regularMealCheckBox);
			sspReg.addItemListener(regularMealCheckBox);
			ccsReg.addItemListener(regularMealCheckBox);
			tbbReg.addItemListener(regularMealCheckBox);
			
			//Textfields
			quantity1.setActionCommand("qty1");
			quantity1.addActionListener(regularMealCheckBox);
			quantity2.setActionCommand("qty2");
			quantity2.addActionListener(regularMealCheckBox);
			quantity3.setActionCommand("qty3");
			quantity3.addActionListener(regularMealCheckBox);
			quantity4.setActionCommand("qty4");
			quantity4.addActionListener(regularMealCheckBox);
			quantity5.setActionCommand("qty5");
			quantity5.addActionListener(regularMealCheckBox);
			quantity6.setActionCommand("qty6");
			quantity6.addActionListener(regularMealCheckBox);
			quantity7.setActionCommand("qty7");
			quantity7.addActionListener(regularMealCheckBox);
			quantity8.setActionCommand("qty8");//turkey bowl
			quantity8.addActionListener(regularMealCheckBox);
		
		
			//Combo box and qty textfield
			cbrReg.setBorderPainted(true);
			leftPan.add(cbrReg);
			leftPan.add(quantity1);
			
			cwrReg.setBorderPainted(true);
			leftPan.add(cwrReg);
			leftPan.add(quantity2);
			
			cspReg.setBorderPainted(true);
			leftPan.add(cspReg);
			leftPan.add(quantity3);
			
			sbrReg.setBorderPainted(true);
			leftPan.add(sbrReg);
			leftPan.add(quantity4);
			
			swrReg.setBorderPainted(true);
			leftPan.add(swrReg);
			leftPan.add(quantity5);
		
			sspReg.setBorderPainted(true);
			leftPan.add(sspReg);
			leftPan.add(quantity6);
			
			ccsReg.setBorderPainted(true);
			leftPan.add(ccsReg);
			leftPan.add(quantity7);
			
			tbbReg.setBorderPainted(true);
			leftPan.add(tbbReg);
			leftPan.add(quantity8);
				
		//Right Panel (line_end ::contentPane)
			rightPan = new JPanel();
			rightPan.setBackground(Color.black);
			rightPan.setLayout(gLayoutRight);
			mainPan.add(rightPan, BorderLayout.LINE_END);

			//Labels
			largeTitle.setForeground(Color.WHITE);
			rightPan.add(largeTitle);	
			quantityTitle1.setForeground(Color.WHITE);
			rightPan.add(quantityTitle1);	
				
			//Right Panel Functionality
			//CheckBoxes
			cbrLg.addItemListener(largeMealCheckBox);
			cwrLg.addItemListener(largeMealCheckBox);
			cspLg.addItemListener(largeMealCheckBox);
			sbrLg.addItemListener(largeMealCheckBox);
			swrLg.addItemListener(largeMealCheckBox);
			sspLg.addItemListener(largeMealCheckBox);
			ccsLg.addItemListener(largeMealCheckBox);
			tbbLg.addItemListener(largeMealCheckBox);
				
			//Textfields
			quantityA.setActionCommand("qtyA");
			quantityA.addActionListener(largeMealCheckBox);
			quantityB.setActionCommand("qtyB");
			quantityB.addActionListener(largeMealCheckBox);
			quantityC.setActionCommand("qtyC");
			quantityC.addActionListener(largeMealCheckBox);
			quantityD.setActionCommand("qtyD");
			quantityD.addActionListener(largeMealCheckBox);
			quantityE.setActionCommand("qtyE");
			quantityE.addActionListener(largeMealCheckBox);
			quantityF.setActionCommand("qtyF");
			quantityF.addActionListener(largeMealCheckBox);
			quantityG.setActionCommand("qtyG");
			quantityG.addActionListener(largeMealCheckBox);
			quantityH.setActionCommand("qtyH");//turkey bowl
			quantityH.addActionListener(largeMealCheckBox);
				
		
			
			//Combo box and qty textfield
			cbrLg.setBorderPainted(true);
			rightPan.add(cbrLg);
			rightPan.add(quantityA);
			
			cwrLg.setBorderPainted(true);
			rightPan.add(cwrLg);
			rightPan.add(quantityB);
			 
			cspLg.setBorderPainted(true);
			rightPan.add(cspLg);
			rightPan.add(quantityC);
	
			sbrLg.setBorderPainted(true);
			rightPan.add(sbrLg);
			rightPan.add(quantityD);
			
			swrLg.setBorderPainted(true);
			rightPan.add(swrLg);
			rightPan.add(quantityE);
		
			sspLg.setBorderPainted(true);
			rightPan.add(sspLg);
			rightPan.add(quantityF);
		
			ccsLg.setBorderPainted(true);
			rightPan.add(ccsLg);
			rightPan.add(quantityG);
			
			tbbLg.setBorderPainted(true);
			rightPan.add(tbbLg);
			rightPan.add(quantityH);
			
		//Calculate Button for both reg and large meals
			mainPan.add(calculate, BorderLayout.PAGE_END);
			calculate.setActionCommand("calculate");
			calculate.addActionListener(regularMealCheckBox);
	}
	
	//Regular meal check boxes
	 private class RegularMealCheckBox implements ItemListener, ActionListener {
		 
			public void itemStateChanged(ItemEvent event){
				if(cbrReg.isSelected() ){
					chickenRegTemp1 = cbrRG.getMeat();
					brownRiceRegTemp = cbrRG.getSide();
					veggieRegTemp1 = cbrRG.getVeggies();
					System.out.println("Protein Macros for Regular Chicken Meals: " + chickenRegTemp1 );
				}
					
				else if (cbrReg.isSelected() ==false){
					chickenRegTemp1 = 0;
					brownRiceRegTemp = 0;
					veggieRegTemp1 = 0;
					System.out.println("Protein Macros for Regular Chicken Meals: " + chickenRegTemp1 );
				}
					

				if (cwrReg.isSelected()){
					chickenRegTemp2 = cwrRG.getMeat();
					whiteRiceRegTemp = cwrRG.getSide();
					veggieRegTemp2 = cwrRG.getVeggies();
					System.out.println("Grams of White Rice: " + whiteRiceRegTemp );
				}
					
				else if (cwrReg.isSelected() ==false)
				{
					chickenRegTemp2 = 0;
					whiteRiceRegTemp = 0;
					veggieRegTemp2 = 0;
					System.out.println("Grams of White Rice: " + whiteRiceRegTemp);
				}
					
				
				if (cspReg.isSelected())
				{
					chickenRegTemp3 = cspRG.getMeat();
					sweetPotRegTemp = cspRG.getSide();
					veggieRegTemp3 = cspRG.getVeggies();
					System.out.println("Grams of Chicken3 " + chickenRegTemp3 );
				}
					
				else if (cspReg.isSelected() ==false){
					chickenRegTemp3 = 0;
					sweetPotRegTemp = 0;
					veggieRegTemp3 = 0;
					System.out.println("Grams of Chicken3 " + chickenRegTemp3  );
				}
				
				
				if (sbrReg.isSelected())
				{
					steakRegTemp1 = sbrRG.getMeat();
					brownRiceRegTemp1 = sbrRG.getSide();
					veggieRegTemp4 = sbrRG.getVeggies();
					System.out.println("Grams of steak1 " + steakRegTemp1 );
				}
					
				else if (sbrReg.isSelected() ==false)
				{
					steakRegTemp1 = 0;
					brownRiceRegTemp1 = 0;
					veggieRegTemp4 = 0;
					System.out.println("Grams of steak1 " + steakRegTemp1  );
				}
					
				
				if (swrReg.isSelected())
				{
					steakRegTemp2 = swrRG.getMeat();
					whiteRiceRegTemp1 = swrRG.getSide();
					veggieRegTemp5 = swrRG.getVeggies();
					System.out.println("Grams of steak2 " + steakRegTemp2 );
				}
				
				else if (swrReg.isSelected() ==false)
				{
					steakRegTemp2 = 0;
					whiteRiceRegTemp1 = 0;
					veggieRegTemp5 = 0;
					System.out.println("Grams of steak2 " + steakRegTemp2  );
				}
					
				
				if (sspReg.isSelected())
				{
					steakRegTemp3 = sspRG.getMeat();
					sweetPotRegTemp1 = sspRG.getSide();
					veggieRegTemp6 = sspRG.getVeggies();
					System.out.println("Grams of steak3 " + steakRegTemp3 );
				}
					
				else if (sspReg.isSelected() ==false)
				{
					steakRegTemp3 = 0;
					sweetPotRegTemp1 = 0;
					veggieRegTemp6 = 0;
					System.out.println("Grams of steak3 " + steakRegTemp3  );
				}
				
				if (ccsReg.isSelected())
				{
					chickenRegTemp4 = ccsRG.getMeat();
					almondRegTemp = ccsRG.getSide();
					sunflowerRegTemp = ccsRG.getSunflower();
					cheeseRegTemp = ccsRG.getCheese();
					lettuceRegTemp = ccsRG.getLettuce();
					spinachRegTemp = ccsRG.getSpinach();
				 
				}
					
				else if (ccsReg.isSelected() ==false)
				{
					chickenRegTemp4 = 0;
					almondRegTemp = 0;
					sunflowerRegTemp = 0;
					cheeseRegTemp = 0;
					lettuceRegTemp = 0;
					spinachRegTemp = 0;
					 
				}
				
				if (tbbReg.isSelected())
				{
					turkeyRegTemp1 = tbbRG.getMeat();
					beanRegTemp1 = tbbRG.getSide();
					pepperRegTemp1 = tbbRG.getVeggies();
					onionRegTemp1 = tbbRG.getOnion();
				}
					
				else if (tbbReg.isSelected() ==false)
				{
					turkeyRegTemp1 = 0;
					beanRegTemp1 = 0;
					pepperRegTemp1 =0;
					onionRegTemp1 = 0;
					 
				}
				
					
				
			}

			
			public void actionPerformed(ActionEvent event){
				if(event.getActionCommand() == "calculate"){
					
					//reset text area
					resultsDisplay.setText(null);

					//Chicken Total
						chickenTotal = (chickenRegTemp1 *qtyTemp1 ) + (chickenRegTemp2 *qtyTemp2 ) + (chickenRegTemp3 *qtyTemp3 ) + (chickenLgTemp1 *qtyTempA )+(chickenLgTemp2 *qtyTempB )+(chickenLgTemp3 *qtyTempC )+(chickenRegTemp4 *qtyTemp7 )+(chickenLgTemp4 *qtyTempG );
						if(chickenTotal >0) 										//if chicken is needed, print to results area
						resultsDisplay.append("Chicken Total = " + Integer.toString(chickenTotal) + "\n"); //displays to program
						System.out.println("Chicken total is: " + chickenTotal );	//display to programmer
					//Steak Total
						steakTotal = (steakRegTemp1 *qtyTemp4 ) + (steakRegTemp2 *qtyTemp5 ) + (steakRegTemp3 *qtyTemp6 )+ (steakLgTemp1 *qtyTempD )+(steakLgTemp2 *qtyTempE )+(steakLgTemp3 *qtyTempF);
						if(steakTotal >0)
						resultsDisplay.append("Steak Total = " + Integer.toString(steakTotal) + "\n");
						System.out.println("Steak total is: " + steakTotal );
					//Brown Rice Total
						brownRiceTotal = (brownRiceRegTemp *qtyTemp1 ) + (brownRiceRegTemp1 *qtyTemp4 ) + (brownRiceLgTemp *qtyTempA ) + (brownRiceLgTemp1 *qtyTempD);
						if(brownRiceTotal >0)
						resultsDisplay.append("Brown Rice Total = " + Integer.toString(brownRiceTotal) + "\n");
						System.out.println("Brown Rice total is: " + brownRiceTotal );
						
					//White Rice Total
						whiteRiceTotal = (whiteRiceRegTemp *qtyTemp2 ) + (whiteRiceRegTemp1 *qtyTemp5 ) + (whiteRiceLgTemp *qtyTempB ) + (whiteRiceLgTemp1 *qtyTempE) ;
						if(whiteRiceTotal >0)
						resultsDisplay.append("White Rice Total = " + Integer.toString(whiteRiceTotal) + "\n");
						System.out.println("White Rice total is: " + whiteRiceTotal );
						
					//Sweet Potato Total
						sweetPotTotal = (sweetPotRegTemp *qtyTemp3 ) + (sweetPotRegTemp1 *qtyTemp6 ) + (sweetPotLgTemp *qtyTempC ) + (sweetPotLgTemp1 *qtyTempF) ;
						if(sweetPotTotal >0)
						resultsDisplay.append("Sweet Potato Total = " + Integer.toString(sweetPotTotal) + "\n");
						System.out.println("Sweet Potato total is: " + sweetPotTotal );
						
					//Veggie  Total
						veggieTotal = (veggieRegTemp1 *qtyTemp1 ) + (veggieRegTemp2 *qtyTemp2) + (veggieRegTemp3 *qtyTemp3) + (veggieRegTemp4 *qtyTemp4) + (veggieRegTemp5 *qtyTemp5) + (veggieRegTemp6 *qtyTemp6) 
								+ (veggieLGTemp1 *qtyTempA) + (veggieLGTemp2 *qtyTempB) + (veggieLGTemp3 *qtyTempC) + (veggieLGTemp4 *qtyTempD) + (veggieLGTemp5 *qtyTempE) + (veggieLGTemp6 *qtyTempF);
						if(veggieTotal >0)
						resultsDisplay.append("Veggie Total = " + Integer.toString(veggieTotal) + "\n");
						System.out.println("Veggie total is: " + veggieTotal );
						
						resultsDisplay.append("\n");
						
						//Almond  Total
						almondTotal = (almondRegTemp * qtyTemp7) + (almondLgTemp * qtyTempG);
						if(almondTotal >0)
							resultsDisplay.append("Almond Total = " + Integer.toString(almondTotal) + "\n");
						//SunFlower  Total
						sunflowerTotal = (sunflowerRegTemp * qtyTemp7) + (sunflowerLgTemp * qtyTempG);
						if(sunflowerTotal >0)
							resultsDisplay.append("Sunflower Total = " + Integer.toString(sunflowerTotal) + "\n");
						//Cheese  Total
						cheeseTotal = (cheeseRegTemp * qtyTemp7) + (cheeseLgTemp * qtyTempG);
						if(cheeseTotal >0)
							resultsDisplay.append("Cheese Total = " + Integer.toString(cheeseTotal) + "\n");
						//Spinach  Total
						spinachTotal = (spinachRegTemp * qtyTemp7) + (spinachLgTemp * qtyTempG);
						if(spinachTotal >0)
							resultsDisplay.append("Spinach Total = " + Double.toString(spinachTotal) + "\n");
						//Lettuce  Total
						lettuceTotal = (lettuceRegTemp * qtyTemp7) + (lettuceLgTemp * qtyTempG);
						if(lettuceTotal >0)
							resultsDisplay.append("Lettuce Total = " + Double.toString(lettuceTotal) + "\n");
						
						resultsDisplay.append("\n");
						
						//Turkey  Total
						turkeyTotal = (turkeyRegTemp1 * qtyTemp8) + (turkeyLgTemp1 * qtyTempH);
						if(turkeyTotal >0)
							resultsDisplay.append("Turkey Total = " + Integer.toString(turkeyTotal) + "\n");
						//Bean  Total
						beanTotal = (beanRegTemp1 * qtyTemp8) + (beanLgTemp1 * qtyTempH);
						if(beanTotal >0)
							resultsDisplay.append("Bean Total = " + Integer.toString(beanTotal) + "\n");
						//Pepper  Total
						pepperTotal = (pepperRegTemp1 * qtyTemp8) + (pepperLgTemp1 * qtyTempH);
						if(pepperTotal >0)
							resultsDisplay.append("Pepper Total = " + Integer.toString(pepperTotal) + "\n");
						//Onion  Total
						onionTotal = (onionRegTemp1 * qtyTemp8) + (onionLgTemp1 * qtyTempH);
						if(onionTotal >0)
							resultsDisplay.append("Onion Total = " + Integer.toString(onionTotal) + "\n");
						resultsDisplay.append("\n");
						resultsDisplay.append("\n");
						
				}
				else if(event.getActionCommand() == "qty1"){
					qtyTemp1 = Integer.parseInt(quantity1.getText()) ;
					System.out.println("Meal quantity is: " + qtyTemp1);
				}
					
				else if(event.getActionCommand() == "qty2"){
					qtyTemp2 = Integer.parseInt(quantity2.getText()) ;
					System.out.println("Meal quantity is: " + qtyTemp2);
				}
				
				else if(event.getActionCommand() == "qty3"){
					qtyTemp3 = Integer.parseInt(quantity3.getText()) ;
					System.out.println("Meal quantity is: " + qtyTemp3);
				}
				else if(event.getActionCommand() == "qty4"){
					qtyTemp4 = Integer.parseInt(quantity4.getText()) ;
					System.out.println("Meal quantity is: " + qtyTemp4);
				}
				else if(event.getActionCommand() == "qty5"){
					qtyTemp5 = Integer.parseInt(quantity5.getText()) ;
					System.out.println("Meal quantity is: " + qtyTemp5);
				}
				else if(event.getActionCommand() == "qty6"){
					qtyTemp6 = Integer.parseInt(quantity6.getText()) ;
					System.out.println("Meal quantity is: " + qtyTemp6);
				}
				else if(event.getActionCommand() == "qty7"){
					qtyTemp7 = Integer.parseInt(quantity7.getText()) ;
					System.out.println("Meal quantity is: " + qtyTemp7);
				}
				else if(event.getActionCommand() == "qty8"){
					qtyTemp8 = Integer.parseInt(quantity8.getText()) ;
					System.out.println("Meal quantity is: " + qtyTemp8);
				}
			}
		}
	
	 //Large Meals check boxes
	 private class LargeMealCheckBox implements ItemListener, ActionListener {
			public void itemStateChanged(ItemEvent event){
				if(cbrLg.isSelected()){
					chickenLgTemp1 = cbrLG.getMeat();
					brownRiceLgTemp = cbrLG.getSide();
					veggieLGTemp1 = cbrLG.getVeggies();
					System.out.println("Protein Macros for Large Chicken Meals: " + chickenLgTemp1 );
				}
					
				else if (!cbrLg.isSelected()){
					chickenLgTemp1 = 0;
					brownRiceLgTemp = 0;
					veggieLGTemp1 = 0;
					System.out.println("Protein Macros for Large Chicken Meals: " + chickenLgTemp1 );
				}
					

				if (cwrLg.isSelected()){
					chickenLgTemp2 = cwrLG.getMeat();
					whiteRiceLgTemp = cwrLG.getSide();
					veggieLGTemp2 = cwrLG.getVeggies();
					System.out.println("Grams of White Rice: " + whiteRiceLgTemp );
				}
					
				else if (cwrLg.isSelected() ==false)
				{
					chickenLgTemp2 = 0;
					whiteRiceLgTemp = 0;
					veggieLGTemp2 = 0;
					System.out.println("Grams of White Rice: " + whiteRiceLgTemp);
				}
					
				
				if (cspLg.isSelected() )
				{
					chickenLgTemp3 = cspLG.getMeat();
					sweetPotLgTemp = cspLG.getSide();
					veggieLGTemp3 = cspLG.getVeggies();
					System.out.println("Grams of Chicken3 " + chickenLgTemp3 );
				}
					
				else if (cspLg.isSelected() ==false){
					chickenLgTemp3 = 0;
					sweetPotLgTemp = 0;
					veggieLGTemp3 = 0;
					System.out.println("Grams of Chicken3 " + chickenLgTemp3  );
				}
				
				
				if (sbrLg.isSelected())
				{
					steakLgTemp1 = sbrLG.getMeat();
					brownRiceLgTemp1 = sbrLG.getSide();
					veggieLGTemp4 = sbrLG.getVeggies();
					System.out.println("Grams of steak1 " + steakLgTemp1 );
				}
					
				else if (sbrLg.isSelected() ==false)
				{
					steakLgTemp1 = 0;
					brownRiceLgTemp1 = 0;
					veggieLGTemp4 = 0;
					System.out.println("Grams of steak1 " + steakLgTemp1  );
				}
					
				
				if (swrLg.isSelected() )
				{
					steakLgTemp2 = swrLG.getMeat();
					whiteRiceLgTemp1 = swrLG.getSide();
					veggieLGTemp5 = swrLG.getVeggies();
					System.out.println("Grams of steak2 " + steakLgTemp2 );
				}
				
				else if (swrLg.isSelected() ==false)
				{
					steakLgTemp2 = 0;
					whiteRiceLgTemp1 = 0;
					veggieLGTemp5 = 0;
					System.out.println("Grams of steak2 " + steakLgTemp2  );
				}
					
				
				if (sspLg.isSelected())
				{
					steakLgTemp3 = sspLG.getMeat();
					sweetPotLgTemp1 = sspLG.getSide();
					veggieLGTemp6 = sspLG.getVeggies();
					System.out.println("Grams of steak3 " + steakLgTemp3 );
				}
					
				else if (sspLg.isSelected() ==false)
				{
					steakLgTemp3 = 0;
					sweetPotLgTemp1 = 0;
					veggieLGTemp6 = 0;
					System.out.println("Grams of steak3 " + steakLgTemp3  );
				}
				
				if (ccsLg.isSelected())
				{
					chickenLgTemp4 = ccsLG.getMeat();
					almondLgTemp = ccsLG.getSide();
					sunflowerLgTemp = ccsLG.getSunflower();
					cheeseLgTemp = ccsLG.getCheese();
					lettuceLgTemp = ccsLG.getLettuce();
					spinachLgTemp = ccsLG.getSpinach();
					System.out.println("Grams of chicken4 " + chickenLgTemp4 );
				}
					
				else if (ccsLg.isSelected() ==false)
				{
					chickenLgTemp4 = 0;
					almondLgTemp = 0;
					sunflowerLgTemp = 0;
					cheeseLgTemp = 0;
					lettuceLgTemp = 0;
					spinachLgTemp = 0;
					System.out.println("Grams of chicken4 " + chickenLgTemp4  );
				}
				
				if (tbbLg.isSelected())
				{
					turkeyLgTemp1 = tbbLG.getMeat();
					beanLgTemp1 = tbbLG.getSide();
					pepperLgTemp1 = tbbLG.getVeggies();
					onionLgTemp1 = tbbLG.getOnion();
				}
					
				else if (tbbLg.isSelected() ==false)
				{
					turkeyLgTemp1 = 0;
					beanLgTemp1 = 0;
					pepperLgTemp1 =0;
					onionLgTemp1 = 0;
					 
				}
					
			
					
				
			}
			
			public void actionPerformed(ActionEvent event){
				if(event.getActionCommand() == "qtyA"){
					qtyTempA = Integer.parseInt(quantityA.getText()) ;
					System.out.println("Meal quantity is: " + qtyTempA);
				}
					
				else if(event.getActionCommand() == "qtyB"){
					qtyTempB = Integer.parseInt(quantityB.getText()) ;
					System.out.println("Meal quantity is: " + qtyTempB);
				}
				
				else if(event.getActionCommand() == "qtyC"){
					qtyTempC = Integer.parseInt(quantityC.getText()) ;
					System.out.println("Meal quantity is: " + qtyTempC);
				}
				else if(event.getActionCommand() == "qtyD"){
					qtyTempD = Integer.parseInt(quantityD.getText()) ;
					System.out.println("Meal quantity is: " + qtyTempD);
				}
				else if(event.getActionCommand() == "qtyE"){
					qtyTempE = Integer.parseInt(quantityE.getText()) ;
					System.out.println("Meal quantity is: " + qtyTempE);
				}
				else if(event.getActionCommand() == "qtyF"){
					qtyTempF = Integer.parseInt(quantityF.getText()) ;
					System.out.println("Meal quantity is: " + qtyTempF);
				}
				else if(event.getActionCommand() == "qtyG"){
					qtyTempG = Integer.parseInt(quantityG.getText()) ;
					System.out.println("Meal quantity is: " + qtyTempG);
				}
				else if(event.getActionCommand() == "qtyH"){//turkey bowl	
					qtyTempH = Integer.parseInt(quantityH.getText()) ;
					System.out.println("Meal quantity is: " + qtyTempH);
				}
				
			}
		}
	
	 
}
