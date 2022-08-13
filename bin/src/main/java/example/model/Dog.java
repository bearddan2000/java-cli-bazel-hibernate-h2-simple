package example.model;

import org.hibernate.Query;
import org.hibernate.Session;
import java.util.List;
import example.entity.DogEntity;

public class Dog{
  Session session = null;
  public Dog(Session s){session = s;}

  public void insert(String breed, String color) throws Exception {
    if (color == null)
      throw new Exception("must provide color");
    else if (breed == null)
      throw new Exception("must provide breed");

		session.beginTransaction();

		DogEntity dog = new DogEntity();
    dog.setBreed(breed);
    dog.setColor(color);

		session.save(dog);

		session.getTransaction().commit();
  }
  public void selectAll(){

		session.beginTransaction();

    String hql = "FROM DogEntity";
    Query query = session.createQuery(hql);
    List<DogEntity> lst = query.list();
    for (DogEntity entity : lst)
      System.out.println(entity.toString());

		session.getTransaction();
  }
}
