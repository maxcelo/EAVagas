package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FacaCartaoController {
	
	public static final String telaFacaCartao = "Cadastre seu Cart�o de Cr�dito!";

	public static final String tituloFacaCartao = "Cadastre o seu cart�o de cr�dito";
	@FXML private Button ButtonEuTopo;
    @FXML private Button ButtonPensar;
    @FXML private Label LabelCadastreCartao;
    @FXML private Label LabelReservar;

    @FXML
    private Button ButtonPensar;

    @FXML
    private Label LabelCadastreCartao;

    @FXML
    private Label LabelReservar;
    
    public void cadastrarCartao(ActionEvent event) {
    	TelaController.carregarTela(event, "/application/CadastraCartao.fxml", CadastraCartaoController.tituloCadastroCartao);
    }
    
    public void telaHome(ActionEvent event) {
    	TelaController.carregarTela(event, "/application/Home.fxml", HomeController.telaHome);
    }

}
