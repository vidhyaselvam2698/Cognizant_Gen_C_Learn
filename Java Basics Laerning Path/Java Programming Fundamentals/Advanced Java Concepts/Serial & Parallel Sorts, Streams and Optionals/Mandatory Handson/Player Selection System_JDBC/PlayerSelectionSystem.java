import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlayerSelectionSystem {
    public List<String> playersBasedOnHeightWeight(double minHeight, double maxWeight) {
        List<String> players = new ArrayList<>();

        try {
            Connection connection = DB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "select playerName\n" +
                            "from player\n" +
                            "where height >= ?\n" +
                            "and weight <= ?" +
                            "order by  playerName"
            );
            preparedStatement.setDouble(1, minHeight);
            preparedStatement.setDouble(2, maxWeight);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String player = resultSet.getString(1);
                players.add(player);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return players;
    }
}
