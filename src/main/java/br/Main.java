package br;

import br.persistence.migration.MigrationStrategy;
import br.ui.MainMenu;

import java.sql.SQLException;

import static br.persistence.config.ConnectionConfig.getConnection;

// classe main
public class Main {

    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }

}
