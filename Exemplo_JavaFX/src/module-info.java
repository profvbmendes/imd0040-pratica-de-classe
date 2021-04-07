module Exemplo_JavaFX {
	requires javafx.controls;
	requires javafx.fxml;
	
	exports br.imd;
	exports br.imd.controller;
	
	opens br.imd.controller to javafx.fxml;
}
