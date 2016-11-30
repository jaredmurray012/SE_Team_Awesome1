package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class sceneContainer 
{

	Stage stage;
	
	HBox loginPane; 
	Scene LoginScene;
	
	AnchorPane menuPane; 
	Scene menuScene; 
	
	HBox ClockInOutPane;
	Scene ClockInOutScene;
	
	HBox BreakfastPane; 
	Scene BreakfastScene; 
	
	HBox BreakfastMasterpiecesPane; 
	Scene BreakfastMasterpiecesScene;
	
	HBox CountryFavoritesPane; 
	Scene CountryFavoriteScene; 
	
	HBox FamousBenedictsPane; 
	Scene FamousBenedictsScene; 
	
	HBox HealthyChoicesPane;
	Scene HealthyChoicesScene;
	
	AnchorPane HomePane;
	Scene HomeScene;
	
	HBox HotOffTheGriddlePane;
	Scene HotOffTheGriddleScene;
	
	HBox MexicanCuisinePane;
	Scene MexicanCuisineScene; 
	
	HBox MenuOptionsPane;
	Scene MenuOptionsScene;
	
	HBox OmeletsPane; 
	Scene OmeletsScene;
	
	HBox SkilletsPane; 
	Scene SkilletsScene; 
	
	HBox StartersPane;
	Scene StartersScene; 
	
	AnchorPane ToppingsPane;
	Scene ToppingsScene; 
	
	HBox BeveragesPane;
	Scene BeveragesScene;
	
	HBox SaladsPane;
	Scene SaladsScene;
	
	HBox BreakfastSandwichesPane;
	Scene BreakfastSandwichesScene; 
	
	HBox TablesPane;
	Scene TablesScene;
	
	HBox Table1Pane;
	Scene Table1Scene;
	
	HBox Table2Pane;
	Scene Table2Scene;
	
	HBox Table3Pane;
	Scene Table3Scene;
	
	HBox Table4Pane;
	Scene Table4Scene;
	
	HBox Table5Pane;
	Scene Table5Scene;
	
	HBox Table6Pane;
	Scene Table6Scene;
	
	HBox Table7Pane;
	Scene Table7Scene;
	
	HBox Table8Pane;
	Scene Table8Scene;
	
	HBox Table9Pane;
	Scene Table9Scene;
	
	HBox Table10Pane;
	Scene Table10Scene;
	
	HBox Table11Pane;
	Scene Table11Scene;
	
	HBox Table12Pane;
	Scene Table12Scene;
	
	HBox Table13Pane;
	Scene Table13Scene;
	
	HBox Table14Pane;
	Scene Table14Scene;
	
	HBox SpecialtySandwichesPane;
	Scene SpecialtySandwichesScene;
	
	HBox TwoHandedBurgersPane;
	Scene TwoHandedBurgersScene;
	
	HBox ClassicSandwichesPane;
	Scene ClassicSandwichesScene;
	
	HBox PaninisPane;
	Scene PaninisScene;
	
	HBox WrapsPane;
	Scene WrapsScene;
	
	HBox QuesadillasPane;
	Scene QuesadillasScene;
	
	HBox LunchOptionsPane;
	Scene LunchOptionsScene;
	
	sceneContainer() // constructor 
	{
		stage = new Stage(); 
		
		try {
			loginPane = FXMLLoader.load(getClass().getResource("FXML_Login.fxml"));
		} catch (IOException e) {
			System.out.println("The Login FXML did not load correctly"); 
			e.printStackTrace();
		} 
		try {
			TablesPane  = FXMLLoader.load(getClass().getResource("FXML_Tables.fxml"));
		} catch (IOException e) {
			System.out.println("The Tables FXML did not load correctly");
			e.printStackTrace();
		}
		try {
			Table1Pane  = FXMLLoader.load(getClass().getResource("FXML_Table1.fxml"));
		} catch (IOException e) {
			System.out.println("The Table1 FXML did not load correctly");
			e.printStackTrace();
		}
		try {
			Table2Pane  = FXMLLoader.load(getClass().getResource("FXML_Table2.fxml"));
		} catch (IOException e) {
			System.out.println("The Table2 FXML did not load correctly");
			e.printStackTrace();
		}
		try {
			Table3Pane  = FXMLLoader.load(getClass().getResource("FXML_Table3.fxml"));
		} catch (IOException e) {
			System.out.println("The Table3 FXML did not load correctly");
			e.printStackTrace();
		}
		try {
			Table4Pane  = FXMLLoader.load(getClass().getResource("FXML_Table4.fxml"));
		} catch (IOException e) {
			System.out.println("The Table4 FXML did not load correctly");
			e.printStackTrace();
		}
		try {
			Table5Pane  = FXMLLoader.load(getClass().getResource("FXML_Table5.fxml"));
		} catch (IOException e) {
			System.out.println("The Table5 FXML did not load correctly");
			e.printStackTrace();
		}
		try {
			Table6Pane  = FXMLLoader.load(getClass().getResource("FXML_Table6.fxml"));
		} catch (IOException e) {
			System.out.println("The Table6 FXML did not load correctly");
			e.printStackTrace();
		}
		try {
			Table6Pane  = FXMLLoader.load(getClass().getResource("FXML_Table6.fxml"));
		} catch (IOException e) {
			System.out.println("The Table6 FXML did not load correctly");
			e.printStackTrace();
		}
		try {
			Table7Pane  = FXMLLoader.load(getClass().getResource("FXML_Table7.fxml"));
		} catch (IOException e) {
			System.out.println("The Table7 FXML did not load correctly");
			e.printStackTrace();
		}
		try {
			Table8Pane  = FXMLLoader.load(getClass().getResource("FXML_Table8.fxml"));
		} catch (IOException e) {
			System.out.println("The Table8 FXML did not load correctly");
			e.printStackTrace();
		}
		try {
			Table9Pane  = FXMLLoader.load(getClass().getResource("FXML_Table9.fxml"));
		} catch (IOException e) {
			System.out.println("The Table9 FXML did not load correctly");
			e.printStackTrace();
		}
		try {
			Table9Pane  = FXMLLoader.load(getClass().getResource("FXML_Table9.fxml"));
		} catch (IOException e) {
			System.out.println("The Table9 FXML did not load correctly");
			e.printStackTrace();
		}
		try {
			Table10Pane  = FXMLLoader.load(getClass().getResource("FXML_Table10.fxml"));
		} catch (IOException e) {
			System.out.println("The Table10 FXML did not load correctly");
			e.printStackTrace();
		}
		try {
			Table11Pane  = FXMLLoader.load(getClass().getResource("FXML_Table11.fxml"));
		} catch (IOException e) {
			System.out.println("The Table11 FXML did not load correctly");
			e.printStackTrace();
		}
		try {
			Table12Pane  = FXMLLoader.load(getClass().getResource("FXML_Table12.fxml"));
		} catch (IOException e) {
			System.out.println("The Table12 FXML did not load correctly");
			e.printStackTrace();
		}
		try {
			Table13Pane  = FXMLLoader.load(getClass().getResource("FXML_Table13.fxml"));
		} catch (IOException e) {
			System.out.println("The Table13 FXML did not load correctly");
			e.printStackTrace();
		}
		try {
			Table14Pane  = FXMLLoader.load(getClass().getResource("FXML_Table14.fxml"));
		} catch (IOException e) {
			System.out.println("The Table14 FXML did not load correctly");
			e.printStackTrace();
		}
		try {
			menuPane = FXMLLoader.load(getClass().getResource("FXML_Menu.fxml"));
		} catch (IOException e) {
			System.out.println("The Menu FXML did not load correctly"); 
			e.printStackTrace();
		}
		try {
			ClockInOutPane = FXMLLoader.load(getClass().getResource("Clock.fxml"));
		} catch (IOException e) {
			System.out.println("The Clock FXML did not load correctly"); 
			e.printStackTrace();
		}
		try {														
			BreakfastPane = FXMLLoader.load(getClass().getResource("FXML_Breakfast.fxml"));
		} catch (IOException e) {
			System.out.println("The BreakfastScene FXML did not load correctly"); 
			e.printStackTrace();
		}
		 
		try {
			BreakfastMasterpiecesPane = FXMLLoader.load(getClass().getResource("FXML_BreakfastMasterpieces.fxml"));
		} catch (IOException e) {
			System.out.println("The BreakfastMasterpieces FXML did not load correctly"); 
			e.printStackTrace();
		}
		try {
				BreakfastSandwichesPane  = FXMLLoader.load(getClass().getResource("FXML_BreakfastSandwiches.fxml"));
			} catch (IOException e) {
				System.out.println("The Breakfast Sandwiches FXML did not load correctly");
				e.printStackTrace();
			}
		
		try {
			CountryFavoritesPane = FXMLLoader.load(getClass().getResource("FXML_CountryFavorites.fxml"));
		} catch (IOException e) {
			System.out.println("The CountryFavorites FXML did not load correctly");
			e.printStackTrace();
		}
		try {
			FamousBenedictsPane = FXMLLoader.load(getClass().getResource("FXML_FamousBenedicts.fxml"));
		} catch (IOException e) {
			System.out.println("The Famous Benedict FXML did not load correctly");
			e.printStackTrace();
		}
		
		try {
			HomePane  = FXMLLoader.load(getClass().getResource("FXML_Home.fxml"));
		} catch (IOException e) {
			System.out.println("Home FXML did not load correctly");
			e.printStackTrace();
		}
		try {
			HotOffTheGriddlePane  = FXMLLoader.load(getClass().getResource("FXML_HotOffTheGriddle.fxml"));
		} catch (IOException e) {
			System.out.println("Home HotOffTheGriddleScene did not load correctly");
			e.printStackTrace();
		}
		try {
			MenuOptionsPane  = FXMLLoader.load(getClass().getResource("FXML_MenuOptions.fxml"));
		} catch (IOException e) {
			System.out.println("Home HotOffTheGriddleScene did not load correctly");
			e.printStackTrace();
		}
		
		try {
			MexicanCuisinePane  = FXMLLoader.load(getClass().getResource("FXML_MexicanCuisine.fxml"));
		} catch (IOException e) {
			System.out.println("Home MexicanCuisinePane did not load correctly");
			e.printStackTrace();
		}
		try {
			OmeletsPane  = FXMLLoader.load(getClass().getResource("FXML_Omelets.fxml"));
		} catch (IOException e) {
			System.out.println("Home OmeletsPane did not load correctly");
			e.printStackTrace();
		}
		try {
			SkilletsPane  = FXMLLoader.load(getClass().getResource("FXML_Skillets.fxml"));
		} catch (IOException e) {
			System.out.println("Home SkilletsPane did not load correctly");
			e.printStackTrace();
		}
		try {
			StartersPane  = FXMLLoader.load(getClass().getResource("FXML_Starters.fxml"));
		} catch (IOException e) {
			System.out.println("Home StartersPane did not load correctly");
			e.printStackTrace();
		}
		try {
			ToppingsPane  = FXMLLoader.load(getClass().getResource("FXML_Toppings.fxml"));
		} catch (IOException e) {
			System.out.println("Home ToppingsPane did not load correctly");
			e.printStackTrace();
		}
		try {
			BeveragesPane  = FXMLLoader.load(getClass().getResource("FXML_Beverages.fxml"));
		} catch (IOException e) {
			System.out.println("Home BeveragesPane did not load correctly");
			e.printStackTrace();
		}
		try {
			SaladsPane  = FXMLLoader.load(getClass().getResource("FXML_Salads.fxml"));
		} catch (IOException e) {
			System.out.println("Home SaladsPane did not load correctly");
			e.printStackTrace();
		}
		try {
			SpecialtySandwichesPane = FXMLLoader.load(getClass().getResource("FXML_SpecialtySandwiches.fxml"));
		} catch (IOException e) {
			System.out.println("Home Specialty Sandwiches did not load correctly");
			e.printStackTrace();
		}
		try {
			TwoHandedBurgersPane = FXMLLoader.load(getClass().getResource("FXML_TwoHandedBurgers.fxml"));
		} catch (IOException e) {
			System.out.println("The Two Handed Burger FXML did not load correctly"); 
			e.printStackTrace();
		} 
		try {
			ClassicSandwichesPane  = FXMLLoader.load(getClass().getResource("FXML_ClassicSandwiches.fxml"));
		} catch (IOException e) {
			System.out.println("The Classic Sandwiches FXML did not load correctly");
			e.printStackTrace();
		}
		try {
			PaninisPane  = FXMLLoader.load(getClass().getResource("FXML_Paninis.fxml"));
		} catch (IOException e) {
			System.out.println("The Healthy Choices FXML did not load correctly");
			e.printStackTrace();
		}
		try {
			WrapsPane  = FXMLLoader.load(getClass().getResource("FXML_Wraps.fxml"));
		} catch (IOException e) {
			System.out.println("The Wraps FXML did not load correctly");
			e.printStackTrace();
		}
		try {
			QuesadillasPane  = FXMLLoader.load(getClass().getResource("FXML_Quesadillas.fxml"));
		} catch (IOException e) {
			System.out.println("The Healthy Choices FXML did not load correctly");
			e.printStackTrace();
		}
		
		try {
			HealthyChoicesPane  = FXMLLoader.load(getClass().getResource("FXML_HeathlyChoices2.fxml"));
		} catch (IOException e) {
			System.out.println("The Healthy Choices FXML did not load correctly");
			e.printStackTrace();
		}
		try {
			LunchOptionsPane  = FXMLLoader.load(getClass().getResource("FXML_LunchOptions.fxml"));
		} catch (IOException e) {
			System.out.println("The Lunch Options FXML did not load correctly");
			e.printStackTrace();
		}
		
		
		 
		HealthyChoicesScene = new Scene(HealthyChoicesPane, 600, 600);
		
		MenuOptionsScene = new Scene(MenuOptionsPane, 700, 600);
		TablesScene = new Scene(TablesPane, 600, 600);
		Table1Scene = new Scene(Table1Pane, 600,600);
		Table2Scene = new Scene(Table2Pane, 600,600);
		Table3Scene = new Scene(Table3Pane, 600,600);
		Table4Scene = new Scene(Table4Pane, 600,600);
		Table5Scene = new Scene(Table5Pane, 600,600);
		Table6Scene = new Scene(Table6Pane, 600,600);
		Table7Scene = new Scene(Table7Pane, 600,600);
		Table8Scene = new Scene(Table8Pane, 600,600);
		Table9Scene = new Scene(Table9Pane, 600,600);
		Table10Scene = new Scene(Table10Pane, 600,600);
		Table11Scene = new Scene(Table11Pane, 600,600);
		Table12Scene = new Scene(Table12Pane, 600,600);
		Table13Scene = new Scene(Table13Pane, 600,600);
		Table14Scene = new Scene(Table14Pane, 600,600);
		menuScene = new Scene(menuPane, 600, 600); 
		LoginScene = new Scene(loginPane, 600, 600); 
		ClockInOutScene = new Scene(ClockInOutPane, 700, 702);
		BreakfastScene = new Scene(BreakfastPane, 600, 600);
		BreakfastMasterpiecesScene = new Scene(BreakfastMasterpiecesPane, 600, 600);
		CountryFavoriteScene = new Scene(CountryFavoritesPane, 600, 600);
		FamousBenedictsScene = new Scene(FamousBenedictsPane, 600, 600);
		BreakfastSandwichesScene = new Scene(BreakfastSandwichesPane, 600, 600);
		SpecialtySandwichesScene = new Scene(SpecialtySandwichesPane, 600, 600);
		TwoHandedBurgersScene = new Scene(TwoHandedBurgersPane, 600, 600);
		ClassicSandwichesScene = new Scene(ClassicSandwichesPane, 600, 600);
		PaninisScene = new Scene(PaninisPane, 600, 600);
		WrapsScene = new Scene(WrapsPane, 600, 600);
		QuesadillasScene = new Scene(QuesadillasPane, 600, 600);		
		HomeScene = new Scene(HomePane, 600, 600);
		HotOffTheGriddleScene = new Scene(HotOffTheGriddlePane, 600, 600);
		MexicanCuisineScene = new Scene(MexicanCuisinePane, 600, 600);
		OmeletsScene = new Scene(OmeletsPane, 600, 600);
		SkilletsScene = new Scene(SkilletsPane, 600, 600);
		StartersScene = new Scene(StartersPane, 600, 600);
		ToppingsScene = new Scene(ToppingsPane, 600, 600);
		BeveragesScene = new Scene(BeveragesPane, 600, 600);
		SaladsScene = new Scene(SaladsPane, 600, 600);
		LunchOptionsScene = new Scene(LunchOptionsPane, 600, 600);
		}
	
	
	
	public void loadScene(Scene scene, String sceneTitle)
	{
		stage.setScene(scene); 
		stage.setTitle(sceneTitle);
		stage.show(); 
	}
	
	public void DisplayLoginScene()
	{
		stage.setScene(LoginScene); 
		stage.setTitle("Login Here");
		stage.show();
	}
	
	public void DisplayMenuScene() 
	{
		stage.setScene(menuScene);
		stage.setTitle("This is the menu Scene");
		stage.show(); 
	}
	public void DisplayClockInOutScene()
	{
		stage.setScene(ClockInOutScene);
		stage.setTitle("Clock in here");
		stage.show();
	}
	public void DisplayTablesScene()
	{
		stage.setScene(TablesScene); 
		stage.setTitle("Tables"); 
		stage.show(); 
	}
	public void DisplayTable1Scene()
	{
		stage.setScene(Table1Scene); 
		stage.setTitle("Table1"); 
		stage.show(); 
	}
	public void DisplayTable2Scene()
	{
		stage.setScene(Table2Scene); 
		stage.setTitle("Table2"); 
		stage.show(); 
	}
	public void DisplayTable3Scene()
	{
		stage.setScene(Table3Scene); 
		stage.setTitle("Table3"); 
		stage.show(); 
	}
	public void DisplayTable4Scene()
	{
		stage.setScene(Table4Scene); 
		stage.setTitle("Table4"); 
		stage.show(); 
	}
	public void DisplayTable5Scene()
	{
		stage.setScene(Table5Scene); 
		stage.setTitle("Table5"); 
		stage.show(); 
	}
	public void DisplayTable6Scene()
	{
		stage.setScene(Table6Scene); 
		stage.setTitle("Table6"); 
		stage.show(); 
	}
	public void DisplayTable7Scene()
	{
		stage.setScene(Table7Scene); 
		stage.setTitle("Table7"); 
		stage.show(); 
	}
	public void DisplayTable8Scene()
	{
		stage.setScene(Table8Scene); 
		stage.setTitle("Table8"); 
		stage.show(); 
	}
	public void DisplayTable9Scene()
	{
		stage.setScene(Table9Scene); 
		stage.setTitle("Table9"); 
		stage.show(); 
	}
	public void DisplayTable10Scene()
	{
		stage.setScene(Table10Scene); 
		stage.setTitle("Table10"); 
		stage.show(); 
	}
	public void DisplayTable11Scene()
	{
		stage.setScene(Table11Scene); 
		stage.setTitle("Table11"); 
		stage.show(); 
	}
	public void DisplayTable12Scene()
	{
		stage.setScene(Table12Scene); 
		stage.setTitle("Table12"); 
		stage.show(); 
	}
	public void DisplayTable13Scene()
	{
		stage.setScene(Table13Scene); 
		stage.setTitle("Table13"); 
		stage.show(); 
	}
	public void DisplayTable14Scene()
	{
		stage.setScene(Table14Scene); 
		stage.setTitle("Table14"); 
		stage.show(); 
	}
	public void DisplayBreakfastScene()
	{
		stage.setScene(BreakfastScene); 
		stage.setTitle("Breakfast Items"); 
		stage.show(); 
	}
	public void DisplayBreakfastMasterpiecesScene()
	{
		stage.setScene(BreakfastMasterpiecesScene); 
		stage.setTitle("Breakfast Master Piece Items"); 
		stage.show(); 
	}
	public void DisplayCountryFavoriteScene()
	{
		stage.setScene(CountryFavoriteScene); 
		stage.setTitle("CountryFavorite Piece Items"); 
		stage.show(); 
	}
	public void DisplayFamousBenedictsScene()
	{
		stage.setScene(FamousBenedictsScene); 
		stage.setTitle("Famous Benedicts Scene Piece Items"); 
		stage.show();
	}
	public void DisplayHealthyChoices()
	{
		stage.setScene(HealthyChoicesScene); 
		stage.setTitle("Healthy Choices Scene Piece Items"); 
		stage.show();
	}
	public void DisplayHome()
	{
		stage.setScene(HomeScene); 
		stage.setTitle("Home Scene Piece Items"); 
		stage.show();
	}
	public void DisplayHotOffTheGriddleScene()
	{
		stage.setScene(HotOffTheGriddleScene); 
		stage.setTitle("Display Hot Off The Griddle Scene"); 
		stage.show();
	}
	public void DisplayMexicanCuisineScene()
	{
		stage.setScene(MexicanCuisineScene); 
		stage.setTitle("Display Mexican Cuisine Scene"); 
		stage.show();
	}
	public void DisplayOmeletsScene()
	{
		stage.setScene(OmeletsScene); 
		stage.setTitle("Display Omelet Scene"); 
		stage.show();
	}
	public void DisplaySkilletsScene()
	{
		stage.setScene(SkilletsScene); 
		stage.setTitle("Display Skillets Scene"); 
		stage.show();
	}
	public void DisplayStartersScene()
	{
		stage.setScene(StartersScene); 
		stage.setTitle("Display Starters Scene"); 
		stage.show();
	}
	public void DisplayToppingsScene()
	{
		stage.setScene(ToppingsScene); 
		stage.setTitle("Display Toppings Scene"); 
		stage.show();
	}
	
	public void DisplayMenuOptionsScene()
	{
		stage.setScene(MenuOptionsScene); 
		stage.setTitle("Display Menu Options Scene"); 
		stage.show();
	}
	
	public void DisplayBeveragesScene()
	{
		stage.setScene(BeveragesScene); 
		stage.setTitle("Display Beverages Scene"); 
		stage.show();
	}
	public void DisplaySaladsScene()
	{
		stage.setScene(SaladsScene); 
		stage.setTitle("Display Salads Scene"); 
		stage.show();
	}
	public void DisplayBreakfastSandwichesScene()
	{
		stage.setScene(BreakfastSandwichesScene); 
		stage.setTitle("Display BreakfastSandwiches Scene"); 
		stage.show();
	}
	public void DisplaySpecialtySandwichesScene()
	{
		stage.setScene(SpecialtySandwichesScene); 
		stage.setTitle("Display SpecialtySandwiches Scene"); 
		stage.show();
	}
	public void DisplayTwoHandedBurgersScene()
	{
		stage.setScene(TwoHandedBurgersScene); 
		stage.setTitle("Display TwoHandedBurgers Scene"); 
		stage.show();
	}
	public void DisplayClassicSandwichesScene()
	{
		stage.setScene(ClassicSandwichesScene); 
		stage.setTitle("Display ClassicSandwiches Scene"); 
		stage.show();
	}
	public void DisplayPaninisScene()
	{
		stage.setScene(PaninisScene); 
		stage.setTitle("Display Paninis Scene"); 
		stage.show();
	}
	public void DisplayWrapsScene()
	{
		stage.setScene(WrapsScene); 
		stage.setTitle("Display Wraps Scene"); 
		stage.show();
	}
	public void DisplayQuesadillasScene()
	{
		stage.setScene(QuesadillasScene); 
		stage.setTitle("Display Quesadillas Scene"); 
		stage.show();
	}
	public void DisplayLunchOptionsScene()
	{
		stage.setScene(LunchOptionsScene); 
		stage.setTitle("Display LunchOptions Scene"); 
		stage.show();
	}
	
}
