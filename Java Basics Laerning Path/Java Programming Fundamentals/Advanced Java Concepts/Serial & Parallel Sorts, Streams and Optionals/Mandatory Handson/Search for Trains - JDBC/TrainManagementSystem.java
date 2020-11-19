import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TrainManagementSystem {
    public ArrayList<Train> viewTrain(String coachType, String src, String dest) {
        ArrayList<Train> trains = new ArrayList<>();

        try {
            Connection connection = DB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select *\n" +
                    "from train\n" +
                    "where source = ?\n" +
                    "and destination = ?\n" +
                    "and " + coachType.toUpperCase() + " > 0\n" +
                    "order by train_number;");
            preparedStatement.setString(1, src);
            preparedStatement.setString(2, dest);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int trainNumber = resultSet.getInt(1);
                String trainName = resultSet.getString(2);
                String source = resultSet.getString(3);
                String destination = resultSet.getString(4);
                int ac1 = resultSet.getInt(5);
                int ac2 = resultSet.getInt(6);
                int ac3 = resultSet.getInt(7);
                int sleeper = resultSet.getInt(8);
                int seater = resultSet.getInt(9);

                trains.add(new Train(trainNumber, trainName, source, destination, ac1, ac2, ac3, sleeper, seater));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return trains;
    }
}
