

package dao;

import models.ContactUs;
import org.sql2o.Connection;
import org.sql2o.Sql2oException;

import java.util.List;

public class Sql2oContactUsDao implements ContactUsDao {

    public List<ContactUs> getAllContactUs() {
        try(Connection con = DB.sql2o.open()) {
            return con.createQuery(" SELECT * FROM ContactUs")
                    .executeAndFetch(ContactUss.class);
        }
    }

    public void addContactUs(ContactUs contactUs){
        String sql = "INSERT INTO ContactUs(name, phoneNumber, email, message VALUES ( :name, : phoneNumber, :email, :message, now())";
        try(Connection con = DB.sql2o.open()){
            int id = (int) con.createQuery(sql, true)
                    .bind(ContactUs)
                    .executeUpdate()
                    .getKey();
            ContactUs.setId(id);
        } catch (Sql2oException e){
            System.out.println("e");
        }


    }

    public ContactUs findContactUsById(int id) {
        try(Connection con = DB.sql2o.open()){
            return con.createQuery("SELECT * FROM ContactUs WHERE id = :id")
                    .addParameter("id", id)
                    .executeAndFetchFirst(ContactUs.class);
        }

    }

    public void deleteContactUsById(int id) {

        String sql = "DELETE FROM ContactUs WHERE id = :id";
        try (Connection con = DB.sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("id", id)
                    .executeUpdate();
        }
    }

    public void deleteAllContactUs() {
        String sql = "DELETE FROM ContactUs";
        try(Connection con = DB.sql2o.open()){
            con.createQuery(sql)
                    .executeUpdate();

        } catch (Sql2oException e){
            System.out.println("e");
        }


    }


}