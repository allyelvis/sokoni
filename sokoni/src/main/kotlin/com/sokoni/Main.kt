package com.sokoni

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.layout.AnchorPane
import javafx.stage.Stage
import javafx.scene.image.Image

class SokoniApp : Application() {
    override fun start(primaryStage: Stage) {
        val loader = FXMLLoader(javaClass.getResource("Main.fxml"))
        val root = loader.load<AnchorPane>()
        val scene = Scene(root)
        
        // Set background and icon
        scene.stylesheets.add(javaClass.getResource("styles.css").toExternalForm())
        primaryStage.icons.add(Image("icon.png")) // Add your icon here

        primaryStage.title = "Sokoni"
        primaryStage.scene = scene
        primaryStage.show()
    }
}

fun main() {
    Application.launch(SokoniApp::class.java)
}
